package com.pawhouseteam.googleworkshop2018.tau.pawhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AddSector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sector);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Intent intent = getIntent();

        Spinner sectorNumber = (Spinner) findViewById(R.id.sectorNumber);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item){
            @Override
            public View getView (int position, View convertView, ViewGroup parent){
                View v = super.getView(position, convertView, parent);
                if (position == getCount()){
                    ((TextView)v.findViewById(android.R.id.text1)).setText("");
                    ((TextView)v.findViewById(android.R.id.text1)).setHint(getItem(getCount()));
                }
                return v;
            }

            @Override
            public int getCount(){
                return super.getCount()-1;
            }
        };

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        String sectors = intent.getExtras().getString("hello");
        EditText numberOfCages = (EditText) findViewById(R.id.NumberOfCages);
        for (int i=0;i<Integer.parseInt(sectors);i++){
            adapter.add(Integer.toString(i+1));
        }
        adapter.add("מספר מחלקה");

        sectorNumber.setAdapter(adapter);
        sectorNumber.setSelection(adapter.getCount());



    }
}

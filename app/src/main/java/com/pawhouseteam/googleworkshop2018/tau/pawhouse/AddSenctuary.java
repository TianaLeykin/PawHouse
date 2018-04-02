package com.pawhouseteam.googleworkshop2018.tau.pawhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddSenctuary extends AppCompatActivity {

    public static  final String EXTRA_MESSAGE = "com.pawhouseteam.Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sencuary);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Intent intent = getIntent();
    }

    public void addSector (View view){
        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        Intent intent = new Intent(this, AddSector.class);
        EditText numberOfSectors = (EditText) findViewById(R.id.numberOfSectors);
        intent.putExtra("hello",numberOfSectors.getText().toString());
        startActivity(intent);
    }
}

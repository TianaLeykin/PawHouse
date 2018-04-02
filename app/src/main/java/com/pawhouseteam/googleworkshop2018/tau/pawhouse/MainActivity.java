package com.pawhouseteam.googleworkshop2018.tau.pawhouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSenctuary (View view){
        Button addSenctuaryBtn = (Button) findViewById(R.id.addSenctuaryBtn);
        Intent intent = new Intent(this, AddSenctuary.class);
        startActivity(intent);
    }
}
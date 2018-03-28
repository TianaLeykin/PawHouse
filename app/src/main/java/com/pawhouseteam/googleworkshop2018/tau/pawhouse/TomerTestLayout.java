package com.pawhouseteam.googleworkshop2018.tau.pawhouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TomerTestLayout extends AppCompatActivity {

    private Button buttonSingUp,buttonSingIn;
    private EditText editTextName;
    private EditText editTextPasssword;
    private TextView viewTextInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomer_test_layout);

        buttonSingUp = (Button) findViewById(R.id.buttonSingUp);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextPasssword = (EditText) findViewById(R.id.editTextPassword);
        viewTextInfo = (TextView) findViewById(R.id.textViewInfo);

    }

    public void clickSingUp(View view) {
        viewTextInfo.setText("good very good");
    }

    public void clickSingIn(View view) {
    }
}

package com.example.business_card;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Buttons (View x){
        String ButtonText = ((Button) x).getText().toString();
        String Forward;
        if(ButtonText.equals("Generate Short Card")){
            EditText Rep = (EditText) findViewById(R.id.editTextTextPersonName);
             Forward = Rep.getText().toString();
            Log.d("a",Forward);
        }
        else if(ButtonText.equals("Generate Long Card")){
            EditText Rep = (EditText) findViewById(R.id.editTextTextPersonName2);
            Forward = Rep.getText().toString();
            Log.d("a",Forward);
        }
            }
}
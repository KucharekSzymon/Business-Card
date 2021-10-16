package com.example.business_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Buttons (View x){
        String Type ="Short";
        String [] Tablica = {
                Type,
                ((EditText) findViewById(R.id.editTextTextPersonName)).getText().toString(),
                ((EditText) findViewById(R.id.editTextTextPersonName2)).getText().toString(),
                ((EditText) findViewById(R.id.editTextTextEmailAddress)).getText().toString(),
                ((EditText) findViewById(R.id.editTextPhone)).getText().toString()
        };
        String ButtonText = ((Button) x).getText().toString();
        Intent Intencja = new Intent(MainActivity.this,MainActivity2.class);
        if(ButtonText.equals("Generate Short Card") && !Tablica[1].equals("") && !Tablica[2].equals("")){
            Tablica[0] = "Short";
            Intencja.putExtra("Tab",Tablica);
            startActivity(Intencja);
        }
        else if(ButtonText.equals("Generate Long Card") && !Tablica[1].equals("") && !Tablica[2].equals("")&& !Tablica[3].equals("") && !Tablica[4].equals("")){
            Tablica[0] = "Long";
            Intencja.putExtra("Tab",Tablica);
            startActivity(Intencja);
        }
        else{
            Toast.makeText(getApplication(), "Corect Data",
                    Toast.LENGTH_LONG).show();
        }
    }
}
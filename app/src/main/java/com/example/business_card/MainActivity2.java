package com.example.business_card;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
            ((TextView) findViewById(R.id.textView2)).setText(getIntent().getExtras().getStringArray("Tab")[1]);
            ((TextView) findViewById(R.id.textView5)).setText(getIntent().getExtras().getStringArray("Tab")[2]);
                if(getIntent().getExtras().getStringArray("Tab")[0].equals("Long")) {
                    ((TextView) findViewById(R.id.textView4)).setText(getIntent().getExtras().getStringArray("Tab")[3]);
                    ((TextView) findViewById(R.id.textView6)).setText(getIntent().getExtras().getStringArray("Tab")[4]);
                }
            }
    }
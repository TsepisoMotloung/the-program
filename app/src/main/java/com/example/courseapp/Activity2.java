package com.example.courseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView text1, text2;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        text1 = (TextView)findViewById(R.id.textView11);
        text2 = (TextView)findViewById(R.id.textView12);
        v = findViewById(R.id.view10);

        Intent recieveIntent = getIntent();
        String message1 = recieveIntent.getStringExtra("message");
        String message2 = recieveIntent.getStringExtra("img");
        String message3 = recieveIntent.getStringExtra("info");


        text1.setText(message1);
        text2.setText(message3);

        switch(message2){
            case "front":
                v.setBackgroundResource(R.drawable.frontend);
                break;
            case "mobileapp":
                v.setBackgroundResource(R.drawable.mobileapp);
                break;
            case "datascience":
                v.setBackgroundResource(R.drawable.datascience);
                break;
        }
        Toast.makeText(this, message1, Toast.LENGTH_SHORT).show();
    }
}
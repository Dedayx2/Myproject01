package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Instant;

public class Cafedetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafedetail);

        Intent intent = getIntent();
        String Cafename = intent.getStringExtra("Cafename");
        String CafeImg = intent.getStringExtra("CafeImg");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        switch (CafeImg) {
            case    "baanna": imageView.setImageResource(R.drawable.risingpark); break;
            case    "boonsri": imageView.setImageResource(R.drawable.puchifa); break;
            case    "honeymoon": imageView.setImageResource(R.drawable.wadlong); break;
        }

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Cafename);
    }
}
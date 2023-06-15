package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView kg;
    CardView kelvin, meter, pound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kg = findViewById(R.id.kg);
        kelvin = findViewById(R.id.temperature);
        meter = findViewById(R.id.meter);
        pound = findViewById(R.id.pound);

        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KgToGram.class);
                startActivity(intent);

            }
        });

        kelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CelciusToKelvin.class);
                startActivity(intent);

            }
        });

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MeterToFeet.class);
                startActivity(intent);

            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KgToPound.class);
                startActivity(intent);

            }
        });

    }
}
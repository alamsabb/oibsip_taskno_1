package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class KgToPound extends AppCompatActivity {
    EditText poundtext,pdeit;
    Button pound_converter;

    ImageView kg, meter, temperature;

    Editable input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg_to_pound);

        poundtext = findViewById(R.id.poundedit);
        pdeit=findViewById(R.id.pdit);
        pound_converter = findViewById(R.id.kg_converter);
        kg = findViewById(R.id.kg);
        meter = findViewById(R.id.meter);
        temperature = findViewById(R.id.temperature);
        pound_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(poundtext.getText().toString().isEmpty()){
                    if(pdeit.getText().toString().isEmpty()){
                        poundtext.setError("any one value");
                        poundtext.setHint("Enter the KG");
                        pdeit.setError("any one value");
                        pdeit.setHint("Enter the Pound");
                    }else {
                        input=pdeit.getText();
                        double a = Double.parseDouble(String.valueOf(pdeit.getText()));
                        poundtext.setHint(input +" Pound = "+ String.format("%.2f",(a*0.45 ))+" KG");
//                        poundtext.setHintTextColor(Color.RED);
                        pdeit.setText("");
                        pdeit.setHint("Enter the Pound");
                    }
                } else if (pdeit.getText().toString().isEmpty()) {
                    if(poundtext.getText().toString().isEmpty()){
                        poundtext.setError("any one value");
                        poundtext.setHint("Enter the KG");
                        pdeit.setError("any one value");
                        pdeit.setHint("Enter the Pound");
                    }else {
                        input=poundtext.getText();
                        double a = Double.parseDouble(String.valueOf(poundtext.getText()));
                        pdeit.setHint(input +" Kg = "+String.format("%.2f",(a*2.20))+" Pound");
//                        pdeit.setHintTextColor(Color.BLUE);
                        poundtext.setText("");
                        poundtext.setHint("Enter the KG");
                    }

                }else {
                    input=poundtext.getText();
                    pdeit.setText("");
                    double a = Double.parseDouble(String.valueOf(poundtext.getText()));
                    pdeit.setHint(input +" Kg = "+String.format("%.2f",(a*2.20))+" Pound");
//                    pdeit.setHintTextColor(Color.BLUE);
                    poundtext.setText("");
                    poundtext.setHint("Enter the KG");
                }

            }
        });


        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToPound.this, KgToGram.class);
                startActivity(intent);
                finish();
              }
        });

        meter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(KgToPound.this, MeterToFeet.class);
                        startActivity(intent);
                        finish();

                    }
        });

                temperature.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(KgToPound.this, CelciusToKelvin.class);
                        startActivity(intent);
                        finish();

                    }
                });

    }
}

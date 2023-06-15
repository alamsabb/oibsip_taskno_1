package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class KgToGram extends AppCompatActivity {
    EditText kgtext,gtext;
    Button kg_converter;

    ImageView pound, meter, temperature;

    Editable input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg_to_gram);

        kgtext = findViewById(R.id.kgedit);
        gtext=findViewById(R.id.gedit);
        kg_converter = findViewById(R.id.kg_converter);
        pound = findViewById(R.id.pound);
        meter = findViewById(R.id.meter);
        temperature = findViewById(R.id.temperature);


        kg_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kgtext.getText().toString().isEmpty()){
                    if(gtext.getText().toString().isEmpty()){
                        kgtext.setError("Enter a Value");
                        gtext.setError("Enter a Value");
                        kgtext.setHint("Enter the Value");
                        gtext.setHint("Enter the Value");
                    }else {
                        input = gtext.getText();
                        double a = Double.parseDouble(String.valueOf(gtext.getText()));
                        kgtext.setHint( input + " Kg = " +String.format("%.2f", (a * 1000))+ " Gram");
                        gtext.setText("");
                        gtext.setHint("Enter the Value");

                    }

                }else if (gtext.getText().toString().isEmpty()) {
                    if(kgtext.getText().toString().isEmpty()){
                        kgtext.setError("Enter a Value");
                        gtext.setError("Enter a Value");
                        kgtext.setHint("Enter the Value");
                        gtext.setHint("Enter the Value");
                    }else {
                        input = kgtext.getText();
                        double a = Double.parseDouble(String.valueOf(kgtext.getText()));
                        gtext.setHint( input + " Gram = " +String.format("%.3f", (a * 0.001))+ " KG");
                        kgtext.setText("");
                        kgtext.setHint("Enter the Value");
                    }
                }else {
                    input = gtext.getText();
                    double a = Double.parseDouble(String.valueOf(kgtext.getText()));
                    gtext.setHint( input + " Kg = " +String.format("%.2f", (a * 1000))+ " Gram");
                    kgtext.setText("");
                    kgtext.setHint("Enter the Value");
                }

            }
        });



        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this, KgToPound.class);
                startActivity(intent);
                finish();
            }
            });

                meter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(KgToGram.this, MeterToFeet.class);
                        startActivity(intent);
                        finish();
                    }
                });

                temperature.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(KgToGram.this, CelciusToKelvin.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }

}

package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MeterToFeet extends AppCompatActivity {
    EditText kmedit,medit,fedit,miledit;
    Button convert;
    ImageView temp,kg,pound;
    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_to_feet);
        kmedit=findViewById(R.id.kmedit);
        medit=findViewById(R.id.medit);
        fedit=findViewById(R.id.fedit);
        miledit=findViewById(R.id.miledit);
        convert=findViewById(R.id.km_converter);

        temp=findViewById(R.id.temperature);
        kg=findViewById(R.id.kgimg);
        pound=findViewById(R.id.pound);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kmedit.getText().toString().isEmpty()&& medit.getText().toString().isEmpty()&&fedit
                        .getText().toString().isEmpty()&&miledit.getText().toString().isEmpty()){
                    kmedit.setError("Enter a value");
                    fedit.setHint("Enter the Feet");
                    medit.setHint("Enter the Meter");
                    medit.setError("Enter a value");
                    fedit.setError("Enter a value");
                    kmedit.setHint("Enter the KM");
                    miledit.setError("Enter a value");
                    miledit.setHint("Enter the Miles");

                } else if (kmedit.getText().toString().isEmpty()&& medit.getText().toString().isEmpty()&&miledit.getText().toString().isEmpty()) {
                    input=fedit.getText();
                    double a =Double.parseDouble(String.valueOf(fedit.getText()));
                    medit.setHint(input +" Feet = "+String.format("%.3f",(a*0.305))+" Meter");
                    kmedit.setHint(input +" Feet = "+String.format("%.6f",(a*0.000305))+" KM");
                    miledit.setHint(input +" Feet = "+String.format("%.6f",(a*0.000189))+" Miles");
                    fedit.setText("");
                    fedit.setHint("Enter the Feet");

                } else if (kmedit.getText().toString().isEmpty()&&fedit
                        .getText().toString().isEmpty()&&miledit.getText().toString().isEmpty()) {
                    input=medit.getText();
                    double a =Double.parseDouble(String.valueOf(medit.getText()));
                    fedit.setHint(input +" Meter = "+String.format("%.3f",(a*3.28))+" Feet");
                    kmedit.setHint(input +" Meter = "+String.format("%.3f",(a*0.001))+" KM");
                    miledit.setHint(input +" Meter = "+String.format("%.6f",(a*0.000621))+" Miles");
                    medit.setText("");
                    medit.setHint("Enter the Meter");

                } else if (medit.getText().toString().isEmpty()&&fedit
                        .getText().toString().isEmpty()&&miledit.getText().toString().isEmpty()) {
                    input=kmedit.getText();
                    double a =Double.parseDouble(String.valueOf(kmedit.getText()));
                    fedit.setHint(input +" KM = "+String.format("%.3f",(a*3280.84))+" Feet");
                    medit.setHint(input +" KM = "+String.format("%.3f",(a*1000))+" Meter");
                    miledit.setHint(input +" KM = "+String.format("%.3f",(a*0.621))+" Miles");
                    kmedit.setText("");
                    kmedit.setHint("Enter the KM");

                } else if (medit.getText().toString().isEmpty()&&fedit
                        .getText().toString().isEmpty()&&kmedit.getText().toString().isEmpty()) {
                    input=miledit.getText();
                    double a =Double.parseDouble(String.valueOf(miledit.getText()));
                    fedit.setHint(input +" Miles = "+String.format("%.3f",(a*5280))+" Feet");
                    medit.setHint(input +" Miles = "+String.format("%.3f",(a*1609.34))+" Meter");
                    kmedit.setHint(input +" Miles = "+String.format("%.3f",(a*1.609))+" KM");
                    miledit.setText("");
                    miledit.setHint("Enter the Miles");

                } else {
                    if(medit.getText().toString().isEmpty()){
                        input=fedit.getText();
                        double a =Double.parseDouble(String.valueOf(fedit.getText()));
                        medit.setHint(input +" Feet = "+String.format("%.3f",(a*0.305))+" Meter");
                        medit.setText("");
                        kmedit.setHint(input +" Feet = "+String.format("%.6f",(a*0.000305))+" KM");
                        kmedit.setText("");
                        fedit.setText("");
                        fedit.setHint("Enter the Feet");
                    } else if (miledit.getText().toString().isEmpty()) {
                        input=fedit.getText();
                        double a =Double.parseDouble(String.valueOf(fedit.getText()));
                        medit.setHint(input +" Feet = "+String.format("%.3f",(a*0.305))+" Meter");
                        medit.setText("");
                        kmedit.setHint(input +" Feet = "+String.format("%.6f",(a*0.000305))+" KM");
                        kmedit.setText("");
                        fedit.setText("");
                        fedit.setHint("Enter the Feet");

                    } else {
                        input = medit.getText();
                        double a = Double.parseDouble(String.valueOf(medit.getText()));
                        fedit.setHint(input + " Meter = " + String.format("%.3f", (a * 3.28)) + " Feet");
                        fedit.setText("");
                        kmedit.setHint(input + " Meter = " + String.format("%.3f", (a * 0.001)) + " KM");
                        kmedit.setText("");
                        medit.setText("");
                        medit.setHint("Enter the Meter");
                    }
                }
            }
        });


        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeterToFeet.this, CelciusToKelvin.class);
                startActivity(intent);
                finish();
            }
        });
        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeterToFeet.this, KgToGram.class);
                startActivity(intent);
                finish();
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeterToFeet.this, KgToPound.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
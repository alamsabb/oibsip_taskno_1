package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class CelciusToKelvin extends AppCompatActivity {
    EditText caledit,feredit,keledit;
    Button converttemp;
    ImageView Len,Weig,Pound;
    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_to_kelvin);
        caledit=findViewById(R.id.celedit);
        feredit=findViewById(R.id.faredit);
        keledit=findViewById(R.id.kedit);
        converttemp=findViewById(R.id.temp_converter);

        Len=findViewById(R.id.imgmeter);
        Weig=findViewById(R.id.weigimg);
        Pound=findViewById(R.id.poundimg);

        converttemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(caledit.getText().toString().isEmpty()&&keledit.getText().toString().isEmpty()&&feredit.getText().toString().isEmpty()){
                    caledit.setError("any one value");
                    caledit.setHint("Enter the Calcius");
                    feredit.setHint("Enter the Fahrenheit");
                    keledit.setHint("Enter the Kelvin");
                    keledit.setError("any one value");
                    feredit.setError("any one value");
                } else if (caledit.getText().toString().isEmpty()&&keledit.getText().toString().isEmpty()) {
                    input=feredit.getText();
                    float a =Float.parseFloat(String.valueOf(feredit.getText()));
                    float minus= a-32;
                    Log.d("sa", String.valueOf(minus));
                    float data=0.55f;
                    Log.d("sa", String.valueOf(data));
                    caledit.setHint(input +" F = "+String.format("%.3f",minus*data)+" C");
                    keledit.setHint(input +" F = "+String.format("%.3f",((minus*data)+273.15))+" K");
                    feredit.setText("");
                    feredit.setHint("Enter the Fahrenheit");

                } else if (keledit.getText().toString().isEmpty()&&feredit.getText().toString().isEmpty()) {

                    input=caledit.getText();
                    float a =Float.parseFloat(String.valueOf(caledit.getText()));
//                    float minus= 25f;
//                    Log.d("sa", String.valueOf(minus));
                    float data=1.8f;
//                    Log.d("sa", String.valueOf(data));
                    feredit.setHint(input +" C = "+String.format("%.3f",((a*data)+32))+" F");
                    keledit.setHint(input +" C = "+String.format("%.3f",(a+273.15))+" K");
                    caledit.setText("");
                    caledit.setHint("Enter the Calcius");
                } else if (caledit.getText().toString().isEmpty()&&feredit.getText().toString().isEmpty()) {
                    input=keledit.getText();
                    float a =Float.parseFloat(String.valueOf(keledit.getText()));
                    float celci= a-273.15f;
//                    Log.d("sa", String.valueOf(minus));
                    float data=1.8f;
//                    Log.d("sa", String.valueOf(data));
                    feredit.setHint(input +" K = "+String.format("%.3f",((celci*data)+32))+" F");
                    caledit.setHint(input +" K = "+String.format("%.3f",(a-273.15))+" C");
                    keledit.setText("");
                    keledit.setHint("Enter the Kelvin");

                }else {
                    if(caledit.getText().toString().isEmpty()){
                        input=keledit.getText();
                        float a =Float.parseFloat(String.valueOf(keledit.getText()));
                        float celci= a-273.15f;
//                    Log.d("sa", String.valueOf(minus));
                        float data=1.8f;
//                    Log.d("sa", String.valueOf(data));
                        feredit.setText("");
                        feredit.setHint(input +" K = "+String.format("%.3f",((celci*data)+32))+" F");
                        caledit.setText("");
                        caledit.setHint(input +" K = "+String.format("%.3f",(a-273.15))+" C");
                        keledit.setText("");
                        keledit.setHint("Enter the Kelvin");
                    }else {
                        input=caledit.getText();
                        float a =Float.parseFloat(String.valueOf(caledit.getText()));
//                    float minus= 25f;
//                    Log.d("sa", String.valueOf(minus));
                        float data=1.8f;
//                    Log.d("sa", String.valueOf(data));
                        feredit.setText("");
                        feredit.setHint(input +" C = "+String.format("%.3f",((a*data)+32))+" F");
                        keledit.setText("");
                        keledit.setHint(input +" C = "+String.format("%.3f",(a+273.15))+" K");
                        caledit.setText("");
                        caledit.setHint("Enter the Calcius");
                    }
                }
            }
        });

        Len.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CelciusToKelvin.this, MeterToFeet.class);
                startActivity(intent);
                finish();

            }
        });
        Pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CelciusToKelvin.this, KgToPound.class);
                startActivity(intent);
                finish();
            }
        });
        Weig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CelciusToKelvin.this, KgToGram.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
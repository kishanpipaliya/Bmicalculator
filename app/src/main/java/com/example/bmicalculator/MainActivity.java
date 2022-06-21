package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    EditText edtHeight, edtWeight, edtAge;
    int age;
    float height, weight, sum;
    Button btnshow;
    String Age, Weight, Height, data;
    TextView txtAge, txtHeight, txtWeight, txtBmi, txtunderweight, txtNormal, txtOverweight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initbinding();
        initclick();


    }

    void initbinding() {
        edtHeight = findViewById(R.id.edtHeight);
        edtWeight = findViewById(R.id.edtWeight);
        edtAge = findViewById(R.id.edtAge);
        btnshow = findViewById(R.id.btnshow);
        txtAge = findViewById(R.id.txtAge);
        txtWeight = findViewById(R.id.txtWeight);
        txtBmi = findViewById(R.id.txtBmi);
        txtHeight = findViewById(R.id.txtHeight);
    }

    void initclick() {
        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Age = edtAge.getText().toString();
                Weight = edtWeight.getText().toString();
                Height = edtHeight.getText().toString();

                age = Integer.parseInt(Age);
                height = Integer.parseInt(Height);
                weight = Integer.parseInt(Weight);


                height = height * 0.3048f;

                sum = weight / (height * height);


                data = txtBmi.getText().toString();
                txtBmi.setText("" + sum);
                data = txtAge.getText().toString();
                txtAge.setText("" + age);
                data = txtHeight.getText().toString();
                txtHeight.setText("" + height);
                data = txtWeight.getText().toString();
                txtWeight.setText("" + weight);

                Toast.makeText(MainActivity.this, "Age : " + age + "Result : " + sum, Toast.LENGTH_SHORT).show();
            }

        });
    }
}
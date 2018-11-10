package com.example.android.techmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Second extends AppCompatActivity {
    int age = 0;
    int bodyHeight = 0;
    double weight = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }


//    public void ageInput(View view) {
//
//        EditText input = (EditText) findViewById(R.id.age);
//        this.age = Integer.parseInt(input.getText().toString());
//
//    }
//
//    public void weightInput(View view) {
//        EditText input = (EditText) findViewById(R.id.weight);
//        this.weight = Integer.parseInt(input.getText().toString());
//    }
//
//    public void heightInput(View view) {
//        EditText input = (EditText) findViewById(R.id.height);
//        this.bodyHeight = Integer.parseInt(input.getText().toString());
//    }
}

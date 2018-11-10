package com.example.android.techmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

        import java.text.NumberFormat;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.text.Editable;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.TextView;

import static android.R.id.input;
import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    int age = 0;
    int height = 0;
    double weight = 0;
    int bodyType = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view){
        setContentView(R.layout.activity_details);
    }
    public void ageInput(View view){

        EditText input = (EditText) findViewById(R.id.age) ;
        this.age = Integer.parseInt(input.getText().toString());

    }
    public void weightInput(View view){
        EditText input = (EditText) findViewById(R.id.weight) ;
        this.weight = Integer.parseInt(input.getText().toString());
    }
    public void heightInput(View view){
        EditText input = (EditText) findViewById(R.id.height) ;
        this.height = Integer.parseInt(input.getText().toString());
    }





}

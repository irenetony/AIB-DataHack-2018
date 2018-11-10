package com.example.android.techmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity{


    public Button start;

//    public void init(){
//        start = (Button)findViewById(R.id.start);
//        start.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Intent toy = new Intent(MainActivity.this, Second.class);
//                startActivity(toy);
//            }
//
//        });
//    }
    public void start(View view){
        Intent toy = new Intent(MainActivity.this, Second.class);
        startActivity(toy);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}

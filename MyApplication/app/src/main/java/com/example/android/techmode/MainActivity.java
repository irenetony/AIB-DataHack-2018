package com.example.android.techmode;

import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.NumberFormat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.width;
import static android.R.id.input;
import static android.R.id.message;
import static com.example.android.techmode.FragmentPager.fragmentPagerAdapter;
import static com.example.android.techmode.FragmentPager.fragments;
import static com.example.android.techmode.FragmentPager.numFragments;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int MAX_NUM_OF_FRAGMENTS = 10; //including first temp fragment
    public static final int NUM_OF_BUTTONS_PER_GRID = 9;
    public static final int NUM_OF_ROWS = 3, NUM_OF_COLUMNS = 3;
    public static MainActivity instance = null;
    static boolean creatingNewButton, editingButton;
    static float width, height;

    int age = 0;
    int bodyHeight = 0;
    double weight = 0;
    int bodyType = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        setContentView(R.layout.activity_details);
    }

    public void ageInput(View view) {

        EditText input = (EditText) findViewById(R.id.age);
        this.age = Integer.parseInt(input.getText().toString());

    }

    public void weightInput(View view) {
        EditText input = (EditText) findViewById(R.id.weight);
        this.weight = Integer.parseInt(input.getText().toString());
    }

    public void heightInput(View view) {
        EditText input = (EditText) findViewById(R.id.height);
        this.bodyHeight = Integer.parseInt(input.getText().toString());
    }

    public static void addNewPage() {
        if(numFragments == MAX_NUM_OF_FRAGMENTS)
            return;
        fragments.add(fragments.size(), new SecondFragment());
        numFragments++;
        fragmentPagerAdapter.notifyDataSetChanged();
    }

    public static int getCurrentFragmentIndex() {
        for (int i = 0; i < fragments.size(); i++) {
            Fragment f = fragments.get(i);
            if (f.getUserVisibleHint())
                return i;
        }
        return -1;
    }

    @Override
    public void onClick(View view) {
       start();
    }





}

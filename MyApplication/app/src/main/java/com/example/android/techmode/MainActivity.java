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
    static class Position {
        float x, y;

        Position(float x, float y) {
            this.x = x;
            this.y = y;
        }

        boolean isClose(float xPos, float yPos) {
            boolean b = false;

            if ((xPos <= (x + (width / 12))) && (xPos >= (x - (width / 16)))) {
                b = true;
            }
            if (b) {
                if ((yPos > (y - (height / 16))) && (yPos < (y + (height / 12)))) {
                    b = true;
                } else {
                    b = false;
                }
            }

            return b;
        }
    }

    public static boolean isClose(Button b, float xPos, float yPos) {

        boolean b1 = false;

        if ((xPos <= (b.getX() + (width / 12))) && (xPos >= (b.getX() - (width / 16)))) {
            b1 = true;
        }
        if (b1) {
            if ((yPos > (b.getY() - (height / 16))) && (yPos < (b.getY() + (height / 12)))) {
                b1 = true;
            } else {
                b1 = false;
            }
        }

        return b1;
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
        switch (view.getId()) {
//            case R.id.btn_google:
//                textToSpeech.speak("Ok Google", TextToSpeech.QUEUE_ADD, null);
//                if (googleCount == 2) {
//                    this.startActivity(new Intent(MainActivity.this, FragmentPager.class).putExtra("btnPressed", "OkGoogle"));
//                    prefix = "Okay, Google, ";
//                }
//                googleCount++;
//                siriCount = 0;
//                break;
//            case R.id.btn_siri:
//                textToSpeech.speak("Hi Siri", TextToSpeech.QUEUE_ADD, null);
//                if (siriCount == 2) {
//                    this.startActivity(new Intent(MainActivity.this, FragmentPager.class).putExtra("btnPressed", "HiSiri"));
//                    prefix = "Hey, Siri, ";
//                }
//                siriCount++;
//                googleCount = 0;

                //break;
        }
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
        this.bodyHeight = Integer.parseInt(input.getText().toString());
    }





}

package com.example.android.techmode;

/**
 * Created by irenetony on 10/11/2018.
 */

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.enaboapps.vassist.MainActivity.MAX_NUM_OF_FRAGMENTS;
import static com.enaboapps.vassist.MainActivity.NUM_OF_COLUMNS;
import static com.enaboapps.vassist.MainActivity.NUM_OF_ROWS;
//import static com.enaboapps.vassist.MainActivity.canEdit;
//import static com.enaboapps.vassist.MainActivity.creatingNewButton;
//import static com.enaboapps.vassist.MainActivity.editingButton;
//import static com.enaboapps.vassist.MainActivity.textEditVisible;

public class FragmentPager extends AppCompatActivity {

    public static View constraint;
    public static ImageButton addButton;
    public static RelativeLayout rlayout;

    private static Button[] buttons;
    //static boolean canEdit, textEditVisible;
    static TextToSpeech tts;

    public static FragmentPagerAdapter fragmentPagerAdapter;
    public static ViewPager viewPager;
    public static List<Fragment> fragments = new ArrayList<Fragment>();

    public static final int FRAGMENT_ONE = 0;
    public static final int FRAGMENT_TWO = 1;
    public static int numFragments = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FragmentPager.instance = this;
        constraint = findViewById(R.id.constraint);
        addButton = findViewById(R.id.add_button);
        rlayout = findViewById(R.id.rlayout);
        buttons = new Button[NUM_OF_COLUMNS * NUM_OF_ROWS];

        fragments.add(FRAGMENT_ONE, new SecondFragment());


        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.UK);
                }
            }
        });

        // Setup the fragments, defining the number of fragments, the screens and titles.
        fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return numFragments;
            }

            @Override
            public Fragment getItem(final int position) {
                return fragments.get(position);
            }

            @Override
            public CharSequence getPageTitle(final int position) {
                switch (position) {
                    case FRAGMENT_ONE:
                        return "Title One";
                   /* case FRAGMENT_TWO:
                        return "Title Two";*/
                    default:
                        return null;
                }
            }
        };
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(fragmentPagerAdapter);
        viewPager.setOffscreenPageLimit(MAX_NUM_OF_FRAGMENTS);

    }


}

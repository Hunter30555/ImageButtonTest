package com.example.imagebuttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txt;
    ImageButton larm, rarm, head, torso, lleg, rleg;
    int[] nums = new int[]{0,0,0,0,0,0};

    public void toggle(int i, ImageButton b){
        if (nums[i] == 0) {
            b.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_ATOP);
            nums[i] = 1;
        } else {
            b.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
            nums[i] = 0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Default lines to load content page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sets the TextView and ImageButton to variables
        txt   = (TextView) getWindow().findViewById(R.id.textview1);
        larm  = (ImageButton) getWindow().findViewById(R.id.imageButton1);
        rarm  = (ImageButton) getWindow().findViewById(R.id.imageButton2);
        head  = (ImageButton) getWindow().findViewById(R.id.imageButton3);
        torso = (ImageButton) getWindow().findViewById(R.id.imageButton4);
        lleg  = (ImageButton) getWindow().findViewById(R.id.imageButton5);
        rleg  = (ImageButton) getWindow().findViewById(R.id.imageButton6);
        ImageButton part[] = new ImageButton[]{larm,rarm,head,torso,lleg,rleg};


        //Example of how this would work for all body components
        //On Click Listener for Image Button Example
        larm.setOnClickListener(v -> toggle(0, larm));
        rarm.setOnClickListener(v -> toggle(1, rarm));
        head.setOnClickListener(v -> toggle(2, head));
        torso.setOnClickListener(v -> toggle(3, torso));
        lleg.setOnClickListener(v -> toggle(4, lleg));
        rleg.setOnClickListener(v -> toggle(5, rleg));
    }
}
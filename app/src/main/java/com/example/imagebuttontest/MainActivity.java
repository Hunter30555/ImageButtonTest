package com.example.imagebuttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txt;
    ImageButton larm, rarm, head, torso, lleg, rleg;
    int arr[] = {0,0,0,0,0,0};

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

        //Example of how this would work for all body components
        //On Click Listener for Image Button Example
        larm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                CharSequence temp = txt.getText();
                if (arr[0] == 0) {
                    //txt.setText(R.string.textExample2); //textExample2 located in the /res/values/colors.xml file
                    larm.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_ATOP);
                    arr[0] = 1;
                } else {
                    //String str = "Left Arm ";
                    //txt.setText(str.concat(getString(R.string.textExample1))); //textExample1 located in the /res/values/colors.xml file
                    larm.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    arr[0] = 0;
                }
            }
        });

        //On Click Listener for Image Button Example
        rarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                CharSequence temp = txt.getText();
                if (arr[1] == 0) {
                    //txt.setText(R.string.textExample2); //textExample2 located in the /res/values/colors.xml file
                    rarm.setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_ATOP);
                    arr[1] = 1;
                } else {
                    //String str = "Right Arm ";
                    //txt.setText(str.concat(getString(R.string.textExample1))); //textExample1 located in the /res/values/colors.xml file
                    rarm.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                    arr[1] = 0;
                }
            }
        });
    }
}
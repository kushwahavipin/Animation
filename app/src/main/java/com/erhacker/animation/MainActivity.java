package com.erhacker.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button moveBtn,scaleBtn,alphaBtn,rotateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        moveBtn=findViewById(R.id.button2);
        scaleBtn=findViewById(R.id.button3);
        alphaBtn=findViewById(R.id.button4);
        rotateBtn=findViewById(R.id.button5);

        moveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
                textView.startAnimation(move);
            }
        });
        alphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha= AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                textView.startAnimation(alpha);
            }
        });
        rotateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotation);
                textView.startAnimation(rotate);
            }
        });
        scaleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale= AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                textView.startAnimation(scale);
            }
        });


    }
}
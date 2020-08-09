package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {

    private static int SPLASH_SCREEN = 2500;
    ImageView imgview;
    TextView textview,textview1;
    Animation top,bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        imgview= findViewById((R.id.imgview));
        textview = findViewById(R.id.textview);
        textview1 = findViewById(R.id.textview1);

        top = AnimationUtils.loadAnimation( this, R.anim.top);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);

        imgview.setAnimation(top);
        textview.setAnimation(bottom);
        textview1.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_screen.this, demo3.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
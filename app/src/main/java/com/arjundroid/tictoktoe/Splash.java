package com.arjundroid.tictoktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    ImageView imgsplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        imgsplash=findViewById(R.id.imgsplash);

        Animation anmimg = AnimationUtils.loadAnimation(this,R.anim.rotate);

        Intent inext = new Intent(Splash.this,MainActivity.class);
        imgsplash.startAnimation(anmimg);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(inext);

                finish();
            }
        },3000);
    }
}
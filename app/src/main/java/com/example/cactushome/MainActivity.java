package com.example.cactushome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int loading_time = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        //Bounce anim
        ImageView logo = (ImageView)findViewById(R.id.logo);
        final Animation anim = AnimationUtils.loadAnimation(this,R.anim.bounce);
        //Interpolator anim
        BounceInterpolator interpolator = new BounceInterpolator(0.2, 20);
        anim.setInterpolator(interpolator);
        logo.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home = new Intent(MainActivity.this, BlogActivity.class);
                startActivity(home);
                finish();
            }
        }, loading_time);
    }
}


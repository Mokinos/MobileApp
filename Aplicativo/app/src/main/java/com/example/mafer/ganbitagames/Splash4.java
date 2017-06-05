package com.example.mafer.ganbitagames;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash4 extends AppCompatActivity {
    private  static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash4);
        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent (Splash4.this, Jankenome.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

package com.stek.ca_ltd.webviewsource;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    TextView mauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mauncher = (TextView) findViewById(R.id.textView12);
      //  Typeface typeface0 = Typeface.createFromAsset(getAssets(), "Baloo-Regular.ttf");
       // mauncher.setTypeface(typeface0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent welcomeintent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(welcomeintent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}


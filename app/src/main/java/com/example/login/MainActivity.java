package com.example.login;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimView);
        lottieAnimationView.animate().translationX(1000).setDuration(1000).setStartDelay(3000);

        TextView textView = findViewById(R.id.textSplashScreen);
        textView.animate().translationX(1000).setDuration(1000).setStartDelay(3000);

        Thread thread = new Thread() {

            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(MainActivity.this, first_page.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
thread.start();
    }

}

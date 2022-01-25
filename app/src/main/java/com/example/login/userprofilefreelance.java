package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class userprofilefreelance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofilefreelance);

        Button button = findViewById(R.id.btnFreelanceUpdate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFreelanceSetting();
            }
        });

    }

    private void openFreelanceSetting() {
        Intent i = new Intent(this, freelancesetting.class);
        startActivity(i);
    }
}
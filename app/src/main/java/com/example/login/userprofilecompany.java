package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class userprofilecompany extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofilecompany);

        Button button = findViewById(R.id.btnCompanyUpdate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCompanySetting();
            }
        });
    }

    private void openCompanySetting() {
        Intent i = new Intent(this, companysetting.class);
        startActivity(i);
    }
    }
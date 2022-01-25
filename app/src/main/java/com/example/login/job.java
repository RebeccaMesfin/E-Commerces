package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class job extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        Button button = findViewById(R.id.jobDone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToCompHomePage();
            }
        });
    }

    private void BackToCompHomePage() {
        Intent i = new Intent(this, bottomnavbar.class);
        startActivity(i);
    }
}
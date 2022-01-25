package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class projectowner_registeration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projectowner_registeration);

        Button button = findViewById(R.id.projownerregister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProjectpage();
            }
        });
    }

    private void openProjectpage() {
        Intent i = new Intent(this, projownerhomepage.class);
        startActivity(i);
    }
    }

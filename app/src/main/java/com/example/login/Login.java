package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button2 = findViewById(R.id.forgotpassword);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReset();
            }
        });

        Button button1 = findViewById(R.id.Signup);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegister();
            }
        });
        Button button = findViewById(R.id.LOGIN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBottomNav();
            }
        });
    }

    private void openReset() {
        Intent i = new Intent(this, resetpassword.class);
        startActivity(i);
    }

    private void openBottomNav() {
      Intent i = new Intent(this, bottomnavbar.class);
      startActivity(i);
    }

    private void openRegister() {
        Intent i = new Intent(this, activity_pickrole.class);
        startActivity(i);
    }

    }
package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class freelance_registeration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelance_registeration);

        Button button = findViewById(R.id.freelanceregister);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              openFreelancepage();
          }
      });
}

    private void openFreelancepage() {
        Intent i = new Intent(this, freelancehomepage.class);
        startActivity(i);
    }
    }
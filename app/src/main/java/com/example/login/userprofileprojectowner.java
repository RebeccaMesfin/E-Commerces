package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class userprofileprojectowner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofileprojectowner);

        Button button = findViewById(R.id.btnProjectOwnerUpdate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProjOwnerSetting();
            }
        });
    }

    private void openProjOwnerSetting() {
        Intent i = new Intent(this, projectownersetting.class);
        startActivity(i);
    }
}
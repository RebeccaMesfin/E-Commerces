package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_pickrole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickrole);

        Button button = (Button) findViewById(R.id.freelance);
        Button button2 = (Button) findViewById(R.id.company);
        Button button3 = (Button) findViewById(R.id.projectOwner);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFreelance();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCompany();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProjectOwner();
            }
        });

    }

    private void openProjectOwner() {
        Intent i = (new Intent(this, projectowner_registeration.class ));
        startActivity(i);
    }

    private void openCompany() {
        Intent i = (new Intent(this, company_registeration.class ));
        startActivity(i);
    }

    private void openFreelance() {
        Intent i = (new Intent(this, freelance_registeration.class ));
        startActivity(i);
    }
}
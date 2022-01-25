package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class projectownersetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projectownersetting);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavView);
        bottomNavigationView.setSelectedItemId(R.id.projectownerhome);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.hiringfreelance:
                        startActivity(new Intent(getApplicationContext()
                                , hiringfreelance.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.projectownerhome:
                        startActivity(new Intent(getApplicationContext()
                                , projownerhomepage.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.projectownerprojects:
                        startActivity(new Intent(getApplicationContext()
                                , projectownerprojects.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.projectownersetting:
                        return true;
                }
                return false;
            }
        });


        Button button = findViewById(R.id.projectownerlogout);
        Button button1 = findViewById(R.id.aboutus);
        Button button2 = findViewById(R.id.shareapp);
        Button button3 = findViewById(R.id.projectownerprofile);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openApp();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutus();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
    }

    private void openProfile() {
        Intent i = new Intent(this, userprofileprojectowner.class);
        startActivity(i);
    }

    private void openApp() {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        String body = "Link to your App";
        String subject = "Your Subject";
        i.putExtra(Intent.EXTRA_SUBJECT, subject);
        i.putExtra(Intent.EXTRA_TEXT, body);
        startActivity(Intent.createChooser(i, "Share using"));

    }

    private void openAboutus() {
        Intent i = new Intent(this, aboutus.class);
        startActivity(i);
    }

    private void openLogin() {
        Intent i = new Intent(this, first_page.class);
        startActivity(i);
    }
}

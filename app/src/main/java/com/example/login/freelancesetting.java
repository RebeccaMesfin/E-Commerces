package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class freelancesetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancesetting);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavView);
        bottomNavigationView.setSelectedItemId(R.id.freelancehome);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.freelanceprojects:
                        startActivity(new Intent(getApplicationContext()
                                , freelanceprojects.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.freelancehome:
                        startActivity(new Intent(getApplicationContext()
                                , freelancehomepage.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.freelancejob:
                        startActivity(new Intent(getApplicationContext()
                                , freelancejob.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.freelancesetting:
                        return true;
                }
                return false;
            }
        });

        Button button = findViewById(R.id.freelancelogout);
        Button button1 = findViewById(R.id.aboutus);
        Button button2 = findViewById(R.id.shareapp);
        Button button3 = findViewById(R.id.freelanceprofile);
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
        Intent i = new Intent(this, userprofilefreelance.class);
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

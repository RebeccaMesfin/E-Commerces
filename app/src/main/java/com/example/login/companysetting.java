package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class companysetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companysetting);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavView);
        bottomNavigationView.setSelectedItemId(R.id.companyhome);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.companyprojects:
                        startActivity(new Intent(getApplicationContext()
                                , companyprojects.class));
                        overridePendingTransition(0, 0);
                        return true;


                    case R.id.companyhome:
                        startActivity(new Intent(getApplicationContext()
                                , bottomnavbar.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.companyjob:
                        startActivity(new Intent(getApplicationContext()
                                , companyjob.class));
                        overridePendingTransition(0, 0);
                        return true;


                    case R.id.companysetting:
                        return true;
                }
                return false;
            }
        });


        Button button = findViewById(R.id.logout);
        Button button1 = findViewById(R.id.aboutus);
        Button button2 = findViewById(R.id.shareapp);
        Button button3 = findViewById(R.id.profile);
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
        Intent i = new Intent(this, userprofilecompany.class);
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
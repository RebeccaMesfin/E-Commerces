package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class freelanceprojects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelanceprojects);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavView);
        bottomNavigationView.setSelectedItemId(R.id.freelancehome);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.freelanceprojects:
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
                        startActivity(new Intent(getApplicationContext()
                                , freelancesetting.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
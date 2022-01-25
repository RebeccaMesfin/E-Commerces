package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class freelancejob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelancejob);

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
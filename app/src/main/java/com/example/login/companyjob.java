package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class companyjob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companyjob);

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
                        return true;


                    case R.id.companysetting:
                        startActivity(new Intent(getApplicationContext()
                                , companysetting.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }

}
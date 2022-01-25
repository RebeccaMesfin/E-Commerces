package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class projectactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projectactivity);

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
                        return true;

                    case R.id.projectownerprojects:
                        startActivity(new Intent(getApplicationContext()
                                , projectownerprojects.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.projectownersetting:
                        startActivity(new Intent(getApplicationContext()
                                , projectownersetting.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class projownerhomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projownerhomepage);

        FloatingActionButton projaddplus = (FloatingActionButton) findViewById(R.id.projectOwneraddplus);
        projaddplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProjAct();
            }
        });


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

    private void openProjAct() {
        Intent i = new Intent(this, projectactivity.class);
        startActivity(i);
    }
}

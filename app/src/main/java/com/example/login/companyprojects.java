package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class companyprojects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companyprojects);

        FloatingActionButton addplus = (FloatingActionButton) findViewById(R.id.companyaddplus);
        FloatingActionButton compjob = (FloatingActionButton) findViewById(R.id.companyaddjob);
        FloatingActionButton compproj = (FloatingActionButton) findViewById(R.id.companyaddproj);
        final LinearLayout joblayout = (LinearLayout) findViewById(R.id.jobLayout);
        final LinearLayout projlayout = (LinearLayout) findViewById(R.id.projLayout);
        Animation showbutton = AnimationUtils.loadAnimation(companyprojects.this, R.anim.show_button);
        Animation hidebutton = AnimationUtils.loadAnimation(companyprojects.this, R.anim.hide_button);
        Animation showlayout = AnimationUtils.loadAnimation(companyprojects.this, R.anim.show_layout);
        Animation hidelayout = AnimationUtils.loadAnimation(companyprojects.this, R.anim.hide_layout);
        addplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(joblayout.getVisibility() == View.VISIBLE && projlayout.getVisibility() == View.VISIBLE){
                    joblayout.setVisibility(View.GONE);
                    projlayout.setVisibility(View.GONE);
                    joblayout.startAnimation(hidelayout);
                    projlayout.startAnimation(hidelayout);
                    addplus.startAnimation(hidebutton);
                }else{
                    joblayout.setVisibility(View.VISIBLE);
                    projlayout.setVisibility(View.VISIBLE);
                    joblayout.startAnimation(showlayout);
                    projlayout.startAnimation(showlayout);
                    addplus.startAnimation(showbutton);
                }
            }
        });

        compjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joblayout.setVisibility(View.GONE);
                projlayout.setVisibility(View.GONE);
                joblayout.startAnimation(hidelayout);
                projlayout.startAnimation(hidelayout);
                openjob();
            }
        });

        compproj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joblayout.setVisibility(View.GONE);
                projlayout.setVisibility(View.GONE);
                joblayout.startAnimation(hidelayout);
                projlayout.startAnimation(hidelayout);
                openProj();
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavView);
        bottomNavigationView.setSelectedItemId(R.id.companyhome);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.companyprojects:
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
                        startActivity(new Intent(getApplicationContext()
                                , companysetting.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }

    private void openProj() {
        Intent proj = new Intent(this, project.class);
        startActivity(proj);
    }

    private void openjob() {
        Intent job = new Intent(this, job.class);
        startActivity(job);
    }
}
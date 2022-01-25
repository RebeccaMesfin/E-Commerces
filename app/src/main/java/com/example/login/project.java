package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.datepicker.MaterialDatePicker;

public class project extends AppCompatActivity {

    private Button datetimepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        Button button1 = findViewById(R.id.projDone);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToCompHome();
            }
        });

        datetimepicker = findViewById(R.id.btndatepicker);

        MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
        builder.setTitleText("Select a Date");
        MaterialDatePicker materialDatePicker = builder.build();

        datetimepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(getSupportFragmentManager(), "DATE_PICKER");

            }
        });
    }

    private void BackToCompHome() {
        Intent i = new Intent(this, bottomnavbar.class);
        startActivity(i);
    }
}
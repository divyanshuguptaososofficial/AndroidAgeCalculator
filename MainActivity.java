package com.example.ages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.view.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View view)
    {
        DatePicker dob= (DatePicker)findViewById(R.id.date1);
        DatePicker current_date = (DatePicker)findViewById(R.id.date);

        int day=dob.getDayOfMonth();
        int month=dob.getMonth();
        int year=dob.getYear();

        int day2=current_date.getDayOfMonth();
        int month2=current_date.getMonth();
        int year2=current_date.getYear();
Intent intent=new Intent(MainActivity.this,ResultActivity.class);
        startActivity(intent);
    }

}



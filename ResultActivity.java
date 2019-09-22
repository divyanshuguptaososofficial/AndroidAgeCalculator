package com.example.ages;

import android.widget.TextView;
import android.view.*;

public class ResultActivity {

    public void age(int d,int m,int y,int d2,int m2,int y2)
    {
        int[] month = {31, 28, 31, 30, 31, 30, 31,
                31, 30, 31, 30, 31};

        // if birth date is greater then current
        // birth_month, then donot count this month
        // and add 30 to the date so as to subtract
        // the date and get the remaining days
        if (d > d2) {
            m2 =m2 - 1;
            d2 = d2 + month[m - 1];
        }

        // if birth month exceeds current month,
        // then do not count this year and add
        // 12 to the month so that we can subtract
        // and find out the difference
        if (m > m2) {
            y2 = y2 - 1;
            m2= m2 + 12;
        }

        // calculate date, month, year
        int calculated_date = d2 - d;
        int calculated_month = m2 - m;
        int calculated_year = y2 - y;

        // print the present age
        TextView tv = (TextView) findViewById(R.id.textView5);
        tv.setText("Years: " + calculated_year +
                " Months: " + calculated_month + " Days: " +
                calculated_date);
    }
age(d)
}

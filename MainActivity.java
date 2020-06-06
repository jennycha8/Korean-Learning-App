package com.sy.koreanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumbersClickListener clickListener = new NumbersClickListener();

        /*
        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView days = (TextView) findViewById(R.id.days);
        TextView family = (TextView) findViewById(R.id.family);

        numbers.setOnClickListener(clickListener);

         */

    }

    public void numbers(View view) {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }

    public void color(View view) {
        Intent intent = new Intent(this, ColorActivity.class);
        startActivity(intent);
    }

    public void days(View view) {
        Intent intent = new Intent(this, DaysActivity.class);
        startActivity(intent);
    }

    public void family(View view) {
        Intent intent = new Intent(this, FamilyActivity.class);
        startActivity(intent);
    }

}

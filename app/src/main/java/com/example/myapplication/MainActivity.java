package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void backToCourses(View V){

        Intent i = new Intent(this,courses.class);
        startActivity(i);
        finish();
    }

    public void backToMenu(View V){

        Intent i = new Intent(this, theMenu.class);
        startActivity(i);
        finish();
    }



}
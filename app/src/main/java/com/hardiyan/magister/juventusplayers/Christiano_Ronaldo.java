package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Christiano_Ronaldo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christiano__ronaldo);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Christiano Ronaldo");
    }
}

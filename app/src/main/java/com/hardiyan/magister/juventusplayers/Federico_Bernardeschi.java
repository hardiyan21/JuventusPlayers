package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Federico_Bernardeschi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_federico__bernardeschi);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Federico Bernardeschi");
    }
}

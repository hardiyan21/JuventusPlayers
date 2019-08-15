package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Paulo_Dybala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paulo__dybala);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Paulo Dybala");
    }
}

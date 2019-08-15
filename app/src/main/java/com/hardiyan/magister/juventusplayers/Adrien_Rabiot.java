package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Adrien_Rabiot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adrien__rabiot);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Adrien Rabiot");
    }
}

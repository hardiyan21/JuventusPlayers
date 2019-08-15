package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Luca_Pellegrini extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luca__pellegrini);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Luca Pellegrini");
    }
}

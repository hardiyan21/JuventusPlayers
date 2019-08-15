package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Juan_Cuadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juan__cuadrado);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Juan Cuadrado");
    }
}

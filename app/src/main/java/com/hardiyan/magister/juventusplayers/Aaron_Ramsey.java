package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Aaron_Ramsey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaron__ramsey);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Aaron Ramsey");
    }
}

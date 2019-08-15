package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Gigi_Buffon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gigi__buffon);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Gianluigi Buffon");
    }
}

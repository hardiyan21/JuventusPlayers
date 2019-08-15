package com.hardiyan.magister.juventusplayers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Leonardo_Bonucci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leonardo__bonucci);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Leonardo Bonucci");
    }
}

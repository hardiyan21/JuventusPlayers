package com.hardiyan.magister.juventusplayers;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_profile);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About Me");
    }

}

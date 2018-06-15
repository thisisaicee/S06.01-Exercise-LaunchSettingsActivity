package com.example.android.sunshine;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


// DONE (1) Add new Activity called SettingsActivity using Android Studio wizard
// Do step 2 in SettingsActivity

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        // DONE (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int menuID = menuItem.getItemId();
        if (menuID == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(menuItem);
    }
}

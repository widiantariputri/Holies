package com.example.cactushome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.navigation_home:
                Intent intent = new Intent(AboutActivity.this, BlogActivity.class);
                startActivity(intent);
                break;
            case R.id.navigation_dashboard:
                Intent intent_about = new Intent(AboutActivity.this, AboutActivity.class);
                startActivity(intent_about);
                break;
        }
    }
}

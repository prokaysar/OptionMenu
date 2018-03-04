package com.example.kawsa.optionmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sample_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.settingId){
            startActivity(new Intent(MainActivity.this,SettingActivity.class));
            Toast.makeText(this, "Clicked.", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.feedId){
            Toast.makeText(this, "Clicked.", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.rateId){
            Toast.makeText(this, "Clicked.", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.shaireId){
            Toast.makeText(this, "Clicked.", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}

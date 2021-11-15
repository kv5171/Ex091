package com.example.ex091;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = (LinearLayout) findViewById(R.id.mainActivity);
    }

    public void move(View view) {
        Intent si = new Intent(this, SecondActivity.class);
        startActivity(si);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id)
        {
            case R.id.blueColor: mainActivity.setBackgroundColor(Color.BLUE);
                break;
            case R.id.yellowColor: mainActivity.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.magentaColor: mainActivity.setBackgroundColor(Color.MAGENTA);
                break;
            default: return false;
        }
        return true;
    }
}
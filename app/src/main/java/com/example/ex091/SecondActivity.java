package com.example.ex091;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class SecondActivity extends AppCompatActivity {
    LinearLayout secondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondActivity = (LinearLayout) findViewById(R.id.secondActivity);
    }

    public void back(View view) {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        menu.add(0,0,400, "Black");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        String color = item.getTitle().toString();

        if (color.equals("Black"))
        {
            secondActivity.setBackgroundColor(Color.BLACK);
        }

        switch (id)
        {
            case R.id.blueColor: secondActivity.setBackgroundColor(Color.BLUE);
                break;
            case R.id.yellowColor: secondActivity.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.magentaColor: secondActivity.setBackgroundColor(Color.MAGENTA);
                break;
            default: return false;
        }
        return true;
    }
}
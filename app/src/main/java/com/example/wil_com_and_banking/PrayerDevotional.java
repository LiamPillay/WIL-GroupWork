package com.example.wil_com_and_banking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrayerDevotional extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer_devotional);
        button1 = (Button) findViewById(R.id.PrayerWallButton);
        button2 = (Button) findViewById(R.id.ScriptureButton);

        getSupportActionBar().setTitle("Village Church Lonehill");


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenPrayerWall();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenScriptures();
            }
        });
    }
    public void OpenPrayerWall(){
        Intent intent = new Intent(this, PrayerWall.class);
        startActivity(intent);
    }
    public void OpenScriptures(){
        Intent intent = new Intent(this, ScriptureLibrary.class);
        startActivity(intent);
    }
}
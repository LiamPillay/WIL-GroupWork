package com.example.wil_com_and_banking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button1 = (Button) findViewById(R.id.donationButton);
        button = (Button) findViewById(R.id.commsButton);
        button3 = (Button) findViewById(R.id.eventsButton);
        button4 = (Button) findViewById(R.id.PrayerButton);
        button2 = (Button) findViewById(R.id.sermonButton);

        getSupportActionBar().setTitle("Village Church Lonehill");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCommsPage();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDonationsPage();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenEventsPage();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenPrayerPage();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenSermonPage();
            }
        });
    }
    public void openCommsPage(){
        Intent intent = new Intent(this, Commincations.class);
        startActivity(intent);
    }
    public void openDonationsPage(){
        Intent intent = new Intent(this, Banking.class);
        startActivity(intent);
    }

    public void OpenEventsPage(){
        Intent intent = new Intent(this, Events.class);
        startActivity(intent);
    }
    public void OpenPrayerPage(){
        Intent intent = new Intent(this, PrayerDevotional.class);
        startActivity(intent);
    }
    public void OpenSermonPage(){
        Intent intent = new Intent(this, Sermon.class);
        startActivity(intent);
    }
}
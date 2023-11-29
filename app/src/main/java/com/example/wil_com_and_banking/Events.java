package com.example.wil_com_and_banking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Events extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        button = (Button) findViewById(R.id.commsButton2);

        getSupportActionBar().setTitle("Village Church Lonehill");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenCommsPage();
            }
        });
    }
    public void OpenCommsPage(){
        Intent intent = new Intent(this, Commincations.class);
        startActivity(intent);
    }
}
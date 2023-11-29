package com.example.wil_com_and_banking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Banking extends AppCompatActivity {
private Button HomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banking);

        HomeButton = (Button) findViewById(R.id.homeButton);
        getSupportActionBar().setTitle("Village Church Lonehill");


        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomePage();
            }
        });
    }
    public void openHomePage(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
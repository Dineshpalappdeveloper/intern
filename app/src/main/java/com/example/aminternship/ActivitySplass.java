package com.example.aminternship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ActivitySplass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splass);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent inext = new Intent(ActivitySplass.this,ActivityWalkThrow1.class);
                startActivity(inext);

            }
        },3500);

    }
}
package com.example.aminternship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_walkthrow3 extends AppCompatActivity {
    ImageView walk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrow3);
        walk3 = findViewById(R.id.walk3);
        walk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext = new Intent(Activity_walkthrow3.this,MainActivity.class);
                startActivity(inext);
            }
        });

    }
}
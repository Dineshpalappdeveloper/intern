package com.example.aminternship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityWalkThrow2 extends AppCompatActivity {
        ImageView walk2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk_throw2);

        walk2 = findViewById(R.id.walk2);
        walk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext = new Intent(ActivityWalkThrow2.this,Activity_walkthrow3.class);
                startActivity(inext);
            }
        });
    }
}
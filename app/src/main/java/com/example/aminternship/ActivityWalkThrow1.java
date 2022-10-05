package com.example.aminternship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityWalkThrow1 extends AppCompatActivity {
     ImageView walk1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk_throw1);
        walk1 =  findViewById(R.id.walk1);
          walk1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent inext = new Intent(ActivityWalkThrow1.this,ActivityWalkThrow2.class);
                  startActivity(inext);
              }
          });


    }

}
package com.example.test_0912;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imvLunchBox, imvNoodle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkViews();
        addData();
    }

    private void addData() {
        imvLunchBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Lunch.class);
                startActivity(intent);
            }
        });

        imvNoodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Noodle.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        imvLunchBox = findViewById(R.id.imvLunchBox);
        imvNoodle = findViewById(R.id.imvNoodle);
    }
}
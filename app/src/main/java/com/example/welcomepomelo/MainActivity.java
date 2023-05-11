package com.example.welcomepomelo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = findViewById(R.id.btnStart);
        start.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, PredictPage.class);
            startActivity(i);
        });
    }
}

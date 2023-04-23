package com.example.welcomepomelo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

public class PredictPage extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        result = findViewById(R.id.result);

        Button back2 = findViewById(R.id.btnback2);
        back2.setOnClickListener(v -> {
            Intent i = new Intent(PredictPage.this ,SelectPicture.class);
            startActivity(i);
        });
    }
}
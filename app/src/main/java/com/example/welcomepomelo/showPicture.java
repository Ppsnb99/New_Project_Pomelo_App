package com.example.welcomepomelo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class showPicture extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_picture);


        Button back = findViewById(R.id.backBtn);
        back.setOnClickListener(v -> {
            Intent i = new Intent(showPicture.this, SelectPicture.class);
            startActivity(i);
        });
        Button next = findViewById(R.id.nextBtn);
        next.setOnClickListener(v -> {
            Intent j = new Intent(showPicture.this, PredictPage.class);
            startActivity(j);
        });
    }

}
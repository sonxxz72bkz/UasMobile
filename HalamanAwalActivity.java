package com.example.tugasuts;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class HalamanAwalActivity extends AppCompatActivity {
    private static final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_awal);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(HalamanAwalActivity.this, GamePopulerActivity.class);
            startActivity(intent);
            finish();
        }, SPLASH_TIME_OUT);
    }
}


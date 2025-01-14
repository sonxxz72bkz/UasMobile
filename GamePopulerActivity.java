package com.example.tugasuts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class GamePopulerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_populer);

        ImageView logoMobileLegend = findViewById(R.id.logoMobileLegend);

        logoMobileLegend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GamePopulerActivity.this, HalamanTopupActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class DaftarNovelActivity extends AppCompatActivity {
    LinearLayout lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_novel);

        lanjut = findViewById(R.id.lanjut);
        lanjut.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(DaftarNovelActivity.this, MenuFavoriteActivity.class);
                startActivity(intent);
                return false;
            }
        });
    }
}
package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout menuInfoPengguna;
    LinearLayout menudaftarnovel;

    LinearLayout novel;



    TextView moreFavorite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuInfoPengguna = findViewById(R.id.informasi_pengguna);
        menuInfoPengguna.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(MainActivity.this, BiodataActivity.class);
                startActivity(intent);
                return false;
            }

        });
        menudaftarnovel = findViewById(R.id.menu_one);
        menudaftarnovel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(MainActivity.this, DaftarNovelActivity.class);
                startActivity(intent);
                return false;
            }

        });

        novel = findViewById(R.id.menufav);
        novel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(MainActivity.this, DaftarNovelActivity.class);
                startActivity(intent);
                return false;
            }

        });





    }
}
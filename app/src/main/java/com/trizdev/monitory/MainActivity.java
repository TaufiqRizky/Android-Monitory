package com.trizdev.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String nama = intent.getStringExtra(Biodata.Extra_NAMA);
        TextView text = (TextView) findViewById(R.id.textMain);
        text.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP "+nama+" tiap hari buat bantu "+nama+" ngatur waktu :) ");
    }

    public void exit(View view) {
        finish();
        System.exit(0);
    }
}
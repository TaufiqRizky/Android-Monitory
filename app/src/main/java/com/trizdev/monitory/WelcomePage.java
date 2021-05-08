package com.trizdev.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    public void mulai(View view) {
        Intent intent = new Intent(this,LoginCode.class);
        startActivity(intent);
    }
}
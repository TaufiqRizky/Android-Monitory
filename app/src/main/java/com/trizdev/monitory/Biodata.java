package com.trizdev.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {
    public static final String Extra_NAMA = "com.trizdev.monitory.NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void MainAction(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        EditText edtNama = (EditText) findViewById(R.id.edtNama);
        String nama = edtNama.getText().toString();
        intent.putExtra(Extra_NAMA,nama);
        startActivity(intent);
    }
}
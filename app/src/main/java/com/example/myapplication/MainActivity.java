package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.pertemuan1.praktikum1;
import com.example.myapplication.pertemuan2.praktikum2;
import com.example.myapplication.pertemuan2.tugas2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void praktikum1(View view){
        Intent a = new Intent(MainActivity.this, praktikum1.class);
        startActivity(a);
    }

    public void praktikum2(View view) {
        Intent a = new Intent(MainActivity.this, praktikum2.class);
        startActivity(a);
    }

    public void tugas2(View view) {
        Intent a = new Intent(MainActivity.this, tugas2.class);
        startActivity(a);
    }
}
package com.example.a21_11_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OverlapButtons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overlap_buttons);
    }

    public void abrirActividad(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

package com.example.a21_11_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void seleccionarActividad(View view){
        switch (view.getId()){
            case R.id.boton1:
                abrirActividad(RadioGroups.class);
                break;
            case R.id.boton2:
                abrirActividad((Buttons.class));
                break;
            case R.id.boton3:
                abrirActividad((UrlDemo.class));
                break;
            case R.id.boton4:
                abrirActividad((OverlapButtons.class));
                break;
            case R.id.boton5:
                abrirActividad((UrlDemo2.class));
                break;
            case R.id.boton6:
                abrirActividad((Scrollview.class));
                break;
        }
    }

    public void abrirActividad(Class c){
        Intent intent = new Intent(this,c);
        startActivity(intent);
    }
}

package com.example.a21_11_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioGroups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_groups);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        RadioGroup radio1 = findViewById(R.id.radioGroup1);
        RadioGroup radio2 = findViewById(R.id.radioGroup2);

        switch(view.getId()) {
            case R.id.botonIzquierda:
                if (checked)
                    radio1.setGravity(Gravity.LEFT);
                break;
            case R.id.botonCentro:
                if (checked)
                    radio1.setGravity(Gravity.CENTER);
                break;
            case R.id.botonDerecha:
                if (checked)
                    radio1.setGravity(Gravity.RIGHT);
                break;
            case R.id.botonHorizontal:
                if(checked)
                    radio2.setOrientation(LinearLayout.HORIZONTAL);
                    break;
            case R.id.botonVertical:
                if(checked)
                    radio2.setOrientation(LinearLayout.VERTICAL);
                    break;
        }
    }

    public void abrirActividad(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

package com.example.mp1_1p_1h;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        lblResultado = (TextView) findViewById(R.id.lblResultado);

        lblResultado.setText(getIntent().getExtras().getString("resultado"));
    }
}
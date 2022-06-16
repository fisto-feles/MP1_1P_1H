package com.example.mp1_1p_1h;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Mates.Mates;

public class MainActivity extends AppCompatActivity {

    EditText txtN1, txtN2;
    Button btnSuma, btnResta, btnProducto, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtN1 = (EditText) findViewById(R.id.txtN1);
        txtN2 = (EditText) findViewById(R.id.txtN2);

        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnProducto = (Button) findViewById(R.id.btnProducto);
        btnDivision = (Button) findViewById(R.id.btnDivision);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtVacio(txtN1) || txtVacio(txtN2)) {
                    Toast.makeText(getApplicationContext(), "Por favor ingrese ambos numeros", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent suma = new Intent(getApplicationContext(), Resultado.class);
                suma.putExtra("resultado", Mates.suma(Integer.valueOf(txtN1.getText().toString()), Integer.valueOf(txtN2.getText().toString())));
                startActivity(suma);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtVacio(txtN1) || txtVacio(txtN2)) {
                    Toast.makeText(getApplicationContext(), "Por favor ingrese ambos numeros", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent resta = new Intent(getApplicationContext(), Resultado.class);
                resta.putExtra("resultado", Mates.resta(Integer.valueOf(txtN1.getText().toString()), Integer.valueOf(txtN2.getText().toString())));
                startActivity(resta);
            }
        });

        btnProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtVacio(txtN1) || txtVacio(txtN2)) {
                    Toast.makeText(getApplicationContext(), "Por favor ingrese ambos numeros", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent producto = new Intent(getApplicationContext(), Resultado.class);
                producto.putExtra("resultado", Mates.producto(Integer.valueOf(txtN1.getText().toString()), Integer.valueOf(txtN2.getText().toString())));
                startActivity(producto);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtVacio(txtN1) || txtVacio(txtN2)) {
                    Toast.makeText(getApplicationContext(), "Por favor ingrese ambos numeros", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent division = new Intent(getApplicationContext(), Resultado.class);
                division.putExtra("resultado", Mates.division(Integer.valueOf(txtN1.getText().toString()), Integer.valueOf(txtN2.getText().toString())));
                startActivity(division);
            }
        });
    }

    boolean txtVacio(EditText e) {
        if (e.getText().toString().trim().length() > 0) {
            return false;
        }
        return true;
    }
}
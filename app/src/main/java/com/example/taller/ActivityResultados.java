package com.example.taller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        Intent intent = getIntent();


        String nombres = intent.getStringExtra("nombres");
        String apellidos = intent.getStringExtra("apellidos");
        String cargo = intent.getStringExtra("cargo");
        double valorDiario = ((Intent) intent).getDoubleExtra("Valor_del_dia", 0);
        double sueldoDescontado = ((Intent) intent).getDoubleExtra("sueldo_descontado", 0);

        // Mostrar los datos en las vistas correspondientes
        TextView textViewNombres = findViewById(R.id.textViewNombres);
        TextView textViewApellidos = findViewById(R.id.textViewApellidos);
        TextView textViewCargo = findViewById(R.id.textViewCargo);
        TextView textViewvalorDiario = findViewById(R.id.valorDiario);
        TextView textViewSueldoDescontado = findViewById(R.id.textViewSueldoDescontado);

        textViewNombres.setText("Nombres: " + nombres);
        textViewApellidos.setText("Apellidos: " + apellidos);
        textViewCargo.setText("Cargo: " + cargo);
        textViewvalorDiario.setText("Valor del dia" + valorDiario);
        textViewSueldoDescontado.setText("Sueldo después de descuentos: " + sueldoDescontado);
    }
}
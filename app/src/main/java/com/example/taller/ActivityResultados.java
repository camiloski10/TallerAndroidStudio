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
        double sueldoDescontado = ((Intent) intent).getDoubleExtra("sueldo_descontado", 0);

        // Mostrar los datos en las vistas correspondientes
        TextView textViewNombres = findViewById(R.id.textViewNombres);
        TextView textViewApellidos = findViewById(R.id.textViewApellidos);
        TextView textViewCargo = findViewById(R.id.textViewCargo);
        TextView textViewSueldoDescontado = findViewById(R.id.textViewSueldoDescontado);

        textViewNombres.setText("Nombres: " + nombres);
        textViewApellidos.setText("Apellidos: " + apellidos);
        textViewCargo.setText("Cargo: " + cargo);
        textViewSueldoDescontado.setText("Sueldo después de descuentos: " + sueldoDescontado);
    }
}
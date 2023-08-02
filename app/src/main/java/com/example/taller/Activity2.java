package com.example.taller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    private EditText editTextNombres, editTextApellidos, editTextCargo, editTextSueldoBase, editTextDiasLab;
    private CheckBox checkBoxDescuento, checkBoxSalud, checkBoxPension;
    Button regresarbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        editTextNombres = findViewById(R.id.editTextText7);
        editTextApellidos = findViewById(R.id.editTextText8);
        editTextCargo = findViewById(R.id.editTextText9);
        editTextSueldoBase = findViewById(R.id.editTextText10);
        editTextDiasLab = findViewById(R.id.editTextText11);
        checkBoxDescuento = findViewById(R.id.checkBox);
        checkBoxSalud = findViewById(R.id.checkBox2);
        checkBoxPension = findViewById(R.id.checkBox3);
        regresarbtn = findViewById(R.id.Regresar);
        Intent regresar = new Intent(Activity2.this, MainActivity.class);
        regresarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(regresar);

            }
        });
        Button btnLiquidar = findViewById(R.id.Liquidar);
        btnLiquidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombres = editTextNombres.getText().toString();
                String apellidos = editTextApellidos.getText().toString();
                String cargo = editTextCargo.getText().toString();
                double sueldoBase = Double.parseDouble(editTextSueldoBase.getText().toString());
                int diasLaborados = Integer.parseInt(editTextDiasLab.getText().toString());
                boolean descuento = checkBoxDescuento.isChecked();
                boolean salud = checkBoxSalud.isChecked();
                boolean pension = checkBoxPension.isChecked();

                double valorDiario = sueldoBase/30;

                double sueldoTotal = valorDiario * diasLaborados;

                double descuentoTotal = 0;
                if (descuento) {
                    descuentoTotal += sueldoBase * 0.03;
                }
                if (salud) {
                    descuentoTotal += sueldoBase * 0.04;
                }
                if (pension) {
                    descuentoTotal += sueldoBase * 0.04;
                }

                double sueldoDescontado = sueldoTotal - descuentoTotal;

                Intent intent = new Intent(Activity2.this, ActivityResultados.class);
                intent.putExtra("nombres", nombres);
                intent.putExtra("apellidos", apellidos);
                intent.putExtra("cargo", cargo);
                intent.putExtra("Valor_del_dia",  valorDiario);
                intent.putExtra("sueldo_descontado", sueldoDescontado);
                startActivity(intent);
            }
        });
    }
}
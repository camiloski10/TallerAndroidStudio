package com.example.taller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button siguientebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siguientebtn = findViewById(R.id.siguiente);
        Intent siguientey = new Intent(this, Activity2.class);

        siguientebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(siguientey);
            }
        });

    }
}
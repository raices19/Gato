package com.example.gatito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnjugar, nivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btnjugar=(Button) findViewById(R.id.btnjuego);
        nivel=(Button) findViewById(R.id.btniveles);

        btnjugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina2 = new Intent(MainActivity.this, juego.class);
                startActivity(pagina2);
            }
        });

        nivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina3 = new Intent(MainActivity.this, nivel.class);
                startActivity(pagina3);
            }
        });
        }
    }


package com.example.gatito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nivel_juego extends AppCompatActivity {

    Button btnregreso, btnone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_juego);
        getSupportActionBar().hide();

        // Boton de regreso al menu
        btnregreso=(Button) findViewById(R.id.btnregresar);
        btnregreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina2 = new Intent(nivel_juego.this, MainActivity.class);
                startActivity(pagina2);
            }
        });

        //Boton de primer nivel
        btnone=(Button) findViewById(R.id.btniveluno);
        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina3 = new Intent(nivel_juego.this, juego.class);
                startActivity(pagina3);
            }
        });

    }
}

package com.example.gatito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nivel extends AppCompatActivity {

    Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel);

        btnregresar=(Button) findViewById(R.id.btnregreso);

        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina1 = new Intent(nivel.this,MainActivity.class);
                startActivity(pagina1);
            }
        });
    }
}

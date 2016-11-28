package com.example.dkdaniz.elementarticonsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgEmpresa;
    ImageView imgServicos;
    ImageView imgClientes;
    ImageView imgContato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializando os componentes.
        imgEmpresa = (ImageView) findViewById(R.id.imgEmpresa);
        imgServicos = (ImageView) findViewById(R.id.imgServicos);
        imgClientes = (ImageView) findViewById(R.id.imgClientes);
        imgContato = (ImageView) findViewById(R.id.imgContato);

        imgEmpresa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, actEmpresa.class));
            }
        });

        imgServicos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, actServicos.class));
            }
        });

        imgClientes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, actClientes.class));
            }
        });

        imgContato.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, actContato.class));
            }
        });


    }
}

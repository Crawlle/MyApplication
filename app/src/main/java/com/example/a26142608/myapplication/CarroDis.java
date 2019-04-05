package com.example.a26142608.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CarroDis extends AppCompatActivity {

    private EditText distancia;
    private EditText potencia;
    private EditText gasolina;
    private EditText modeloAuto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_dis);

        distancia = findViewById(R.id.distancia);
        potencia = findViewById(R.id.potencia);
        gasolina = findViewById(R.id.gasolina);
        modeloAuto = findViewById(R.id.modeloAuto);


    }

    public void calculo (View v){

        double dist;
        double poten;
        double gaso;
        double gastoLi;
        String modelo;
        double resul;


        dist = Double.parseDouble(distancia.getText().toString());
        poten = Double.parseDouble(potencia.getText().toString());
        gaso = Double.parseDouble(gasolina.getText().toString());
        modelo = modeloAuto.getText().toString();

        if (poten <= 1.0){

            gastoLi = 13.00;

        }else if (poten > 1.0 && poten <= 1.4){

            gastoLi = 11.00;

        }else if (poten > 1.4 && poten <= 1.9 ){

            gastoLi = 9.50;

        }else{

            gastoLi = 7.75;

        }

        resul = ((dist/gastoLi)*gaso);

        Intent i = new Intent(getApplicationContext(),resultado.class);

        i.putExtra("resu", resul);
        i.putExtra("dist", dist);
        i.putExtra("poten", poten);
        i.putExtra("gaso", gaso);
        i.putExtra("gasto", gastoLi);
        i.putExtra("modelo", modelo);

        startActivity(i);


    }


}

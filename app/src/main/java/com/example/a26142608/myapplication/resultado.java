package com.example.a26142608.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    private TextView frase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        frase = findViewById(R.id.frase);

        Bundle dados = getIntent().getExtras();
        double dist = dados.getDouble("dist");
        double resu = dados.getDouble("resu");
        double poten = dados.getDouble("poten");
        double gaso = dados.getDouble("gaso");
        double gasto = dados.getDouble("gasto");
        String modelo = dados.getString("modelo");




        frase.setText(modelo + poten + " gasta" + " R$" + resu + " para percorrer " + dist + "km " + "com gasolina a " + "R$" + gaso + " por litro.");
    }
}

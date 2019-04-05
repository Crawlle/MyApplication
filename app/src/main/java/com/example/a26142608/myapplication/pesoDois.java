package com.example.a26142608.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pesoDois extends AppCompatActivity {

    private EditText altMasc;
    private EditText altFeme;
    private TextView result;
    private Button calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_dois);

        altMasc = findViewById(R.id.altMasc);
        altFeme = findViewById(R.id.altFeme);
        result = findViewById(R.id.result);
        calculo = findViewById(R.id.calculo);

        calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calcPeso(view);
            }
        });



    }

    public void calcPeso(View v){

        double peso;
        double res;

        if(altMasc.getText().toString().length() == 0){

            peso = Double.parseDouble(altFeme.getText().toString());

            res = (62.1 * peso)-44.7;

        }else{

            peso = Double.parseDouble(altMasc.getText().toString());

            res = (72.7 * peso)-58;
        }


        result.setText( "Seu peso ideal é: " + res);



    }

}

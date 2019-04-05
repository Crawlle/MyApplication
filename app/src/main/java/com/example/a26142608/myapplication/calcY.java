package com.example.a26142608.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calcY extends AppCompatActivity {

    private EditText xValor;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_y);

        xValor = findViewById(R.id.xValor);
        result = findViewById(R.id.result);


    }

    public void calc(View v){

        double x;
        double res;

        x = Double.parseDouble(xValor.getText().toString());
        res = 8 / (2 - x);

        result.setText("é: " + res );

    }


}

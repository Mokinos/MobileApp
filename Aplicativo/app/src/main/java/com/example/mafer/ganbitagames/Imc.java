package com.example.mafer.ganbitagames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Imc extends AppCompatActivity {
    private EditText et_peso;
    private EditText et_altura;
    private Button btn_calcular;
    private TextView tv_resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imc);

        et_peso = (EditText) findViewById(R.id.et_peso);
        et_altura = (EditText) findViewById(R.id.et_altura);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);


            btn_calcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int peso = Integer.parseInt(et_peso.getText().toString()) ;
                    float altura = Float.parseFloat(et_altura.getText().toString());
                    float resultado = peso / (altura * altura);
                    String toastResultado = String.format("%2f", resultado);
                    if (resultado < 19){
                        tv_resultado.setText("Abaixo do peso, procure seu medico");
                        Toast.makeText(getBaseContext(), toastResultado,Toast.LENGTH_LONG).show();
                    }else if (resultado > 32){
                        tv_resultado.setText("Acima do peso, procure seu medico");
                        Toast.makeText(getBaseContext(), toastResultado,Toast.LENGTH_LONG).show();
                    }else {
                        tv_resultado.setText("Parabéns você dentro do peso");
                        Toast.makeText(getBaseContext(), toastResultado,Toast.LENGTH_LONG).show();
                    }
                }
            });

    }
}

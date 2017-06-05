package com.example.mafer.ganbitagames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela2 extends AppCompatActivity {
    private  Button btn_toast;
    private  Button btn_Jan;
    private  Button btn_velha;
    private  Button btn_imc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);
            sendBroadcast(new Intent("PUFFF"));
            Intent servico = new Intent (getBaseContext(), DelayMessage.class);
            servico.putExtra(DelayMessage.EXTRA_MESSAGE, getResources().getString(R.string.mensagem2));
            startService(servico);

        Button btn_Jan = (Button) findViewById(R.id.btn_Jan);

            btn_Jan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent janke = new Intent(tela2.this, Splash4.class);
                    startActivity(janke);
                }
            });


        Button btn_velha = (Button) findViewById(R.id.btn_velha);

        btn_velha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent velha = new Intent(tela2.this, JogoVelha.class);
                startActivity(velha);
            }
        });

            Button btn_imc = (Button) findViewById(R.id.btn_imc);

                 btn_imc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent imc = new Intent(tela2.this, Splash3.class);
                 startActivity(imc);
            }
        });



        Button btn_toast = (Button) findViewById(R.id.btn_toast);

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), DelayToasd.class);
                intent.putExtra(DelayToasd.EXTRA_MESSAGE, getResources().getString(R.string.mensagem));
                startService(intent);
            }

        });
    }
}

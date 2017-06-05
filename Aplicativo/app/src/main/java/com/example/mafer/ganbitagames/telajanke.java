package com.example.mafer.ganbitagames;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class telajanke extends AppCompatActivity {

    private Button btn_tesoura;
    private Button btn_spock;
    private Button btn_pedra;
    private Button btn_papel;
    private Button btn_largato;
    //
    private TextView tv_nome;
    private ImageView img_jogador;
    private ImageView img_computador;

    private TextView tv_jogador;
    private TextView tv_computador;
    int placarP = 0;
    int placarC = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janken);



        //
        btn_largato = (Button) findViewById(R.id.btn_largato);
        btn_papel = (Button) findViewById(R.id.btn_papel);
        btn_spock = (Button) findViewById(R.id.btn_spock);
        btn_pedra = (Button) findViewById(R.id.btn_pedra);
        btn_tesoura = (Button) findViewById(R.id.btn_tesoura);
        //
        img_jogador = (ImageView) findViewById(R.id.img_jogador);
        img_computador = (ImageView) findViewById(R.id.img_computador);
        //
        tv_jogador = (TextView) findViewById(R.id.tv_jogador);
        tv_computador = (TextView) findViewById(R.id.tv_computador);
        tv_nome= (TextView) findViewById(R.id.tv_nome);
        //

        tv_nome.setText(getIntent().getStringExtra("nameplayer" ));

        Toast.makeText(getBaseContext(),getIntent().getStringExtra("nameplayer"), Toast.LENGTH_SHORT).show();


        btn_tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int escolhaComputador = (int) (Math.random()*5)+ 1;
                if (escolhaComputador == 1){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.tesoura);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.spock);
                    Toast.makeText(getBaseContext(),"Você Perdeu", Toast.LENGTH_SHORT).show();
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));


                } else if (escolhaComputador == 2 ){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.tesoura);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.papel);
                    Toast.makeText(getBaseContext(),"Você Ganhou", Toast.LENGTH_SHORT).show();
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));




                }else if (escolhaComputador == 3){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.tesoura);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.tesoura);
                    Toast.makeText(getBaseContext(),"Empate", Toast.LENGTH_SHORT).show();
                    //atualizar placar



                }else if (escolhaComputador == 4) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.tesoura);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.largato);
                    Toast.makeText(getBaseContext(),"Você Ganhou", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));


                }else if (escolhaComputador == 5) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.tesoura);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.pedra);
                    Toast.makeText(getBaseContext(),"Você Perdeu", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));


                }
            }
        });

        btn_pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int escolhaComputador = (int) (Math.random()*5)+ 1;
                if (escolhaComputador == 1){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.pedra);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.spock);
                    Toast.makeText(getBaseContext(),"Você Perdeu", Toast.LENGTH_SHORT).show();
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));


                } else if (escolhaComputador == 2 ){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.pedra);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.papel);
                    Toast.makeText(getBaseContext(),"Você Perdeu", Toast.LENGTH_SHORT).show();
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));




                }else if (escolhaComputador == 3){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.pedra);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.tesoura);
                    Toast.makeText(getBaseContext(),"Você Ganhou", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));


                }else if (escolhaComputador == 4) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.pedra);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.largato);
                    Toast.makeText(getBaseContext(),"Você Ganhou", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));


                }else if (escolhaComputador == 5) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.pedra);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.pedra);
                    Toast.makeText(getBaseContext(),"Empate", Toast.LENGTH_SHORT).show();
                    //atualizar placar


                }
            }
        });



        btn_papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int escolhaComputador = (int) (Math.random()*5)+ 1;
                if (escolhaComputador == 1){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.papel);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.spock);
                    Toast.makeText(getBaseContext(),"Você ganhou", Toast.LENGTH_SHORT).show();
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));


                } else if (escolhaComputador == 2 ){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.papel);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.papel);
                    Toast.makeText(getBaseContext(),"Empate", Toast.LENGTH_SHORT).show();




                }else if (escolhaComputador == 3){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.papel);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.tesoura);
                    Toast.makeText(getBaseContext(),"Você Pedeu", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));


                }else if (escolhaComputador == 4) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.papel);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.largato);
                    Toast.makeText(getBaseContext(),"Você Perdeu", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));


                }else if (escolhaComputador == 5) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.papel);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.pedra);
                    Toast.makeText(getBaseContext(),"Você Ganhou", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));

                }
            }
        });


        btn_largato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int escolhaComputador = (int) (Math.random()*5)+ 1;
                if (escolhaComputador == 1){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.largato);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.spock);
                    Toast.makeText(getBaseContext(),"Você ganhou", Toast.LENGTH_SHORT).show();
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));


                } else if (escolhaComputador == 2 ){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.largato);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.papel);
                    Toast.makeText(getBaseContext(),"Você Ganhou", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));



                }else if (escolhaComputador == 3){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.largato);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.tesoura);
                    Toast.makeText(getBaseContext(),"Você Pedeu", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));


                }else if (escolhaComputador == 4) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.largato);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.largato);
                    Toast.makeText(getBaseContext(),"Empate", Toast.LENGTH_SHORT).show();
                    //atualizar placar


                }else if (escolhaComputador == 5) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.largato);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.pedra);
                    Toast.makeText(getBaseContext(),"Você Perdeu", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));

                }
            }
        });


        btn_spock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int escolhaComputador = (int) (Math.random()*5)+ 1;
                if (escolhaComputador == 1){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.spock);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.spock);
                    Toast.makeText(getBaseContext(),"EMPATE", Toast.LENGTH_SHORT).show();

                } else if (escolhaComputador == 2 ){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.spock);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.papel);
                    Toast.makeText(getBaseContext(),"Você Perdeu", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));



                }else if (escolhaComputador == 3){
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.spock);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.tesoura);
                    Toast.makeText(getBaseContext(),"Você Ganhou", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));

                }else if (escolhaComputador == 4) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.spock);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.largato);
                    Toast.makeText(getBaseContext(),"Você Perdeu", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarC++;
                    tv_computador.setText(String.valueOf(placarC));

                }else if (escolhaComputador == 5) {
                    //escolhemos a imagem do jogaodr
                    img_jogador.setImageResource(R.drawable.spock);
                    //escolha do computador
                    img_computador.setImageResource(R.drawable.pedra);
                    Toast.makeText(getBaseContext(),"Você Ganhou", Toast.LENGTH_SHORT).show();
                    //atualizar placar
                    placarP++;
                    tv_jogador.setText(String.valueOf(placarP));

                }
            }
        });
    }

}

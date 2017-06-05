package com.example.mafer.ganbitagames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class JogoVelha extends AppCompatActivity {

    //total jogada
     private static int TOTAL_JOGADAS = 9;
    private Game l1, l2, l3, c1, c2, c3, d1, d2;
    //Array para ImageButton
    private ImageButton [] iB =new ImageButton[9];
    private int jogadas;
    private int jogador = 0;
    //array do jogador da vez
    private String [] pl = {"Jogador 1", "Jogador 2"};
    //Criando Array para endereço das imagens
    private int [] img = {R.drawable.batman, R.drawable.superman};
    //Método que manipula o evento de clique
    public void clickListener(View v){
        ImageButton b = (ImageButton) v;
        //Endereço da image e jogador que é int
        b.setImageResource(img[jogador]);
        //incrementar a serie escolhida pelo jogador
        Game g = ((Games)b.getTag()).gamesAddSerie(jogador);

        TextView t = (TextView) findViewById(R.id.tv_jogada);
        t.setText((g != null) ? fimJogo(g.getImageButtons(), jogador): verificarVelha(++jogadas));
    }
    public void reiniciar(View v){
        TOTAL_JOGADAS= 9;

        jogadas=0;

        jogador=0;

        for (int a=0; a<9; a++){
            iB[a].setImageResource(0);
            iB[a].setEnabled(true);
            iB[a].animate().rotationY(0).setDuration(0);
        }

        l1 = null;
        l2 = null;
        l3 = null;
        c1 = null;
        c2 = null;
        c3 = null;
        d1 = null;
        d2 = null;

        l1 = new Game(iB[0], iB[1],iB[2]);
        l2 = new Game(iB[3], iB[4],iB[5]);
        l3 = new Game(iB[6], iB[7],iB[8]);
        c1 = new Game(iB[0], iB[3],iB[6]);
        c2 = new Game(iB[1], iB[4],iB[7]);
        c3 = new Game(iB[2], iB[5],iB[8]);
        d1 = new Game(iB[0], iB[4],iB[8]);
        d2 = new Game(iB[2], iB[4],iB[6]);

        //primeira fila

        iB[0].setTag(new Games (l1, c1, d1));
        iB[1].setTag(new Games (l1, c2));
        iB[2].setTag(new Games (l1, c3, d2));

        //segunda fila

        iB[3].setTag(new Games (l2, c1));
        iB[4].setTag(new Games (l2, c2, d1, d2));
        iB[5].setTag(new Games (l2, c3));

        //terceira Fila

        iB[6].setTag(new Games (l3, c1, d2));
        iB[7].setTag(new Games (l3, c2));
        iB[8].setTag(new Games (l3, c3, d1));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogovelha);




        //lista botao
        iB[0] = (ImageButton) findViewById(R.id.b0);
        iB[1] = (ImageButton) findViewById(R.id.b1);
        iB[2] = (ImageButton) findViewById(R.id.b2);
        iB[3] = (ImageButton) findViewById(R.id.b3);
        iB[4] = (ImageButton) findViewById(R.id.b4);
        iB[5] = (ImageButton) findViewById(R.id.b5);
        iB[6] = (ImageButton) findViewById(R.id.b6);
        iB[7] = (ImageButton) findViewById(R.id.b7);
        iB[8] = (ImageButton) findViewById(R.id.b8);

        //objeto da lista de possibilidades
        l1 = new Game(iB[0], iB[1],iB[2]);
        l2 = new Game(iB[3], iB[4],iB[5]);
        l3 = new Game(iB[6], iB[7],iB[8]);
        c1 = new Game(iB[0], iB[3],iB[6]);
        c2 = new Game(iB[1], iB[4],iB[7]);
        c3 = new Game(iB[2], iB[5],iB[8]);
        d1 = new Game(iB[0], iB[4],iB[8]);
        d2 = new Game(iB[2], iB[4],iB[6]);

        //primeira fila

        iB[0].setTag(new Games (l1, c1, d1));
        iB[1].setTag(new Games (l1, c2));
        iB[2].setTag(new Games (l1, c3, d2));

        //segunda fila

        iB[3].setTag(new Games (l2, c1));
        iB[4].setTag(new Games (l2, c2, d1, d2));
        iB[5].setTag(new Games (l2, c3));

        //terceira Fila

        iB[6].setTag(new Games (l3, c1, d2));
        iB[7].setTag(new Games (l3, c2));
        iB[8].setTag(new Games (l3, c3, d1));



    }
    private String fimJogo(List<ImageButton> buttons, int jogador){
        for (ImageButton button : buttons)
        button.animate().rotationY(360).setDuration(1000);
        disableButtons();
        return getResources().getString(R.string.vencedor, pl[jogador]);
    }
    private String verificarVelha(int jogadas){
        //verifica jogados
        jogador = (jogador==0) ? 1:0;
        if (jogadas == TOTAL_JOGADAS)
            disableButtons();

        return (jogadas == TOTAL_JOGADAS) ? "Deu Velha!" : getResources().getString(R.string.player, pl[jogador]) ;
    }
    private void disableButtons(){
        for (int b = 0; b < 9; b++)
            iB[b].setEnabled(false);

    }

}

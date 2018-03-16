package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pontuacaoTimeA = 0;
    int pontuacaoTimeB = 0;

    int faltaTimeA = 0;
    int faltaTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Funções que marcam os pontos do time.
     */

    public void marcarGolTimeA(View view) {
        pontuacaoTimeA += 1;
        displayPontuacaoTimeA(pontuacaoTimeA);
    }

    public void marcarGolTimeB(View view) {
        pontuacaoTimeB += 1;
        displayPontuacaoTimeB(pontuacaoTimeB);
    }

    /**
     * Funções que mostram os pontos dos times.
     */

    public void displayPontuacaoTimeA(int gol) {
        TextView scoreView = (TextView) findViewById(R.id.pontuacao_time_a);
        scoreView.setText(String.valueOf(gol));
    }

    public void displayPontuacaoTimeB(int gol) {
        TextView scoreView = (TextView) findViewById(R.id.pontuacao_time_b);
        scoreView.setText(String.valueOf(gol));
    }

    /**
     * Funções que marcam as faltas dos times.
     */

    public void marcarFaltaTimeA(View view) {
        faltaTimeA += 1;
        displayFaltaTimeA(faltaTimeA);
    }

    public void marcarFaltaTimeB(View view) {
        faltaTimeB += 1;
        displayFaltaTimeB(faltaTimeB);
    }

    /**
     * Funções que mostram os pontos dos times.
     */

    public void displayFaltaTimeA(int falta) {
        TextView scoreView = (TextView) findViewById(R.id.falta_time_a);
        scoreView.setText(String.valueOf(falta));
    }

    public void displayFaltaTimeB(int falta) {
        TextView scoreView = (TextView) findViewById(R.id.falta_time_b);
        scoreView.setText(String.valueOf(falta));
    }

    /**
     * Funções que reseta a partida.
     */

    public void resetaPlacar(View view) {
        faltaTimeA = 0;
        faltaTimeB = 0;
        pontuacaoTimeA = 0;
        pontuacaoTimeB = 0;
        displayPontuacaoTimeA(pontuacaoTimeA);
        displayPontuacaoTimeB(pontuacaoTimeB);
        displayFaltaTimeA(faltaTimeA);
        displayFaltaTimeB(faltaTimeB);
    }
}

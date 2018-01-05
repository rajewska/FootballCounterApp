package com.rajewska.courtcounterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowA = 0;
    int yellowB = 0;
    int redA = 0;
    int redB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void teamA(View view) {
        scoreTeamA= scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void teamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    public void displayForYellowTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_a);
        scoreView.setText(String.valueOf(score));
    }

    public void yellow_Team_A(View view) {
        yellowA = yellowA + 1;
        displayForYellowTeamA(yellowA);
    }

    public void displayForYellowTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_b);
        scoreView.setText(String.valueOf(score));
    }

    public void yellow_Team_B(View view) {
        yellowB = yellowB + 1;
        displayForYellowTeamB(yellowB);
    }


    public void displayForRedTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_a);
        scoreView.setText(String.valueOf(score));
    }

    public void red_Team_A(View view) {
        redA = redA + 1;
        displayForRedTeamA(redA);
    }


    public void displayForRedTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_b);
        scoreView.setText(String.valueOf(score));
    }

    public void red_Team_B(View view) {
        redB = redB + 1;
        displayForRedTeamB(redB);
    }





    public void reset(View view) {
        displayForTeamA(0);
        displayForTeamB(0);

        displayForYellowTeamA(0);
        displayForYellowTeamB(0);

        displayForRedTeamA(0);
        displayForRedTeamB(0);


        scoreTeamA = 0;
        scoreTeamB = 0;

        yellowA = 0;
        yellowB = 0;

        redA = 0;
        redB = 0;
    }
}
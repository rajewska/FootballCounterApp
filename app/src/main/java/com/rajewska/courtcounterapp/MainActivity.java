package com.rajewska.courtcounterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;
    int yellowA;
    int yellowB;
    int redA;
    int redB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    
    // This method displays points for Team A
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // This method counts points for Team A
    public void teamA(View view) {
        scoreTeamA= scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    // This method displays points for Team B
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // This method counts points for Team B
    public void teamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    // This method displays yellow cards for Team A
    public void displayForYellowTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_a);
        scoreView.setText(String.valueOf(score));
    }

    // This method counts yellow cards for Team A
    public void yellow_Team_A(View view) {
        yellowA = yellowA + 1;
        displayForYellowTeamA(yellowA);
    }

    // This method displays yellow cards for Team B
    public void displayForYellowTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_b);
        scoreView.setText(String.valueOf(score));
    }

    // This method counts yellow cards for Team B
    public void yellow_Team_B(View view) {
        yellowB = yellowB + 1;
        displayForYellowTeamB(yellowB);
    }

    // This method displays red cards for Team A
    public void displayForRedTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_a);
        scoreView.setText(String.valueOf(score));
    }

    // This method counts red cards for Team A
    public void red_Team_A(View view) {
        redA = redA + 1;
        displayForRedTeamA(redA);
    }

    // This method displays red cards for Team B
    public void displayForRedTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_b);
        scoreView.setText(String.valueOf(score));
    }

    // This method counts red cards for Team B
    public void red_Team_B(View view) {
        redB = redB + 1;
        displayForRedTeamB(redB);
    }

//    This method resets all scores and fouls
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
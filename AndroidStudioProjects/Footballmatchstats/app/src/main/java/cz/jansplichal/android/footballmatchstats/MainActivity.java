package cz.jansplichal.android.footballmatchstats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static cz.jansplichal.android.footballmatchstats.R.id.teamAGoal;

public class MainActivity extends AppCompatActivity {
    int teamAscore = 0;
    int teamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAscore);
        displayForTeamB(teamBscore);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(teamAGoal);
        scoreView.setText(String.valueOf(teamAscore));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBGoal);
        scoreView.setText(String.valueOf(teamBscore));
    }

    public void goalA(View view) {
        teamAscore = teamAscore + 1;
        displayForTeamA(teamAscore);


    }

    public void goalB(View view) {
        teamBscore = teamBscore + 1;
        displayForTeamA(teamBscore);


    }

    public void resetall(View v) {

        teamAscore = 0;
        teamBscore = 0;
        displayForTeamA(teamAscore);
        displayForTeamB(teamBscore);


    }
}


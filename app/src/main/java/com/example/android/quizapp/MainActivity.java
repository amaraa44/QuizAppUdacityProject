package com.example.android.quizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SubmitAnswerBtn(View view) {
        displayResult(checkAnswers());
    }
    private int checkAnswers(){
        int goodAnswers = 0;
        RadioButton q1Answer = (RadioButton) findViewById(R.id.question1_Jumpman_answer_RadioButton);
        RadioButton q2Answer = (RadioButton) findViewById(R.id.question2_Animus_answer_RadioButton);
        RadioButton q3Answer = (RadioButton) findViewById(R.id.question3_Link_answer_RadioButton);
        RadioButton q4Answer = (RadioButton) findViewById(R.id.question4_Playstation2_RadioButton);

        if (q1Answer.isChecked()){
            goodAnswers = goodAnswers + 1;
        }if (q2Answer.isChecked()) {
            goodAnswers = goodAnswers + 1;
        }if (q3Answer.isChecked()){
            goodAnswers = goodAnswers + 1;
        }if (q4Answer.isChecked()){
            goodAnswers = goodAnswers + 1;
        }
        return goodAnswers;
    }
    private void displayResult(int numberOfGoodAnswers){
        Toast.makeText(this, "Number of good answers: " + numberOfGoodAnswers, Toast.LENGTH_LONG).show();
    }
}

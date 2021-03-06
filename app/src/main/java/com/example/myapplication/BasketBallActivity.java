package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class BasketBallActivity extends AppCompatActivity {
    private int mScoreA = 0;
    private int mScoreB = 0;
    private TextView mScoreATextView;
    private TextView mScoreBTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket_ball);

        mScoreATextView = (TextView) findViewById(R.id.score_a_text);
        mScoreBTextView = (TextView) findViewById(R.id.score_b_text);
    }

    public void onButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.a_1_button:
                mScoreA++;
                break;
            case R.id.a_2_button:
                mScoreA += 2;
                break;
            case R.id.a_3_button:
                mScoreA += 3;
                break;
            case R.id.b_1_button:
                mScoreB++;
                break;
            case R.id.b_2_button:
                mScoreB += 2;
                break;
            case R.id.b_3_button:
                mScoreB += 3;
                break;
            case R.id.reset_button:
                mScoreA = 0;
                mScoreB = 0;
                break;
        }

        mScoreATextView.setText("" + mScoreA);
        mScoreBTextView.setText("" + mScoreB);
    }
}

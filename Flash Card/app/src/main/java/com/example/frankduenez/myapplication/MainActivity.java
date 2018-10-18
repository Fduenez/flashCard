package com.example.frankduenez.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    Boolean isShowingAnswers = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);

            }
        });
        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);

            }
        });
        findViewById(R.id.answer_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer_1).setBackgroundColor(getResources().getColor(R.color.my_red_color, null));
                findViewById(R.id.answer_2).setBackgroundColor(getResources().getColor(R.color.my_green_color, null));
            }
        });
        findViewById(R.id.answer_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer_2).setBackgroundColor(getResources().getColor(R.color.my_green_color, null));

            }
        });
        findViewById(R.id.answer_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer_3).setBackgroundColor(getResources().getColor(R.color.my_red_color, null));
                findViewById(R.id.answer_2).setBackgroundColor(getResources().getColor(R.color.my_green_color, null));

            }
        });
        findViewById(R.id.answer_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer_4).setBackgroundColor(getResources().getColor(R.color.my_red_color, null));
                findViewById(R.id.answer_2).setBackgroundColor(getResources().getColor(R.color.my_green_color, null));

            }
        });

        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (isShowingAnswers)
                {
                    ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.ic_iconmonstr_eye_5);
                    findViewById(R.id.answer_1).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer_2).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer_3).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer_4).setVisibility(View.VISIBLE);
                    isShowingAnswers = false;
                }
                else
                {
                    ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.closed_eye);
                    findViewById(R.id.answer_1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer_2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer_3).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer_4).setVisibility(View.INVISIBLE);
                    isShowingAnswers = true;
                }

            }
        });


    }


    public native String stringFromJNI();
}

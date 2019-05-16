package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     ImageView answerImage;
     Button askButton;
     final int[] imageArray = {
             R.drawable.ball1,
             R.drawable.ball2,
             R.drawable.ball3,
             R.drawable.ball4,
             R.drawable.ball5
     };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answerImage = findViewById(R.id.answer);
        askButton = findViewById(R.id.ask_button);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random genRandom = new Random();
                int number = genRandom.nextInt(5);
                answerImage.setImageResource(imageArray[number]);
            }
        });
    }
}

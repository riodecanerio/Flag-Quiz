package com.example.bayrakquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    private TextView textViewSoru,textViewDogru,textViewYanlıs;
    private Button buttonA,buttonB,buttonC,buttonD;
    private ImageView imageViewBayrak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        textViewSoru = findViewById(R.id.textViewSoru);
        textViewDogru = findViewById(R.id.textViewDogru);
        textViewYanlıs = findViewById(R.id.textViewYanlıs);
        buttonA = findViewById(R.id.buttonA);
        buttonB = findViewById(R.id.buttonB);
        buttonC = findViewById(R.id.buttonC);
        buttonD = findViewById(R.id.buttonD);
        imageViewBayrak = findViewById(R.id.imageViewBayrak);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizActivity.this,ResultActivity.class));
                finish();
            }
        });





    }
}
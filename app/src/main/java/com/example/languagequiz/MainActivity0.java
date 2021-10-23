package com.example.languagequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        Button quiz = (Button) findViewById(R.id.quiz);     // it takes to Vocabulary Quiz view ("Computer", MainActivity1)

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity0.this, MainActivity1.class));
            }
        });

        Button test = (Button) findViewById(R.id.test);     // it takes to Grammar Test view (MainActivity6)

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity0.this, MainActivity6.class));
            }
        });


    }
}
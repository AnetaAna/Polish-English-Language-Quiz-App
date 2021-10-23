package com.example.languagequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button answer1 = (Button) findViewById(R.id.answer1);       // it shows that the answer is CORRECT
        Button answer2 = (Button) findViewById(R.id.answer2);       // it shows that the answer is incorrect
        Button answer3 = (Button) findViewById(R.id.answer3);       // it shows that the answer is incorrect

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity1.this,"THAT'S CORRECT!", Toast.LENGTH_SHORT).show();
            }
        });


        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity1.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity1.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });

        Button backtostart = (Button) findViewById(R.id.backtostart);       // it takes to start view (MainActivity0)

        backtostart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity1.this, MainActivity0.class));
            }
        });

        Button nexttoschool = (Button) findViewById(R.id.nexttoschool);     // it takes to "School" view (MainActivity2)

        nexttoschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity1.this, MainActivity2.class));
            }
        });

    }
}
package com.example.languagequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button gramback = (Button) findViewById(R.id.gramback);     // it takes to start view (MainActivity0)

        gramback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity6.this, MainActivity0.class));
            }
        });

            String word = "MAM";        // correct answer for 1st sentence
            EditText gramedit = (EditText) findViewById(R.id.gramedit);     // here user writes in their answer

            Button checkone = (Button) findViewById(R.id.checkone);     // it checks if user's answer is correct

            checkone.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(word.equalsIgnoreCase(gramedit.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

            } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: MAM", Toast.LENGTH_SHORT).show();
                }
        }
    });

        String wordtwo = "MASZ";        // correct answer for 2nd sentence
        EditText gramedittwo = (EditText) findViewById(R.id.gramedittwo);       // here user writes in their answer

        Button checktwo = (Button) findViewById(R.id.checktwo);     // it checks if user's answer is correct

        checktwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(wordtwo.equalsIgnoreCase(gramedittwo.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: MASZ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        String wordthree = "SIĘ";       // correct answer for 3rd sentence
        EditText grameditthree = (EditText) findViewById(R.id.grameditthree);       // here user writes in their answer

        Button checkthree = (Button) findViewById(R.id.checkthree);     // it checks if user's answer is correct

        checkthree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(wordthree.equalsIgnoreCase(grameditthree.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: SIĘ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        String wordfour = "SKĄD";       // correct answer for 4th sentence
        EditText grameditfour = (EditText) findViewById(R.id.grameditfour);     // here user writes in their answer

        Button checkfour = (Button) findViewById(R.id.checkfour);       // it checks if user's answer is correct

        checkfour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(wordfour.equalsIgnoreCase(grameditfour.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: SKĄD", Toast.LENGTH_SHORT).show();
                }
            }
        });

        String wordfive = "MIESZKASZ";      // correct answer for 5th sentence
        EditText grameditfive = (EditText) findViewById(R.id.grameditfive);     // here user writes in their answer

        Button checkfive = (Button) findViewById(R.id.checkfive);       // it checks if user's answer is correct

        checkfive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(wordfive.equalsIgnoreCase(grameditfive.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: MIESZKASZ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        String wordsix = "ROBI";        // correct answer for 6th sentence
        EditText grameditsix = (EditText) findViewById(R.id.grameditsix);       // here user writes in their answer

        Button checksix = (Button) findViewById(R.id.checksix);     // it checks if user's answer is correct

        checksix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(wordsix.equalsIgnoreCase(grameditsix.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: ROBI", Toast.LENGTH_SHORT).show();
                }
            }
        });

        String wordseven = "SĄ";        // correct answer for 7th sentence
        EditText grameditseven = (EditText) findViewById(R.id.grameditseven);       // here user writes in their answer

        Button checkseven = (Button) findViewById(R.id.checkseven);     // it checks if user's answer is correct

        checkseven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(wordseven.equalsIgnoreCase(grameditseven.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: SĄ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        String wordeight = "MAM";       // correct answer for 8th sentence
        EditText gramediteight = (EditText) findViewById(R.id.gramediteight);       // here user writes in their answer

        Button checkeight = (Button) findViewById(R.id.checkeight);     // it checks if user's answer is correct

        checkeight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(wordeight.equalsIgnoreCase(gramediteight.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: MAM", Toast.LENGTH_SHORT).show();
                }
            }
        });

        String wordnine = "ROBIĆ";      // correct answer for 9th sentence
        EditText grameditnine = (EditText) findViewById(R.id.grameditnine);     // here user writes in their answer

        Button checknine = (Button) findViewById(R.id.checknine);       // it checks if user's answer is correct

        checknine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(wordnine.equalsIgnoreCase(grameditnine.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: ROBIĆ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        String wordten = "JESTEŚCIE";       // correct answer for 10th sentence
        EditText grameditten = (EditText) findViewById(R.id.grameditten);       // here user writes in their answer

        Button checkten = (Button) findViewById(R.id.checkten);     // it checks if user's answer is correct

        checkten.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                // check if the word user wrote in is the same as the "correct answer"
                if(wordten.equalsIgnoreCase(grameditten.getText().toString())) {
                    Toast.makeText(MainActivity6.this,"That's correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity6.this,"Sorry! The correct answer is: JESTEŚCIE", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }}
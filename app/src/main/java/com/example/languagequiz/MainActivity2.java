package com.example.languagequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button answer11 = (Button) findViewById(R.id.answer11);     // it shows that the answer is incorrect
        Button answer22 = (Button) findViewById(R.id.answer22);     // it shows that the answer is CORRECT
        Button answer33 = (Button) findViewById(R.id.answer33);     // it shows that the answer is incorrect

        answer11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });


        answer22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this,"THAT'S CORRECT!", Toast.LENGTH_SHORT).show();
            }
        });

        answer33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });

        Button backtocomp = (Button) findViewById(R.id.backtocomp);     // it takes to Vocabulary Quiz view ("Computer", MainActivity1)

        backtocomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity1.class));
            }
        });

        Button nexttoautumn = (Button) findViewById(R.id.nexttoautumn);     // it takes to "Autumn" view (MainActivity3)

        nexttoautumn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });

    }
}
package com.example.languagequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button answer5a = (Button) findViewById(R.id.answer5a);     // it shows that the answer is CORRECT
        Button answer5b = (Button) findViewById(R.id.answer5b);     // it shows that the answer is incorrect
        Button answer5c = (Button) findViewById(R.id.answer5c);     // it shows that the answer is incorrect

        answer5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity5.this,"THAT'S CORRECT!", Toast.LENGTH_SHORT).show();
            }
        });


        answer5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity5.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });

        answer5c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity5.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });

        Button backtohouse = (Button) findViewById(R.id.backtohouse);       // it takes to "House" view (MainActivity4)

        backtohouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this, MainActivity4.class));
            }
        });

        Button startagain = (Button) findViewById(R.id.startagain);     // it takes to start view (MainActivity0)

        startagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this, MainActivity0.class));
            }
        });



    }
}

package com.example.languagequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button answer111 = (Button) findViewById(R.id.answer111);       // it shows that the answer is incorrect
        Button answer222 = (Button) findViewById(R.id.answer222);       // it shows that the answer is incorrect
        Button answer333 = (Button) findViewById(R.id.answer333);       // it shows that the answer is CORRECT

        answer111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });


        answer222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });

        answer333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this,"THAT'S CORRECT!", Toast.LENGTH_SHORT).show();
            }
        });

        Button backtoschool = (Button) findViewById(R.id.backtoschool);     // // it takes to "School" view (MainActivity2)

        backtoschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
            }
        });

        Button nexttohouse = (Button) findViewById(R.id.nexttohouse);       // it takes to "House" view (MainActivity4)

        nexttohouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this, MainActivity4.class));
            }
        });


    }
}

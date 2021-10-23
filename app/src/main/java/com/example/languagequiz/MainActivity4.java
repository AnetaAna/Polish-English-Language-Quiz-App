package com.example.languagequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button answer4a = (Button) findViewById(R.id.answer4a);     // it shows that the answer is incorrect
        Button answer4b = (Button) findViewById(R.id.answer4b);     // it shows that the answer is incorrect
        Button answer4c = (Button) findViewById(R.id.answer4c);     // it shows that the answer is CORRECT

        answer4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity4.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });


        answer4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity4.this,"THAT'S NOT CORRECT - TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });

        answer4c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity4.this,"THAT'S CORRECT!", Toast.LENGTH_SHORT).show();
            }
        });

        Button backtoautumn = (Button) findViewById(R.id.backtoautumn);     // it takes to "Autumn" view (MainActivity3)

        backtoautumn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity4.this, MainActivity3.class));
            }
        });

        Button nexttopen = (Button) findViewById(R.id.nexttopen);       // it takes to "Pen" view (MainActivity5)

        nexttopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity4.this, MainActivity5.class));
            }
        });


    }
}

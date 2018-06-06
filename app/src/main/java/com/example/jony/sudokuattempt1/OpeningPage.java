package com.example.jony.sudokuattempt1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpeningPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_page);

        Button startSudokuButton = findViewById(R.id.startSudokuButton);
        startSudokuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startSudokuSolver = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startSudokuSolver);
            }
        });

        Button startAndokuButton = findViewById(R.id.startAndokuButton);
        startAndokuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startAndokuSolver = new Intent(getApplicationContext(), AndokuActivity.class);
                startActivity(startAndokuSolver);
            }
        });

    }
}

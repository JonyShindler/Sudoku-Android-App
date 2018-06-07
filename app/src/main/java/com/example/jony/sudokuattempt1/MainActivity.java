package com.example.jony.sudokuattempt1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jony.sudokuattempt1.sudoku.sudoku.SolverType;
import com.example.jony.sudokuattempt1.sudoku.sudoku.SudokuSolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.jony.sudokuattempt1.sudoku.sudoku.SudokuSolver.solveSudoku;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button solveButton = findViewById(R.id.solveButton);
        final TextView resultText = findViewById(R.id.resultMessageTextView);
        final List<EditText> boxes = makeList();
        solveButton.setOnClickListener(new SolverOnClickListener(boxes, resultText, SolverType.NORMAL));

        Button clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText("");
                clearBoxes(boxes);
            }
        });

        Button exampleButton = findViewById(R.id.exampleButton);
        exampleButton.setOnClickListener(new SudokuExampleClickListener(boxes, resultText));
    }

    private void clearBoxes(List<EditText> boxes) {
        for (EditText box : boxes) {
            box.setText("");
            box.setTextColor(Color.BLACK);
        }
    }


    List<EditText> makeList () {
        List<EditText> boxes = new ArrayList<>();

        boxes.add((EditText) findViewById(R.id.editText1)); boxes.add((EditText) findViewById(R.id.editText2)); boxes.add((EditText) findViewById(R.id.editText3));
        boxes.add((EditText) findViewById(R.id.editText4)); boxes.add((EditText) findViewById(R.id.editText5)); boxes.add((EditText) findViewById(R.id.editText6));
        boxes.add((EditText) findViewById(R.id.editText7)); boxes.add((EditText) findViewById(R.id.editText8)); boxes.add((EditText) findViewById(R.id.editText9));
        boxes.add((EditText) findViewById(R.id.editText10)); boxes.add((EditText) findViewById(R.id.editText11)); boxes.add((EditText) findViewById(R.id.editText12));
        boxes.add((EditText) findViewById(R.id.editText13)); boxes.add((EditText) findViewById(R.id.editText14)); boxes.add((EditText) findViewById(R.id.editText15));
        boxes.add((EditText) findViewById(R.id.editText16)); boxes.add((EditText) findViewById(R.id.editText17)); boxes.add((EditText) findViewById(R.id.editText18));
        boxes.add((EditText) findViewById(R.id.editText19)); boxes.add((EditText) findViewById(R.id.editText20)); boxes.add((EditText) findViewById(R.id.editText21));
        boxes.add((EditText) findViewById(R.id.editText22)); boxes.add((EditText) findViewById(R.id.editText23)); boxes.add((EditText) findViewById(R.id.editText24));
        boxes.add((EditText) findViewById(R.id.editText25)); boxes.add((EditText) findViewById(R.id.editText26)); boxes.add((EditText) findViewById(R.id.editText27));
        boxes.add((EditText) findViewById(R.id.editText28)); boxes.add((EditText) findViewById(R.id.editText29)); boxes.add((EditText) findViewById(R.id.editText30));
        boxes.add((EditText) findViewById(R.id.editText31)); boxes.add((EditText) findViewById(R.id.editText32)); boxes.add((EditText) findViewById(R.id.editText33));
        boxes.add((EditText) findViewById(R.id.editText34)); boxes.add((EditText) findViewById(R.id.editText35)); boxes.add((EditText) findViewById(R.id.editText36));
        boxes.add((EditText) findViewById(R.id.editText37)); boxes.add((EditText) findViewById(R.id.editText38)); boxes.add((EditText) findViewById(R.id.editText39));
        boxes.add((EditText) findViewById(R.id.editText40)); boxes.add((EditText) findViewById(R.id.editText41)); boxes.add((EditText) findViewById(R.id.editText42));
        boxes.add((EditText) findViewById(R.id.editText43)); boxes.add((EditText) findViewById(R.id.editText44)); boxes.add((EditText) findViewById(R.id.editText45));
        boxes.add((EditText) findViewById(R.id.editText46)); boxes.add((EditText) findViewById(R.id.editText47)); boxes.add((EditText) findViewById(R.id.editText48));
        boxes.add((EditText) findViewById(R.id.editText49)); boxes.add((EditText) findViewById(R.id.editText50)); boxes.add((EditText) findViewById(R.id.editText51));
        boxes.add((EditText) findViewById(R.id.editText52)); boxes.add((EditText) findViewById(R.id.editText53)); boxes.add((EditText) findViewById(R.id.editText54));
        boxes.add((EditText) findViewById(R.id.editText55)); boxes.add((EditText) findViewById(R.id.editText56)); boxes.add((EditText) findViewById(R.id.editText57));
        boxes.add((EditText) findViewById(R.id.editText58)); boxes.add((EditText) findViewById(R.id.editText59)); boxes.add((EditText) findViewById(R.id.editText60));
        boxes.add((EditText) findViewById(R.id.editText61)); boxes.add((EditText) findViewById(R.id.editText62)); boxes.add((EditText) findViewById(R.id.editText63));
        boxes.add((EditText) findViewById(R.id.editText64)); boxes.add((EditText) findViewById(R.id.editText65)); boxes.add((EditText) findViewById(R.id.editText66));
        boxes.add((EditText) findViewById(R.id.editText67)); boxes.add((EditText) findViewById(R.id.editText68)); boxes.add((EditText) findViewById(R.id.editText69));
        boxes.add((EditText) findViewById(R.id.editText70)); boxes.add((EditText) findViewById(R.id.editText71)); boxes.add((EditText) findViewById(R.id.editText72));
        boxes.add((EditText) findViewById(R.id.editText73)); boxes.add((EditText) findViewById(R.id.editText74)); boxes.add((EditText) findViewById(R.id.editText75));
        boxes.add((EditText) findViewById(R.id.editText76)); boxes.add((EditText) findViewById(R.id.editText77)); boxes.add((EditText) findViewById(R.id.editText78));
        boxes.add((EditText) findViewById(R.id.editText79)); boxes.add((EditText) findViewById(R.id.editText80)); boxes.add((EditText) findViewById(R.id.editText81));

        return boxes;
    }


    private class SudokuExampleClickListener implements View.OnClickListener {
        private final List<EditText> boxes;
        private final TextView resultText;

        public SudokuExampleClickListener(List<EditText> boxes, TextView resultText) {
            this.boxes = boxes;
            this.resultText = resultText;
        }

        @Override
        public void onClick(View v) {
            clearBoxes(boxes);
            resultText.setText("");

            boxes.get(3).setText("2"); boxes.get(7).setText("6"); boxes.get(8).setText("3");
            boxes.get(9).setText("3"); boxes.get(14).setText("5"); boxes.get(15).setText("4"); boxes.get(17).setText("1");
            boxes.get(20).setText("1"); boxes.get(23).setText("3"); boxes.get(24).setText("9"); boxes.get(25).setText("8");
            boxes.get(34).setText("9");
            boxes.get(39).setText("5"); boxes.get(40).setText("3"); boxes.get(41).setText("8");
            boxes.get(46).setText("3");
            boxes.get(55).setText("2"); boxes.get(56).setText("6"); boxes.get(57).setText("3"); boxes.get(60).setText("5");
            boxes.get(63).setText("5"); boxes.get(65).setText("3"); boxes.get(66).setText("7"); boxes.get(71).setText("8");
            boxes.get(72).setText("4"); boxes.get(73).setText("7"); boxes.get(77).setText("1");
        }
    }
}

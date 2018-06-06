package com.example.jony.sudokuattempt1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AndokuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andoku);

        Button solveButton = findViewById(R.id.solveButton);
        final TextView resultText = findViewById(R.id.resultMessageTextView);
        final List<EditText> boxes = makeList();
        solveButton.setOnClickListener(new SolverOnClickListener(boxes, resultText));

        Button clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText("");
                clearBoxes(boxes);
            }
        });

        Button exampleButton = findViewById(R.id.exampleButton);
        exampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearBoxes(boxes);

              //TODO implement example here.
            }
        });
    }

    private void clearBoxes(List<EditText> boxes) {
        for (EditText box : boxes) {
            box.setText("");
            box.setTextColor(Color.BLACK);
        }
    }




    private List<EditText> makeList () {
        List<EditText> boxes = new ArrayList<>();

        boxes.add((EditText) findViewById(R.id.editTextAndoku1)); boxes.add((EditText) findViewById(R.id.editTextAndoku2)); boxes.add((EditText) findViewById(R.id.editTextAndoku3));
        boxes.add((EditText) findViewById(R.id.editTextAndoku4)); boxes.add((EditText) findViewById(R.id.editTextAndoku5)); boxes.add((EditText) findViewById(R.id.editTextAndoku6));
        boxes.add((EditText) findViewById(R.id.editTextAndoku7)); boxes.add((EditText) findViewById(R.id.editTextAndoku8)); boxes.add((EditText) findViewById(R.id.editTextAndoku9));
        boxes.add((EditText) findViewById(R.id.editTextAndoku10)); boxes.add((EditText) findViewById(R.id.editTextAndoku11)); boxes.add((EditText) findViewById(R.id.editTextAndoku12));
        boxes.add((EditText) findViewById(R.id.editTextAndoku13)); boxes.add((EditText) findViewById(R.id.editTextAndoku14)); boxes.add((EditText) findViewById(R.id.editTextAndoku15));
        boxes.add((EditText) findViewById(R.id.editTextAndoku16)); boxes.add((EditText) findViewById(R.id.editTextAndoku17)); boxes.add((EditText) findViewById(R.id.editTextAndoku18));
        boxes.add((EditText) findViewById(R.id.editTextAndoku19)); boxes.add((EditText) findViewById(R.id.editTextAndoku20)); boxes.add((EditText) findViewById(R.id.editTextAndoku21));
        boxes.add((EditText) findViewById(R.id.editTextAndoku22)); boxes.add((EditText) findViewById(R.id.editTextAndoku23)); boxes.add((EditText) findViewById(R.id.editTextAndoku24));
        boxes.add((EditText) findViewById(R.id.editTextAndoku25)); boxes.add((EditText) findViewById(R.id.editTextAndoku26)); boxes.add((EditText) findViewById(R.id.editTextAndoku27));
        boxes.add((EditText) findViewById(R.id.editTextAndoku28)); boxes.add((EditText) findViewById(R.id.editTextAndoku29)); boxes.add((EditText) findViewById(R.id.editTextAndoku30));
        boxes.add((EditText) findViewById(R.id.editTextAndoku31)); boxes.add((EditText) findViewById(R.id.editTextAndoku32)); boxes.add((EditText) findViewById(R.id.editTextAndoku33));
        boxes.add((EditText) findViewById(R.id.editTextAndoku34)); boxes.add((EditText) findViewById(R.id.editTextAndoku35)); boxes.add((EditText) findViewById(R.id.editTextAndoku36));
        boxes.add((EditText) findViewById(R.id.editTextAndoku37)); boxes.add((EditText) findViewById(R.id.editTextAndoku38)); boxes.add((EditText) findViewById(R.id.editTextAndoku39));
        boxes.add((EditText) findViewById(R.id.editTextAndoku40)); boxes.add((EditText) findViewById(R.id.editTextAndoku41)); boxes.add((EditText) findViewById(R.id.editTextAndoku42));
        boxes.add((EditText) findViewById(R.id.editTextAndoku43)); boxes.add((EditText) findViewById(R.id.editTextAndoku44)); boxes.add((EditText) findViewById(R.id.editTextAndoku45));
        boxes.add((EditText) findViewById(R.id.editTextAndoku46)); boxes.add((EditText) findViewById(R.id.editTextAndoku47)); boxes.add((EditText) findViewById(R.id.editTextAndoku48));
        boxes.add((EditText) findViewById(R.id.editTextAndoku49)); boxes.add((EditText) findViewById(R.id.editTextAndoku50)); boxes.add((EditText) findViewById(R.id.editTextAndoku51));
        boxes.add((EditText) findViewById(R.id.editTextAndoku52)); boxes.add((EditText) findViewById(R.id.editTextAndoku53)); boxes.add((EditText) findViewById(R.id.editTextAndoku54));
        boxes.add((EditText) findViewById(R.id.editTextAndoku55)); boxes.add((EditText) findViewById(R.id.editTextAndoku56)); boxes.add((EditText) findViewById(R.id.editTextAndoku57));
        boxes.add((EditText) findViewById(R.id.editTextAndoku58)); boxes.add((EditText) findViewById(R.id.editTextAndoku59)); boxes.add((EditText) findViewById(R.id.editTextAndoku60));
        boxes.add((EditText) findViewById(R.id.editTextAndoku61)); boxes.add((EditText) findViewById(R.id.editTextAndoku62)); boxes.add((EditText) findViewById(R.id.editTextAndoku63));
        boxes.add((EditText) findViewById(R.id.editTextAndoku64)); boxes.add((EditText) findViewById(R.id.editTextAndoku65)); boxes.add((EditText) findViewById(R.id.editTextAndoku66));
        boxes.add((EditText) findViewById(R.id.editTextAndoku67)); boxes.add((EditText) findViewById(R.id.editTextAndoku68)); boxes.add((EditText) findViewById(R.id.editTextAndoku69));
        boxes.add((EditText) findViewById(R.id.editTextAndoku70)); boxes.add((EditText) findViewById(R.id.editTextAndoku71)); boxes.add((EditText) findViewById(R.id.editTextAndoku72));
        boxes.add((EditText) findViewById(R.id.editTextAndoku73)); boxes.add((EditText) findViewById(R.id.editTextAndoku74)); boxes.add((EditText) findViewById(R.id.editTextAndoku75));
        boxes.add((EditText) findViewById(R.id.editTextAndoku76)); boxes.add((EditText) findViewById(R.id.editTextAndoku77)); boxes.add((EditText) findViewById(R.id.editTextAndoku78));
        boxes.add((EditText) findViewById(R.id.editTextAndoku79)); boxes.add((EditText) findViewById(R.id.editTextAndoku80)); boxes.add((EditText) findViewById(R.id.editTextAndoku81));

        return boxes;
    }


}

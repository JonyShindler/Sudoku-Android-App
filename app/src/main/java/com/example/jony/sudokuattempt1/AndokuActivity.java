package com.example.jony.sudokuattempt1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jony.sudokuattempt1.sudoku.sudoku.SolverType;

import java.util.ArrayList;
import java.util.List;

public class AndokuActivity extends AppCompatActivity {

    int selectedColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andoku);

        Button solveButton = findViewById(R.id.solveButton);
        final TextView resultText = findViewById(R.id.resultMessageTextView);
        final List<EditText> boxes = makeList();
        solveButton.setOnClickListener(new SolverOnClickListener(boxes, resultText, SolverType.ANDOKU));

        Button clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText("");
                clearBoxes(boxes);
            }
        });

        Button exampleButton = findViewById(R.id.exampleButton);
        exampleButton.setOnClickListener(new AndokuExampleClickListener(boxes, resultText));

        addColouredButtons();
    }


    private void addColouredButtons() {
        Button tomatoButton = findViewById(R.id.tomatoButton);
        tomatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedColor = R.drawable.tomato_box_border;
            }
        });

        Button orangeButton = findViewById(R.id.orangeButton);
        orangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedColor = R.drawable.orange_box_border;
            }
        });

        Button darkBlueButton = findViewById(R.id.darkBlueButton);
        darkBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedColor = R.drawable.dark_blue_box_border;
            }
        });


        Button pinkButton = findViewById(R.id.pinkButton);
        pinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedColor = R.drawable.pink_box_border;
            }
        });

        Button lightBlueButton = findViewById(R.id.lightBlueButton);
        lightBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedColor = R.drawable.light_blue_box_border;
            }
        });

        Button redButton = findViewById(R.id.redButton);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedColor = R.drawable.red_box_border;
            }
        });

        Button greenButton = findViewById(R.id.greenButton);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedColor = R.drawable.green_box_border;
            }
        });

        Button yellowButton = findViewById(R.id.yellowButton);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedColor = R.drawable.yellow_box_border;
            }
        });

        Button purpleButton = findViewById(R.id.purpleButton);
        purpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedColor = R.drawable.purple_box_border;
            }
        });
    }


    private void clearBoxes(List<EditText> boxes) {
        for (EditText box : boxes) {
            box.setText("");
            box.setTextColor(Color.BLACK);
            box.setBackgroundResource(R.drawable.white_box_border);
        }
    }



    private List<EditText> makeList () {
        List<EditText> boxes = new ArrayList<>();

        makeAndAddBox(boxes, R.id.editTextAndoku1 ); makeAndAddBox(boxes, R.id.editTextAndoku2 ); makeAndAddBox(boxes, R.id.editTextAndoku3 );
        makeAndAddBox(boxes, R.id.editTextAndoku4 ); makeAndAddBox(boxes, R.id.editTextAndoku5 ); makeAndAddBox(boxes, R.id.editTextAndoku6 );
        makeAndAddBox(boxes, R.id.editTextAndoku7 ); makeAndAddBox(boxes, R.id.editTextAndoku8 ); makeAndAddBox(boxes, R.id.editTextAndoku9 );
        makeAndAddBox(boxes, R.id.editTextAndoku10); makeAndAddBox(boxes, R.id.editTextAndoku11); makeAndAddBox(boxes, R.id.editTextAndoku12);
        makeAndAddBox(boxes, R.id.editTextAndoku13); makeAndAddBox(boxes, R.id.editTextAndoku14); makeAndAddBox(boxes, R.id.editTextAndoku15);
        makeAndAddBox(boxes, R.id.editTextAndoku16); makeAndAddBox(boxes, R.id.editTextAndoku17); makeAndAddBox(boxes, R.id.editTextAndoku18);
        makeAndAddBox(boxes, R.id.editTextAndoku19); makeAndAddBox(boxes, R.id.editTextAndoku20); makeAndAddBox(boxes, R.id.editTextAndoku21);
        makeAndAddBox(boxes, R.id.editTextAndoku22); makeAndAddBox(boxes, R.id.editTextAndoku23); makeAndAddBox(boxes, R.id.editTextAndoku24);
        makeAndAddBox(boxes, R.id.editTextAndoku25); makeAndAddBox(boxes, R.id.editTextAndoku26); makeAndAddBox(boxes, R.id.editTextAndoku27);
        makeAndAddBox(boxes, R.id.editTextAndoku28); makeAndAddBox(boxes, R.id.editTextAndoku29); makeAndAddBox(boxes, R.id.editTextAndoku30);
        makeAndAddBox(boxes, R.id.editTextAndoku31); makeAndAddBox(boxes, R.id.editTextAndoku32); makeAndAddBox(boxes, R.id.editTextAndoku33);
        makeAndAddBox(boxes, R.id.editTextAndoku34); makeAndAddBox(boxes, R.id.editTextAndoku35); makeAndAddBox(boxes, R.id.editTextAndoku36);
        makeAndAddBox(boxes, R.id.editTextAndoku37); makeAndAddBox(boxes, R.id.editTextAndoku38); makeAndAddBox(boxes, R.id.editTextAndoku39);
        makeAndAddBox(boxes, R.id.editTextAndoku40); makeAndAddBox(boxes, R.id.editTextAndoku41); makeAndAddBox(boxes, R.id.editTextAndoku42);
        makeAndAddBox(boxes, R.id.editTextAndoku43); makeAndAddBox(boxes, R.id.editTextAndoku44); makeAndAddBox(boxes, R.id.editTextAndoku45);
        makeAndAddBox(boxes, R.id.editTextAndoku46); makeAndAddBox(boxes, R.id.editTextAndoku47); makeAndAddBox(boxes, R.id.editTextAndoku48);
        makeAndAddBox(boxes, R.id.editTextAndoku49); makeAndAddBox(boxes, R.id.editTextAndoku50); makeAndAddBox(boxes, R.id.editTextAndoku51);
        makeAndAddBox(boxes, R.id.editTextAndoku52); makeAndAddBox(boxes, R.id.editTextAndoku53); makeAndAddBox(boxes, R.id.editTextAndoku54);
        makeAndAddBox(boxes, R.id.editTextAndoku55); makeAndAddBox(boxes, R.id.editTextAndoku56); makeAndAddBox(boxes, R.id.editTextAndoku57);
        makeAndAddBox(boxes, R.id.editTextAndoku58); makeAndAddBox(boxes, R.id.editTextAndoku59); makeAndAddBox(boxes, R.id.editTextAndoku60);
        makeAndAddBox(boxes, R.id.editTextAndoku61); makeAndAddBox(boxes, R.id.editTextAndoku62); makeAndAddBox(boxes, R.id.editTextAndoku63);
        makeAndAddBox(boxes, R.id.editTextAndoku64); makeAndAddBox(boxes, R.id.editTextAndoku65); makeAndAddBox(boxes, R.id.editTextAndoku66);
        makeAndAddBox(boxes, R.id.editTextAndoku67); makeAndAddBox(boxes, R.id.editTextAndoku68); makeAndAddBox(boxes, R.id.editTextAndoku69);
        makeAndAddBox(boxes, R.id.editTextAndoku70); makeAndAddBox(boxes, R.id.editTextAndoku71); makeAndAddBox(boxes, R.id.editTextAndoku72);
        makeAndAddBox(boxes, R.id.editTextAndoku73); makeAndAddBox(boxes, R.id.editTextAndoku74); makeAndAddBox(boxes, R.id.editTextAndoku75);
        makeAndAddBox(boxes, R.id.editTextAndoku76); makeAndAddBox(boxes, R.id.editTextAndoku77); makeAndAddBox(boxes, R.id.editTextAndoku78);
        makeAndAddBox(boxes, R.id.editTextAndoku79); makeAndAddBox(boxes, R.id.editTextAndoku80); makeAndAddBox(boxes, R.id.editTextAndoku81);

        return boxes;
    }

    private void makeAndAddBox(List<EditText> boxes, int id) {
        final EditText box = findViewById(id);
        box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             box.setBackgroundResource(selectedColor);
             box.setTag(selectedColor);
            }
        });
        boxes.add(box);
    }

    private class AndokuExampleClickListener implements View.OnClickListener {
        private final List<EditText> bxs;
        private final TextView resultText;

        public AndokuExampleClickListener(List<EditText> boxes, TextView resultText) {
            this.bxs = boxes;
            this.resultText = resultText;
        }

        @Override
        public void onClick(View v) {
            clearBoxes(bxs);
            resultText.setText("");

            bxs.get(1).setText("2"); bxs.get(5).setText("9"); bxs.get(6).setText("6");
            bxs.get(9).setText("7"); bxs.get(10).setText("6"); bxs.get(11).setText("3"); bxs.get(13).setText("9"); bxs.get(15).setText("1"); bxs.get(16).setText("2");
            bxs.get(18).setText("9"); bxs.get(22).setText("2"); bxs.get(23).setText("7");
            bxs.get(28).setText("4"); bxs.get(33).setText("7"); bxs.get(35).setText("5");
            bxs.get(36).setText("1"); bxs.get(38).setText("7"); bxs.get(40).setText("6"); bxs.get(42).setText("8"); bxs.get(44).setText("2");
            bxs.get(45).setText("8"); bxs.get(47).setText("2"); bxs.get(52).setText("5");
            bxs.get(57).setText("6"); bxs.get(58).setText("7"); bxs.get(62).setText("9");
            bxs.get(64).setText("7"); bxs.get(65).setText("9"); bxs.get(67).setText("1"); bxs.get(69).setText("5"); bxs.get(70).setText("8"); bxs.get(71).setText("3");
            bxs.get(74).setText("8"); bxs.get(75).setText("3"); bxs.get(79).setText("4");

            int[] box1 = {0, 1, 2, 9, 10, 18, 19, 27, 28};
            int[] box2 = {3, 4, 5, 6, 14, 15, 23, 31, 32};
            int[] box3 = {7, 8, 16, 17, 24, 25, 26, 34, 35};
            int[] box4 = {11, 12, 13, 20, 29, 36, 37, 38, 47};
            int[] box5 = {21, 22, 30, 39, 40, 41, 50, 58, 59};
            int[] box6 = {33, 42, 43, 44, 51, 60, 69, 67, 68};
            int[] box7 = {45, 46, 54, 55, 56, 63, 64, 72, 73};
            int[] box8 = {48, 49, 57, 65, 66, 74, 75, 76, 77};
            int[] box9 = {52, 53, 61, 62, 70, 71, 78, 79, 80};
            makeTheseBoxesColourX(bxs, box1, R.drawable.tomato_box_border);
            makeTheseBoxesColourX(bxs, box2, R.drawable.orange_box_border);
            makeTheseBoxesColourX(bxs, box3, R.drawable.pink_box_border);
            makeTheseBoxesColourX(bxs, box4, R.drawable.dark_blue_box_border);
            makeTheseBoxesColourX(bxs, box5, R.drawable.light_blue_box_border);
            makeTheseBoxesColourX(bxs, box6, R.drawable.red_box_border);
            makeTheseBoxesColourX(bxs, box7, R.drawable.green_box_border);
            makeTheseBoxesColourX(bxs, box8, R.drawable.yellow_box_border);
            makeTheseBoxesColourX(bxs, box9, R.drawable.purple_box_border);
        }

        private void makeTheseBoxesColourX(List<EditText> boxes, int[] boxIndices, int drawable) {
            for(int index : boxIndices){
                EditText box = boxes.get(index);
                box.setBackgroundResource(drawable);
                box.setTag(drawable);
            }
        }
    }
}

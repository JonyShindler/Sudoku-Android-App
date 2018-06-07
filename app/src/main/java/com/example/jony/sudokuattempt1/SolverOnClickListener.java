package com.example.jony.sudokuattempt1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jony.sudokuattempt1.sudoku.sudoku.SolverType;
import com.example.jony.sudokuattempt1.sudoku.sudoku.SudokuSolver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.jony.sudokuattempt1.sudoku.sudoku.SudokuSolver.solveSudoku;

class SolverOnClickListener implements View.OnClickListener {
    private final List<EditText> boxes;
    private final TextView resultText;
    private final SolverType solverType;
    private Map<Integer, Integer> mapOfInputBoxes;

    public SolverOnClickListener(List<EditText> boxes, TextView resultText, SolverType solverType) {
        this.boxes = boxes;
        this.resultText = resultText;
        this.solverType = solverType;
    }

    @Override
    public void onClick(View v) {
        Map<Integer, Integer> mapOfInputValues = makeInputMap(boxes);

        for (EditText box : boxes) {
            box.setTextColor(Color.BLACK);
        }

        // If its andoku, make sure all the box colours are correct.
        if (solverType == SolverType.ANDOKU) {
            mapOfInputBoxes = makeBoxInputMap(boxes);

            if (mapOfInputBoxes.values().size() != 81) {
                resultText.setText("Colours not complete");
                return;
            }

            int counter = 0;
            for (Integer number : mapOfInputBoxes.values()) {
                counter = counter + number;
            }

            if (counter != 405) {
                resultText.setText("There are not 9 of each colour");
                return;
            }
        }

        // Mark any invalid cell numbers in red.
        List<Integer> invalidCells = SudokuSolver.validateInputMap(mapOfInputValues, mapOfInputBoxes, solverType);
        if (!invalidCells.isEmpty()) {
            for (Integer naughtyCell : invalidCells) {
                boxes.get(naughtyCell-1).setTextColor(Color.RED);
            }
            resultText.setText(R.string.invalidInput);
            return;
        }


        // If the input grid is valid, then we can proceed with solving it.
        List<Integer> result = new ArrayList<>();
        try {
            result = solveSudoku(mapOfInputValues, mapOfInputBoxes, solverType);
        } catch (Exception e) {
        resultText.setText(R.string.solvingUnsuccessful);
        }

        // If we couldn't solve it, then say it was unsuccessful.
        if (result == null) {
            resultText.setText(R.string.solvingUnsuccessful);
            return;
        }

        // Otherwise, if its successful, we can populate the solution on screen.
        if (!result.isEmpty()) {
            int index = 1;
            for (EditText box : boxes) {
                box.setText(result.get(index).toString());
                index ++;
            }
            resultText.setText(R.string.solvingSuccessful);
        }
    }


    private Map<Integer, Integer> makeInputMap(List<EditText> boxes){
        Map<Integer, Integer> mapOfInputValues = new HashMap<>();

        int index = 1;
        for (EditText box : boxes) {
            if (!box.getText().toString().equals("")) {
                mapOfInputValues.put(index, Integer.parseInt(box.getText().toString()));
            }
            index ++;
        }
        return mapOfInputValues;
    }

    private Map<Integer, Integer> makeBoxInputMap(List<EditText> boxes){
        Map<Integer, Integer> mapOfBoxValues = new HashMap<>();

        int index = 1;
        for (EditText box : boxes) {
            if (box.getTag() == null) {
                continue;
            }

            int tag = (int)box.getTag();

            if (tag == R.drawable.tomato_box_border) {
                mapOfBoxValues.put(index, 1);
            } else
            if (tag == R.drawable.orange_box_border) {
                mapOfBoxValues.put(index, 2);
            } else
            if (tag == R.drawable.dark_blue_box_border) {
                mapOfBoxValues.put(index, 3);
            } else
            if (tag == R.drawable.pink_box_border) {
                mapOfBoxValues.put(index, 4);
            } else
            if (tag == R.drawable.light_blue_box_border) {
                mapOfBoxValues.put(index, 5);
            } else
            if (tag == R.drawable.red_box_border) {
                mapOfBoxValues.put(index, 6);
            } else
            if (tag == R.drawable.green_box_border) {
                mapOfBoxValues.put(index, 7);
            } else
            if (tag == R.drawable.yellow_box_border) {
                mapOfBoxValues.put(index, 8);
            } else
            if (tag == R.drawable.purple_box_border) {
                mapOfBoxValues.put(index, 9);
            }
            index ++;
        }
        return mapOfBoxValues;
    }


}

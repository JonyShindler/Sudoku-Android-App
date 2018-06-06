package com.example.jony.sudokuattempt1;

import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jony.sudokuattempt1.sudoku.sudoku.SolverType;
import com.example.jony.sudokuattempt1.sudoku.sudoku.SudokuSolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.jony.sudokuattempt1.sudoku.sudoku.SudokuSolver.solveSudoku;

class SolverOnClickListener implements View.OnClickListener {
    private final List<EditText> boxes;
    private final TextView resultText;

    public SolverOnClickListener(List<EditText> boxes, TextView resultText) {
        this.boxes = boxes;
        this.resultText = resultText;
    }

    @Override
    public void onClick(View v) {
        Map<Integer, Integer> mapOfInputValues = makeInputMap(boxes);

        ///////////////////////////////////////////////////////////////
        //This is all the same as the other activity so share it.
        for (EditText box : boxes) {
            box.setTextColor(Color.BLACK);
        }

        // Mark any invalid cells in red.
        List<Integer> invalidCells = SudokuSolver.validateInputMap(mapOfInputValues);
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
            result = solveSudoku(mapOfInputValues, new HashMap<Integer, Integer>(), SolverType.NORMAL);
        } catch (Exception e) {
        resultText.setText(R.string.solvingUnsuccessful);
        //Testing
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

}

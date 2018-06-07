package com.example.jony.sudokuattempt1.sudoku.sudoku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SudokuSolver {

	public static List<Integer> solveSudoku(Map<Integer, Integer> mapOfInputValues, //key = index position, value = value number
                                            Map<Integer, Integer> mapOfBoxPositions, //key = index position, value = box number
											SolverType solverType) {

		// Give this service the input values and get it to give us back something.
		List<Integer> inputtedGrid = BuildGridFromInputsService.createListFromInputMap(mapOfInputValues);
		// Working grid is a replica of the input grid by the UI.
		List<Integer> workingGrid = BuildGridFromInputsService.createListFromInputMap(mapOfInputValues);
		List<Integer> solutionGrid = new SolverService().solveSudoku(workingGrid, inputtedGrid, mapOfBoxPositions, solverType);

		return solutionGrid;
	}


	public static List<Integer> validateInputMap(Map<Integer, Integer> mapOfInputValues, Map<Integer, Integer> mapOfBoxValues, SolverType solverType) {
		List<Integer> inputtedGrid = BuildGridFromInputsService.createListFromInputMap(mapOfInputValues);
		List<Integer> listOfNaughtyIndexes = new ArrayList<>();

		for (Map.Entry<Integer, Integer> value : mapOfInputValues.entrySet()) {
			if (!ValidValueService.isValid(value.getValue(),
					     value.getKey(),
					     inputtedGrid,
						 solverType,
					     mapOfBoxValues,
						 true)){
				listOfNaughtyIndexes.add(value.getKey());
			}
		}

		return listOfNaughtyIndexes;
	}



}

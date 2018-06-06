package com.example.jony.sudokuattempt1.sudoku.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * Service to populate the initial starting 9x9 grid with input values.
 * @author Jony
 */
public class BuildGridFromInputsService {

	/** 
	 * Creates a list with 82 entries, where the zeroth is null.
	 * Any values provided by the UI are set in the list in their correct index.
	 * 
	 * @param map the map of indices to values from the UI.
	 * @return
	 */
	public static List<Integer> createListFromInputMap(Map<Integer, Integer> map){
		// create an 82 length list of nulls? could use 0 otherwise...
		List<Integer> grid = new ArrayList<>(82);
		for (int i = 0 ; i <= 81 ; i++) {
			grid.add(null);
		}
		
		// Now go through the map of positions and just stick them in.
		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			grid.set(entry.getKey(), entry.getValue());
		}
		return grid;
	}
	
}

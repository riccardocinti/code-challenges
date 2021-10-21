package com.rikzerouno.refactoredarray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RefactoredArray {

    public List<Integer> getElementsTimeLinear(List<Integer> arr, List<List<Integer>> queries) {
        int resPerRow = arr.get(0);
        return queries.stream()
                .map(query -> {
                    int x = query.get(0);
                    int y = query.get(1);
                    int resIndex = y;
                    if (x > 1) {
                        resIndex = y + (x - 1) * resPerRow;
                    }
                    return arr.get(resIndex);
                }).collect(Collectors.toList());
    }

    public List<Integer> getElementsTimeQuadratic(List<Integer> arr, List<List<Integer>> queries) {
        int cols = arr.get(0);
        int rows = arr.size() / cols;
        int[][] diagram = new int[rows][cols];
        int arrCount = 1;
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                diagram[x][y] = arr.get(arrCount++);
            }
        }
        Integer[] result = new Integer[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            int x = queries.get(i).get(0) - 1;
            int y = queries.get(i).get(1) - 1;
            result[i] = diagram[x][y];
        }
        return Arrays.asList(result);
    }

}

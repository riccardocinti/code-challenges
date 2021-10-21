package com.rikzerouno.refactoredarray;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RefactoredArrayTest {

    private final RefactoredArray refactoredArray = new RefactoredArray();

    @Test
    public void testGetElements2DArrayExpectedResults() {
        List<Integer> valid2DArrayList = Arrays.asList(5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<List<Integer>> valid2DQueries = Arrays.asList(Arrays.asList(1, 1), Arrays.asList(1, 2),
                Arrays.asList(2, 1), Arrays.asList(2, 2));

        List<Integer> expectedResults = Arrays.asList(1, 2, 6, 7);
        assertEquals(expectedResults, refactoredArray.getElementsTimeLinear(valid2DArrayList, valid2DQueries));
        assertEquals(expectedResults, refactoredArray.getElementsTimeQuadratic(valid2DArrayList, valid2DQueries));
    }

    @Test
    public void testGetElements3DArrayExpectedResults() {
        List<Integer> valid3DArrayList = Arrays.asList(5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        List<List<Integer>> valid3DQueries = Arrays.asList(Arrays.asList(1, 1), Arrays.asList(1, 2),
                Arrays.asList(2, 1), Arrays.asList(2, 2), Arrays.asList(3, 1), Arrays.asList(3, 3));

        List<Integer> expectedResults = Arrays.asList(1, 2, 6, 7, 11, 13);
        assertEquals(expectedResults, refactoredArray.getElementsTimeLinear(valid3DArrayList, valid3DQueries));
        assertEquals(expectedResults, refactoredArray.getElementsTimeQuadratic(valid3DArrayList, valid3DQueries));
    }

}

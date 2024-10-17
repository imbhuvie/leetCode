package com.leetcode.practice.easy.two_pointer;

import junit.framework.TestCase;

import java.util.Arrays;

public class SortingArrayProblemTest extends TestCase {
    SortingArrayProblem sortingArrayProblem = new SortingArrayProblem();

    public void testSortArrayByParityII() {
        int[] expected = {4, 5, 2, 7};
        int[] actual = sortingArrayProblem.sortArrayByParityII(new int[]{4, 2, 5, 7});
        assertTrue(Arrays.equals(expected, actual));
    }

    public void testRemoveDuplicates() {
        assertEquals(5, sortingArrayProblem.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public void testFlipAndInvertImage() {
        sortingArrayProblem.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
    }
}
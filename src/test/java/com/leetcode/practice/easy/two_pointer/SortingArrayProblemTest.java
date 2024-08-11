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
}
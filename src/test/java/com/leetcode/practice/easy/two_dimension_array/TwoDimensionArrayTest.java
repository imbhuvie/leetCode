package com.leetcode.practice.easy.two_dimension_array;

import junit.framework.TestCase;

public class TwoDimensionArrayTest extends TestCase {
    TwoDimensionArray twoDimensionArray = new TwoDimensionArray();

    public void testMergeArrays() {

        twoDimensionArray.mergeArrays(new int[][]{{1, 2}, {2, 3}, {4, 5}}, new int[][]{{1, 4}, {3, 2}, {4, 1}});
    }
}
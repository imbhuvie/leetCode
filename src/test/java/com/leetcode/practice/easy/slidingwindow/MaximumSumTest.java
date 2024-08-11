package com.leetcode.practice.easy.slidingwindow;

import junit.framework.TestCase;

public class MaximumSumTest extends TestCase {
    MaximumSum maximumSum = new MaximumSum();

    public void testGetMaxSum() {
        assertEquals(15, maximumSum.getMaxSum(new int[]{1, 3, 5, 2, 7, 3, 4, 5, 2, 8}, 3));
        assertEquals(19, maximumSum.getMaxSum(new int[]{1, 3, 5, 2, 7, 3, 4, 5, 2, 8}, 4));
        assertEquals(22, maximumSum.getMaxSum(new int[]{1, 3, 5, 2, 7, 3, 4, 5, 2, 8}, 5));
        assertEquals(10, maximumSum.getMaxSum(new int[]{1, 3, 5, 2, 7, 3, 4, 5, 2, 8}, 2));
    }
}
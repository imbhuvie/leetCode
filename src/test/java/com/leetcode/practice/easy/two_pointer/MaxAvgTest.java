package com.leetcode.practice.easy.two_pointer;

import junit.framework.TestCase;

public class MaxAvgTest extends TestCase {
    MaxAvg maxAvg = new MaxAvg();

    public void testFindMaxAverage() {
        assertEquals(12.75, maxAvg.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));

    }
}
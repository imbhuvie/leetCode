package com.leetcode.practice.easy.slidingwindow;

import junit.framework.TestCase;

public class BuyAndSellTest extends TestCase {
    BuyAndSell buyAndSell = new BuyAndSell();

    public void testMaxProfit() {
        assertEquals(6, buyAndSell.maxProfit(new int[]{2, 6, 3, 4, 7, 8, 1, 4}));
    }
}
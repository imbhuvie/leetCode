package com.leetcode.practice.easy.slidingwindow;

public class BuyAndSell {
    public int maxProfit(int[] nums) {
        int maxProfit = 0;
        int buy = 0;
        int sell = 1;
        while (sell < nums.length) {
            int currentProfit = nums[sell] - nums[buy];
            if (nums[buy] < nums[sell]) {
                maxProfit = Math.max(currentProfit, maxProfit);
            } else
                buy = sell;
            sell++;
        }
        return maxProfit;
    }
}

package com.leetcode.practice.easy.slidingwindow;

public class MaximumSum {
    public int getMaxSum(int[] nums, int k) {
        int maxSum;
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];
        int j = k;
        maxSum = sum;
        int i = 0;
        while (j < nums.length) {
            sum = sum - nums[i] + nums[j];
            if (sum > maxSum)
                maxSum = sum;
            j++;
            i++;
        }
        return maxSum;
//        1, 3, 5, 2, 7, 3, 4, 5, 2, 8
    }
}

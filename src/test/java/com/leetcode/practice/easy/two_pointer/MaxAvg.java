package com.leetcode.practice.easy.two_pointer;

public class MaxAvg {
    public double findMaxAverage(int[] numbs, int index) {
        int n = numbs.length;
        double maxAverage = Double.NEGATIVE_INFINITY;
        double windowSum = 0;
        for (int i = 0; i < index; i++) {
            windowSum += numbs[i];
        }
        maxAverage = windowSum / index;

        for (int right = index; right < n; right++) {
            windowSum += numbs[right] - numbs[right - index];
            maxAverage = Math.max(maxAverage, (double) windowSum / index);
        }
        System.out.println(maxAverage);
        return maxAverage;
    }
}

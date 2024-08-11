package com.leetcode.practice.easy.two_pointer;

public class SortingArrayProblem {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1;
        int size = nums.length;
        while (i < size || j < size) {
            if (i < size && j < size && nums[i] % 2 != 0 && nums[j] % 2 != 1) {
                nums[i] = nums[i] ^ nums[j];
                nums[j] = nums[i] ^ nums[j];
                nums[i] = nums[i] ^ nums[j];
                i = i + 2;
                j = j + 2;
                continue;
            }
            if (i < size && nums[i] % 2 == 0)
                i = i + 2;
            if (j < size && nums[j] % 2 == 1)
                j = j + 2;

        }
        return nums;
    }
}

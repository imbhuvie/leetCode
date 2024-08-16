package com.leetcode.practice.easy.two_pointer;

public class SortingArrayProblem {
    /*
    922. Sort Array By Parity II
    Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
    Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
    Return any answer array that satisfies this condition.
    Example 1:
    Input: nums = [4,2,5,7]
    Output: [4,5,2,7]
    Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
    Example 2:
    Input: nums = [2,3]
    Output: [2,3]
     */
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

    /*
    26. Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
     */
//[0,0,1,1,1,2,2,3,3,4]
    public int removeDuplicates(int[] nums) {
        int j = 0;
        if (nums.length == 1)
            return 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (j == 0) {
                    nums[j] = nums[i];
                    j++;
                }
            } else {
                if (j == 0) {
                    nums[j] = nums[i];
                    j++;
                    nums[j] = nums[i + 1];
                    j++;
                } else {
                    nums[j] = nums[i + 1];
                    j++;
                }
            }
        }

        return j;
    }
}

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

/*
2164. Sort Even and Odd Indices Independently

You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:

Sort the values at odd indices of nums in non-increasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
Sort the values at even indices of nums in non-decreasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.

 */

    public int[] sortEvenOdd(int[] nums) {


        return nums;

    }

    /*
    832. Flipping an Image
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].


Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     */

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                image[i][start] = (image[i][start]) == 0 ? 1 : 0;
                image[i][end] = (image[i][end]) == 0 ? 1 : 0;
                image[i][start] = image[i][start] ^ image[i][end];
                image[i][end] = image[i][start] ^ image[i][end];
                image[i][start] = image[i][start] ^ image[i][end];
                start++;
                end--;
                if (start == end) {
                    image[i][start] = (image[i][start]) == 0 ? 1 : 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
        return image;
    }
}

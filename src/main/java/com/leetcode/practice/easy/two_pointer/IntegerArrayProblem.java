package com.leetcode.practice.easy.two_pointer;

import java.util.Arrays;
import java.util.HashSet;

//1346. Check If N and Its Double Exist
//https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
public class IntegerArrayProblem {
    public static void main(String[] args) {
        IntegerArrayProblem integerArrayProblem = new IntegerArrayProblem();
        integerArrayProblem.checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8});
    }

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (findElementInArray(arr)) {
                return true;
            }
        }
        return false;
    }

    public boolean findElementInArray(int[] nums) {
        int index = 0;
        int targetDouble = nums[index] * 2;
        int start, end, mid;
        if (nums[index] < 0) {
            start = 0;
            end = index - 1;

        } else {
            start = index + 1;
            end = nums.length - 1;
        }
        while (start <= end) {
            if (nums[index] < 0) {
                start = 0;
                end = index - 1;

            } else {
                start = index + 1;
                end = nums.length - 1;
            }
            mid = (start + end) / 2;
            if (nums[mid] == targetDouble)
                return true;
            else if (nums[mid] < targetDouble) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            index++;
        }
        return false;
    }

    /**
     * 349. Intersection of Two Arrays
     * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
     * Example 1:
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2]
     * Example 2:
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [9,4]
     * Explanation: [4,9] is also accepted.
     */

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result = new HashSet<>();
        int size1 = nums1.length;
        int size2 = nums2.length;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                    System.out.println("nums1[" + i + "] :" + nums1[i] + " ;  nums2[" + j + "]" + nums2[j]);
                    break;
                }
            }
        }
//        integerArrayProblem.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println("Result HashSet : " + Arrays.toString(result.toArray()));
        int[] intersecArray = new int[result.size()];
        int j = 0;
        for (Object i : result.toArray()) {
            System.out.println(i);
            intersecArray[j] = (int) i;
            j++;
        }
        System.out.println(Arrays.toString(intersecArray));
        return intersecArray;
    }

    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int start = 0;
        int end = nums.length - 1;
        StringBuilder sum = new StringBuilder();
        while (start < end) {
            sum.delete(0, sum.length());
            sum.append(nums[start]);
            sum.append(nums[end]);
            ans += Integer.parseInt(sum.toString());
            start++;
            end--;
        }
        if (start == end) {
            ans += nums[start];
        }
        return ans;
    }


}
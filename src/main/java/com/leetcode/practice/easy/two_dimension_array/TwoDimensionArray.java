package com.leetcode.practice.easy.two_dimension_array;

public class TwoDimensionArray {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int[][] ans = new int[size1 + size2][2];
        int i = 0, j = 0, index = 0;
        while (i < size1 && j < size2) {
            if (nums1[i][0] == nums2[j][0]) {
                ans[index][0] = nums1[i][0];
                ans[index][1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                ans[index][0] = nums1[i][0];
                ans[index][1] = nums1[i][1];
                i++;
            } else {
                ans[index][0] = nums2[j][0];
                ans[index][1] = nums2[j][1];
                j++;
            }
            index++;
        }
        while (i < size1) {
            ans[index][0] = nums1[i][0];
            ans[index][1] = nums1[i][1];
            index++;
            i++;
        }
        while (j < size2) {
            ans[index][0] = nums2[j][0];
            ans[index][1] = nums2[j][1];
            j++;
            index++;
        }
        int[][] finalAns = new int[index][2];
        System.arraycopy(ans, 0, finalAns, 0, index);
        for (int[] k : finalAns) {
            System.out.println(k[0] + " : " + k[1]);
        }
        return ans;
    }
}

package com.leetcode.practice.easy.simple_problem;

import java.util.ArrayList;

public class SumProblem {
    //User function Template for Java
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Integer evenSum = N * (N + 1);
        Integer oddSum = (N / 2) * (N / 2);
        list.add(evenSum);
        list.add(oddSum);
        return list;

    }
}

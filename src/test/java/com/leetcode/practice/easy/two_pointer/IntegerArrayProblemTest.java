package com.leetcode.practice.easy.two_pointer;

import junit.framework.TestCase;

public class IntegerArrayProblemTest extends TestCase {
    IntegerArrayProblem integerArrayProblem = new IntegerArrayProblem();


    public void testIntersection() {
//        integerArrayProblem.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        integerArrayProblem.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
    }

    public void testFindTheArrayConcVal() {
        integerArrayProblem.findTheArrayConcVal(new int[]{5, 14, 13, 8, 12});
    }
}
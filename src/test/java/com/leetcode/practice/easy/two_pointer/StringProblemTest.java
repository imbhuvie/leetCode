package com.leetcode.practice.easy.two_pointer;

import junit.framework.TestCase;

public class StringProblemTest extends TestCase {
    StringProblem stringProblem = new StringProblem();

    public void testMergeAlternately() {
        assertEquals("aabbccdd", stringProblem.mergeAlternately("abcd", "abcd"));
        assertEquals("apbqcr", stringProblem.mergeAlternately("abc", "pqr"));
    }

    public void testMakeSmallestPalindrome() {
        stringProblem.makeSmallestPalindrome("egcfe");
    }

    public void testDiStringMatch() {
        stringProblem.diStringMatch("IDID");
    }

    public void testShortestToChar() {
        stringProblem.shortestToChar("loveleetcode", 'e');
    }


    public void testReverseOnlyLetters() {
        stringProblem.reverseOnlyLetters("-S2,_");
    }

    public void testReverseStr() {
        stringProblem.reverseStr("abcdefg", 2);
    }
}
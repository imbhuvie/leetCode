package com.leetcode.practice.easy.two_pointer;

import junit.framework.TestCase;

public class StringProblemTest extends TestCase {
    StringProblem stringProblem = new StringProblem();

    public void testMergeAlternately() {
        assertEquals("aabbccdd", stringProblem.mergeAlternately("abcd", "abcd"));
        assertEquals("apbqcr", stringProblem.mergeAlternately("abc", "pqr"));
    }
    
}
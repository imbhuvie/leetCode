package com.leetcode.practice.easy.two_pointer;

public class StringProblem {

    /*
    1768. Merge Strings Alternately
    You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
    Return the merged string.
    Example 1:
    Input: word1 = "abc", word2 = "pqr"
    Output: "apbqcr"
    Explanation: The merged string will be merged as so:
    word1:  a   b   c
    word2:    p   q   r
    merged: a p b q c r
     */
    public String mergeAlternately(String word1, String word2) {
        StringProblem stringProblem = new StringProblem();
        System.out.println(stringProblem + " ,hascode : " + stringProblem.hashCode());
        String p = "hello";
        System.out.println(p + " HashCode : " + p.hashCode());
        int len1 = word1.length();
        int len2 = word2.length();
        int largestStrLength = word1.length();
        if (largestStrLength < word2.length())
            largestStrLength = word2.length();
        int i = 0;
        StringBuilder newStr = new StringBuilder();
        while (i < largestStrLength) {
            if (i < len1)
                newStr.append(word1.charAt(i));
            if (i < len2)
                newStr.append(word2.charAt(i));
            i++;
        }
        System.out.println(newStr + " hascode : " + newStr.hashCode());
        String str = newStr.toString();
        System.out.println(str + " hascode : " + str.hashCode());
        return str;
    }

}

package com.leetcode.practice.easy.two_pointer;

import java.util.Arrays;

public class StringProblem {

    /**
     * 1768. Merge Strings Alternately
     * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
     * starting with word1. If a string is longer than the other,
     * append the additional letters onto the end of the merged string.
     * Return the merged string.
     * Example 1:
     * Input: word1 = "abc", word2 = "pqr"
     * Output: "apbqcr"
     * Explanation: The merged string will be merged as so:
     * word1:  a   b   c
     * word2:    p   q   r
     * merged: a p b q c r
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

    /**
     * 2697. Lexicographically Smallest Palindrome
     * You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.
     * Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.
     * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
     * Return the resulting palindrome string.
     * Example 1:
     * Input: s = "egcfe"
     * Output: "efcfe",
     * Explanation: The minimum number of operations to make "egcfe" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "efcfe", by changing 'g'.
     * Example 2:
     * Input: s = "abcd"
     * Output: "abba"
     * Explanation: The minimum number of operations to make "abcd" a palindrome is 2, and the lexicographically smallest palindrome string we can get by modifying two characters is "abba".
     * Example 3:
     * Input: s = "seven"
     * Output: "neven"
     * Explanation: The minimum number of operations to make "seven" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "neven".
     */

    public String makeSmallestPalindrome(String s) {
//        code on leetcode is more optimal then this
        StringBuilder newstr = new StringBuilder();
        newstr.append(s);
        int start = 0;
        int end = newstr.length() - 1;
//        System.out.println(end + " " + newstr);
        while (start < end) {
            if (newstr.charAt(start) == newstr.charAt(end)) {
                start++;
                end--;
            } else if (newstr.charAt(start) < newstr.charAt(end)) {
                char ch = newstr.charAt(start);
                newstr.setCharAt(start, ch);
                newstr.setCharAt(end, ch);
                start++;
                end--;
            } else {
                char ch = newstr.charAt(end);
                newstr.setCharAt(start, ch);
                newstr.setCharAt(end, ch);
                start++;
                end--;
            }

        }
        System.out.println(newstr.toString());
        return newstr.toString();

    }

    /**
     * 942. DI String Match
     * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
     * s[i] == 'I' if perm[i] < perm[i + 1], and
     * s[i] == 'D' if perm[i] > perm[i + 1].
     * Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
     * Example 1:
     * Input: s = "IDID"
     * Output: [0,4,1,3,2]
     * Example 2:
     * Input: s = "III"
     * Output: [0,1,2,3]
     * Example 3:
     * Input: s = "DDI"
     * Output: [3,2,0,1]
     * Constraints:
     * 1 <= s.length <= 105
     * s[i] is either 'I' or 'D'.
     */
    public int[] diStringMatch(String s) {
        int i = 0;
        int d = s.length();
        int totalSum = (d * (d + 1)) / 2;
        int sum = 0;
        int[] arr = new int[d + 1];
        int j;
        for (j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'I') {
                arr[j] = i;
                sum += i;
                i++;
            } else if (s.charAt(j) == 'D') {
                arr[j] = d;
                sum += d;
                d--;

            }
        }
        arr[j] = totalSum - sum;
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    /**
     * 917. Reverse Only Letters
     * Given a string s, reverse the string according to the following rules:
     * All the characters that are not English letters remain in the same position.
     * All the English letters (lowercase or uppercase) should be reversed.
     * Return s after reversing it.
     * Example 1:
     * Input: s = "ab-cd"
     * Output: "dc-ba"
     * Example 2:
     * Input: s = "a-bC-dEf-ghIj"
     * Output: "j-Ih-gfE-dCba"
     * Example 3:
     * Input: s = "Test1ng-Leet=code-Q!"
     * Output: "Qedo1ct-eeLg=ntse-T!"
     * Constraints:
     * 1 <= s.length <= 100
     * s consists of characters with ASCII values in the range [33, 122].
     * s does not contain '\"' or '\\'.
     */
    public String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length() - 1;
//      If want to perform action on String like change value at any index then convert it in Char[] Array not StringBuilder...
        char[] chars = s.toCharArray();
        while (start < end) {
            while (start < end && !Character.isAlphabetic(chars[start])) {
                start++;
            }
            while (start < end && !Character.isAlphabetic(chars[end])) {
                end--;
            }
            if (start < end) {
                char ch = chars[start];
                chars[start] = chars[end];
                chars[end] = ch;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(chars));
        return new String(chars);
    }

    /**
     * 541. Reverse String II
     * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
     * If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
     * Example 1:
     * Input: s = "abcdefg", k = 2
     * Output: "bacdfeg"
     * Example 2:
     * Input: s = "abcd", k = 2
     * Output: "bacd"
     * Constraints:
     * 1 <= s.length <= 104
     * s consists of only lowercase English letters.
     * 1 <= k <= 104
     */
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int size = s.length();
        for (int end = 0; end < size; end = end + k) {
            int start = end;
            int j = 0;
            while (end < size && j < k) {
                j++;
                end++;
            }
            reverse(chars, start, end - 1);
        }
        System.out.println(new String(chars));
        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

    }

    /**
     * 821. Shortest Distance to a Character
     * Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.
     * The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
     * Example 1:
     * Input: s = "loveleetcode", c = "e"
     * Output: [3,2,1,0,1,0,0,1,2,2,1,0]
     * Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
     * The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
     * The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
     * For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
     * The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
     * Example 2:
     * Input: s = "aaab", c = "b"
     * Output: [3,2,1,0]
     * Constraints:
     * 1 <= s.length <= 104
     * s[i] and c are lowercase English letters.
     * It is guaranteed that c occurs at least once in s.
     */
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int index = 0;
        int startChar = 0;
        int endChar = 0;
        int count = 0;
        int i = 0;
//        Input: s = "loveleetcode", c = "e"
//        Output: [3,2,1,0,1,0,0,1,2,2,1,0]
        while (index < s.length()) {
            if (s.charAt(index) != c) {
                index++;
                count++;
            }
            while (i < ans.length && count >= 0) {
                ans[i] = count;
                i++;
                count--;
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;

    }
}



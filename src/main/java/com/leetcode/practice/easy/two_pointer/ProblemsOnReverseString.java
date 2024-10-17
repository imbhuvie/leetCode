package com.leetcode.practice.easy.two_pointer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProblemsOnReverseString {
    /*    2000. Reverse Prefix of Word

        Given a 0-indexed string word and a character ch,reverse the segment of word that starts at
        index 0 and ends at the index of the first occurrence of ch (inclusive).
        If the character ch does not exist in word, do nothing.

        For example, if word = "abcdefd" and ch = "d", then you should reverse the segment
        that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".

        Constraints:

        1 <= word.length <= 250
        word consists of lowercase English letters.
        ch is a lowercase English letter.
    */
    public String reversePrefix(String word, char ch) {
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                return word.charAt(i) + str + word.substring(i + 1, word.length());
//      2nd approach without using else
//           String revString= reverseString(word.substring(0,i+1));
//           return revString+word.substring(i+1,word.length());
            } else
                str = word.charAt(i) + str;
        }

        return word;
    }

    private String reverseString(String substring) {
        String str = "";
        for (int i = substring.length() - 1; i >= 0; i--) {
            str = str + substring.charAt(i);
        }
        return str;
    }

    /*
    557. Reverse Words in a String III
        Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
     */
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder("");
        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            result.append(reverseString(strArray[i]));
            result.append(" ");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }

/*
680. Valid Palindrome II

Given a string s, return true if the s can be palindrome after deleting at most one character from it.
Example 1:
Input: s = "aba"
Output: true
Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
 */

    public boolean validPalindrome(String s) {

        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                if ((checkPalindrome(s, i + 1, j)) || checkPalindrome(s, i, j - 1))
                    return true;
                else
                    return false;
            }
            j--;
        }
        return true;
    }

    private boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                list.add(i);
            }
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(i));
                set.add(list.get(j) + i);
                set.add(list.get(j) - i);
            }
        }
        // System.out.print(set);
        return list;
    }
}

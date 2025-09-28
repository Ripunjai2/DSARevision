package org.ripunjai.slidingWindow.longestSubstringWoRepeatingChar;

// Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without repeating characters.

public class Client {
    public static void main(final String[] args) {
        final Solution solution = new Solution();
        final String s = "abcabcdbb";
        final int res = solution.longetSubstring(s);
        System.out.println("Length of Longest Substring Without Repeating Characters is: " + res);
    }
}

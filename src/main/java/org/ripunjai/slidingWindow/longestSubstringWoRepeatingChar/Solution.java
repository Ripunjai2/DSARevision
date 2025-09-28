package org.ripunjai.slidingWindow.longestSubstringWoRepeatingChar;

import java.util.HashSet;

/*
Algorithm:
1. Start with left=0, right=0.
2. Expand right (add chars).
3. If duplicate found → shrink from left until duplicate removed.
4. Keep track of max window size.
*/

public class Solution {
    public int longetSubstring(String s){

        int left = 0;
        int right =0;

        int maxLength = 0;
        int n = s.length();

        HashSet<Character> set = new HashSet<>();

        while(right<n){
            char ch = s.charAt(right);
            if(set.contains(ch)){
                while(set.contains(ch)){
                    set.remove(s.charAt(left));
                    left++;
                }
            } else {
                set.add(ch);
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            }
        }
        return maxLength;
    }
}

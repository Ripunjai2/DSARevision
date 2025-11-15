package org.ripunjai.NeetCode;

import java.util.HashMap;
import java.util.HashSet;

/*
Given a string s, find the length of the longest substring without repeating characters.
 */

public class NC_3_LongestSubstringWoRepeatingChar {

    // Sliding Window Approach + HashSet
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left =0;
        int res = 0;
        for(int right =0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            res = Math.max(res, right-left+1);
        }
        return res;
    }

    // Sliding Window Approach + HashMap --> Slightly Optimized
    public int lengthOfLongestSubstring2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int res = 0;
        for(int right =0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right), right);
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}

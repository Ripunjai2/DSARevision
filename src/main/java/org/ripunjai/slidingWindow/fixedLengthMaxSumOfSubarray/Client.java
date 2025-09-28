package org.ripunjai.slidingWindow.fixedLengthMaxSumOfSubarray;

/*
You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions.
If no subarray meets the conditions, return 0.
*/

public class Client {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {1,5,4,2,9,9,9};
        int k = 3;
        int res = solution.maxSumSubarray(nums, k);
        System.out.println("Maximum Subarray Sum of size " + k + " with distinct elements is: " + res);
    }
}

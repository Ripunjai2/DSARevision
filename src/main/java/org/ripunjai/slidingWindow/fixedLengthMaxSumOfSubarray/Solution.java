package org.ripunjai.slidingWindow.fixedLengthMaxSumOfSubarray;

public class Solution {
    public int maxSumSubarray(int k[], int n){
        int maxSum = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += k[i];
        }
        if(sum > maxSum){
            maxSum = sum;
        }

        for(int i=n;i<k.length;i++){
            sum += k[i] - k[i-n];
            if(sum > maxSum){
                maxSum = sum;
            }
        }

        return maxSum;
    }
}

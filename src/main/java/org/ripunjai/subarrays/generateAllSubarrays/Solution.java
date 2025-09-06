package org.ripunjai.subarrays.generateAllSubarrays;

public class Solution {
    public int[][] generateAllSubarrays(int A[]){
        int n = A.length;
        int arrSize = (n*(n+1))/2;

        int res[][] = new int[arrSize][];
        int count = 0;
        // fix the starting point
        for(int i=0;i<n;i++){
            // fix the ending point
            for(int j=i;j<n;j++){
                //get the length of subarray and create a new subarray
                int length = j-i+1;
                res[count] = new int[length];
                for(int k=i;k<=j;k++){
                    res[count][k-i] = A[k];
                }
                count++;
            }
        }
        return res;
    }
}

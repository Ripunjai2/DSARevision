package org.ripunjai.subarrays.generateAllSubarrays;

/*
Given an integer array A of size n, return all possible subarrays of the array.
 */

public class Client {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int A[] = {1,2,3,4};
        int [][]res = solution.generateAllSubarrays(A);
        System.out.println("All Subarrays are: ");
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

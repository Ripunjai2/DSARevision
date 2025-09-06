package org.ripunjai.prefixSum.evenNumberInRange;

public class Solution {
    public int[] solve(int[] A, int[][] B) {
        if(A[0]%2 == 0){
            A[0] = 1;
        }else {
            A[0] = 0;
        }
        for(int i = 1; i<A.length;i++){
            if(A[i]%2 == 0){
                A[i] = A[i-1]+1;
            }else{
                A[i] = A[i-1];
            }
        }
        int[] res = new int [B.length];
        for(int i =0 ;i<B.length; i++){
            int left = B[i][0];
            int right = B[i][1];
            if(left == 0){
                res[i] = A[right];
            }else {
                res[i] = A[right]-A[left-1];
            }
        }
        return res;
    }
}

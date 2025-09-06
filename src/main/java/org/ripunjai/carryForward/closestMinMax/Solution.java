package org.ripunjai.carryForward.closestMinMax;

public class Solution {
    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
            if(A[i]<min){
                min = A[i];
            }
        }
        int lastMinInd = -1;
        int lastMaxInd = -1;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]==min){
                lastMinInd = i;
                if(lastMaxInd!= -1){
                    ans = Math.min(ans,Math.abs(i-lastMaxInd+1));
                }
            }

            if(A[i]==max){
                lastMaxInd = i;
                if(lastMinInd!= -1){
                    ans = Math.min(ans,Math.abs(i-lastMinInd+1));
                }
            }
        }
        return ans;
    }
}

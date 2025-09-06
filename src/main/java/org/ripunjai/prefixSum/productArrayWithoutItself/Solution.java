package org.ripunjai.prefixSum.productArrayWithoutItself;

/*
We will have a prefix array pref[] where pref[i] will store the
multiplication of all the elements in the prefix of the array till
i-th position. Similar we will have a suffix array suff[].
Now for the i-th element, we can find the multiplication of all the
elements to it's left from the pref[] array and that in the right side
from the suff[] array
*/

public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = A[0];
        for(int i = 1 ; i < n ; i++){
            pref[i] = pref[i - 1] * A[i];
        }
        suff[n - 1] = A[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--){
            suff[i] = suff[i + 1] * A[i];
        }
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(i == 0){
                ans[i] = suff[i + 1];
            }
            else if(i == n - 1){
                ans[i] = pref[i - 1];
            }
            else{
                ans[i] = pref[i - 1] * suff[i + 1];
            }
        }
        return ans;
    }
}

package org.ripunjai.prefixSum.equilibriumIndex;

public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        for (int i = 1; i < N; i++) {
            A[i] = A[i] + A[i - 1];
        }

        if (A[N - 1] - A[0] == 0) return 0;
        for (int i = 1; i < N; i++) {
            if (A[i - 1] == A[N - 1] - A[i]) {
                return i;
            }
        }
        return -1;
    }
}

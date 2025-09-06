package org.ripunjai.prefixSum.evenNumberInRange;

/*
Problem:
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
Each query consists of two integers B[i][0] and B[i][1].
For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].


 Solution: We will use prefix sum approach and create a prefix array of even numbers count to solve this problem.
 */

public class Client {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 4}, {1, 2}};
        int[] res = solution.solve(A, B);
        for (int r : res) {
            System.out.print(r + " ");
        }
    }
}

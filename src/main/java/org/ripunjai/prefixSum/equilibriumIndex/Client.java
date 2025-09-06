package org.ripunjai.prefixSum.equilibriumIndex;

/*
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 */
public class Client {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solution.solve(A));
    }
}

package org.ripunjai.prefixSum.productArrayWithoutItself;

/*
Given an array of integers A, find and return the product array of the same size where the ith element
of the product array will be equal to the product of all the elements divided by the ith element of the array.
*/

public class Client {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1, 2, 3, 4, 5};
        int[] res = solution.solve(A);
        for (int r : res) {
            System.out.print(r + " ");
        }
    }
}

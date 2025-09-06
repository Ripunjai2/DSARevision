package org.ripunjai.carryForward.pickFromBothSides;


/*
You are given an integer array A of size N. You have to perform B operations. In one operation, you
can remove either the leftmost or the rightmost element of the array A. Find and return the maximum
possible sum of the B elements that were removed after the B operations.
 */
public class Client {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //test case 1
        int[] A = {5, -2, 3, 1, 2};
        int B = 3;
        int res = solution.solve(A, B);
        System.out.println(res);

        //test case 2
        int[] A2 = {2, 3, -1, 4, 5};
        int B2 = 4;
        int res2 = solution.solve(A2, B2);
        System.out.println(res2);

        //test case 3
        int []A3 = { 2, 3, -1, 4, 2, 1 };
        int B3 = 4;
        int res3 = solution.solve(A3, B3);
        System.out.println(res3);
    }
}

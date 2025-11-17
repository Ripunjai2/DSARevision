package org.ripunjai.NeetCode_150;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 */

public class NC_4_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int na = nums1.length;
        int nb = nums2.length;
        int n = na + nb;
        if((na+nb)%2==1){
            return solve(nums1, nums2, n/2, 0, na-1, 0, nb-1);
        } else {
            return (double)(solve(nums1, nums2, n/2, 0, na-1, 0, nb-1)+
                    solve(nums1, nums2, n/2-1, 0, na-1, 0, nb-1))/2;
        }
    }

    public int solve(int []A, int []B, int k, int startA, int endA, int startB, int endB){
        if(startA>endA) return B[k-startA];
        if(startB>endB) return A[k-startB];

        int midA = (endA-startA)/2+startA;
        int midB = (endB-startB)/2+startB;

        if(midA+midB<k){ // we can ignore from left
            if(A[midA]<B[midB]){
                return solve(A, B, k, midA+1, endA, startB, endB);
            } else {
                return solve(A, B, k, startA, endA, midB+1, endB);
            }
        } else {        // we can ignore from right
            if(A[midA]>B[midB]){
                return solve(A, B, k, startA, midA-1, startB, endB);
            } else {
                return solve(A, B, k, startA, endA, startB, midB-1);
            }
        }
    }
}

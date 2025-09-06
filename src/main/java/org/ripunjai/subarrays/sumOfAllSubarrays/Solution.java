package org.ripunjai.subarrays.sumOfAllSubarrays;

import java.time.Duration;
import java.time.Instant;

public class Solution {

    //Brute Force Approach O(N^3)
    public long bruteForce(int[] A) {
        long result = 0;
        int n = A.length;
        Instant start = Instant.now();
//        long start = System.currentTimeMillis();
//        long start = System.nanoTime();
        //fix the starting point of subarray
        for(int i=0;i<n;i++){
            //fix the ending point of subarray
            for(int j=i;j<n;j++){
                //traverse the subarray and calculate the sum
                for(int k=i;k<=j;k++){
                    result += A[k];
                }
            }
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Time taken in Brute Force Approach: " + duration.toNanos()+" nanoseconds");
        return result;
    }

    //Prefix Sum Approach TC-O(N^2)  SC-O(N)
    public long prefixSumApproach(int []A){
        long result = 0;
        int n = A.length;

        Instant start = Instant.now();
        //create a prefix sum array
        int prefixSum[] = new int[n];
        prefixSum[0] = A[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = A[i]+ prefixSum[i-1];
        }

        //fix the starting point of subarray
        for(int i=0;i<n;i++){
            //fix the ending point of subarray
            for(int j=i;j<n;j++){
                if(i==0){
                    result += prefixSum[j];
                }else{
                    result += prefixSum[j]-prefixSum[i-1];
                }
            }
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Time taken in Prefix Sum Approach: " + duration.toNanos()+" nanoseconds");
        return result;
    }

    //Carry Forward Approach TC-O(N^2) SC-O(1)
    public long carryForwardApproach(int []A){
        long result = 0;
        int n = A.length;

        Instant start = Instant.now();
        //fix the starting point of subarray
        for(int i=0;i<n;i++){
            long sum = 0;
            //fix the ending point of subarray
            for(int j=i;j<n;j++){
                sum += A[j];
                // keep adding the sum of subarray to result
                result += sum;
            }
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Time taken in Carry Forward Approach: " + duration.toNanos()+" nanoseconds");
        return result;
    }

    //Contribution Approach TC-O(N) SC-O(1)
    public long contributionApproach(int []A){
        long result = 0;
        int n = A.length;
        Instant start = Instant.now();

        for(int i=0;i<n;i++){
            // (i+1) is the number of choices to choose starting point
            // (n-i) is the number of choices to choose ending point
            result += (long)A[i]*(i+1)*(n-i);
        }

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Time taken in Contribution Approach: " + duration.toNanos()+" nanoseconds");
        return result;
    }
}
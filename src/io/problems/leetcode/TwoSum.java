package io.problems.leetcode;
/*
 ** Question : https://leetcode.com/problems/two-sum/
 *
 */


import java.util.Arrays;

class TwoSumBruteForce {
    /*
    - Time complexity : O(n^2) because of two loops
    - Space Complexity : O(1) -> because same amount of space is used regardless of the number of elements in an array.
     */
    public int [] twoSum(int target, int numbers[]) {
        int len = numbers.length;
        int []result = new int[2];
        for (int i = 0; i< len -1; i++) {
            for (int j = i + 1; j < len; j++) {
                if(numbers[i] + numbers[j] == target) {
                   result[0] = i;
                   result[1] = j;
                }
            }
        }
        return result;
    }
}

class TwoSum2Pointers {
    /*
    - Time complexity : O(n) + nlog(n) [sorting] = O(nlog(n)). [efficient than n^2 for sure]
    - Space Complexity : O(1) -> because same amount of space is used regardless of the number of elements in an array.
     */
    public int [] twoSum(int target, int numbers[]) {
        int len = numbers.length;
        int []result = new int[2];

        int leftPointer = 0; // first index
        int rightPointer = len -1; // last index

        Arrays.sort(numbers); // sort the array [nlogn]

        while(leftPointer < rightPointer) {
            if(numbers[leftPointer] + numbers[rightPointer] == target) {
                result[0] = leftPointer;
                result[1] = rightPointer;
                return result;
            }
            else if(numbers[leftPointer] + numbers[rightPointer] > target) {
                rightPointer --;
            }
            else {
                leftPointer ++;
            }
        }
        return result;
    }
}


public class TwoSum {
    public static void main(String[] args) {
        // int [] numbersArray = {10,2,3,4,6,70};
        int [] numbersArray = {0, 1,2,3,8,80};
        int target = 8;

        TwoSumBruteForce twoSumBruteForce = new TwoSumBruteForce();
        int [] solutionOne = twoSumBruteForce.twoSum(target, numbersArray);
        System.out.println("BruteForce Solution : [" + solutionOne[0] + "," + solutionOne[1] +"]");

        TwoSum2Pointers twoSum2Pointers = new TwoSum2Pointers();
        int [] solutionTwo = twoSum2Pointers.twoSum(target, numbersArray);
        System.out.println("Two Pointers Solution : [" + solutionTwo[0] + "," + solutionTwo[1] +"]");
    }
}

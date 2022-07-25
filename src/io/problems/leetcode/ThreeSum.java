package io.problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 ** Question : https://leetcode.com/problems/3sum/
 */
public class ThreeSum {
    // TC - O(n^3)
    // SC - O(1)
    private List<List<Integer>> getThreeSumBruteForce(int[] numbers) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        int length = numbers.length;
        for (int i = 0; i< length -2; i++) {
            for (int j = i+1; j < length -1; j++) {
                for (int k = j + 1; k < length; k++) {
                   if(numbers[i] + numbers[j] + numbers[k] == 0) {
                       List<Integer> result = new ArrayList<>();
                       result.add(numbers[i]);
                       result.add(numbers[j]);
                       result.add(numbers[k]);
                       results.add(result);
                   }
                }
            }
        }
        return results;
    }

    /*
     * select a and find b and c such that  (b+c) = a
     */
    private List<List<Integer>> getThreeSum2PointerApproach(int[] numbers) {
        List<List<Integer>> results=new ArrayList<List<Integer>>();
        Arrays.sort(numbers);
        int length = numbers.length;

        // selects a
        for(int i=0; i<length; i++) {
            // for b and c
            // calculate such that : b + c = q
            int j = i+1, k = length - 1;
            while(j < k) {
                if(numbers[j]+numbers[k]==-numbers[i]) {
                    List<Integer> result= new ArrayList<>();
                    result.add(numbers[i]);
                    result.add(numbers[j]);
                    result.add(numbers[k]);

                    results.add(result);

                    j++; k--;
                }
                else if(numbers[j]+numbers[k] < -numbers[i]) {
                    j++;
                }
                else {
                    k--;
                }
            }
            while(i+1<length && numbers[i+1]==numbers[i]) i++;
        }
        return results;
    }

    public static void main(String args[]) {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> threeSumBruteForceResult = threeSum.getThreeSumBruteForce(new int[]{-1,0,1,2,-1,-4});
        System.out.println("Using Bruteforce approach");
        threeSumBruteForceResult.forEach(listItem -> {
            listItem.forEach(result -> {
                System.out.print(" " + result);
            });
            System.out.println();
        });
        System.out.println("Using two pointer approach");

        List<List<Integer>> threeSum2PointerApproach = threeSum.getThreeSum2PointerApproach(new int[]{-1, 0, 1, 2, -1, -4});
        threeSum2PointerApproach.forEach(listItem -> {
            listItem.forEach(result -> {
                System.out.print(" " + result);
            });
            System.out.println();
        });
        System.out.println();
    }
}

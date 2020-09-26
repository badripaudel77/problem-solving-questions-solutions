package io.problems.general_problems;
/*
  Problem : Given an array with n items, job is to find the largest possible product from a pair within that array.
            array [] = { 1,5,8,3,10 } => Largest Product is : 10 * 8 = 80
*/

import java.util.Arrays;
public class LargestPairProduct {

    private static void largestProduct(int arr[]) {
         int len = arr.length;

         if(len > 1) {
             int result = calculateProduct(arr, len);
             System.out.println("Largest Product is : " + result);
         }
         
         else {
             System.out.println("Please Provide at least two elements.");
             return;
         }
    }

    private static int calculateProduct(int[] arr, int len) {
        int i, j;
        int largestProduct = 1;

        if(arr.length <1) {
            System.out.println("Provide some elements.");
            return -1;
        }

        // O(n)
        for (i = 0; i < len; i++) {
            //O(n)
            for (j = i + 1; j < len; j++) {
                if(arr[i] * arr[j] > largestProduct) {
                    largestProduct = arr[i] * arr[j];
                }
            }
        }
        return largestProduct;
    }

    public static void main(String[] args) {
        int arr [] = { 100,5,8,3,10,12,15 };
        System.out.println("Original Array is : " + Arrays.toString(arr));
        largestProduct(arr);
    }
}

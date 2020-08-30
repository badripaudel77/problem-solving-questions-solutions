package io.problems.general_problems;/*
  Problem : Given an array with n items, job is to find the largest possible product from a pair within that array.
            array [] = { 1,5,8,3,10 } => Largest Product is : 10 * 8 = 80

*/

import java.util.Arrays;

public class LargestPairProduct {

    private static int largestProduct(int arr[]) {
         int len = arr.length;

         if(len <= 1) {
             System.out.println("No elements in array, please provide at least two elements.");
             System.exit(0);
         }

         int i, j;
         int largestProduct = 1;

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
        System.out.println("largest product from the possible pair in array is : "  + largestProduct(arr));
    }
}

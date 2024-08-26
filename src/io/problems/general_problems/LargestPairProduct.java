package io.problems.general_problems;
/*
  Problem : Given an array with n items, job is to find the largest possible product from a pair within that array.
            Given following array:
            1 -> [ 1,5,8,3,10 ] => Should give 10 * 8 = 80
            NOTE: Imagine array integers will be only positive.
*/

import java.util.Arrays;
public class LargestPairProduct {

    private static int largestProduct(int arr[]) {
         int len = arr.length;
         if(len < 2) {
            System.out.println("Please Provide at least two elements.");
            throw new IllegalArgumentException("Pass at least two elements");
        }
         int result = calculateProduct(arr, len);
         return result;
    }

    // O(n^2)
    // This is good when negative elements are also allowed.
    private static int calculateProduct(int[] arr, int len) {
        if(len < 2) {
            throw new IllegalArgumentException("Length must be greater than 1 (At least two required for product).");
        }
        int i, j;
        int largestProduct = arr[0] * arr[len - 1];

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

    // nlog(n)
    private static int calculateLargestProduct(int [] arr, int len) {
        if(len < 2) return -1;
        Arrays.sort(arr); // nlog(n)
        return arr[len -1] * arr[len -2]; // largest product.
    }

    // More efficiently
    // O(n) -> In a single pass.
    private static int giveMeLargestProduct(int [] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // Update second largest with the previous largest because we've found new largest
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return largest * secondLargest;
    }

    private static int largestProductWithTwoSequentialLoops(int[] arr) {
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int secondMax = Integer.MIN_VALUE;

        // O(n)
        for (int i = 0; i< len; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        // O(n)
        for (int i = 0; i< len; i++) {
            if(i != maxIndex && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        // Time Complexity = O(n) + O(n) = O(2n) = O(n) , constant value is disregarded when loops are sequential.
        return max * secondMax;
    }

    public static void main(String[] args) {
        int arr [] = { 1,5,8,3,10 };
        System.out.println("Original Array is >>> " + Arrays.toString(arr));

        System.out.println("Largest product is : >>> " + largestProduct(arr));
        System.out.println("Giving you the largest product: " + giveMeLargestProduct(arr));

        System.out.println("Product with sequential loops: " + largestProductWithTwoSequentialLoops(arr));
    }
}

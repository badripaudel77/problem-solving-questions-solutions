package io.problems.leetcode;
/*
 * Problem : https://leetcode.com/problems/valid-mountain-array/
 *
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int size = arr.length;
        if(size < 3) return false;

        int i = 0;
        // Loop till the current element becomes smaller than the previous one
        for(i = 1; i< size; i++) {
            if(arr[i] <= arr[i -1]) {
                break;
            }
        }

        if(i == size || i == 1) {
            return false; // if there is no other seque
        }

        // now from the current index to the last index
        // check if current index is smaller than the previous one
        for(i = i; i< size; i++) {
            if(arr[i] >= arr[i-1]) {
                break;
            }
        }
        return i == size; // checked all the array elements
    }

    public static void main(String[] args) {
        ValidMountainArray validMountainArray = new ValidMountainArray();
        int arr [] = new int[]{1,3,2}; // true
        int arr1 [] = new int[]{0,3,2,1}; // true
        int arr2 [] = new int[]{2,1}; // false
        int arr3 [] = new int[]{1,3,2,3}; // false
        validMountainArray.validMountainArray(arr);
        validMountainArray.validMountainArray(arr1);
        validMountainArray.validMountainArray(arr2);
        validMountainArray.validMountainArray(arr3);
    }
}

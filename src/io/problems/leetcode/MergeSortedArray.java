package io.problems.leetcode;

import java.util.Arrays;

/*
 ** Question : https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    // TIME COMPLEXITY : O(n) + nlog(n) = nlog(n)
    // SPACE COMPLEXITY : O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tempIndex = 0;
        for(int i =0; i< m + n; i ++) {
            if(m == 0) {
                nums1[i] = nums2[i];
                tempIndex ++;
            }
            if(i >= m-1) {
                if(tempIndex < n) {
                    nums1[i + 1] = nums2[tempIndex];
                    tempIndex ++;
                }
            }
        }
        Arrays.sort(nums1); // nlog(n)
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[] {1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
}

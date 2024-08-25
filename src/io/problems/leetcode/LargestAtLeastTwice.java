package io.problems.leetcode;
/*
 ** Question Prompt : https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 */
public class LargestAtLeastTwice {
    public int dominantIndex(int[] nums) {
        int capacity = nums.length;
        int max = nums[0];
        int maxIndex = 0;

        for (int i = 1; i < capacity; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i <capacity; i++) {
          if(nums[i] != max && max < 2 * nums[i]) {
              return -1;
          }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        LargestAtLeastTwice atLeastTwice = new LargestAtLeastTwice();
        System.out.println("Dominant index >>> " + atLeastTwice.dominantIndex(new int[]{3,6,1,0})); // o/p = 1
        System.out.println("Dominant index >>> " + atLeastTwice.dominantIndex(new int[]{1,2,3,4})); // o/p = -1
    }
}

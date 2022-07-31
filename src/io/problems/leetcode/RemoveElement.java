package io.problems.leetcode;

/*
 ** Question : https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {

    private int removeElement(int[] nums, int val) {
        int capacity = nums.length;
        int index    = 0; // only increment if element is not the target element

        for(int i = 0; i< capacity; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        removeElement.removeElement(new int[]{3, 3, 2, 2, 3, 3}, 3);
    }
}

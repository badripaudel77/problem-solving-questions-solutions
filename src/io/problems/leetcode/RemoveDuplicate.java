package io.problems.leetcode;

/*
 Question : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicate {

    private int removeDuplicates(int[] nums) {
        int capacity = nums.length;
        int firstIndex = 0;
        int lastIndex = capacity - 1;
        int index = 0;

        while (lastIndex >= firstIndex) {
            if (nums[lastIndex] == nums[firstIndex]) {
                nums[index] = nums[firstIndex];
                firstIndex = lastIndex + 1;
                lastIndex = capacity - 1;
                index++;
            }
            else {
                lastIndex--;
            }
        }
        return index;
    }

    public static void main(String[] args) {
      RemoveDuplicate removeDuplicate = new RemoveDuplicate();
      removeDuplicate.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3}); // index = 4
      removeDuplicate.removeDuplicates(new int[] {1,1,1,1,1,2,2,2,2,3,4,4,4,4,4,6}); // index = 5
    }
}

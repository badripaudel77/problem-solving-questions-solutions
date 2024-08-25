package io.problems.leetcode;

/*
 ** Question : https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
 * Approach :
 * calculate total sum
 * initialize left sum = 0
 * iterate through all the elements, and compute [total sum - left sum - element at current index ] == left sum
 * if yes, return the index else return -1
 * Very similar to calculating range in maths graph ....
 * Total dist = A + B + C, left = A or could be any one of them, toal dist - left ... [just a simple mathematical calculation]
 */

public class PivotIndex {
    public int pivotIndex(int [] elements) {
        int capacity = elements.length;
        int leftSum = 0;
        int totalSum = 0;

        for (int element : elements) {
           totalSum += element;
        }

        for (int i = 0; i < capacity; i++) {
            if(totalSum - leftSum - elements[i] == leftSum) {
                return i;
            }
            leftSum += elements[i];
        }
        return -1;
    }
    public static void main(String[] args) {
       PivotIndex pivotIndex = new PivotIndex();
        int[] elements = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println("Pivot Index is >>> " + pivotIndex.pivotIndex(elements));
        System.out.println("Pivot Index is >>> " + pivotIndex.pivotIndex(new int[]{1,2,3}));
        System.out.println("Pivot Index is >>> " + pivotIndex.pivotIndex(new int[]{2,1,-1}));
    }
}

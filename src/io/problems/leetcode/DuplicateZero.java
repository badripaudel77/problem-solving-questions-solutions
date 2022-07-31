package io.problems.leetcode;

/*
 ** Question : https://leetcode.com/problems/duplicate-zeros/
 */
public class DuplicateZero {
    private void duplicateZeroMethodOne(int [] numbers) {
        int capacity  = numbers.length;

        for (int i = capacity -1 ; i>= 0; i--) {
            if(numbers[i] == 0) {
                // duplicate zero and right shift
                for (int j = capacity -1 ; j > i; j--) {
                    numbers[j] = numbers[j - 1];
                }
            }
        }
    }

    private void duplicateZeroMethodTwo(int [] numbers) {
        int capacity  = numbers.length;
        for (int i = 0 ; i< capacity; i++) {
            if(numbers[i] == 0) {
                // duplicate zero and right shift
                for (int j = capacity -1 ; j > i; j--) {
                    numbers[j] = numbers[j - 1];
                }
                i++; // increment so that old value doesn't override all values.
            }
        }
    }

    public static void main(String[] args) {
        DuplicateZero duplicateZero = new DuplicateZero();
        int [] numbers = {1,2,0,5,0, 8, 8, 0};
        duplicateZero.duplicateZeroMethodOne(numbers);

        int [] numbersTwo = {1,0,5,0, 8};
        duplicateZero.duplicateZeroMethodTwo(numbersTwo);
    }
}

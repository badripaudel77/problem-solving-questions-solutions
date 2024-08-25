package io.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem : https://leetcode.com/problems/check-if-n-and-its-double-exist/
 */
public class DoubleExists {

    private boolean checkIfExist(int [] arr) {
        // keeps track of visited elements
        Set checked = new HashSet();

        /* for every element check if it's double or half exists and add that to the set
         * for eg : if current element is 10
         * if checked set contains either 20 or 5 then there exists such condition.
         */
        for (int number: arr) {
            if(checked.contains(number * 2) || (number % 2 ==0 && checked.contains(number / 2))) {
                return true;
            }
            checked.add(number);
        }
        return false;
    }
    public static void main(String[] args) {
        DoubleExists doubleExists = new DoubleExists();
        int [] array = new int[] { 10, 34, 5, 6, 120};
        // int [] array = new int[] { 3,1,7,11 };
        boolean doesExist = doubleExists.checkIfExist(array);
        System.out.println("Exists ? >> " + doesExist);
    }
}

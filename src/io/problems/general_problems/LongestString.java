package io.problems.general_problems;

 /*
    Given an array of strings, return another array containing all of its longest strings.
    For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
                     allLongestStrings(inputArray) = ["aba", "vcd", "aba"]
 */

import java.util.Arrays;

public class LongestString {
    public static void main(String[] args) {
        String arr[] = {"Badri", "Ali", "Sujan", "Harke"};
        System.out.println("String array is : " + Arrays.toString(arr));
        System.out.println("Required Array is : " + Arrays.toString(allLongestStrings(arr)));
    }

    private static String[] allLongestStrings(String[] inputArray) {
        String a[];
        int j = 0;
        int count = 0;
        int max = inputArray[0].length();
        int len = inputArray.length;

        for(int i=1; i<len; i++) {
            if(inputArray[i].length() >max) {
                max = inputArray[i].length();
            }
        }

        for(int i=0; i<len; i++) {
            if(inputArray[i].length() == max) {
                count++;
            }
        }

        a = new String[count];
        for(int i=0; i<len; i++) {
            if(inputArray[i].length() == max) {
                a[j] = inputArray[i];
                j++;
            }
        }
        return a;
    }
}


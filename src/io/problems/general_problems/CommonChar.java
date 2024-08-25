package io.problems.general_problems;

/*
codesignals Problem : https://app.codesignal.com/arcade/intro/level-3/JKKuHJknZNj4YGL32
Given two strings, find the number of common characters between them.

Example :
For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.
*/

import java.util.Arrays;

public class CommonChar {
    public static void main(String[] args) {
        String strOne = "aaadbcc";
        String strTwo = "adcaa";
        System.out.println("No of common chars in " + strOne + " and " + strTwo + " is : " + commonChar(strOne, strTwo));
    }

    private static int commonChar(String strOne, String strTwo) {
        int count = 0;

        char charArr1[] = strOne.toCharArray();
        char charArr2[] = strTwo.toCharArray();


         for(int i = 0; i< charArr1.length; i++) {
             for(int j = 0; j< charArr2.length; j++) {
                 if(charArr1[i] == charArr2[j]) {
                     charArr2[j] = ' ';
                     count++;
                     break; // If avoid checking other char if match is already found.
                 }
             }
         }
        System.out.println(Arrays.toString(charArr1) + " " + Arrays.toString(charArr2));
        return count;
    }
}

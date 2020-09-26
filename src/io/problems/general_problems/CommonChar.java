package io.problems.general_problems;

/*
codesignlas Problem : https://app.codesignal.com/arcade/intro/level-3/JKKuHJknZNj4YGL32
Given two strings, find the number of common characters between them.

Example :
For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.
*/

import java.util.Arrays;

public class CommonChar {
    public static void main(String[] args) {
        String strOne = "aabcc";
        String strTwo = "adcaa";
        System.out.println("No of common chars in " + strOne + " and " + strTwo + " is : " + commonChar(strOne, strTwo));
    }

    private static int commonChar(String strOne, String strTwo) {
        int len1 = strOne.length();
        int len2 = strOne.length();
        int count = 0;

        char charArr1[] = new char[len1];
        char charArr2[] = new char[len2];

        for(int i = 0; i< len1; i++) {
            charArr1[i] = strOne.charAt(i);
        }
        for(int i = 0; i< len2; i++) {
            charArr2[i] = strTwo.charAt(i);
        }

         for(int i = 0; i< len1; i++) {
             for(int j = 0; j< len2; j++) {
                 if(charArr1[i] == charArr2[j]) {
                     charArr2[j] = ' ';
                     count++;
                 }
             }
         }
        System.out.println(Arrays.toString(charArr1) + " " + Arrays.toString(charArr2));
        return count;
    }
}

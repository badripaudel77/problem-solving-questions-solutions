package io.problems.leetcode;

/*
 * Question Prompt : https://leetcode.com/problems/reverse-string/
 */
public class ReverseStringRecursively {
    public  String reverse(String str) {
        // Base condition
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        // recursive solution
        String reversedString = reverse(str.substring(1)) + str.charAt(0);
        return reversedString;
    }
    public static void main(String[] args) {
        ReverseStringRecursively reverseStringRecursively = new ReverseStringRecursively();
        String word = "java";
        System.out.println("Reversed one is >> " + reverseStringRecursively.reverse(word));
    }
}

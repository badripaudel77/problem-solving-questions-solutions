package io.problems.general_problems;

public class Pallindrome {
    public static void main(String[] args) {
        int number1 = 177;
        int number2 = 232;
        System.out.println(" Is number = " + number1 + " pallindrome ? => " + (isNumberPallindrome(number1) ? "YES" : "NO"));
        System.out.println(" Is number = " + number2 + " pallindrome ? => " + (isNumberPallindrome(number2) ? "YES" : "NO"));
    }

    private static boolean isNumberPallindrome(int number) {
        int newNum = 0;
        int lastDigit;
        int original = number;

        while( number !=0) {
          lastDigit = number % 10; //gives last digit
          newNum = (newNum * 10) + lastDigit;
          number = number / 10; //
        }
        if(original == newNum) return true;
        else return  false;
    }
}

package io.problems.general_problems;

public class CheckArmstrongNumber {
    public static void main(String[] args) {

        int number1 = 153;
        int number2 = 150;

        System.out.println("Is number = " + number1 + " an armstrong ? " + (isArmstrongNumber(number1) == true ? "Yes it is." : "No it's not."));
        System.out.println("Is number = " + number2 + " an armstrong ? " + (isArmstrongNumber(number2) == true ? "Yes it is." : "No it's not."));
    }

    private static boolean isArmstrongNumber(int number) {
        int num;
        int remainder;
        double sum = 0;

        num = number;
        while (number !=0) {
          remainder = number % 10; // remainder
          sum = sum + Math.pow(remainder, 3);
          number = number /10;
        }
        if(sum == num) {
            return true;
        }
        return  false;
    }
}

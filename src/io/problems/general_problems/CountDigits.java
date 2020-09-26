package io.problems.general_problems;

public class CountDigits {

    public static void main(String[] args) {
        System.out.println("running ");
        long number = 9867622377L;
        System.out.println("number " + number);
        System.out.println("The number of digits in number = " + number + " is : " + new CountDigits().countDigits(number));
        System.out.println("done");
    }

    int  countDigits(long number ){
        int count = 0;
        while(number != 0) {
            number = number /10;
            count++;
        }
        return count;
    }

}

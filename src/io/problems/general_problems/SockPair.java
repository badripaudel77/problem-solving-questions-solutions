package io.problems.general_problems;

/*
 There are n pairs of socks.
 Each pair with different colors.
 You have to pick a pair of socks, color of your choice.
 You can pick only one sock at a time.
 Write a program that returns the worst case attempt to be sure that you have the desired socks in your hand.

 1<=n<100

*/

public class SockPair {
    public static void main(String[] args) {
        int socksPair = 50; // total 100 pairs of socks
        System.out.println("We must draw the drawer  with " + socksPair + " pairs of socks " + calculate(socksPair)+  " times to be sure.");
    }

    private static int calculate(int socksPair) {
        return socksPair * 2;
    }
}

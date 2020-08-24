package io.problems.statistics;

/*
 Median is the middle value in the sorted array.
    => If the len of the array is even, then median is the mean of the middle two elements.
*/

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {

        int[] values  = { 5,1,6,2,1, 0, -1,5};

        System.out.println("Median of the given statistics is : " + sortElements(values));
    }

    public static float sortElements(int [] values) {
        int i,j;
        int len;
        System.out.println("original array is : " + Arrays.toString(values));

        //array needs to be sorted
        len = values.length;
        for ( i = 0; i < len; i++) {
            for (j = 0; j < len -1 -i ; j++) {

                if(values[j] > values[j+1]) {
                    //swap
                    swapElements(values, j, j+1);
                }
            }
        }
        //now array has been sorted
        //calculate the mean
        return calcMedian(values);

    }

    // method to swap elements
    private static void swapElements(int values[], int j, int i) {
        int temp;
        temp = values[j];
        values[j] = values[j+1];
        values[j+1]  = temp;
    }

    //method to compute median
    private static float calcMedian(int[] values) {
        System.out.println("Sorted array is : " + Arrays.toString(values));
        float median ;
        int len = values.length;
        int i, j;

        //if length is odd, median is the middle element
        if(len%2 != 0) {
            // len/2 gives integer value, if 5, 5/2 = 2.5 = 2,
            // middle elem will be elem at that position because index starts from 0
            median = values[len / 2];
        }
        //else the median will be the mean of the middle elements
        else {
            int newLen = len / 2;
            median = (float) (values[newLen -1] + values[newLen]) / 2;
        }
        return  median;
    }
}

package io.problems.statistics;

import java.util.HashMap;

 /*
     Mode is the value that has occurred frequently in the given statistics.
 */

public class Mode {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 0,1, 5,5, 5,5};

        int mode = calcMode(arr);
        System.out.println("The mode of the given array is : " + mode);

    }

    private static int calcMode(int[] arr) {

        int len = arr.length;
        int frequency = 1;
        int mode = 0;
        int i;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // System.out.println(hashMap.get(1));

        for (i = 0; i < len; i++) {

            //if that element is already in the hashmap
            if (hashMap.get(arr[i]) != null) {
                //get the count of elem at this index from hashmap
                int count = hashMap.get(arr[i]);

                //increase it's count by one
                count = count + 1;

                hashMap.put(arr[i], count);

                if (count > frequency) {
                    frequency = count;
                    mode = arr[i];
                }
            }
            //else element has appeared first time so it's count is 1
            else {
                hashMap.put(arr[i], 1);
            }
        }
        System.out.println(hashMap);
        return mode;
    }
}

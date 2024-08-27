package ru.courses.otherTests;

import java.util.ArrayList;
import java.util.Arrays;

public class Test9 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 2, 2, 9};
        int x = 2;
        findAll(arr, x);
    }


    public static int[] findAll(int[] arr, int x) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) arr2.add(i);

        }

        Integer arr3[] = new Integer[arr2.size()];
        arr3 = arr2.toArray(arr3);
        System.out.println(Arrays.toString(arr3));

        return arr;

    }

}
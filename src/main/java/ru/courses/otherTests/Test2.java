package ru.courses.otherTests;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 2, 2, 9};
        int x = 2;
        int[] arr3 = findAll(arr, x);
        System.out.println(Arrays.toString(arr3));
    }


    public static int[] findAll(int[] arr, int x) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) arr2.add(i);
        }

        int[] result = new int[arr2.size()];

        for (int i = 0; i < arr2.size(); i++) {
            result[i] = arr2.get(i);
        }

        return result;
    }
}





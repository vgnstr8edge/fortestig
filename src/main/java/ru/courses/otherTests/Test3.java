package ru.courses.otherTests;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,2,2,9};
        int x = 2;
        findAll(arr, x);
    }

    public static int[] findAll(int[] arr, int x){
        int[] arr2 = new int[arr.length];
        for (int i=0; i< arr.length; i++) {
            if (arr[i]==x) arr2[i] = i;
        }
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }
}




/*
public class ru.courses.otherTests.Test3 {
    public static void main(String[] args) {
        rightTriangle(4);
    }

    public static void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 1; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}





    public static void main(String[] args) {
        leftTriangle(4);
    }

    public static void leftTriangle(int x){
    for (int i=0; i<x; i++){
        for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }







    public static void main(String[] args) {
        square(4);
    }

    public static void square(int x){
    for (int i=0; i<x; i++){
        for (int j = 0; j<x; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
 */
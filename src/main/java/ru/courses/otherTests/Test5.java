package ru.courses.otherTests;

import java.util.Arrays;


public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 9;
        int pos = 3;
        add(arr, x, pos);

    }


    public static int[] add(int[] arr, int x, int pos) {

        int[] arr2 = new int[arr.length+1];

        for (int i = 0; i < pos; i++) {
            arr2[i] = arr[i];
        }

        arr2[pos] = x;

        for (int i = pos; i < arr.length; i++) {
            arr2[pos] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));
        return arr2;
    }
}





/*
import java.util.ArrayList;


public class ru.courses.otherTests.Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 9;
        int pos = 3;
        add(arr, x, pos);
    }


    public static int[] add(int[] arr, int x, int pos) {

        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < pos; i++) {
            arr2.add(arr[i]);
        }

        arr2.add(x);

        for (int i = pos; i < arr.length; i++) {
            arr2.add(arr[i]);
        }

        System.out.println(arr2);
        return arr;
    }
}


=====================================
import java.util.Arrays;

public class ru.courses.otherTests.Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int pos = 3;
        System.out.println(Arrays.toString(add(arr, ins, pos)));
    }

    public static int[] add(int[] arr, int[] ins, int pos) {

        int[] arr2 = new int[arr.length + ins.length];

        System.arraycopy(arr, 0, arr2, 0, pos);
        System.arraycopy(ins, 0, arr2, pos, ins.length);
        System.arraycopy(arr, pos, arr2, pos + ins.length, arr.length - pos);

        return arr2;

    }

}






import java.util.ArrayList;

public class ru.courses.otherTests.Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 9;
        int pos = 3;
        add(arr, x, pos);
    }

    public static int[] add(int[] arr, int x, int pos) {

        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < arr[pos]; i++) {
            arr2.add(arr[i]);
        }

        arr2.add(pos, x);

        for (int i = pos + 1; i < arr.length; i++) {
            arr2.add(arr[i]);
        }

        System.out.println(arr2);
        return arr;
    }
}






=============================================
import java.util.ArrayList;

public class ru.courses.otherTests.Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -2, 2, -5};
        deleteNegative(arr);
    }

    public static int[] deleteNegative(int[] arr) {

        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) arr2.add(arr[i]);
        }

        System.out.println(arr2);
        return arr;
    }
}




===============================

public class ru.courses.otherTests.Test5 {
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

        System.out.println(arr2);
        return arr;
    }
}








=========================
public class ru.courses.otherTests.Test5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 8, 9};
        System.out.println(Arrays.toString(concat(arr1, arr2)));
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }

import java.util.Arrays;

public class ru.courses.otherTests.Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseBack(arr)));
    }

    public static int[] reverseBack(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[arr.length - 1 - i] = arr[i];
        }
        return arr2;
    }
}





=====================================================


    public static void reverse(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[arr.length - 1 - i] = arr[i];
        }

        arr = arr2;
        System.out.println(Arrays.toString(arr));
    }
}



import java.util.Arrays;

public class ru.courses.otherTests.Test5 {
    public static void main(String[] args) {
        int[] arr = {1,-2,-7,4,-7,-2,1};
        System.out.println(palindrom(arr));
    }


    public static boolean palindrom(int[] arr) {

        int[] arr2 = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[arr.length - 1 - i] = arr[i];

            if (Arrays.equals(arr2, arr)) return true;
        }

        return false;
    }
}

============================================================

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(findFirst(arr, 2));
    }


    public static int findFirst(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }






    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(findFirst(arr, 2));
    }


    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }



        for (;;) {
            if (isDirectory) continue;
            System.out.println("Данный путь ведет к папке. Повторите ввод.");

        }


        for (; ; ) {
            if (fileExists) ;
            count++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + count);
            } else {
            System.out.println("Данный путь некорректен. Повторите ввод.");
 */
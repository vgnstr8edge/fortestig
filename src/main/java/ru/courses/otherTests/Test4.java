package ru.courses.otherTests;

public class Test4 {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        int randomNum = 3;
        int count = 0;
        int x;

        java.util.Scanner sc = new java.util.Scanner(System.in);


        do {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            count++;
            if (x == randomNum) {
                System.out.println("Yes, it`s " + randomNum);
                System.out.println("Number of your tries is: " + count);

            } else {
                System.out.println("No, try again");
            }

        } while (x != randomNum);
    }
}

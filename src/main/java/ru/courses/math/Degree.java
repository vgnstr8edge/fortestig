package ru.courses.math;

public class Degree {
    String X;
    String Y;

    public static double pow(String X, String Y) {
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);
        return Math.pow(x, y);
    }

}
package ru.courses.geometry;

import java.util.Objects;

public class Point implements Cloneable{
   int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {

        return "ru.courses.geometry.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point)super.clone();
    }


    public static boolean compare(Point a, Point b, Point c) {
        return (a == b) && (b == c);
    }


}

package ru.courses.geometry;

public class Fraction extends Number {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }


    @Override
    public int intValue() {
        return (int) ((double) num / denum);
    }

    @Override
    public long longValue() {
        return (long) ((double) num / denum);
    }

    @Override
    public float floatValue() {
        return (float) num / denum;
    }

    @Override
    public double doubleValue() {
        return (double) num / denum;
    }
}

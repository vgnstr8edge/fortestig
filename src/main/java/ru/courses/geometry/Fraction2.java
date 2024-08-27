package ru.courses.geometry;

public class Fraction2 {
    private final int numerator, denominator;

    public Fraction2(int numerator, int denominator) {
        if ((numerator>0) || (numerator<0));
            this.numerator = numerator;
        if (denominator<0) throw new IllegalArgumentException("denominator can't be less 0");
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Дробь{" +
                "числитель=" + numerator +
                ", знаменатель=" + denominator +
                '}';
    }



    // сложение дробей
    public Fraction2 sumFraction(Fraction2 other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction2(newNumerator, newDenominator);
    }

    // вычитание дробей
    public Fraction2 minusFraction(Fraction2 other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction2(newNumerator, newDenominator);
    }

    // сложение с целым числом
    public Fraction2 sumNumber(int integer) {
        int newNumerator = this.numerator + integer * this.denominator;
        return new Fraction2(newNumerator, this.denominator);
    }

    // вычитание с целым числом
    public Fraction2 minusNumber(int integer) {
        int newNumerator = this.numerator - integer * this.denominator;
        return new Fraction2(newNumerator, this.denominator);
    }



}

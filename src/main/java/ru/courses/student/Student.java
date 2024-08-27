package ru.courses.student;

public class Student {
    private String name = "Dima";
    final private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = java.util.Arrays.copyOf(grades, grades.length);
    }

    public int[] getGrades() {
        return java.util.Arrays.copyOf(grades, grades.length);
    }



    












}

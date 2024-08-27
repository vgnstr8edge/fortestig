package ru.courses.otherTests;

public enum Spiciness{
    VERYSPICY("очень острый"), SPICY("острый"), NOTSPICY("не острый");

    private final String rename;

    Spiciness(String rename) {
        this.rename = rename;
    }

    @Override
    public String toString(){
        return rename;
    }
}

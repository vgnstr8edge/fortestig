package ru.courses.otherTests;


public class Sauce {
    private String name;
    private Spiciness spiciness;


    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness;
    }
}

//public class Main {
//    public static void main(String[] arg) {
//        Sauce sauce1 = new Sauce("Чили", Spiciness.VERYSPICY);
//        Sauce sauce2 = new Sauce("Барбекю", Spiciness.NOTSPICY);
//        System.out.println(sauce1);
//        System.out.println(sauce2);
//    }
//}
//
//package ru.courses.otherTests;
//
//public enum Spiciness{
//    VERYSPICY("очень острый"), SPICY("острый"), NOTSPICY("не острый");
//
//    private final String rename;
//
//    Spiciness(String rename) {
//        this.rename = rename;
//    }
//
//    @Override
//    public String toString(){
//        return rename;
//    }
//}
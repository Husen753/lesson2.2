package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("B").print();
        createObject("C").print();
        createObject("D").print();
    }

    public static Printable createObject(String className) {
        return switch (className) {
            case "B" -> new B("Алфавит", "буквы", 10, "10");
            case "C" -> new C("Алфавит", "число", 9, "11");
            case "D" -> new D("Алфавит", "число", 7, "9");
            default -> null;

        };



    }
}

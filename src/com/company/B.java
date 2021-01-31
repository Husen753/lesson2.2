package com.company;

public class B extends A implements Printable{
    private String B;

    public String getB() {
        return B;
    }

    public B (String alfavit, String bukva, int number, String B){
        super(alfavit,bukva,number);
        this.B= B;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Буква Б");
        System.out.println("B"+getB());

    }
}

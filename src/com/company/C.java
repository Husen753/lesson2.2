package com.company;

public class C extends A implements Printable{
    private String C;

    public String getC() {
        return C;
    }
    public C (String alfavit, String bukva, int number, String C){
        super(alfavit,bukva,number);
        this.C= C;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Буква C");
        System.out.println("B"+getC());

    }
}

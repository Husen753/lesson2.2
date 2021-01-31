package com.company;

public class D extends A implements Printable{
    private String D;

    public String getD() {
        return D;
    }
    public D (String alfavit, String bukva, int number, String D){
        super(alfavit,bukva,number);
        this.D= D;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("Буква Д");
        System.out.println("D"+getD());


    }

}

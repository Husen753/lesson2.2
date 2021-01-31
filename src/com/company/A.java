package com.company;

public class A implements Printable{
    private String alfavit;
    private String bukva;
    private int number;


    public String getAlfavit() {
        return alfavit;
    }

    public String getBukva() {
        return bukva;
    }

    public int getNumber() {
        return number;
    }
    public A (String alfavit, String bukva, int number){
        this.alfavit= alfavit;
        this.bukva= bukva;
        this.number= number;
    }

    @Override
    public void print() {
        System.out.println("Гласные");
        System.out.println("Алфавит"+getAlfavit()+"\nсимвал"+getBukva()+"\nколичество"+getNumber());

    }

}


package com.company;

public class Main {

    public static void main(String[] args) {
    AbstractChairFactory c = new ChairFactory();
    VictorianChair a = c.createVictorianChair(100);
    System.out.println(a.getAge());
    FunctionalChair f = c.createFunctionalChair();
    System.out.println(f.sum(10,20));
    MagicChair m = c.createMagicChair();
    m.doMagic();
    }
}

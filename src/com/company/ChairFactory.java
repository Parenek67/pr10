package com.company;

public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair(int a){
        return new VictorianChair(100);
    }
    public MagicChair createMagicChair(){
        return new MagicChair();
    }
    public FunctionalChair createFunctionalChair(){
        return new FunctionalChair();
    }
}

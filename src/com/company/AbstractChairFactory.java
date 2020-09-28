package com.company;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int a);
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}

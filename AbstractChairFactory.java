package ru.mirea.pr10;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicianChair();
    FunctionalChair createFunctionalChair();
}

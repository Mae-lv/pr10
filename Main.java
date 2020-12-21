package ru.mirea.pr10;

public class Main {
    public static void Main(String[] args) {
        ConcreteFactory obj1 = new ConcreteFactory();
        System.out.println(obj1);
        obj1.CreateComplex(12, 12);

        ConcreteFactory obj2 = new ConcreteFactory();
        System.out.println(obj2);
        obj2.createComplex();
    }
}
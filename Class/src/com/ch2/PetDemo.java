package com.ch2;

public class PetDemo {
    public static void main(String[] args) {
        Pet dog = new Pet("xlq",100,100,"亲爱的");
        dog.print();
        dog.getHealth();
        dog.getLove();
        dog.getName();
        Cat cat = new Cat();
        cat.getHealth();
        cat.getLove();
        cat.getName();
        cat.print();
    }
}

package com.ch1;

public class Dog {
    private String name = "旺财";
    private int health = 100;
    private int love = 0;
    private String strain = "拉布拉多犬";

    public Dog(String name, int i, int i1, String strain) {
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getHealth() {
        System.out.println(this.health);
    }

    public void getLove() {
        System.out.println(this.love);
    }

    public void getStrain() {
        System.out.println(this.strain);
    }

    public void bark() {
        System.out.println("汪汪汪......");
    }
}

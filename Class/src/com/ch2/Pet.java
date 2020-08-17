package com.ch2;

public class Pet {
    private String name;
    private int health;
    private int love;
    private String strain;

    public Pet(String name,int health,int love,String strain) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.strain = strain;
    }

    public void print() {
        System.out.println("我的品种是："+this.name);
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
}

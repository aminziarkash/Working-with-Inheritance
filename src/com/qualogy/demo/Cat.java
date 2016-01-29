package com.qualogy.demo;

/**
 * Created by aziarkash on 28-1-2016.
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat making noise");
    }

    public void jump() {
        System.out.println("Cat juming...");
    }
}

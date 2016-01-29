package com.qualogy.demo;

/**
 * Created by aziarkash on 28-1-2016.
 */
public class Bird extends Animal implements Flyable {

    @Override
    public void eat() {
        System.out.println("bird eating");
    }

    @Override
    public void fly() {
        System.out.println("bird flying");
    }

    @Override
    public void land() {
        System.out.println("bird landing");
    }

    @Override
    public void makeNoise() {
        System.out.println("bird making noise");
    }
}

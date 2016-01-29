package com.qualogy.demo;

/**
 * Created by aziarkash on 28-1-2016.
 */
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog barking");
    }
}

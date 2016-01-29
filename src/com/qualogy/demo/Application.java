package com.qualogy.demo;

/**
 * Created by aziarkash on 28-1-2016.
 */
public class Application {

    public static void main(String[] args) {

        new Application().createCat();

        Application application = new Application();
        application.createDog();
        application.createBird();
        application.castingExample();
    }

    void createCat() {
        Cat cat = new Cat();
        System.out.println("Animal type\t:\t" + cat.getClass().getSimpleName());
        cat.eat();
        addSeparator();

        Animal animalCat = new Cat();
        System.out.println("Animal type\t:\t" + animalCat.getClass().getSimpleName());
        animalCat.eat();
        addSeparator();
        System.out.println("Animal cat = new Cat();\nThe object type : Cat\nThe object reference : Animal");
        // animalCat.jump(); will not work eventhough the Cat class has a public method called jump();
        addSeparator();
    }

    void createDog() {
        Dog dog = new Dog();
        System.out.println("Animal type\t:\t" + dog.getClass().getSimpleName());
        dog.makeNoise();
        addSeparator();
    }

    void createBird() {
        Animal animalBird = new Bird();
        System.out.println("Animal type\t:\t" + animalBird.getClass().getSimpleName());
        // animalBird.fly() will not work because fly() method is not available in the Animal class

        Bird bird = new Bird();
        bird.fly();
        bird.makeNoise();
        bird.eat();
        addSeparator();

        Flyable flyableBird = new Bird();
        System.out.println("Animal type\t:\t" + flyableBird.getClass().getSimpleName());
        flyableBird.fly();
        flyableBird.land();
        addSeparator();
    }

    void castingExample() {
        Bird parrotBird = new Parrot();
        ((Parrot) parrotBird).sing();
        Parrot parrot = new Parrot();
        parrot.makeNoise(); // parrot is calling birds makeNoise() because it is inherited

        if (parrot instanceof Bird) {
            System.out.println("parrot is a bird!");
        }

        if (parrotBird instanceof Parrot) {
            System.out.println("bird is a parrot");
        }
    }

    void addSeparator() {
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
}

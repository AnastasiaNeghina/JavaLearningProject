package com.neghina.zooclubservice;

public class Dog extends Animal implements AnimalInterface {
    //    Constructor cu parametru ce apeleaza constructorul clasei perinte Animal
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes: woof woof!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats chicken meatballs");
    }
}

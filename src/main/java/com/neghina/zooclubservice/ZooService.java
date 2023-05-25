package com.neghina.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
//        principiul Polimorfism
        Animal cat1 = new Cat("Simba");
        cat1.eat();
        System.out.println();
        Animal dog1 = new Dog("Cooper");
        dog1.eat();
        System.out.println();
        Cat cat2 = new Cat("Lily");
        cat2.eat();
        cat2.makeSound();
        System.out.println();
        Dog dog2 = new Dog("Rocky");
        dog2.eat();
        dog2.makeSound();

    }
}

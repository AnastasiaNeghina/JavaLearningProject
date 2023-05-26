package com.neghina.zooclubservice;

public class Cat extends Animal implements AnimalInterface {
    //    Constructor cu parametru ce apeleaza clasa parinte in scopul atribuirii unui nume obiectului Cat
    public Cat(String name) {
        super(name);
    }

    //    Suprascriem metodele makesound si eat
    @Override
    public void makeSound() {
        System.out.println(getName() + " makes: meow meow!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats: wet fish feed");
    }
}

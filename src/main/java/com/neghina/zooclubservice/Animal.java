package com.neghina.zooclubservice;

public abstract class Animal {
    //   Declaram variabila de instanta
    private String name;

    //    Constructor cu parametru
    public Animal(String name) {
        this.name = name;
    }

    //   Getter - returneaza valoarea numelui
    public String getName() {
        return name;
    }

    //    Metoda abstracta, nu are implementare
    public abstract void eat();
}
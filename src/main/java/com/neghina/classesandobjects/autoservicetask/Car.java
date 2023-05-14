package com.neghina.classesandobjects.autoservicetask;

public class Car {

    String model;
    String vin;
    int yearOfProduction;
    int km;
    String fuelType;

    public Car(String model, String vin, int yearOfProduction) {
        this.model = model;
        this.vin = vin;
        this.yearOfProduction = yearOfProduction;
        System.out.println("In urma executiei acestui constructor de 3 parametri, se creaza un nou obiect despre care nu cunoastem km si fuelType");
    }

    public Car(String model, int yearOfProduction) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        System.out.println("A fost creata o masina despre care cunoastem modelul si anul producerii");
    }
}
package com.neghina.classesandobjects.autoservicetask;

public class Garage {
    String numberId;
    String address;
    String schedule;
    boolean hasComputersForDiagnosis;
    int storeCapacity;

    public Garage(String address) {
        this.address = address;
        System.out.println("A fost creat un garaj despre care cunoastem doar adresa");
    }

    public Garage(int storeCapacity) {
        this.storeCapacity = storeCapacity;
        System.out.println("Deaspre acest garaj cunoastem doar capacitate de stocare a masinilor");
    }
}
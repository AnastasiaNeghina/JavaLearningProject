package com.neghina.classesandobjects.autoservicetask;

public class Worker {
    String name;
    int identificationNumber;
    String speciality;
    String workingSchedule;

    public Worker(String specialityMecanic) {
        this.speciality = specialityMecanic;
        System.out.println("In sistem a fost inregistrat un nou lucrator despre care cunoastem doar specialitatea acestuia");
    }

    public Worker() {
        System.out.println(" Angajat nou, nu au fost inca inregistrate datele personale");
    }
}
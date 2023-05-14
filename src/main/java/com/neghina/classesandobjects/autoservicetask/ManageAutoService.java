package com.neghina.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage autoSpace = new Garage("bd. Mircea cel Batran 13");
        autoSpace.storeCapacity = 20;
        autoSpace.hasComputersForDiagnosis = true;
        autoSpace.numberId = "2A";
        autoSpace.schedule = "Luni - Vineri, de la 09:00 - 17:00";
        System.out.println("Garajul AutoSpace are urmatoarele proprietati: adresa: " + autoSpace.address + ", numberId: " + autoSpace.numberId + ", orarul de lucru: " + autoSpace.schedule + ", cu capacitatea de stocare a " + autoSpace.storeCapacity + " masini, de asemenea detine calculator pentru diagnosticare " + autoSpace.hasComputersForDiagnosis);

        Garage autoDoc = new Garage("bd. Decebal 132");
        autoDoc.storeCapacity = 10;
        autoDoc.hasComputersForDiagnosis = false;
        autoDoc.numberId = "2B";
        autoDoc.schedule = "Luni - Vineri, de la 07:00 - 16:00";
        System.out.println("Garajul AutoDoc are urmatoarele proprietati: adresa:" + autoDoc.address + ", numberId: " + autoDoc.numberId + ", orarul de lucru: " + autoDoc.schedule + ", cu o capacitate de stocare a " + autoDoc.storeCapacity + " masini, de asemenea detine calculator pentru diagnosticare" + autoDoc.hasComputersForDiagnosis);

        Car masina1 = new Car("Mercedes, GLE Class", "FA6P0PU2HR", 2020);
        masina1.km = 13589;
        masina1.fuelType = "diesel";
        System.out.println("Spre reparatie a fost adusa urmatoarea masina:" + masina1.model + ", VIN" + masina1.vin + ", fuel type " + masina1.fuelType + ", anul producerii " + masina1.yearOfProduction + ", avand la bord " + masina1.km + " km");

        Car masina2 = new Car("Ford KUGA", 2023);
        masina2.vin = "RA98HUN56";
        masina2.fuelType = "diesel";
        masina2.km = 35000;
        System.out.println("Spre reparatie a fost adusa urmatoarea masina:" + masina2.model + ", VIN " + masina2.vin + ", fuel type " + masina2.fuelType + ", anul producerii " + masina2.yearOfProduction + ", avand la bord " + masina2.km + " km");

        Tool carCompressor = new Tool(20862653, true);
        carCompressor.isDurable = true;
        carCompressor.needsElectritity = true;
        System.out.println("A fost achizitionat urmatorul instrumentu: nr de inventariere " + carCompressor.inventoryNumber + ", este Varsatil " + carCompressor.isVersatile + ", este durabil " + carCompressor.isDurable + ", lucreaza la electricitate " + carCompressor.needsElectritity);

        Worker worker1 = new Worker("mecanic superior");
        worker1.name = "Mihail Mocanu";
        worker1.identificationNumber = 12;
        worker1.workingSchedule = "Luni - Vineri, de la 07:00 la 13:00";
        System.out.println("A fost angajat urmatorul lucrator: nume, prenume: " + worker1.name + ", numarul de identificare " + worker1.identificationNumber + ", specialitatea " + worker1.speciality + ", orarul de munca: " + worker1.workingSchedule);
    }
}
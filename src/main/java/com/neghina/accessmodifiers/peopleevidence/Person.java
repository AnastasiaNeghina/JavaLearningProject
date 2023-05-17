package com.neghina.accessmodifiers.peopleevidence;

public class Person {
    public String name;
    public String surname;
    private String sex;
    protected int age;
    protected final long id;
    public boolean isMaried;
    public boolean isRetired;
    public long mobNumber;
    public String address;

    public Person(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        System.out.println("Un obiect de timp Person a fost creat, folosind un constructior cu 3 parametri formali");
    }

    public Person(String name, String surname, String sex, int age, long id, boolean isMaried, boolean isRetired, String address, long mobNumber) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.id = id;
        this.isMaried = isMaried;
        this.isRetired = isRetired;
        this.address = address;
        this.mobNumber = mobNumber;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructior cu 9 parametri formali");
    }
}
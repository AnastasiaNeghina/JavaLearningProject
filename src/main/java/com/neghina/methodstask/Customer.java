package com.neghina.methodstask;

public class Customer {
    //    Proprietati private
    private String name;
    private int age;
    private String email;

    //    Constructor
    public Customer(String name, int age, String email) {
        this.name = name;
        this.email = email;

        if ((age < 18) || (age > 90)) {
            System.out.println("The age is invalid");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    //    Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        if ((newAge < 18) || (newAge > 90)) {
            System.out.println("The age is invalid");
        } else {
            this.age = newAge;
        }
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}

package com.vishal;

public class Dev {

    //    private Laptop laptop;
    private int age;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev 1 constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build() {
        System.out.println("working on an awesome project!");
    }
}

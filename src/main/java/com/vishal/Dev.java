package com.vishal;

public class Dev {

    private Laptop laptop;
//    private int age;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev 1 constructor");
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public void build() {
        System.out.println("working on an awesome project!");
    }
}

package com.vishal;

public class Dev {

    private Computer comp;
//    private int age;

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public void build() {
        System.out.println("working on an awesome project!");
        comp.compile();
    }
}

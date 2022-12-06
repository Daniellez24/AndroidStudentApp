package com.example.androidstudentapp;

public class Student {
    String name, id, address, phone;
    Boolean cb;

    public Student(String name, String id, String address, String phone, Boolean cb) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone =  phone;
        this.cb = cb;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCb(Boolean cb) {
        this.cb = cb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

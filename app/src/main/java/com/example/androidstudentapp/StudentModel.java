package com.example.androidstudentapp;

public class StudentModel {
    String name, id, address;
    int Phone;

    public StudentModel(String name, String id, String address, int phone) {
        this.name = name;
        this.id = id;
        this.address = address;
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}

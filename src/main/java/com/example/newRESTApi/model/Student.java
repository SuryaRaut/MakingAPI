package com.example.newRESTApi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
    int id;
    String name;
    String city;
    int pin;

    public Student() {
    }

    public Student(int id, String name, String city, int pin) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}

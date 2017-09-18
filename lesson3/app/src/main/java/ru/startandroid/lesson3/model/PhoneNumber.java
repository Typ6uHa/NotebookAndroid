package ru.startandroid.lesson3.model;

/**
 * Created by Aizat on 18.09.2017.
 */

public class PhoneNumber {

    private String name;

    private String phone;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

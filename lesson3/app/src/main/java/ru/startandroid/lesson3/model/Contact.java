package ru.startandroid.lesson3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aizat on 18.09.2017.
 */

public class Contact {

    private int id;

    private int photoId;

    private String name;

    private List <PhoneNumber> phoneNumbers;

    public Contact(int id, int photoId, String name, List <PhoneNumber> phoneNumbers) {
        this.id = id;
        this.photoId = photoId;
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}

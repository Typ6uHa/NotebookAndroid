package ru.startandroid.lesson3.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aizat on 18.09.2017.
 */

public class Contact implements Parcelable {

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


    protected Contact(Parcel in) {
        id = in.readInt();
        photoId = in.readInt();
        name = in.readString();
        phoneNumbers = in.createTypedArrayList(PhoneNumber.CREATOR);
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeInt(photoId);
        parcel.writeString(name);
        parcel.writeTypedList(phoneNumbers);
    }
}

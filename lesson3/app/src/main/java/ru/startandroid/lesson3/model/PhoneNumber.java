package ru.startandroid.lesson3.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Aizat on 18.09.2017.
 */

public class PhoneNumber implements Parcelable {

    private String name;

    private String phone;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    protected PhoneNumber(Parcel in) {
        name = in.readString();
        phone = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(phone);
    }

    public static final Creator<PhoneNumber> CREATOR = new Creator<PhoneNumber>() {
        @Override
        public PhoneNumber createFromParcel(Parcel in) {
            return new PhoneNumber(in);
        }

        @Override
        public PhoneNumber[] newArray(int size) {
            return new PhoneNumber[size];
        }
    };
}

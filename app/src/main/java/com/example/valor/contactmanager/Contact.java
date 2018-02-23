package com.example.valor.contactmanager;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Alvin on 2/15/2018. This is a class object of individual contacts for the
 * contact manager activity
 */

public class Contact implements Parcelable{



    //Basic info per contact
    private Bitmap avatar = null;
    private String firstName,lastName,middleInitial, dateOfBirth, phoneNumber, dateFirstContact;


    public Contact(String firstName, String lastName, String middleInitial, String dateOfBirth,
                   String phoneNumber, String dateFirstContact) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.dateFirstContact = dateFirstContact;
    }

    public Contact(Parcel in) {
        this.firstName = in.readString();
        this.lastName = in.readString();
        this.middleInitial = in.readString();
        this.dateOfBirth = in.readString();
        this.phoneNumber = in.readString();
        this.dateFirstContact = in.readString();
    }

    public Bitmap getAvatar() {
        return avatar;
    }

    public void setAvatar(Bitmap avatar) {
        this.avatar = avatar;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateFirstContact() {
        return dateFirstContact;
    }

    public void setDateFirstContact(String dateFirstContact) {
        this.dateFirstContact = dateFirstContact;
    }

    @Override
    public String toString() {
        return  "First Name: " + firstName + '\'' +
                "Last Name: " + lastName + '\'' +
                "Middle Initial: " + middleInitial + '\'' +
                "Date of Birth: " + dateOfBirth + '\'' +
                "Phone: " + phoneNumber + '\'' +
                "Date of first contact: " + dateFirstContact + '\'';
    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override //Writing infromation to destination parcel
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(middleInitial);
        dest.writeString(dateOfBirth);
        dest.writeString(phoneNumber);
        dest.writeString(dateFirstContact);
    }

    //Create a parcel for the contact class.
    public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>(){
        public Contact createFromParcel(Parcel in){
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }

    };

}

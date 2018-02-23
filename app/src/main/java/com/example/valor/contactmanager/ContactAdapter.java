package com.example.valor.contactmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alvin on 2/15/2018.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {

    public ContactAdapter(@NonNull Context context, ArrayList<Contact> contactEntries) {
        super(context, 0, contactEntries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Contact contactEntry = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contact_list, parent, false);
        }

        if (contactEntry == null){
            return convertView; //If data is not valid, just return basic view
        }

        //Textview initilized for each first, last, middle, DOB, phone, dateFirstContact
        TextView firstName = convertView.findViewById(R.id.firstNameContact);
        TextView lastName = convertView.findViewById(R.id.lastNameContact);
        TextView middleInitial = convertView.findViewById(R.id.middleContact);
        TextView dateOfBirth = convertView.findViewById(R.id.birthDate);
        TextView phoneNumber = convertView.findViewById(R.id.phoneContact);
        TextView dateFirstContact = convertView.findViewById(R.id.firstDateContact);

        //set text in textView for each first, last, middle, DOB, phone, dateFirstContact
        firstName.setText(contactEntry.getFirstName());
        lastName.setText(contactEntry.getLastName());
        middleInitial.setText(contactEntry.getMiddleInitial());
        dateOfBirth.setText(contactEntry.getDateOfBirth());
        phoneNumber.setText(contactEntry.getPhoneNumber());
        dateFirstContact.setText(contactEntry.getDateFirstContact());

        return convertView;
    }














}

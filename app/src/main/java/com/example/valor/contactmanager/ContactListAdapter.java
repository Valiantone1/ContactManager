package com.example.valor.contactmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alvin on 2/15/2018.
 */

public class ContactListAdapter extends ArrayAdapter<Contact> {

    public ContactListAdapter(@NonNull Context context, ArrayList<Contact> contactEntries) {
        super(context, 0, contactEntries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Contact contactEntry = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contact, parent, false);
        }

        if (contactEntry == null){
            return convertView; //If data is not valid, just return basic view
        }

        //Textview initilized for each first, last, middle, DOB, phone, dateFirstContact

        ImageView avatar = convertView.findViewById(R.id.contactAvatar);
        TextView fullName = convertView.findViewById(R.id.contactFullName);
        TextView phoneNumber = convertView.findViewById(R.id.phoneContact);


        //set text in textView for each first, last, middle, DOB, phone, dateFirstContact
        avatar.setImageBitmap(contactEntry.getAvatar());
        fullName.setText(contactEntry.getFirstName() + " " + contactEntry.getLastName());
        phoneNumber.setText(contactEntry.getPhoneNumber());

        return convertView;
    }














}

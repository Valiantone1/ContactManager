package com.example.valor.contactmanager;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import java.util.ArrayList;


/**
 * Created by Alvin on 2/18/2018.
 */

public class ContactStorage extends AppCompatActivity {

    //global string URL
    private String TAG = ContactStorage.class.getName();

    //Intializing EditText views for contact entry info
    EditText firstName,lastName,middleInitial, dateOfBirth, phoneNumber, dateFirstContact;
    String first,last,middle, dob, phone, dateFirst;


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_entry_layout);

                firstName = findViewById(R.id.firstNameContact);
                lastName = findViewById(R.id.lastNameContact);
                middleInitial = findViewById(R.id.middleContact);
                dateOfBirth = findViewById(R.id.birthDate);
                phoneNumber = findViewById(R.id.phoneContact);
                dateFirstContact = findViewById(R.id.firstDateContact);



        //Contact newContact = new Contact();


       // Log.d(TAG, urlString + " has been received!");

    }




}

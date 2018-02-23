package com.example.valor.contactmanager;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import java.util.ArrayList;


/**
 * Created by Alvin on 2/18/2018.
 */

public class ContactStorage extends AppCompatActivity {

    //global string URL
    private String TAG = ContactStorage.class.getName();



    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_entry_layout);

        //Contact inputContact = getIntent().getClass();

       // Log.d(TAG, urlString + " has been received!");

    }




}

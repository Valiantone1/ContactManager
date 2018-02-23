package com.example.valor.contactmanager;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    //progressbar and listview initialized
    private String TAG = ContactStorage.class.getName();
    FloatingActionButton addContactBttn;
    ProgressBar progressBar;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);

        addContactBttn = findViewById(R.id.addContactButton);
        listView = findViewById(R.id.contactList);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        //TODO onClick event calls an intent for parcelable contact
        //initialize listView and render progress bar

        addContactBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent = new Intent(getApplicationContext(),ContactStorage.class);
                startActivity(addIntent);
            }
        });

        try {

            //TODO build contact list from AsyncTask class
            Contact inputContact = getIntent().getParcelableExtra("Contact");
            ArrayList<Contact> contactResults = new GetDataReader().execute(inputContact).get();
            buildContactList(contactResults);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }


    }






    //Rafay: method build list of contact info from an ArrayList of contacts
    private void buildContactList(ArrayList<Contact> buildContacts){
        Log.d(TAG, "Data has been loaded, removing progress bar and showing list of stockData");
        Log.d(TAG, buildContacts.toString());

        progressBar.setVisibility(View.GONE);

        //initialize adapter fo stock price list view
        ContactListAdapter adapter = new ContactListAdapter(this, buildContacts);
        listView.setAdapter(adapter);

    }


}

//Rafay: Asynctask to read data from URL
class GetDataReader extends AsyncTask<Contact, Void, ArrayList<Contact>> {

    //readFrom URL in the back ground
    @Override
    protected ArrayList<Contact> doInBackground(Contact... contacts) {
        try {
            //read fromFromURL methed called
            return readFromContacts(contacts[0]);
        } catch (Exception e) {
            Log.d("DataReaderAsyncTask", e.toString());
        }

        return null;
    }

    private static ArrayList<Contact> readFromContacts(Contact contacts) throws Exception {

        ArrayList<Contact> contactBook = new ArrayList<>();

        //get each line from buffer

        while (!contactBook.isEmpty()) {
            contactBook.add(contacts);
            Log.d("DATAREADER", contactBook.toString());
        }


        return contactBook;
    }

}

package com.example.mac13.contacts_app;

import android.provider.ContactsContract;

/**
 * Created by mac13 on 15.10.16.
 */
public class Contact {
    private String FirstName;
    private String LastName;
    private int Age;
    private int Photo;


    public Contact(String FirstName, String LastName, int Age, int Photo){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Age=Age;
        this.Photo = Photo;
    }

    public String getFirstName(){
        return FirstName;
    }


    public String getLastName(){
        return LastName;
    }
    public int getAge(){
        return Age;
    }

    public int getPhoto(){
        return Photo;
    }
}

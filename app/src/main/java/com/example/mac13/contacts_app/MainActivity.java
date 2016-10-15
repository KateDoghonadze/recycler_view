package com.example.mac13.contacts_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<Contact> contacts =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        fillContacts();
        recyclerView.setAdapter(new Adapter(contacts));
    }


    private void fillContacts() {
        contacts.add(new Contact("ლევან ","ბერიანიძე", 33, R.mipmap.f1));
        contacts.add(new Contact("ნინო ","ჯოჯუა", 21, R.mipmap.f1));
        contacts.add(new Contact("კოტე ","უჯმაჯურიძე", 40, R.mipmap.f1));
        contacts.add(new Contact("ანა ","ბაღდავაძე", 24, R.mipmap.f1));
        contacts.add(new Contact("გიორგი ","ტყემალაძე", 33, R.mipmap.f1));
        contacts.add(new Contact("თეონა ","მანჯავიძე", 45, R.mipmap.f1));
        contacts.add(new Contact("ლევან ","ბერიანიძე", 33, R.mipmap.f1));
        contacts.add(new Contact("ნინო ","ჯოჯუა", 21, R.mipmap.f1));
        contacts.add(new Contact("კოტე ","უჯმაჯურიძე", 40, R.mipmap.f1));
        contacts.add(new Contact("ანა ","ბაღდავაძე", 24, R.mipmap.f1));
    }
}

package com.example.mac13.contacts_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{


    RecyclerView recyclerView;
    RecyclerView secondRecyclerView;
    ArrayList<Contact> contacts = new ArrayList<>();
    ArrayList<Contact> contactsForSecondRecyclerView = new ArrayList<>();
    Adapter adapter;
    Adapter secondAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillContacts();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        secondRecyclerView = (RecyclerView) findViewById(R.id.secondRecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        secondAdapter = new Adapter(contactsForSecondRecyclerView,null);

        secondRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        secondRecyclerView.setAdapter(secondAdapter);


        recyclerView.setAdapter(new Adapter(contacts,new RecyclerItemClickListener() {
            @Override
            public void onItemClicked(int position) {
                contactsForSecondRecyclerView.add(0,contacts.get(position));
//                contacts.remove(position);
                secondAdapter.notifyItemInserted(0);
                secondRecyclerView.scrollToPosition(0);
//                adapter.notify();

            }
        }));

    }


    private void fillContacts() {
        contacts.add(new Contact("ლევან", "ბერიანიძე", 33, R.drawable.m1));
        contacts.add(new Contact("ნინო", "ჯოჯუა", 21, R.drawable.f1));
        contacts.add(new Contact("კოტე", "უჯმაჯურიძე", 40, R.drawable.m1));
        contacts.add(new Contact("ანა", "ბაღდავაძე", 24, R.drawable.f1));
        contacts.add(new Contact("გიორგი", "ტყემალაძე", 33, R.drawable.m1));
        contacts.add(new Contact("თეონა", "მანჯავიძე", 45, R.drawable.f1));
        contacts.add(new Contact("ლევან", "ბერიანიძე", 33, R.drawable.m1));
        contacts.add(new Contact("სოფო", "აბრამიძე", 21, R.drawable.f1));
        contacts.add(new Contact("ნიკო", "კილაძე", 40, R.drawable.m1));
        contacts.add(new Contact("ეკა", "კამკამიძე", 24, R.drawable.f1));
    }


}

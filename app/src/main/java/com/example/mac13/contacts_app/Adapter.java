package com.example.mac13.contacts_app;

import android.content.Context;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by mac13 on 15.10.16.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    ArrayList<Contact> contacts;
    RecyclerItemClickListener listener;
    Context context;

    public Adapter(ArrayList<Contact> contacts, RecyclerItemClickListener listener) {
        this.contacts = contacts;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageView.setImageResource(contacts.get(position).getPhoto());
        holder.textViewFirstName.setText(contacts.get(position).getFirstName());
        holder.textViewLastName.setText(contacts.get(position).getLastName());
        holder.textViewAge.setText(String.valueOf(contacts.get(position).getAge()));

    }


    @Override
    public int getItemCount() {
        return contacts.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView textViewFirstName, textViewLastName, textViewAge;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textViewFirstName = (TextView) itemView.findViewById(R.id.textViewFirstName);
            textViewLastName = (TextView) itemView.findViewById(R.id.textViewLastName);
            textViewAge = (TextView) itemView.findViewById(R.id.textViewAge);

        }


        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onItemClicked(getAdapterPosition());

            }
        }


    }

}


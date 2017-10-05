package ru.kphu.itis.adapterapp.screen.contact_list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ru.kphu.itis.adapterapp.R;
import ru.kphu.itis.adapterapp.model.Contact;

/**
 * Created by Дмитрий on 18.09.2017.
 */

public class ContactListAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private List<Contact> contacts;

    private OnItemClickListener onItemClickListener;

    public ContactListAdapter(@NonNull List<Contact> contacts, OnItemClickListener onItemClickListener) {
        this.contacts = contacts;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact_list, parent, false);
        return new ContactViewHolder(view, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Contact contact = contacts.get(position);

        holder.photoImageView.setImageResource(contact.getPhotoId());

        holder.nameTextView.setText(contact.getName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}

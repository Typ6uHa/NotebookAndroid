package ru.startandroid.lesson3;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.lesson3.model.Contact;
import ru.startandroid.lesson3.model.PhoneNumber;

public class ContactsListActivity extends AppCompatActivity implements OnItemClickListener{

    private List <Contact> contacts;

    RecyclerView recyclerView;

    private LinearLayoutManager layoutManager;

    ContactListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactslist);

        contacts = getContacts();

        layoutManager = new LinearLayoutManager(this);

        adapter = new ContactListAdapter(contacts,this);

        recyclerView = (RecyclerView) findViewById (R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private List<Contact> getContacts () {

        List <Contact> contacts = new ArrayList<>();

        contacts.add(new Contact(0,R.mipmap.ic_launcher_round,"Дмитрий", new ArrayList<PhoneNumber>(){{
            add(new PhoneNumber("Домашний","+ 7 999 111 22 33"));
            add(new PhoneNumber("Рабочий","+ 7 888 222 33 11"));
        }} ));

        contacts.add(new Contact(1,R.mipmap.ic_launcher_round,"Владимир", new ArrayList<PhoneNumber>(){{
            add(new PhoneNumber("Домашний","+ 7 999 111 22 33"));
            add(new PhoneNumber("Домашний","+ 7 999 111 22 33"));
            add(new PhoneNumber("Домашний","+ 7 999 111 22 33"));
        }} ));

        contacts.add(new Contact(1,R.mipmap.ic_launcher_round,"Ольга", new ArrayList<PhoneNumber>(){{
            add(new PhoneNumber("Домашний","+ 7 999 111 22 33"));
            add(new PhoneNumber("Рабочий","+ 7 999 134 33 11"));
        }} ));

        return contacts;
    }

    @Override
    public void onClick(int position) {
        Toast.makeText(this,"position is "+ position, Toast.LENGTH_LONG).show();
    }
}

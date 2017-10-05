package ru.startandroid.lesson3.screen.contact_pager;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import ru.startandroid.lesson3.R;
import ru.startandroid.lesson3.model.Contact;

public class ContactPagerActivity extends AppCompatActivity {

    private static final String KEY_POSITION = "position";

    private static final String KEY_CONTACTS = "contact";

    private ViewPager viewPager;

    private ContactPagerAdapter adapter;

    private ArrayList<Contact> contacts;

    public static Intent makeIntent (Context context, int position, ArrayList <Contact> contacts){
        Intent intent = new Intent(context, ContactPagerActivity.class);
        intent.putExtra(KEY_POSITION, position);
        intent.putParcelableArrayListExtra(KEY_CONTACTS,contacts);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_pager);

        contacts = getIntent().getParcelableArrayListExtra(KEY_CONTACTS);

        adapter = new ContactPagerAdapter(getSupportFragmentManager(),contacts);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);

    }

    //
}

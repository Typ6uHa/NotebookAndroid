package ru.kphu.itis.adapterapp.screen.contact_pager;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import ru.kphu.itis.adapterapp.R;
import ru.kphu.itis.adapterapp.custom_view.PagerIndicator;
import ru.kphu.itis.adapterapp.model.Contact;

public class ContactPagerActivity extends AppCompatActivity {

    private static final String KEY_POSITION = "position";

    private static final String KEY_CONTACTS = "contact";

    private ViewPager viewPager;

    private ContactPagerAdapter adapter;

    private PagerIndicator pagerIndicator;

    private ArrayList<Contact> contacts;

    @NonNull
    public static Intent makeIntent(@NonNull Context context, int position, @NonNull ArrayList<Contact> contacts){
        Intent intent = new Intent(context, ContactPagerActivity.class);
        intent.putExtra(KEY_POSITION, position);
        intent.putParcelableArrayListExtra(KEY_CONTACTS, contacts);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_pager);

        contacts = getIntent().getParcelableArrayListExtra(KEY_CONTACTS);

        adapter = new ContactPagerAdapter(getSupportFragmentManager(), contacts);

        pagerIndicator = (PagerIndicator) findViewById(R.id.pager_indicator);
        pagerIndicator.setItemsCount(contacts.size());

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
               pagerIndicator.setCurrentPosition(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

}

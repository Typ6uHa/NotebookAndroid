package ru.startandroid.lesson3.screen.contact_pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.lesson3.model.Contact;

/**
 * Created by Aizat on 25.09.2017.
 */

public class ContactPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;


    public ContactPagerAdapter(FragmentManager fm, List<Contact> contacts) {
        super(fm);
        fragments = makeFragment(contacts);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    private List<Fragment> makeFragment(List<Contact> contacts) {

        List<Fragment> result = new ArrayList<>();
        for (Contact contact : contacts) {
            result.add(ContactFragment.newInstance(contact));
        }
        return result;
    }
}

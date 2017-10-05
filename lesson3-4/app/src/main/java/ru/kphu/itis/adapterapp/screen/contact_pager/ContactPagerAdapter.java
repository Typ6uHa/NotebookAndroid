package ru.kphu.itis.adapterapp.screen.contact_pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import ru.kphu.itis.adapterapp.model.Contact;

/**
 * Created by Дмитрий on 25.09.2017.
 */

public class ContactPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments;

    public ContactPagerAdapter(FragmentManager fm, List<Contact> contacts) {
        super(fm);
        fragments = makeFragments(contacts);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    private List<Fragment> makeFragments(List<Contact> contacts){
        List<Fragment> result = new ArrayList<>();
        for(Contact contact: contacts){
            result.add(ContactFragment.newInstance(contact));
        }
        return result;
    }
}

package ru.kphu.itis.adapterapp.screen.contact_pager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.kphu.itis.adapterapp.R;
import ru.kphu.itis.adapterapp.model.Contact;

public class ContactFragment extends Fragment {

    private static final String KEY_CONTACT = "contact";

    public static ContactFragment newInstance(Contact contact) {
        Bundle args = new Bundle();
        args.putParcelable(KEY_CONTACT, contact);
        ContactFragment fragment = new ContactFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

}

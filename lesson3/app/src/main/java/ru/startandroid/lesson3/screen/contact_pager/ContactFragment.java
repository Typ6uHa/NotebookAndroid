package ru.startandroid.lesson3.screen.contact_pager;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.startandroid.lesson3.R;
import ru.startandroid.lesson3.model.Contact;


public class ContactFragment extends Fragment {

    private  static final String KEY_CONTACT = "contact";

    public static ContactFragment newInstance(Contact contact){
        Bundle args = new Bundle();
        args.putParcelable(KEY_CONTACT, contact);
        ContactFragment contactFragment = new ContactFragment();
        contactFragment.setArguments(args);
        return contactFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }
}

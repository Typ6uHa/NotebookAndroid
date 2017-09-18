package ru.startandroid.lesson2_12092017;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Aizat on 12.09.2017.
 */

public class SecondActivity extends FragmentHostActivity {

    public static Intent makeIntent (Context context){
        return new Intent (context, SecondActivity.class);
    }

    @Override
    protected Fragment getFragment() {
        return SecondFragment.newInstance();
    }
}

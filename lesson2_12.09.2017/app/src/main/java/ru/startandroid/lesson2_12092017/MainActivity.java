package ru.startandroid.lesson2_12092017;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentHostActivity{
    @Override
    protected Fragment getFragment() {
        return MainFragment.newInstance();
    }

            /*
            fm.beginTransaction()
                    .replace(R.id.fragment_container, MainFragment.newInstance("data"))
                    .commit();
        }
             */
//    @Override
//    public void onBackPressed() { // переопределяет кнопку назад
//        getFragmentManager().popBackStack();
//    }
}

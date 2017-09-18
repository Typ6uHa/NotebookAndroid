package ru.startandroid.lesson2_12092017;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Aizat on 12.09.2017.
 */

public class NextStepFragmet extends DialogFragment implements DialogInterface.OnClickListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_next_step, null,false);
        return new AlertDialog
                .Builder(getActivity())
                .setView(v)
                .setPositiveButton(R.string.dialog_positive,this)
                .setNegativeButton(R.string.dialog_negative,this)
                .create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case DialogInterface.BUTTON_POSITIVE:
                startActivity(SecondActivity.makeIntent(getActivity()));
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                break;
        }
    }
}

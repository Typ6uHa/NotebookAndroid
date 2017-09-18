package ru.startandroid.lesson2_12092017;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment implements View.OnClickListener {

    private static final String KEY = "key";

    private static final String TAG_NEXT_STEP = " TAG";

    private Button button;

    public static MainFragment newInstance() {
        Bundle args = new Bundle();
        //args.putString();
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setRetainInstance(true); // посмотреть в разных версиях
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container, false);

        button = view.findViewById(R.id.button);
        button.setOnClickListener(this);
        //TODO подвязать вьюшки

        return view;
    }

    @Override
    public void onClick(View view) {
        NextStepFragmet fragment = new NextStepFragmet();
        fragment.show(getFragmentManager(),TAG_NEXT_STEP);
//        getFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.fragment_container,SecondFragment.newInstance()) // заменяем текущий объект на новый
//                    //.addToBackStack("") // возвращается на предыдущий фрагмент
//                    .commit();
    }
}

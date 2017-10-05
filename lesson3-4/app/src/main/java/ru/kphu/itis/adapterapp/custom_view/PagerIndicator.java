package ru.kphu.itis.adapterapp.custom_view;

import android.content.Context;
import android.media.Image;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import ru.kphu.itis.adapterapp.R;

/**
 * Created by Дмитрий on 25.09.2017.
 */

public class PagerIndicator extends LinearLayout{

    private int currentPosition;

    public PagerIndicator(Context context) {
        super(context);
        init();
    }

    public PagerIndicator(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PagerIndicator(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        setOrientation(HORIZONTAL);
        setGravity(Gravity.CENTER);
    }

    public void setItemsCount(int count){
        removeAllViews();
        for (int i=0; i< count; i++){
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.indicator_unactive);
            addView(imageView);
        }
        currentPosition = 0;
        setCurrentPosition(currentPosition);
    }

    public void setCurrentPosition(int position){
        if(position >= 0 && position < getChildCount()){
            ((ImageView)getChildAt(currentPosition)).setImageResource(R.drawable.indicator_unactive);
            currentPosition = position;
            ((ImageView)getChildAt(currentPosition)).setImageResource(R.drawable.indicator_active);
        }
    }
}

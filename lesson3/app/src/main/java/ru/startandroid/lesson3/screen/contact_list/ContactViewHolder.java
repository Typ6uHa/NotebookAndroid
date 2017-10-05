package ru.startandroid.lesson3.screen.contact_list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ru.startandroid.lesson3.R;

/**
 * Created by Aizat on 18.09.2017.
 */

public class ContactViewHolder extends RecyclerView.ViewHolder {

    public ImageView photoImageView;

    public TextView nameTextView;

    public ContactViewHolder (View itemView, final OnItemClickListener onItemClickListener){
        super(itemView);

        photoImageView = itemView.findViewById(R.id.image_view_holder);

        nameTextView = itemView.findViewById(R.id.text_view_name);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onItemClickListener != null){
                    onItemClickListener.onClick(getAdapterPosition());
                }
            }
        });
    }
}

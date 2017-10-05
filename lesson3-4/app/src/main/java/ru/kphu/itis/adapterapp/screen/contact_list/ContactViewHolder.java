package ru.kphu.itis.adapterapp.screen.contact_list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ru.kphu.itis.adapterapp.R;

/**
 * Created by Дмитрий on 18.09.2017.
 */

public class ContactViewHolder extends RecyclerView.ViewHolder {

    public ImageView photoImageView;

    public TextView nameTextView;

    public ContactViewHolder(View itemView, final OnItemClickListener onItemClickListener) {
        super(itemView);

        photoImageView = (ImageView) itemView.findViewById(R.id.image_view_photo);

        nameTextView = (TextView) itemView.findViewById(R.id.text_view_name);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onItemClickListener!=null){
                    onItemClickListener.onClick(getAdapterPosition());
                }
            }
        });
    }
}

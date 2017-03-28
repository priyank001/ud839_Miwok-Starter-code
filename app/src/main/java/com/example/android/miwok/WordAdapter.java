package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shivam Namdev on 03-02-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context,List<Word> resource) {
        super(context,0,resource);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getCount() {
        return super.getCount();
    }


    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate( R.layout.simple_list_item_1, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentAndroidWord = getItem(position);



        // Find the TextView in the simple_list_item_1.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidWord.getEnglishWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidWord.getParaDescp());
/*
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentAndroidWord.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView   */
        return listItemView;
    }
}

package com.example.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    //color
    private int color;

    //constructor
    public WordAdapter(Activity context, ArrayList<Word> layout, int color){
        super(context, 0, layout);
        this.color=color;
    }

    //have to override the getView method so we can modify it to our taste
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //checks if the view is null, if null we inflate it with custom_layout
        View listView = convertView;
        if (listView == null){
            listView = LayoutInflater.from(getContext())
                    .inflate(R.layout.custom_layout,parent, false);
        }
        //sets the background color
        LinearLayout linear_text = listView.findViewById(R.id.linear_text);
        int color1 = ContextCompat.getColor(getContext(), color);
        linear_text.setBackgroundColor(color1);

        ///get the item at that position
        Word  item = getItem(position);




        //get both the english and miwok texts from the item
        String english = item.getEnglish();
        String miwok = item.getMiwok();

        //finds the view for english and set the text gotten to it
        TextView english_text = listView.findViewById(R.id.english_text);
        english_text.setText(english);

        //finds the TexView for miwok and sets the text gotten to it
        TextView miwok_text = listView.findViewById(R.id.miwok_text);
        miwok_text.setText(miwok);

        //get the image view and load the resource in
        ImageView imageView = listView.findViewById(R.id.image);
        if (item.hasImage()){
            imageView.setImageResource(item.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

//        if (imageView == null){
//            imageView.setVisibility(View.GONE);
//        }else {
//            imageView.setImageResource(item.getImageResourceId());
//        }


        return listView;
    }
}

package com.example.asd.androidbasics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
  private Context mcontext;
  private  String[] names;
  private  Integer[] images;
  LayoutInflater layoutInflater;
  View view;

    public MyAdapter(Context mcontext, String[] names, Integer[] images) {
        this.mcontext = mcontext;
        this.names = names;
        this.images = images;
    }

    @Override
    public int getCount() {
        return  names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        layoutInflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            view = new View(mcontext);
            view = layoutInflater.inflate(R.layout.single_item, null);
            imageView = view.findViewById(R.id.image);
            imageView.setImageResource(images[position]);
            TextView textView = view.findViewById(R.id.text);
            textView.setText(names[position]);
        }
        return view;
    }
    }

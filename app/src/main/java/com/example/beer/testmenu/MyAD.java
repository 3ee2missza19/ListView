package com.example.beer.testmenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Beer on 8/9/2559.
 */
public class MyAD extends BaseAdapter {

    //ประกาศตัวแปรใน class MyAD
    private Context ojdcontext;
    private String[] datastrings;
    private int[] iconints;

    public MyAD(Context ojdcontext, String[] datastrings, Int[] iconints) {
        this.ojdcontext = ojdcontext;
        this.datastrings = datastrings;
        this.iconints = iconints;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) ojdcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ojdView = layoutInflater.inflate(R.layout.activity_detail, viewGroup, false);

        TextView dataTextView = (TextView) ojdView.findViewById(R.id.textView);
        dataTextView.setText(datastrings[i]);

        ImageView imageView = (ImageView) ojdView.findViewById(R.id.imageView);
        imageView.setImageResource(iconints[i]);

        return ojdView;
    }
}

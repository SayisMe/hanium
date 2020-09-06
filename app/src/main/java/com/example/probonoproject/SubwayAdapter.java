package com.example.probonoproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.probonoproject.R;
import com.example.probonoproject.SubwayData;

import java.util.ArrayList;

public class SubwayAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<SubwayData> subwayList;

    public SubwayAdapter(Context context, ArrayList<SubwayData> data) {
        mContext = context;
        subwayList = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return subwayList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public SubwayData getItem(int position) {
        return subwayList.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.activity_subway_information, null);

        ImageView subwayPhoto = (ImageView)view.findViewById(R.id.subwayPhotoImg);
        TextView subwayNum = (TextView)view.findViewById(R.id.subwayNumTv);

        subwayPhoto.setImageResource(subwayList.get(position).getPhoto());
        subwayNum.setText(subwayList.get(position).getNumber());

        return view;
    }
}

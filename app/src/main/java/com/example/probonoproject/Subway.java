package com.example.probonoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Subway extends AppCompatActivity {
    ArrayList<SubwayData> SubwayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subway);

        this.InitializeSubwayData();

        ListView listView = (ListView)findViewById(R.id.ListView_Subway);
        final SubwayAdapter subwayadapter = new SubwayAdapter(this,SubwayList);

        listView.setAdapter(subwayadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        subwayadapter.getItem(position).getNumber(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeSubwayData()
    {
        SubwayList = new ArrayList<SubwayData>();

        SubwayList.add(new SubwayData(R.drawable.subway_1, "1호선"));
        SubwayList.add(new SubwayData(R.drawable.subway_2, "2호선"));
        SubwayList.add(new SubwayData(R.drawable.subway_3, "3호선"));
        SubwayList.add(new SubwayData(R.drawable.subway_4, "4호선"));
        SubwayList.add(new SubwayData(R.drawable.subway_5, "5호선"));
        SubwayList.add(new SubwayData(R.drawable.subway_6, "6호선"));
        SubwayList.add(new SubwayData(R.drawable.subway_7, "7호선"));

    }
}
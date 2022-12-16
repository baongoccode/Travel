package com.example.vacation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.vacation.Adapter.Recent;
import com.example.vacation.Adapter.TopPlace;
import com.example.vacation.Model.RecentData;
import com.example.vacation.Model.TopPlaceData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecycler, topPlacesRecycler;
    Recent recentAdapter;
    TopPlace topPlaceAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Vacation);
        setContentView(R.layout.activity_main);
        List<RecentData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));
        setRecentRecycler(recentsDataList);
        List<TopPlaceData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlaceData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlaceData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlaceData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlaceData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlaceData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        setTopPlacesRecycler(topPlacesDataList);
        Button bt = findViewById(R.id.button2);
        bt.setOnClickListener(view -> {
            Intent ac = new Intent(MainActivity.this, ScheduleActivity.class);
            startActivity(ac);
        });
    }
    private  void setRecentRecycler(List<RecentData> recentsDataList){
        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentAdapter = new Recent(this, recentsDataList);
        recentRecycler.setAdapter(recentAdapter);
    }

    private  void setTopPlacesRecycler(List<TopPlaceData> topPlacesDataList){
        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlaceAdapter = new TopPlace(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlaceAdapter);
    }
}




package com.example.vacation.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vacation.Model.TopPlaceData;
import com.example.vacation.R;
import com.example.vacation.Model.TopPlaceData;
import java.util.List;

public class TopPlace extends RecyclerView.Adapter<TopPlace.TopPlacesViewHolder> {
    Context context;
    List<TopPlaceData> topPlacesDataList;
    public TopPlace(Context context, List<TopPlaceData> topPlacesDataList) {
        this.context = context;
        this.topPlacesDataList = topPlacesDataList;
    }
    @NonNull
    @Override
    public TopPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_place_row, parent, false);
        return new TopPlacesViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull TopPlacesViewHolder holder, int position) {
        holder.countryName.setText(topPlacesDataList.get(position).getCountryName());
        holder.placeName.setText(topPlacesDataList.get(position).getPlaceName());
        holder.price.setText(topPlacesDataList.get(position).getPrice());
        holder.placeImage.setImageResource(topPlacesDataList.get(position).getImageUrl());
    }
    @Override
    public int getItemCount() {
        return topPlacesDataList.size();
    }
    public static final class TopPlacesViewHolder extends RecyclerView.ViewHolder{
        ImageView placeImage;
        TextView placeName, countryName, price;
        public TopPlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.place_image);
            placeName = itemView.findViewById(R.id.place_name);
            countryName = itemView.findViewById(R.id.country_name);
            price = itemView.findViewById(R.id.price);

        }
    }
}


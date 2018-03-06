package com.test.tourguideapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PlaceListItemRecyclerAdapter extends RecyclerView.Adapter<PlaceListItemRecyclerAdapter.ViewHolder> {

    private ArrayList<Place> mPlaces;
    private Context context;

    PlaceListItemRecyclerAdapter(ArrayList<Place> places, Context context) {
        mPlaces = places;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Place place = mPlaces.get(position);
        holder.mTextViewTitle.setText(place.getTitle());
        Picasso.with(context).load(place.getImageResourceId()).into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mPlaces.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        CardView mCardView;
        TextView mTextViewTitle;
        ImageView mImageView;

        ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mCardView = mView.findViewById(R.id.card_view);
            mTextViewTitle = mView.findViewById(R.id.title);
            mImageView = mView.findViewById(R.id.image);
        }
    }
}

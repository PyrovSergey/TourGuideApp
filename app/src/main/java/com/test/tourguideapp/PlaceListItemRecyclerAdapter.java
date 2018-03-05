package com.test.tourguideapp;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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

    public PlaceListItemRecyclerAdapter(ArrayList<Place> places) {
        mPlaces = places;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Place place = mPlaces.get(position);
        holder.mTextViewTitle.setText(place.getTitle());
        holder.mImageView.setImageBitmap(BitmapFactory.decodeResource(holder.mImageView.getResources(), place.getImageResourceId()));
    }

    @Override
    public int getItemCount() {
        return mPlaces.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        public CardView mCardView;
        public TextView mTextViewTitle;
        public ImageView mImageView;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mCardView = mView.findViewById(R.id.card_view);
            mTextViewTitle = mView.findViewById(R.id.title);
            mImageView = mView.findViewById(R.id.image);
        }
    }
}

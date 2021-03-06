package com.test.tourguideapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PageFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;
    private Data data;

    public static PageFragment newInstance(int page) {
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = Data.getDataInstance(getContext());
        if (getArguments() != null) {
            mPage = getArguments().getInt(ARG_PAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.places_list, container, false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new PlaceListItemRecyclerAdapter(getItemPlaceList(mPage), getContext()));

        return recyclerView;
    }

    private ArrayList<Place> getItemPlaceList(int mPage) {
        if (mPage == 1) {
            return data.getVisitList();
        }
        if (mPage == 2) {
            return data.getEatList();
        }
        if (mPage == 3) {
            return data.getClubList();
        }
        if (mPage == 4) {
            return data.getHotelList();
        }
        return null;
    }
}

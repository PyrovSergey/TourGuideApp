package com.test.tourguideapp;


import android.content.Context;

import java.util.ArrayList;

public class Data {
    private static Data data;
    private ArrayList<Place> clubList;
    private ArrayList<Place> eatList;
    private ArrayList<Place> visitList;
    private ArrayList<Place> hotelList;

    private Data(Context context) {
        initAllData(context);
    }

    public static Data getDataInstance(Context context) {
        if (data == null) {
            data = new Data(context);
        }
        return data;
    }

    public ArrayList<Place> getClubList() {
        return clubList;
    }

    public ArrayList<Place> getEatList() {
        return eatList;
    }

    public ArrayList<Place> getVisitList() {

        return visitList;
    }

    public ArrayList<Place> getHotelList() {
        return hotelList;
    }

    private void initAllData(Context context) {
        clubList = new ArrayList<>();
        eatList = new ArrayList<>();
        visitList = new ArrayList<>();
        hotelList = new ArrayList<>();
        clubList.add(new Place(context.getString(R.string.scandal_bar), R.drawable.scandal_bar));
        clubList.add(new Place(context.getString(R.string.bar_nebar), R.drawable.bar_nebar));
        clubList.add(new Place(context.getString(R.string.arena_concept_club), R.drawable.arena_concept_club));
        clubList.add(new Place(context.getString(R.string.club_lux), R.drawable.club_lux));
        clubList.add(new Place(context.getString(R.string.club_mod), R.drawable.club_mod));
        eatList.add(new Place(context.getString(R.string.salute_bistro_and_bar), R.drawable.salute_bistro_and_bar));
        eatList.add(new Place(context.getString(R.string.spices_and_joy), R.drawable.spices_and_joy));
        eatList.add(new Place(context.getString(R.string.terrassa), R.drawable.terrassa));
        eatList.add(new Place(context.getString(R.string.meat_line), R.drawable.meat_line));
        eatList.add(new Place(context.getString(R.string.tonyc_bar), R.drawable.tonyc_bar));
        visitList.add(new Place(context.getString(R.string.grand_peterhof_palace), R.drawable.grand_peterhof_palace));
        visitList.add(new Place(context.getString(R.string.the_aurora_ship), R.drawable.the_aurora_ship));
        visitList.add(new Place(context.getString(R.string.the_peterhof), R.drawable.peterhof));
        visitList.add(new Place(context.getString(R.string.the_singer_house), R.drawable.singer_house));
        visitList.add(new Place(context.getString(R.string.hermitage), R.drawable.hermitage));
        hotelList.add(new Place(context.getString(R.string.inbox_capsule_hotel), R.drawable.inbox_capsule_hotel));
        hotelList.add(new Place(context.getString(R.string.funky_sport_capsule_hostel), R.drawable.funky_sport_capsule_hostel));
        hotelList.add(new Place(context.getString(R.string.your_space_capsule_hostel), R.drawable.your_space_capsule_hostel));
        hotelList.add(new Place(context.getString(R.string.railway_capsules), R.drawable.railway_capsules));
        hotelList.add(new Place(context.getString(R.string.hostel_capsular_world), R.drawable.hostel_capsular_world));
    }
}

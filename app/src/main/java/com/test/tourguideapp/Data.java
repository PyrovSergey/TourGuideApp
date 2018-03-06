package com.test.tourguideapp;


import android.content.Context;

import java.util.ArrayList;

public class Data {
    
    static ArrayList<Place> getClubList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.scandal_bar), R.drawable.scandal_bar));
        places.add(new Place(context.getString(R.string.bar_nebar), R.drawable.bar_nebar));
        places.add(new Place(context.getString(R.string.arena_concept_club), R.drawable.arena_concept_club));
        places.add(new Place(context.getString(R.string.club_lux), R.drawable.club_lux));
        places.add(new Place(context.getString(R.string.club_mod), R.drawable.club_mod));
        return places;
    }

    static ArrayList<Place> getEatList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.salute_bistro_and_bar), R.drawable.salute_bistro_and_bar));
        places.add(new Place(context.getString(R.string.spices_and_joy), R.drawable.spices_and_joy));
        places.add(new Place(context.getString(R.string.terrassa), R.drawable.terrassa));
        places.add(new Place(context.getString(R.string.meat_line), R.drawable.meat_line));
        places.add(new Place(context.getString(R.string.tonyc_bar), R.drawable.tonyc_bar));
        return places;
    }

    static ArrayList<Place> getVisitList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.grand_peterhof_palace), R.drawable.grand_peterhof_palace));
        places.add(new Place(context.getString(R.string.the_aurora_ship), R.drawable.the_aurora_ship));
        places.add(new Place(context.getString(R.string.the_peterhof), R.drawable.peterhof));
        places.add(new Place(context.getString(R.string.the_singer_house), R.drawable.singer_house));
        places.add(new Place(context.getString(R.string.hermitage), R.drawable.hermitage));
        return places;
    }

    static ArrayList<Place> getHotelList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.inbox_capsule_hotel), R.drawable.inbox_capsule_hotel));
        places.add(new Place(context.getString(R.string.funky_sport_capsule_hostel), R.drawable.funky_sport_capsule_hostel));
        places.add(new Place(context.getString(R.string.your_space_capsule_hostel), R.drawable.your_space_capsule_hostel));
        places.add(new Place(context.getString(R.string.railway_capsules), R.drawable.railway_capsules));
        places.add(new Place(context.getString(R.string.hostel_capsular_world), R.drawable.hostel_capsular_world));
        return places;
    }
}

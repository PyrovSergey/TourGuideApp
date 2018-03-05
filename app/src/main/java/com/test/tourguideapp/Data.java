package com.test.tourguideapp;


import android.content.Context;

import java.util.ArrayList;

public class Data {
    static ArrayList<Place> getMotoList(Context context) {
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Suzuki", R.drawable.a, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Triumph T100 Custom", R.drawable.b, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("BMV", R.drawable.c, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Suzuki R6", R.drawable.d, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Ducati", R.drawable.e, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Custom Indian Scout", R.drawable.f, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Honda Cafe Racer", R.drawable.j, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Honda Cb550 Custom", R.drawable.h, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Honda Custom", R.drawable.i, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Yamaha R4", R.drawable.j, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Yamaha R1", R.drawable.k, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Triumph Custom", R.drawable.l, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Triumph Cafe Racer", R.drawable.m, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Suzuki Japan Custom", R.drawable.o, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        places.add(new Place("Honda Valkyrie", R.drawable.p, "Description", "phone", "www.ya.ru", -33.8567844, 151.2152967));
        return places;
    }
}

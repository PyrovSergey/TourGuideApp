package com.test.tourguideapp;

import java.io.Serializable;

public class Place implements Serializable {
    private String title;
    private int imageResourceId;

    Place(String title, int imageResourceId) {
        this.title = title;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    int getImageResourceId() {
        return imageResourceId;
    }
}

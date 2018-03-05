package com.test.tourguideapp;

import java.io.Serializable;

public class Place implements Serializable {
    private String title;
    private int imageResourceId;
    private String description;
    private String phoneNum;
    private String url;
    private double lat;
    private double lng;

    public Place(String title, int imageResourceId, String description, String phoneNum, String url, double lat, double lng) {
        this.title = title;
        this.imageResourceId = imageResourceId;
        this.description = description;
        this.phoneNum = phoneNum;
        this.url = url;
        this.lat = lat;
        this.lng = lng;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getUrl() {
        return url;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}

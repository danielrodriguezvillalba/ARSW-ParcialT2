package edu.eci.arsw.model;

import com.google.gson.annotations.SerializedName;

public class Locations {

    private @SerializedName("longitude") String longitude;
    private @SerializedName("latitude") String latitude;

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}

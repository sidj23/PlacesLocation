package com.sid.placeslocation.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.google.android.gms.maps.model.LatLng;
import com.sid.placeslocation.data.converter.LocationConverter;

@Entity(tableName = "places")
public class PlaceLocation {


    @PrimaryKey(autoGenerate = true)
    private int uniId;

    @ColumnInfo
    private String placeId;

    @ColumnInfo
    private String placeName;

    @ColumnInfo
    @TypeConverters(LocationConverter.class)
    private LatLng placeLatLng;

    public int getUniId() {
        return uniId;
    }

    public void setUniId(int uniId) {
        this.uniId = uniId;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public LatLng getPlaceLatLng() {
        return placeLatLng;
    }

    public void setPlaceLatLng(LatLng placeLatLng) {
        this.placeLatLng = placeLatLng;
    }
}

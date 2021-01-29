package com.sid.placeslocation.data.converter;

import androidx.room.TypeConverter;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class LocationConverter {

    @TypeConverter
    public static LatLng getLatLang(String value) {
        Type listType = new TypeToken<LatLng>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String setLatLang(LatLng list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }
}

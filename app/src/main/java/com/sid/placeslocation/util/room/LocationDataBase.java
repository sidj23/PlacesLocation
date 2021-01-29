package com.sid.placeslocation.util.room;

import androidx.room.Database;

import com.sid.placeslocation.data.PlaceLocation;

@Database(entities = {PlaceLocation.class}, version = 1, exportSchema = false)
public abstract class LocationDataBase {

    public abstract LocationDao locationDao();
}

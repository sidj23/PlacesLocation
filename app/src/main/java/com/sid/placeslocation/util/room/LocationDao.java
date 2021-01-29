package com.sid.placeslocation.util.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.sid.placeslocation.data.PlaceLocation;

import java.util.List;

@Dao
public interface LocationDao {

    @Insert
    public void addLocation(PlaceLocation placeLocation);

    @Query("select * from places")
    public List<PlaceLocation> getMostPop();
}

package com.sid.placeslocation.util;

import android.annotation.SuppressLint;
import android.app.Activity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;

public class LocationUtil {

    private static final String TAG = LocationUtil.class.getSimpleName();

    private Activity activity;
    private PreferenceHelper preferenceHelper;

    private FusedLocationProviderClient fusedLocationClient;

    private LocationUtilListener listener;

    public LocationUtil(Activity activity, PreferenceHelper preferenceHelper, LocationUtilListener listener) {
        this.activity = activity;
        this.preferenceHelper = preferenceHelper;
        this.listener = listener;
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(activity);
    }

    @SuppressLint("MissingPermission")
    public void initLocationService() {
        fusedLocationClient.getLastLocation().addOnSuccessListener(activity, location -> {

        });

    }

    public interface LocationUtilListener {
        void setLocationText(LatLng userLocation);
    }
}
package com.sid.placeslocation.util;

import android.content.Context;
import android.content.SharedPreferences;

import static com.sid.placeslocation.util.AppConstants.PREF_NAME;

public class PreferenceHelper {


    private final SharedPreferences mPrefs;

    public PreferenceHelper(Context context) {
        this.mPrefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

}

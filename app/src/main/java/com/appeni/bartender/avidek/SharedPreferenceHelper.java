package com.appeni.bartender.avidek;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by David on 5/10/2016.
 */
public class SharedPreferenceHelper {
    Context context;
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    public final String SHARED_PREF = "scoobeezPreference";

    // local variables

    public static String USER_ACCOUNT = "USER_ACCOUNT";
    public static String USER_ID = "USER_ID";
    public static String CURRENT_API_KEY = "CURRENT_API_KEY";
    public static String ONLINE_TOGGLE = "ONLINE_TOGGLE";
    public static String SEND_LOCATION_TOGGLE = "SEND_LOCATION_TOGGLE";


    public SharedPreferenceHelper(Context context) {
        this.context = context;
        prefs = context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);
        editor = context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE).edit();
    }

    public SharedPreferences getPrefs() {
        return prefs;
    }

    public String getValueString(String key) {
        String value = prefs.getString(key, null);
        return value;
    }

    public void setValueString(String key, String value) {
        editor.putString(key, value).apply();
    }


    public void setValueBoolean(String key, boolean value) {
        editor.putBoolean(key, value).apply();
        Log.d("sharedPreference", key + " " + value);
    }

    public boolean getValueBoolean(String key) {
        boolean value = prefs.getBoolean(key, false);
        return value;
    }

}

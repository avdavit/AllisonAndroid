package com.appeni.bartender.avidek;

import android.content.Context;

import com.appeni.bartender.utils.SharedPreference;
import com.google.gson.Gson;


public class AppSettings {

    private Context context;
    private SharedPreference sharedPreference;
    private Gson gson;

    boolean allowLocationShare;

    public AppSettings(Context context) {
        this.context = context;
        sharedPreference = new SharedPreference(context);
        gson = new Gson();
    }

    public SharedPreference getSharedPreference() {
        return sharedPreference;
    }

    public Gson getGson() {
        return gson;
    }

}

package com.appeni.bartender.utils;

import android.content.Context;

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

    public boolean isAllowLocationShare() {
        return getSharedPreference().getValueBoolean(SharedPreference.SEND_LOCATION_TOGGLE);
    }

    public void setAllowLocationShare(boolean allowLocationShare) {
        getSharedPreference().setValueBoolean(SharedPreference.SEND_LOCATION_TOGGLE, allowLocationShare);
    }
}

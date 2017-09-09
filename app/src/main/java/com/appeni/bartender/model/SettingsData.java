package com.appeni.bartender.model;

import android.graphics.Color;


/**
 * Created by Davit on 8/17/17.
 */

public class SettingsData {


    private String pressedBlue = "#01C9E9";

    public SettingsData() {
    }


    public int getPressedBlue() {
        return Color.parseColor(pressedBlue);
    }
}

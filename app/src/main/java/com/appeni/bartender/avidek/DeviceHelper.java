package com.appeni.bartender.avidek;

import android.content.Context;
import android.provider.Settings;

import com.appeni.bartender.utils.Tools;


/**
 * Created by Davit on 8/12/17.
 */

public class DeviceHelper {

    public static boolean isDevDevice(Context context) {
        boolean isDev = false;
        String deviceID = Tools.getDeviceId(context);
        for (int i = 0; i < Const.debugDevices.length; i++) {
            if (deviceID != null && deviceID.equals(Const.debugDevices[i])) {
                isDev = true;
                break;
            }
        }
        return isDev;
    }

    public static String getDeviceId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ANDROID_ID);
    }
}

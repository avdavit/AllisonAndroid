package com.appeni.bartender.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.appeni.bartender.MainActivity;
import com.appeni.bartender.activities.onboarding.FirstInfoActivity;
import com.appeni.bartender.utils.SharedPreference;

public class SplashScreenActivity extends Activity {
    private Intent intent;
    private SharedPreference sharedPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPreference = new SharedPreference(this);
        if (isLoggedIn()) {
            intent = new Intent(getApplicationContext(), MainActivity.class);
//            intent = new Intent(getApplicationContext(), TestActivity.class);
        } else {
            intent = new Intent(this, FirstInfoActivity.class);
        }

        startActivity(intent);
        finish();
    }

    public boolean isLoggedIn() {
        if (sharedPreference.getValueString(SharedPreference.USER_ACCOUNT) != null) {
            return true;
        } else return false;
    }

}

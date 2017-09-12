package com.appeni.bartender.controllers;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.IntentCompat;

import com.appeni.bartender.MainActivity;
import com.appeni.bartender.activities.onboarding.PhoneVerificationActivity;
import com.appeni.bartender.activities.onboarding.RegisterActivity;


public class ViewController {

    private static ViewController controller = new ViewController();
    private MainActivity mainActivity;

    public static int CHANGED_PATIENT =0;
    public static int CHANGED_ORDER =1;




    private ViewController() {

    }

    public static ViewController getViewController() {
        return controller;
    }


    public void openMainActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }


//    public void openLoginActivity(Context context) {
//
//        Intent intent = new Intent(context, LogInActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
//        context.startActivity(intent);
//    }

    public void openRegisterActivity(Context context) {

        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

    public void openPhoneVerificationActivity(Context context) {

        Intent intent = new Intent(context, PhoneVerificationActivity.class);
        context.startActivity(intent);
    }



//    public void openNewOrderActivity(Activity context, String patientJson, boolean isRefill, String orderInfo) {
//        Intent taskIntent = new Intent(context, NewOrderActivity.class);
//        taskIntent.putExtra(NewOrderActivity.PATIENT_JSON, patientJson);
//        taskIntent.putExtra(NewOrderActivity.IS_REFILL, isRefill);
//        taskIntent.putExtra(NewOrderActivity.CURRENT_ORDER, orderInfo);
//        context.startActivityForResult(taskIntent, CHANGED_ORDER);
//    }


}

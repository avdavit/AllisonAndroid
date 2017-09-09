package com.appeni.bartender.utils;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Vibrator;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;
import android.widget.TextView;

import com.appeni.bartender.model.User;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by David on 5/17/2016.
 */
public class Tools {

    public static final int REQUEST_ACCESS_FINE_LOCATION = 1;
    public static final int REQUEST_CAMERA = 2;
    public static final int REQUEST_CALL_PHONE = 3;
    public static final int REQUEST_READ_CONTACTS = 4;
    public static final int REQUEST_WRITE_EXTERNAL_STORAGE = 5;

    public static String log() {

        return Thread.currentThread().getClass().getSimpleName() + Thread.currentThread().getStackTrace()[2].getLineNumber();
    }


    public static void showAlertWinow(Context context, String message) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
        builder1.setMessage(message);
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

//         builder1.setNegativeButton(
//                 "No",
//                 new DialogInterface.OnClickListener() {
//                     public void onClick(DialogInterface dialog, int id) {
//                         dialog.cancel();
//                     }
//                 });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }


    public static void checkGps(final Activity context) {
        String dialogMessage = "Gps note enabled";
        String openSettings = "open Gps ic_settings";
        String cancelMessage = "Cancel";


        LocationManager lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        boolean gps_enabled = false;
        boolean network_enabled = false;

        try {
            gps_enabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
        } catch (Exception ex) {
        }

        try {
            network_enabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        } catch (Exception ex) {
        }

        if (!gps_enabled && !network_enabled) {
            // notify user
            final AlertDialog.Builder dialog = new AlertDialog.Builder(context);
            dialog.setMessage(dialogMessage);
            dialog.setPositiveButton(openSettings, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                    // TODO Auto-generated method stub
                    Intent myIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    context.startActivity(myIntent);
                    //get gps
                }
            });
            dialog.setNegativeButton(cancelMessage, new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                    context.finish();
                }
            });

            dialog.setOnKeyListener(new Dialog.OnKeyListener() {

                @Override
                public boolean onKey(DialogInterface arg0, int keyCode,
                                     KeyEvent event) {
                    // TODO Auto-generated method stub
                    if (keyCode == KeyEvent.KEYCODE_BACK) {
                        context.finish();

                    }
                    return true;
                }
            });

            dialog.show();

        }

    }


    public static void checkNetwork(final Activity context) {
        String dialogMessage = "Turn on internet and come back";
        String openSettings = "open Network ic_settings";
        String cancelMessage = "Ok";

        // permission need <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
        boolean networkTurned;
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        networkTurned = activeNetworkInfo != null && activeNetworkInfo.isConnected();

        if (!networkTurned) {
            // notify user
            AlertDialog.Builder dialog = new AlertDialog.Builder(context);
            dialog.setMessage(dialogMessage);
//            dialog.setPositiveButton(openSettings, new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface paramDialogInterface, int paramInt) {
//                    Intent intent = new Intent(Intent.ACTION_MAIN);
//                    intent.setClassName("com.android.phone", "com.android.phone.NetworkSetting");
//                    context.startActivity(intent);
//                }
//            });
            dialog.setNegativeButton(cancelMessage, new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                    context.finish();
                }
            });

            dialog.setOnKeyListener(new Dialog.OnKeyListener() {

                @Override
                public boolean onKey(DialogInterface arg0, int keyCode,
                                     KeyEvent event) {
                    // TODO Auto-generated method stub
                    if (keyCode == KeyEvent.KEYCODE_BACK) {
                        context.finish();

                    }
                    return true;
                }
            });

            dialog.show();
        }

    }


    public static boolean checkLocationPermission(Activity activity) {
        if (ContextCompat.checkSelfPermission(activity,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {


            // No explanation needed, we can request the permission.

            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_ACCESS_FINE_LOCATION);
            return false;
        }
        return true;

    }

    public static boolean checkCameraPermission(Activity activity) {
        if (ContextCompat.checkSelfPermission(activity,
                Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {


            // No explanation needed, we can request the permission.

            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.CAMERA},
                    REQUEST_CAMERA);
            return false;
        }
        return true;
    }


    public static boolean checkCallPermission(Activity activity) {
        if (ContextCompat.checkSelfPermission(activity,
                Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {


            // No explanation needed, we can request the permission.

            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.CALL_PHONE},
                    REQUEST_CALL_PHONE);
            return false;
        }
        return true;


    }

    public static boolean checkContactsPermission(Activity activity) {
        if (ContextCompat.checkSelfPermission(activity,
                Manifest.permission.READ_CONTACTS)
                != PackageManager.PERMISSION_GRANTED) {
            // No explanation needed, we can request the permission.

            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.READ_CONTACTS},
                    REQUEST_READ_CONTACTS);
            return false;
        }
        return true;

    }


    public static boolean checkStoragePermission(Activity activity) {
        if (ContextCompat.checkSelfPermission(activity,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {


            // No explanation needed, we can request the permission.

            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_WRITE_EXTERNAL_STORAGE);
            return false;
        }
        return true;

    }

    public static int colorParse(int color, Context context) {
        //  my_image_view.setColorFilter(Tools.colorParse(R.color.my_color, this));
        return ResourcesCompat.getColor(context.getResources(), color, null);
    }


    public static String getDateFromLinuxDate(String strDate) {
        try {
            //2016-09-19T06:00:00
            SimpleDateFormat dt = new SimpleDateFormat("MMM yyyy");
            long longDate = 1000 * Long.valueOf(strDate);
            Date date = new Date(longDate);

            String dateText = dt.format(date);
            return dateText;

        } catch (Exception e) {
            e.printStackTrace();
            return "date unavailable";
        }

    }

    public static long getUnixTimeFromString(String longDate) {
        try {
            //2016-09-19T06:00:00 PDT
            longDate += " -0700";
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
            Date date = null;
            date = dt.parse(longDate);

            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int pxToDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public static int spToPx(float sp) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, Resources.getSystem().getDisplayMetrics());
        return px;
    }

    public static double doubleRound(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static boolean isDevDevice(Context context) {
        boolean isDev = false;
        String deviceID = Tools.getDeviceId(context);
        for (int i = 0; i < Constants.debugDevices.length; i++) {
            if (deviceID != null && deviceID.equals(Constants.debugDevices[i])) {
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

    public static String speedMeterSecondToMileH(String speed) {
        if (speed.equals("") || speed == null) speed = "0";
        DecimalFormat dFormat = new DecimalFormat("##.#");
        String a = dFormat.format((2.23694 * Float.valueOf(speed)));
        return a;
    }

    public static Bitmap getResizedBitmap(Bitmap bm, int newWidth, int newHeight) {
        int width = bm.getWidth();
        int height = bm.getHeight();
        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;
        // CREATE A MATRIX FOR THE MANIPULATION
        Matrix matrix = new Matrix();
        // RESIZE THE BIT MAP
        float scale = Math.min(scaleWidth, scaleHeight);
        matrix.setScale(scale, scale);

        // "RECREATE" THE NEW BITMAP
        Bitmap resizedBitmap = Bitmap.createBitmap(
                bm, 0, 0, width, height, matrix, false);
        bm.recycle();
        return resizedBitmap;
    }

    public static User getCrmAccount(Context context) {
        SharedPreference sharedPreference = new SharedPreference(context);
        Gson gson = new Gson();
        String a = sharedPreference.getValueString(SharedPreference.USER_ACCOUNT);
        User user = gson.fromJson(a, User.class);
        return user;
    }

    public static void saveClaimInInternalStorage(Context context, String claimJson, long id) {
        String filename = "claim_" + id; //id here in the future

        try {
            FileOutputStream outputStream = context.openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(claimJson.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream inputStream = context.openFileInput(filename);
            BufferedReader r = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder total = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                total.append(line);
            }
            r.close();
            inputStream.close();
            Log.d("File", "File contents: " + total);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void vibrator(Context context, int time) {
        Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(time);
    }




    public static void hideKeyboard(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static String getTextFromTextView(TextView currentTextView) {
        String myString;
        if (currentTextView == null || currentTextView.getText() == null) myString = "";
        else myString = currentTextView.getText().toString().trim();

        return myString;
    }

    public static boolean isRequiredTextViewFilled(final TextView[] textViewList, final ScrollView myScrollView) {

        boolean isAnyEmptyFields = false;
        int firstIndex = 0;
        for (int i = textViewList.length - 1; i >= 0; i--) {

            if (textViewList[i] == null || textViewList[i].getText() == null || textViewList[i].getText().toString().trim().length() == 0) {
                YoYo.with(Techniques.Shake)
                        .duration(600)
                        .playOn(textViewList[i]);
                isAnyEmptyFields = true;
                firstIndex = i;
            }
        }
        if (isAnyEmptyFields) {
            textViewList[firstIndex].requestFocus();

            final int finalFirstIndex = firstIndex;
            myScrollView.post(new Runnable() {
                @Override
                public void run() {
                    myScrollView.scrollTo(0, textViewList[finalFirstIndex].getTop());
                }
            });
        }
        return !isAnyEmptyFields;
    }
}
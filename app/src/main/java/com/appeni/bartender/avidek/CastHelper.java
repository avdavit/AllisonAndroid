package com.appeni.bartender.avidek;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.util.TypedValue;

import java.io.ByteArrayOutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Davit on 8/12/17.
 */

public class CastHelper {


    public static String speedMeterSecondToMileH(String speed) {
        if (speed.equals("") || speed == null) speed = "0";
        DecimalFormat dFormat = new DecimalFormat("##.#");
        String a = dFormat.format((2.23694 * Float.valueOf(speed)));
        return a;
    }

    public static double doubleRound(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    // format double number with point
    // #0.00 - with 2 points
    //0.0 - 1 number
    public static String doubleFormatter(double number, String format) {

        NumberFormat formatter = new DecimalFormat("#" + format);
        return formatter.format(number);
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


// Dates formatter

    // "yyyy-MM-dd hh:mm:ss Z"
    public static long getUnixTimeFromString(String longDate, String pattern) {
        try {
            SimpleDateFormat dt = new SimpleDateFormat(pattern);
            Date date = null;
            date = dt.parse(longDate);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }

// pattern "MMM yyyy")
    public static String getDateFromLinuxDate(String strDate,String pattern) {
        try {
            //2016-09-19T06:00:00
            SimpleDateFormat dt = new SimpleDateFormat(pattern);
            long longDate = 1000 * Long.valueOf(strDate);
            Date date = new Date(longDate);

            String dateText = dt.format(date);
            return dateText;

        } catch (Exception e) {
            e.printStackTrace();
            return "date unavailable";
        }
    }







    public static int colorParse(int color, Context context) {
        //  my_image_view.setColorFilter(Tools.colorParse(R.color.my_color, this));
        return ResourcesCompat.getColor(context.getResources(), color, null);
    }
    /**
     * Turn drawable resource into byte array.
     *
     * @param context parent context
     * @param id      drawable resource id
     * @return byte array
     */
    public static byte[] getFileDataFromDrawable(Context context, int id) {
        Drawable drawable = ContextCompat.getDrawable(context, id);
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /**
     * Turn drawable into byte array.
     *
     * @param drawable data
     * @return byte array
     */
    public static byte[] getFileDataFromDrawable(Context context, Drawable drawable) {
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

}

package com.appeni.bartender.avidek;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

/**
 * Created by Davit on 8/12/17.
 */

public class ViewHelper {

    // return true if at least one of the editTexts is empty, also puts animation on editText
    public static boolean isRequiredEditTextFilled(final EditText[] editTexts, final ScrollView myScrollView) {

        boolean isAnyEmptyFields = false;
        int firstIndex = 0;
        for (int i = editTexts.length - 1; i >= 0; i--) {

            if (editTexts[i] == null || editTexts[i].getText() == null || editTexts[i].getText().toString().trim().length() == 0) {
                YoYo.with(Techniques.Shake)
                        .duration(600)
                        .playOn(editTexts[i]);
                isAnyEmptyFields = true;
                firstIndex = i;
            }
        }

        // request focus
        if (isAnyEmptyFields) {
            editTexts[firstIndex].requestFocus();

            // skip this part if scrollview is null
            if (myScrollView != null) {
                final int finalFirstIndex = firstIndex;
                myScrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        myScrollView.scrollTo(0, editTexts[finalFirstIndex].getTop());
                    }
                });
            }
        }
        return !isAnyEmptyFields;
    }


    // get String from editText, trims spaces
    public static String getTextFromEditTextView(TextView currentTextView) {
        String myString;
        if (currentTextView == null || currentTextView.getText() == null) myString = "";
        else myString = currentTextView.getText().toString().trim();

        return myString;
    }


    public static void showAlertWinow(Context context, String message) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
        builder1.setMessage(message);
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

         builder1.setNegativeButton(
                 "No",
                 new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int id) {
                         dialog.cancel();
                     }
                 });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }

    public static void hideKeyboard(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

}

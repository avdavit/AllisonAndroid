package com.appeni.bartender.activities.onboarding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.appeni.bartender.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class PhoneVerificationActivity extends AppCompatActivity {

    EditText digit1, digit2, digit3, digit4, digit5, digit6;
    Button verifyBtn;
    ImageView back;
    LinearLayout digitContainer;
    String digitCode;
    boolean digitAvailability = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verification);

        initView();

        digitContainer = (LinearLayout) findViewById(R.id.digit_container);
        digit1.requestFocus();
        setTextListeners();


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        verifyBtn.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             digitCode = digit1.getText().toString() + digit2.getText().toString() + digit3.getText().toString() + digit4.getText().toString() + digit5.getText().toString();
                                             if (digitCode.length() != 6)
                                                 YoYo.with(Techniques.Shake).duration(800).playOn(digitContainer);
                                             else {
                                                 //this should go after server respond
//                                                 Intent digitIntent = new Intent(ZipCodeActivity.this, ZipAvailability.class);
//
//                                                 if (digitCode.equals("11111")) digitAvailability = false;
//                                                 else digitAvailability = true;
//                                                 digitIntent.putExtra(ZipAvailability.ZIP_CODE, digitCode);
//                                                 SharedPreference sharedPreference = new SharedPreference(ZipCodeActivity.this);
//                                                 sharedPreference.setValueString(SharedPreference.CURRENT_ZIP_CODE, digitCode);
//                                                 digitIntent.putExtra(ZipAvailability.ZIP_AVAILABILITY, digitAvailability);
//                                                 startActivity(digitIntent);

                                             }

                                         }
                                     }

        );


    }

    private void setTextListeners() {
        digit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (digit1.getText().length() == 1)
                    digit2.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        digit2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (digit2.getText().length() == 1)
                    digit3.requestFocus();

                if (digit2.getText().length() == 0)
                    digit1.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




        digit3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (digit3.getText().length() == 1)
                    digit4.requestFocus();
                if (digit3.getText().length() == 0)
                    digit2.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        digit4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (digit4.getText().length() == 1)
                    digit5.requestFocus();
                if (digit4.getText().length() == 0)
                    digit3.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        digit5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (digit5.getText().length() == 1)
                    digit6.requestFocus();
                if (digit5.getText().length() == 0)
                    digit4.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        digit6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (digit6.getText().length() == 0)
                    digit5.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    private void initView() {


        digit1 = (EditText) findViewById(R.id.digit1);
        digit2 = (EditText) findViewById(R.id.digit2);
        digit3 = (EditText) findViewById(R.id.digit3);
        digit4 = (EditText) findViewById(R.id.digit4);
        digit5 = (EditText) findViewById(R.id.digit5);
        digit6 = (EditText) findViewById(R.id.digit6);
        verifyBtn = findViewById(R.id.verifyBtn);

        back = (ImageView) findViewById(R.id.back);
    }
}

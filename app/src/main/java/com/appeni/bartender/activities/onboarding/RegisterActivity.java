package com.appeni.bartender.activities.onboarding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.appeni.bartender.R;
import com.appeni.bartender.controllers.ViewController;

public class RegisterActivity extends AppCompatActivity {

    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewController.getViewController().openPhoneVerificationActivity(RegisterActivity.this);
            }
        });
    }

    private void initView() {
        btnRegister = findViewById(R.id.btnRegister);
    }
}

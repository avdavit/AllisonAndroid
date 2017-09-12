package com.appeni.bartender.activities.onboarding;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.appeni.bartender.R;
import com.appeni.bartender.controllers.ViewController;
import com.appeni.bartender.onBoarding.PaperOnboardingFragment;
import com.appeni.bartender.onBoarding.PaperOnboardingPage;
import com.appeni.bartender.onBoarding.listeners.PaperOnboardingOnRightOutListener;

import java.util.ArrayList;

public class FirstInfoActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_info);
        fragmentManager = getSupportFragmentManager();

        final PaperOnboardingFragment onBoardingFragment = PaperOnboardingFragment.newInstance(getDataForOnboarding());

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, onBoardingFragment);
        fragmentTransaction.commit();

        onBoardingFragment.setOnRightOutListener(new PaperOnboardingOnRightOutListener() {
            @Override
            public void onRightOut() {
                ViewController.getViewController().openRegisterActivity(FirstInfoActivity.this);
            }
        });
    }

    private ArrayList<PaperOnboardingPage> getDataForOnboarding() {
        // prepare data
        PaperOnboardingPage scr1 = new PaperOnboardingPage("BarDemand Presents...", "Mobile Bartendering!",
                Color.parseColor("#03BCE9"), R.drawable.img_onboarding_1, R.drawable.ic_plus);
        PaperOnboardingPage scr2 = new PaperOnboardingPage("On-Demand bartender", "We bring the bar to you",
                Color.parseColor("#F7BF0E"), R.drawable.img_onboarding_2, R.drawable.ic_plus);
        PaperOnboardingPage scr3 = new PaperOnboardingPage("Elevate your Event & Provide an experience", "with BarDemand",
                Color.parseColor("#03BCE9"), R.drawable.img_onboarding_3, R.drawable.ic_plus);

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(scr1);
        elements.add(scr2);
        elements.add(scr3);
        return elements;
    }
}

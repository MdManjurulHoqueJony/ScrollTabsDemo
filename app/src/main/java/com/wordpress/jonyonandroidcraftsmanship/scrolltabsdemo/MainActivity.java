package com.wordpress.jonyonandroidcraftsmanship.scrolltabsdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    private ViewPager vpMain = null;
    private FragmentManager fragmentManager = null;
    private ViewPagerAdapter viewPagerAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        fragmentManager = getSupportFragmentManager();
        vpMain = (ViewPager) findViewById(R.id.vpMain);
        viewPagerAdapter = new ViewPagerAdapter(fragmentManager);
        vpMain.setAdapter(viewPagerAdapter);
    }

}


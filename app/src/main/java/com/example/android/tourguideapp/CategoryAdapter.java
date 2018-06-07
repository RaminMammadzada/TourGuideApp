package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by admin on 26-06-2016.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private String mTabTitles[];
    private int mMenuItemId = 0;

    public CategoryAdapter(FragmentManager fm, int menuItemId) {
        super(fm);
        this.mMenuItemId = menuItemId;

        if(menuItemId == R.id.nav_holiday_trip) {
            this.mTabTitles = new String[] { "Restaurants", "Hotels", "Bazaars", "Museums"};
        }
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {


        if(mMenuItemId == R.id.nav_holiday_trip){
            switch (position) {
                case 0:
                    return new RestaurantsFragment();
                case 1:
                    return new HotelsFragment();
                case 2:
                    return new BazaarsFragment();
                case 3:
                    return new MuseumsFragment();
            }
        }

        return null;
    }

    @Override
    public int getCount() {
        return mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return mTabTitles[position];
    }

}

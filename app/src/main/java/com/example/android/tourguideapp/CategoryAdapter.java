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

    private String mTabTitles[] = new String[] { };
    private int mMenuItemId = 0;
    private ArrayList<Integer> resourcesIds= new ArrayList<Integer>( Arrays.asList(R.id.nav_restaurants, R.id.nav_hotels, R.id.nav_cafes, R.id.nav_bazaars, R.id.nav_events, R.id.nav_museums, R.id.nav_night_clubs, R.id.nav_parks, R.id.nav_trasportation));

    public CategoryAdapter(FragmentManager fm, int menuItemId) {
        super(fm);
        this.mMenuItemId = menuItemId;

        switch (mMenuItemId){
            case R.id.nav_restaurants:
                this.mTabTitles = new String[]{"Turkish", "International"};
                break;
            case R.id.nav_hotels:
                this.mTabTitles = new String[]{"Economic", "4 Star + ", "Beach Hotels"};
                break;
            case R.id.nav_cafes:
                this.mTabTitles = new String[]{"Turkish", "National", "International", "Extraordinatires"};
                break;
            case R.id.nav_bazaars:
                this.mTabTitles = new String[]{"Historical", "Modern", "Fruits", "Extraordinatires"};
                break;
            case R.id.nav_events:
                this.mTabTitles = new String[]{"Parties", "Fairs", "Fruits", "Extraordinatires"};
                break;
            case R.id.nav_museums:
                this.mTabTitles = new String[]{"Historical", "Scientific", };
                break;
            case R.id.nav_night_clubs:
                this.mTabTitles = new String[]{"Restaurants", "Homes", "Fruits", "Extraordinatires"};
                break;
            case R.id.nav_parks:
                this.mTabTitles = new String[]{"Homes", "Fruits", "Extraordinatires"};
                break;
            case R.id.nav_trasportation:
                this.mTabTitles = new String[]{"Restaurants"};
                break;
        }
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        if(mMenuItemId == R.id.nav_restaurants) {

            switch (position) {
                case 0:
                    return new TurkishRestaurantsFragment();
                case 1:
                    return new InternationalRestaurantsFragment();
            }
        }

        if(mMenuItemId == R.id.nav_hotels) {

            switch (position) {
                case 0:
                    return new EconomicHotelsFragment();
                case 1:
                    return new FourStarPlusHotelsFragment();
                case 2:
                    return new BeachHotelsHotelsFragment();
                }
        }

        /*if(mMenuItemId == R.id.nav_cafes) {

            switch (position) {
                case 0:
                    return new SampleFragment();
                case 1:
                    return new BarsFragment();
                case 2:
                    return new SampleFragment();
                case 3:
                    return new SampleFragment();
            }
        }

        if(mMenuItemId == R.id.nav_bazaars) {

            switch (position) {
                case 0:
                    return new ButicFragment();
                case 1:
                    return new SampleFragment();
                case 2:
                    return new SampleFragment();
                case 3:
                    return new SampleFragment();
            }
        }

        if(mMenuItemId == R.id.nav_events) {

            switch (position) {
                case 0:
                    return new SampleFragment();
                case 1:
                    return new BarsFragment();
                case 2:
                    return new SampleFragment();
                case 3:
                    return new SampleFragment();
            }
        }

        if(mMenuItemId == R.id.nav_museums) {

            switch (position) {
                case 0:
                    return new ButicFragment();
                case 1:
                    return new SampleFragment();
                case 2:
                    return new SampleFragment();
                case 3:
                    return new SampleFragment();
            }
        }

        if(mMenuItemId == R.id.nav_night_clubs) {

            switch (position) {
                case 0:
                    return new SampleFragment();
                case 1:
                    return new BarsFragment();
                case 2:
                    return new SampleFragment();
                case 3:
                    return new SampleFragment();
            }
        }

        if(mMenuItemId == R.id.nav_parks) {

            switch (position) {
                case 0:
                    return new ButicFragment();
                case 1:
                    return new SampleFragment();
                case 2:
                    return new SampleFragment();
                case 3:
                    return new SampleFragment();
            }
        }

        if(mMenuItemId == R.id.nav_trasportation) {

            switch (position) {
                case 0:
                    return new ButicFragment();
                case 1:
                    return new SampleFragment();
                case 2:
                    return new SampleFragment();
                case 3:
                    return new SampleFragment();
            }
        }*/

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

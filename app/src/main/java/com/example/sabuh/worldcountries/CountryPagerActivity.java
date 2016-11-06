package com.example.sabuh.worldcountries;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;

import java.util.ArrayList;
import java.util.UUID;

import project.sabuhi.com.countries.R;

/**
 * Created by Sabuh on 11/1/2016.
 */

public class CountryPagerActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private ArrayList<Countries> mOlkeler;





    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.viewPager);
        setContentView(mViewPager);

        mOlkeler = CountryLab.get(this).getOlkeler();

        FragmentManager fm= getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int position) {
                Countries country = mOlkeler.get(position);
                return  CountryFragment.newInstance(country.getId());
            }

            @Override
            public int getCount() {
                return mOlkeler.size();
            }
        });
        UUID olkeId = (UUID)getIntent()
                .getSerializableExtra(CountryFragment.EXTRA_OLKE_ID);
        for (int i = 0; i < mOlkeler.size(); i++) {
            if (mOlkeler.get(i).getId().equals(olkeId)) {
                mViewPager.setCurrentItem(i);
                break;
            }
        }
    }
}

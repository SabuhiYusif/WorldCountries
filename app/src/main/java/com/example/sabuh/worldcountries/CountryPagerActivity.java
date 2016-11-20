package com.example.sabuh.worldcountries;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.UUID;

import project.sabuhi.com.countries.R;

/**
 * Created by Sabuh on 11/1/2016.
 */

public class CountryPagerActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private ArrayList<Countries> mOlkeler;
    private Countries country;





    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.viewPager);

//        setContentView(R.layout.activity_main);
        setContentView(mViewPager);
//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//

//        toolbar.setTitle(mOlke.getNameOlke());



//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mOlkeler = CountryLab.get(this).getOlkeler();

        FragmentManager fm= getSupportFragmentManager();

        mViewPager.setAdapter(new FragmentPagerAdapter(fm) {



            @Override
            public int getCount() {
                return mOlkeler.size();
            }

            @Override
            public Fragment getItem(int position) {
                country = mOlkeler.get(position);
                return  CountryFragment.newInstance(country.getId());

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
//    @Override
//    public void onBackStackChanged() {
//        shouldDisplayHomeUp();
//    }
//    public void shouldDisplayHomeUp(){
//        //Enable Up button only  if there are entries in the back stack
//        boolean canback = getSupportFragmentManager().getBackStackEntryCount()>0;
//        getSupportActionBar().setDisplayHomeAsUpEnabled(canback);
//    }
//    @Override
//    public boolean onSupportNavigateUp() {
//        //This method is called when the up button is pressed. Just the pop back stack.
//        getSupportFragmentManager().popBackStack();
//        return true;
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Log.d("BackPressedActivity"," ");
            onBackPressed();//Call the back button's method
            return true;
        }
        return super.onOptionsItemSelected(item);
//        return false;
    }
//    @Override
//    public void onBackPressed() {
//        if ( mViewPager != null && mViewPager.getCurrentItem() != 0 ) {
//            mViewPager.setCurrentItem(0);
//        }
//    }
}

package com.example.sabuh.worldcountries;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;

import android.support.v4.app.NavUtils;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.UUID;

import project.sabuhi.com.countries.R;


public class CountryActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {

        UUID olkeId= (UUID)getIntent().getSerializableExtra(CountryFragment.EXTRA_OLKE_ID);

        return CountryFragment.newInstance(olkeId);



    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement



        return super.onOptionsItemSelected(item);
    }



}

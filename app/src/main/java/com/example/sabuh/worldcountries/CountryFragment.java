package com.example.sabuh.worldcountries;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.UUID;

import project.sabuhi.com.countries.R;

import static android.R.attr.id;

/**
 * Created by Sabuh on 10/30/2016.
 */

public class CountryFragment extends Fragment {

    private Countries mOlke;
    private TextView mOlkeAdi;

    private TextView mPaytaxtAdi;
    private TextView mEhali;
    private ImageView mBayraqImg;
    private TextView mErazi;
    private TextView mDil;
    private TextView mValyuta;
    private TextView mMilliyet;
    private TextView mUDM;

    private TextView mQite;
    private Toolbar toolbar;
//    private Toolbar mToolbar;

    public static final String EXTRA_OLKE_ID = "com.example.sabuh.worldcountries.olke_id";

    public static CountryFragment newInstance(UUID olkeId){
        Bundle args = new Bundle();

        args.putSerializable(EXTRA_OLKE_ID, olkeId);

        CountryFragment fragment = new CountryFragment();

        fragment.setArguments(args);
        return  fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mOlke = new Countries(0);
        UUID olkeId=(UUID)getArguments().getSerializable(EXTRA_OLKE_ID);
        mOlke =CountryLab.get(getActivity()).getOlke(olkeId);




//
//        getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);



//        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);




//        mToolbar.activateToolbar();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_main, parent, false);


        mOlkeAdi = (TextView) v.findViewById(R.id.olke_adi);
        mOlkeAdi.setText(mOlke.getNameOlke());
        mPaytaxtAdi =(TextView) v.findViewById(R.id.paytaxtAdi);
        mPaytaxtAdi.setText(mOlke.getPaytaxt());
        mEhali =(TextView) v.findViewById(R.id.ehali_sayi);
        mEhali.setText(mOlke.getEhali());
        mErazi = (TextView) v.findViewById(R.id.erazi_olcu);
        mErazi.setText(mOlke.getErazi());
        mDil = (TextView) v.findViewById(R.id.diller);
        mDil.setText(mOlke.getDil());
        mValyuta = (TextView) v.findViewById(R.id.valyutalar);
        mValyuta.setText(mOlke.getValyuta());
        mUDM = (TextView) v.findViewById(R.id.udm_deyer);
        mUDM.setText(mOlke.getUDM());
        mMilliyet = (TextView) v.findViewById(R.id.kodlar);
        mMilliyet.setText(mOlke.getTelKod());
        mQite= (TextView) v.findViewById(R.id.qiteler);
        mQite.setText(mOlke.getQite());

        mBayraqImg = (ImageView) v.findViewById(R.id.bayraq_img);
        mBayraqImg.setImageResource(mOlke.getImageId());
//
        toolbar = (Toolbar) v.findViewById(R.id.toolbar);
        toolbar.setTitle(mOlke.getNameOlke());



        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

//        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setDisplayShowHomeEnabled(true);





//        actionBar.setHomeButtonEnabled(true);
//        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);





        return v;
    }




    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {


        super.onCreateOptionsMenu(menu, inflater);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (item.getItemId() == android.R.id.home) {
        getActivity().onBackPressed();    //Call the back button's method
        return true;
    }


    return super.onOptionsItemSelected(item);

    }
}




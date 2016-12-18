package com.example.sabuh.worldcountries;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SectionIndexer;
import android.widget.TextView;


import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;

import project.sabuhi.com.countries.R;

/**
 * Created by Sabuh on 10/30/2016.
 */

public class CountryListFragment extends AppCompatActivity {

    private static final String TAG= "CountryListFragment";
    private ArrayList<Countries> mOlkeler;
    private Adapter adapter;
    private   ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       lv = (ListView) findViewById(R.id.list_countries);


        mOlkeler = CountryLab.get(getApplicationContext()).getOlkeler();
        adapter = new Adapter(getApplicationContext(), mOlkeler);

        lv.setAdapter(adapter);
        lv.setFastScrollEnabled(true);
//        lv.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_INSET);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//
                Countries c= (Countries) lv.getAdapter().getItem(position);
                Log.d(TAG, "onItemClick: "+c.getId());



                Log.d(TAG,c.getNameOlke()+" was Clicked"+position);



                Intent i = new Intent(getApplicationContext(),CountryPagerActivity.class);
                i.putExtra(CountryFragment.EXTRA_OLKE_ID,c.getId());



//53009e8a-9a9e-4d4f-90b5-a1a4ad9ddce7
//f3e691a6-b99f-4132-8492-737bedf35066

                startActivity(i);
            }
        });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.menu_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
//                Log.d("COUNT", " " + adapter.getCount());

                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }



        return super.onOptionsItemSelected(item);
    }


    private class Adapter extends BaseAdapter implements Filterable {
        Context c;
        ArrayList<Countries> countries;

        CustomFilter mFilter= new CustomFilter();
        ArrayList<Countries> filterList;




        public Adapter(Context ctx, ArrayList<Countries> countries){
//            this.countries= new ArrayList<>();

            this.c=ctx;
            this.countries= countries;
            this.filterList =countries;

        }




        @Override
        public int getCount() {
            

            return countries.size();



        }

//        @Override
//        public Object getItem(int position) {
//            return countries.get(position);
//        }

        @Override
        public Object getItem(int position) {

            return countries.get(position);
        }

        @Override
        public long getItemId(int position) {
            return countries.indexOf(getItem(position));
        }

        class TestViewHolder{
            TextView olkeHolder;
            TextView paytaxtHolder;
            ImageView mImageView;
            TestViewHolder(View v){
                mImageView = (ImageView) v.findViewById(R.id.imageView);
                olkeHolder = (TextView) v.findViewById(R.id.olke_list_item_olke);
                paytaxtHolder = (TextView) v.findViewById(R.id.olke_list_item_paytaxt);
            }
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v=convertView;
            TestViewHolder holder = null;
                if(v==null){
                    LayoutInflater inflater =(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v=inflater.inflate(R.layout.model,null);
                    holder = new TestViewHolder(v);
                    v.setTag(holder);

                }else{
                        holder= (TestViewHolder) v.getTag();
                }

//
            holder.olkeHolder.setText(countries.get(position).getNameOlke());

//
            holder.paytaxtHolder.setText(countries.get(position).getPaytaxt());

//
            holder.mImageView.setImageResource(countries.get(position).getIconId());
            return v;
        }



        @Override
        public Filter getFilter() {

            if(mFilter==null){
                mFilter= new CustomFilter();

            }
            return mFilter;

        }



        class CustomFilter extends Filter{
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                FilterResults results=new FilterResults();
                if(constraint!=null&&constraint.length()>0){

                    constraint=constraint.toString().toLowerCase();

                    ArrayList<Countries> filters =new ArrayList<>();

                    for(int i = 0; i< filterList.size(); i++){
                        if(filterList.get(i).getNameOlke().toLowerCase().startsWith((constraint.toString().toLowerCase()))){
//                            Countries c = new Countries(filterList.get(i).getNameOlke(),filterList.get(i).getPaytaxt(), filterList.get(i).getIconId());


                            filters.add(filterList.get(i));

                        }

                    }
                    results.count= filters.size();
                    results.values=filters;

                }else {
                    results.count= filterList.size();
                    results.values=filterList;
                }
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                countries  =(ArrayList<Countries>) results.values;

                if (results.count > 0)
                {
                    Log.d(TAG, "publishResults: "+adapter.getCount());
                    adapter.notifyDataSetChanged();
                    Log.d(TAG, "publishResults: "+adapter.getCount());


                }
                else
                {
                    Log.d(TAG, "publishResults: invalidated");
                    notifyDataSetInvalidated();
                }

            }
        }


    }



}

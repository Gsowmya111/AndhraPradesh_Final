package com.example.sowmyaram.andhrapradesh_final.adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.sowmyaram.andhrapradesh_final.Fragments.About_Place;
import com.example.sowmyaram.andhrapradesh_final.Fragments.SymbolFragment;

import static com.example.sowmyaram.andhrapradesh_final.Fragments.Aboutus_tab.int_items;

public class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new About_Place();
            case 1:
                return new SymbolFragment();


        }
        return null;
    }

    @Override
    public int getCount() {


        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "About Andhra";
            case 1:
                return "Symbols";


        }

        return null;
    }
}

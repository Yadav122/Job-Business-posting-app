package com.google.firebase.udacity.project.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.firebase.udacity.project.Fragments.Individual;
import com.google.firebase.udacity.project.Fragments.Merchant;
import com.google.firebase.udacity.project.Fragments.Professional;

public class FragementAdapter extends FragmentPagerAdapter {


    public FragementAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Individual();
            case 1:
                return new Professional();
            case 2:
                return new Merchant();
            default:
                return new Individual();

        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tittle = null;
        if (position==0){
            tittle="INDIVIDUAL";
        }
        if (position==1){
            tittle=" PROFESSIONAL ";
        }
        if (position==2){
            tittle="MERCHANT";
        }
        return tittle;
    }
}

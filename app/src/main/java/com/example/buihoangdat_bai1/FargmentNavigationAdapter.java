package com.example.buihoangdat_bai1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FargmentNavigationAdapter extends FragmentStatePagerAdapter {
    private int numPage=3;
    public FargmentNavigationAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new hanoiFragment();
            case 1: return new danangFragment();
            case 2: return new dalatFragment();
            default: return new hanoiFragment();
        }
    }

    @Override
    public int getCount() {
        return numPage;
    }
}

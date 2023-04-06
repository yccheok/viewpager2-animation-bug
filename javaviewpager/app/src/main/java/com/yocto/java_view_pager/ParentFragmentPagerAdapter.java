package com.yocto.java_view_pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ParentFragmentPagerAdapter extends FragmentStateAdapter {
    public ParentFragmentPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new PetsFragment();
        } else {
            return new NeedsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

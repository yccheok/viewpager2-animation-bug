package com.yocto.java_view_pager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        ParentFragmentPagerAdapter parentFragmentPagerAdapter = new ParentFragmentPagerAdapter(this);
        viewPager.setAdapter(parentFragmentPagerAdapter);

        viewPager.setOffscreenPageLimit(parentFragmentPagerAdapter.getItemCount()-1);
        
        new TabLayoutMediator(tabLayout, viewPager, true, false, (tab, position) -> {
            tab.setText("" + position);
        }).attach();

    }
}
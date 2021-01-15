package com.lnjr.viewpapertext1;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hcwd on 2019/10/9.
 */

public class FragmentAdapter extends FragmentPagerAdapter{

    private List<Fragment> fragments;
    public FragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }
    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }
    @Override
    public int getCount() {
        return fragments.size();
    }

}

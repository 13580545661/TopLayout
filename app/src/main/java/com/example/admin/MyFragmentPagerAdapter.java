package com.example.admin;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Carson_Ho on 16/7/22.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] mTitles = new String[]{"热门", "最新", "简餐便当","小吃炸串","地方菜系","面食粥点","汉堡披萨","日韩料理","轻食西餐","香锅冒菜"};

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new Fragment2();
        } else if (position == 2) {
            return new Fragment3();
        }else if (position==3){
            return new Fragment4();
        }else if (position==4){
            return new Fragment5();
        }else if (position==5){
            return new Fragment6();
        }else if (position==6){
            return new Fragment7();
        }else if (position==7){
            return new Fragment8();
        }else if (position==8){
            return new Fragment9();
        }else if (position==9){
            return new Fragment10();
        }
        return new Fragment1();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    //ViewPager与TabLayout绑定后，这里获取到PageTitle就是Tab的Text
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}

package com.example.admin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment_main extends Fragment {

    private TextView textView;
    private Button button;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private TabLayout.Tab one;
    private TabLayout.Tab two;
    private TabLayout.Tab three;
    private TabLayout.Tab four;
    private TabLayout.Tab five;
    private TabLayout.Tab six;
    private TabLayout.Tab seven;
    private TabLayout.Tab eight;
    private TabLayout.Tab nine;
    private TabLayout.Tab ten;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        //11.17
        initViews();

      //  textView=(TextView)getActivity().findViewById(R.id.textView1);
      //  button=(Button)getActivity().findViewById(R.id.button1);
      //  button.setOnClickListener(new View.OnClickListener(){
          //  @Override
         //   public void onClick(View view){
          //      Toast.makeText(getActivity(),"Fragment_main",Toast.LENGTH_SHORT).show();
          //  }
      //  });
    }

    //11.17
    private void  initViews(){
        //使用适配器与fragment绑定一起
        mViewPager=(ViewPager)getActivity().findViewById(R.id.viewPager);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(myFragmentPagerAdapter);

        //将TabLayout与ViewPager绑定一起
        mTabLayout = (TabLayout) getActivity().findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        //指定Tab的位置
        one= mTabLayout.getTabAt(0);
        two= mTabLayout.getTabAt(1);
        three = mTabLayout.getTabAt(2);
        four = mTabLayout.getTabAt(3);
        five= mTabLayout.getTabAt(4);
        six= mTabLayout.getTabAt(5);
        seven = mTabLayout.getTabAt(6);
        eight= mTabLayout.getTabAt(7);
        nine= mTabLayout.getTabAt(8);
        ten= mTabLayout.getTabAt(9);


        //设置Tab的图标


    }

}

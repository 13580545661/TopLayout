package com.example.admin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private Fragment_main fragment_main;
    private Fragment_my fragment_my;
    private Fragment[] fragments;
    private int lastfragment;

    //11.17



    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.write:
                Intent intent1 = new Intent(MainActivity.this,Toolbar_write2.class);
                startActivity(intent1);
                break;
            case R.id.search:
                Intent intent2 = new Intent(MainActivity.this,Toolbar_write2.class);
                startActivity(intent2);
                break;
                default:
        }
        return true;
    }


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar( toolbar);
        initFragment();

    }
    private void initFragment()
    {
        fragment_main = new Fragment_main();
        fragment_my = new Fragment_my();
        fragments = new Fragment[]{fragment_main,fragment_my};
        lastfragment = 0;
        getSupportFragmentManager().beginTransaction().replace(R.id.mainview,fragment_main).show(fragment_main).commit();
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bnv);
        bottomNavigationView.setOnNavigationItemSelectedListener(changeFragment);
    }

    //判断选择的菜单
    private BottomNavigationView.OnNavigationItemSelectedListener changeFragment=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch(menuItem.getItemId()){
                case R.id.id1:
                {
                    if(lastfragment!=0)
                    {
                        switchFragment(lastfragment,0);
                        lastfragment=0;
                    }
                    return true;
                }
                case R.id.id2:
                {
                    if(lastfragment!=1)
                    {
                        switchFragment(lastfragment,1);
                        lastfragment=1;
                    }
                    return true;
                }


            }
            return false;
        }
    };
    private void switchFragment(int lastfragment,int index)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.hide(fragments[lastfragment]);
        if (fragments[index].isAdded()==false)
        {
            transaction.add(R.id.mainview,fragments[index]);
        }
        transaction.show(fragments[index]).commitAllowingStateLoss();
    }
}

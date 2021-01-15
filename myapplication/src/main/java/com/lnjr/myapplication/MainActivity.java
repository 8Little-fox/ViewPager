package com.lnjr.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener {
    //UI Objects
//    private TextView txt_topbar;
    private RadioGroup rg_tab_bar;
    private RadioButton rb_change1;
    private RadioButton rb_message;
    private RadioButton rb_better;
    private RadioButton rb_setting;
    private ViewPager vPager;
    private MyFragmentPagerAdapter adapter;
    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        bindViews();
        rb_change1.setChecked(true);
    }

    private void bindViews() {
//        txt_topbar = findViewById(R.id.txt_topbar);
        rg_tab_bar = findViewById(R.id.rg_tab_bar);
        rb_change1 = findViewById(R.id.rb_channel);
        rb_message = findViewById(R.id.rb_message);
        rb_better = findViewById(R.id.rb_better);
        rb_setting = findViewById(R.id.rb_setting);
        rg_tab_bar.setOnCheckedChangeListener(this);

        vPager = findViewById(R.id.vpager);
        vPager.setAdapter(adapter);
        vPager.setCurrentItem(0);
        vPager.addOnPageChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Log.i("底部点击", String.valueOf(checkedId));

        switch (checkedId) {
            case R.id.rb_channel:
                vPager.setCurrentItem(PAGE_ONE);
                break;
            case R.id.rb_message:
                vPager.setCurrentItem(PAGE_TWO);
                break;
            case R.id.rb_better:
                vPager.setCurrentItem(PAGE_THREE);
                break;
            case R.id.rb_setting:
                vPager.setCurrentItem(PAGE_FOUR);
                break;
        }
    }
//重写ViewPager页面切换的处理方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }
//state的状态有三个，0表示什么都没做，1正在滑动，2，滑动完毕
    @Override
    public void onPageScrollStateChanged(int state) {
        Log.d("1正在滑动", String.valueOf(state));
        if (state==2){
            switch (vPager.getCurrentItem()){
                case PAGE_ONE:
                    rb_change1.setChecked(true);
                    break;
                case PAGE_TWO:
                    rb_message.setChecked(true);
                    break;
                case PAGE_THREE:
                    rb_better.setChecked(true);
                    break;
                case PAGE_FOUR:
                    rb_setting.setChecked(true);
                    break;

            }
        }
    }

    public void Btn(View view) {
        Log.i("点击，点击，点击，点击", "");
    }
}

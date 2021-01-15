package com.lnjr.viewpapertext1;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.CharacterIterator;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class MainActivity extends AppCompatActivity {
    private ViewPager vp;
    private ListView listView;
    private List<Fragment>list;
//    private List<Item> items = new ArrayList<>();
    private FragmentAdapter adapter;
//    private ArrayAdapter adapter;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items();
//        adapter=new FragmentAdapter(MainActivity.this,R.layout.fruit_item,);
        vp = findViewById(R.id.vp);
        listView=findViewById(R.id.lv);
//        listView.setAdapter(adapter);
        initData();
        initEvent();
//        final List<View> viewList = new ArrayList<View>();//视图集合，用来装左右滑动的页面视图
//        final View view1 = getLayoutInflater().inflate(R.layout.item_base, null);
//        final View view2 = getLayoutInflater().inflate(R.layout.view_paper, null);
//        viewList.add(view1);
//        viewList.add(view2);

//        ListView listView2 = view2.findViewById(R.id.lv);
//
//        tv_title = view2.findViewById(R.id.tv_title);
//        tv_title.setText("TabLayout");
        //ViewPaper 设置适配器
//        vp.setAdapter(new FragmentAdapter(){
//            @Override
//            public int getCount() {
//                return list.size(); //这个方法是返回总共有几个滑动的页面（）
//            }
//
//            @Override
//            public boolean isViewFromObject(View view, Object object) {
//                return view == object;
//            }
//
//            @Override
//            public Object instantiateItem(ViewGroup container, int position) {
//                vp.addView(list.get(position));
//                return list.get(position);
//            }
//
//            @Override
//            public void destroyItem(ViewGroup container, int position, Object object) {
//                vp.removeView(list.get(position));
//            }
//        });
//        String[] data = {"a", "b", "c", "d", "a", "b", "c", "d", "a", "b", "c", "d", "a", "b", "c", "d"};
//        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);
//        listView2.setAdapter(adapter);
    }

    private void items() {
    }

    private void initData() {
        list=new ArrayList<>();
        list.add(new firstFragment());
        list.add(new SecondFragment());
        adapter=new FragmentAdapter(getSupportFragmentManager(),list);

        vp.setAdapter(adapter);

    }
    private void initEvent() {


    }

}
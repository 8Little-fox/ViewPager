package com.lnjr.viewpapertext1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    private List<Item> items=new ArrayList<>();
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_second,container,false);
//        final OkHttpClient okHttpClient = new OkHttpClient();
//        //构建请求对象
//        Request request = new Request.Builder()
//                .url("https://api.myjson.com/bins/jejb5")
//                .build();
//        okHttpClient.newCall(request).enqueue(new Callback() { //异步操作，网络请求不再主线程里执行，在子线程里
//            @Override
//            public void onFailure(Call call, IOException e) {
//                Log.d("错误", "onFailure:" + e.toString());
//            }
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                try {
//                    String data = response.body().string();
//                    JSONArray jsonArray = new JSONArray(data);
//                    for (int i = 0; i < jsonArray.length(); i++) {
//                        JSONObject json = jsonArray.getJSONObject(i);
//                        Item item = new Item();
//                        item.setName(json.getString("name"));
//                        item.setImg(json.getString("img"));
//                        item.setPrice(json.getString("price"));
//                        items.add(item);
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        });

        return view;
    }
}

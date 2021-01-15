package com.lnjr.viewpapertext1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by hcwd on 2019/10/9.
 */

public class ListMainAdapter extends ArrayAdapter<Item>{
    TextView nameTv;
    ImageView image;
    TextView price;
    private int resourceId;
    public ListMainAdapter(Context context, int resource,List<Item> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        Item item=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,null);
        nameTv=view.findViewById(R.id.nameTv);
        image=view.findViewById(R.id.image);
        price=view.findViewById(R.id.price);
        return view;
    }
}

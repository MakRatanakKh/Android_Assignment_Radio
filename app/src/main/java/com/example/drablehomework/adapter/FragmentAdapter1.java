package com.example.drablehomework.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drablehomework.R;
import com.example.drablehomework.model.ItemModel;

import java.util.List;

public class FragmentAdapter1 extends BaseAdapter {
    private Context context;
    private List<ItemModel> modelList;

    public FragmentAdapter1(Context context, List<ItemModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        ItemModel model = modelList.get(position);
        return model;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.item_listview, null);
        TextView textViewTitle = v.findViewById(R.id.tv_title);
        TextView textViewDesc = v.findViewById(R.id.tv_desc);
        ImageView imageView = v.findViewById(R.id.img_logo);

        ItemModel model = modelList.get(position);
        textViewTitle.setText(model.getTitle());
        textViewDesc.setText(model.getDescription());
        imageView.setImageResource(model.getImgID());

        return v;

    }
}

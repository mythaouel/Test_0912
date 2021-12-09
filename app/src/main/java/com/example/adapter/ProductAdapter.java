package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.model.Product;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    Activity context;
    int custom_list_view;
    List<Product> products;

    public ProductAdapter(Activity context, int custom_list_view, List<Product> products) {
        this.context = context;
        this.custom_list_view = custom_list_view;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get( i );
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            view = inflater.inflate( custom_list_view,null );


            view.setTag( holder );
        }else{
            holder = (ViewHolder) view.getTag();
        }
        return view;
    }

    private static class ViewHolder{

    }
}

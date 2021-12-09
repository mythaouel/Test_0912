package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.Product;
import com.example.test_0912.R;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    Activity context;
    int custom_item;
    List<Product> products;

    public ProductAdapter(Activity context, int custom_item, List<Product> products) {
        this.context = context;
        this.custom_item = custom_item;
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
            view = inflater.inflate( custom_item,null );

            holder.imvThumb = view.findViewById( R.id.imvThumb );
            holder.txtName = view.findViewById( R.id.txtName );
            holder.txtDes = view.findViewById( R.id.txtDes );
            holder.txtRating = view.findViewById( R.id.txtRating );
            holder.txtRatingNumber = view.findViewById( R.id.txtRatingNumber );

            view.setTag( holder );
        }else{
            holder = (ViewHolder) view.getTag();
        }
        Product p = products.get( i );
        holder.imvThumb.setImageResource(p.getPdThumb());
        holder.txtName.setText( p.getPdName() );
        holder.txtDes.setText( p.getPdDesciption() );
        holder.txtRating.setText( p.getPdRate() +"" );
        holder.txtRatingNumber.setText("(" + p.getPdCount() + ")");
        return view;
    }

    private static class ViewHolder{
        ImageView imvThumb;
        TextView  txtName, txtDes, txtRating, txtRatingNumber;
    }
}

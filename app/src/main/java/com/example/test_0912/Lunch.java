package com.example.test_0912;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.adapter.ProductAdapter;
import com.example.model.Product;

import java.util.ArrayList;

public class Lunch extends AppCompatActivity {

    ImageView imgBack;
    ListView lvProduct;
    ProductAdapter adapter;
    ArrayList<Product> productArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        linkViews();
        addEvents();
    }

    private void addEvents() {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lunch.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void linkViews() {
        imgBack = findViewById(R.id.imgback);
        lvProduct = findViewById(R.id.lvProduct);
        productArrayList = new ArrayList<>();
        adapter = new ProductAdapter(Lunch.this,
                R.layout.custom_item, productArrayList);
        lvProduct.setAdapter(adapter);
    }
}
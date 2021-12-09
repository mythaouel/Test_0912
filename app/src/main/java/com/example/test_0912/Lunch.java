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
        intData();
        loadData();
    }

    private void loadData() {
        adapter = new ProductAdapter(Lunch.this,
                R.layout.custom_item, productArrayList);
        lvProduct.setAdapter(adapter);
    }

    private void intData() {
        productArrayList = new ArrayList<>();
        productArrayList.add(new Product(R.drawable.lunch_com_tam_dai_dong,"Cơm Tấm Đại Đồng","38 Đường Số 17, P. Linh Trung, Q. Thủ Đức, Tp.HCM","Cơm Sườn",4.1,100));
        productArrayList.add(new Product(R.drawable.lunch_com_bd_quang_ngan,"Cơm Bình Dân Quang Ngân","130 Linh Trung, P. Linh Trung, Q. Thủ Đức, Tp.HCM","Cơm Gà Kho Xả Ớt",4.0,100));
        productArrayList.add(new Product(R.drawable.lunch_com_ga_to_vinh_dien,"Cơm Gà - Tô Vĩnh Diện","15 Tô Vĩnh Diện, P. Linh Chiểu, Q. Thủ Đức, Tp.HCM","Cơm Đùi Gà Chiên Nước Mắm",4.5,999));
        productArrayList.add(new Product(R.drawable.lunch_com_nieu_phuong_bac,"Cơm Niêu Phương Bắc","87 Hoàng Diệu 2, P. Linh Trung, Q. Thủ Đức, Tp.HCM","Cơm Đùi Gà Chiên Nước Mắm",4.0,100));
        productArrayList.add(new Product(R.drawable.lunch_com_tam_di_ba,"Cơm Tấm Dì Ba","197B Lê Văn Việt, P. Hiệp Phú, Q. 9, Tp.HCM","Cơm Sườn Muối Ớt",4.1,999));
        productArrayList.add(new Product(R.drawable.lunch_com_tam_phuc_loc_tho,"Cơm Tấm Phúc Lộc Thọ","31-33 Lê Văn Việt, Q. Thủ Đức, Tp.HCM","Cơm Sườn, Cơm Ba Rọi",4.5,999));
        productArrayList.add(new Product(R.drawable.lunch_shilin_com_ga,"Shilin - Cơm Gà","22 Đoàn Kết, P. Bình Thọ, Q. Thủ Đức, Tp.HCM","Gà Rán",4.4,999));
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


    }
}
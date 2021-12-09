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

public class Noodle extends AppCompatActivity {

    ImageView imgBack;
    ListView lvProduct1;
    ProductAdapter adapter;
    ArrayList<Product> productArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noodle);
        linkViews();
        addEvents();
        initData();
        loadData();
    }

    private void linkViews() {
        imgBack = findViewById(R.id.imgback);
        lvProduct1 = findViewById(R.id.lvProduct1);
    }

    private void initData() {
        productArrayList = new ArrayList<>();
        productArrayList.add(new Product(R.drawable.noodle_bun_dau_mam_tom,"Bún Đậu Mẹt Tre - Hoàng Diệu 2","177 Hoàng Diệu 2, P. Linh Trung, Q. Thủ Đức, Tp.HCM","Bún Đậu Tá Lả",4.0,499));
        productArrayList.add(new Product(R.drawable.noodle_bun_dau_tieu_muoi,"Bún Đậu Mắm Tôm Tiểu Muội","39 Hoàng Diệu 2, P. Linh Trung, Q. Thủ Đức, Tp.HCM","Bún Đậu Thập Cẩm",4.0,400));
        productArrayList.add(new Product(R.drawable.noodle_bun_di_7,"Bún Thịt Nướng Dì 7","25/1 Đường Số 19, P. Linh Chiểu, Q. Thủ Đức, Tp.HCM","Bún Thịt Nướng Đặc Biệt",4.0,300));
        productArrayList.add(new Product(R.drawable.noodle_bun_quay_phu_quoc,"Bún Quậy Phú Quốc - Hoàng Diệu 2","204A Hoàng Diệu 2, P. Linh Chiểu, Q. Thủ Đức, Tp.HCM","Bún Quậy Chả Tôm",4.6,200));
        productArrayList.add(new Product(R.drawable.noodle_dino_bun_cha_nha_trang,"Dino - Bún Chả Nha Trang","89 Hoàng Diệu 2, P. Linh Trung, Q. Thủ Đức, Tp.HCM","Bò Né",4.4,400));
        productArrayList.add(new Product(R.drawable.noodle_thao_ly_quan,"Thảo Ly Quán","29 Đường Số 16, P. Linh Chiểu, Q. Thủ Đức, Tp.HCM","Mì Xào Bò", 4.0,100));
        productArrayList.add(new Product(R.drawable.noodle_bun_dau_bun_cha,"Bún Đậu Bún Chả - Cô Hường","61 Hoàng Diệu 2, P. Linh Trung, Q. Thủ Đức, Tp.HCM","Bún Đậu Thịt Luộc",4.2,999));

    }
    private void loadData() {
        adapter = new ProductAdapter(Noodle.this, R.layout.custom_item, productArrayList);
        lvProduct1.setAdapter(adapter);
    }

    private void addEvents() {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Noodle.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
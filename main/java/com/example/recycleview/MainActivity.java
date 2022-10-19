package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcv_Category;
    private CategoryAdapter categoryAdapter;
    String[] danhGia = {"4.5","3.5","3.5","4.2","4.0","5.0"};
    String[] name = {"Áo khoác","Áo Polo", "Áo thun", "Quần jean", "Quần Tây", "Quần Short"};
    int[] img = {R.drawable.aokhoac,R.drawable.aopolo,R.drawable.aothun,R.drawable.quanjean,
            R.drawable.quantay,R.drawable.quanshort};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_Category = findViewById(R.id.rcv_Category);
        categoryAdapter = new CategoryAdapter(  this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcv_Category.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcv_Category.setAdapter(categoryAdapter);

    }

    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();

        List<Shop> mlist = new ArrayList<>();
        for (int i = 0; i<img.length;i++){
            Shop shop = new Shop(img[i],name[i],danhGia[i]);
            mlist.add(shop);
        }

        listCategory.add(new Category("Category 1",mlist));
        listCategory.add(new Category("Category 2",mlist));
        listCategory.add(new Category("Category 3",mlist));
        listCategory.add(new Category("Category 4",mlist));
        listCategory.add(new Category("Category 5",mlist));

        return listCategory;
    }


}
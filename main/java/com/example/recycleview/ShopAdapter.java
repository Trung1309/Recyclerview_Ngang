package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopHolder> {
    private List<Shop> mListShop;


    public void setData(List<Shop> list){
        this.mListShop = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ShopHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shop,parent,false);
        return new ShopHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopHolder holder, int position) {
        Shop shop = mListShop.get(position);
        if (shop == null){
            return;
        }
        holder.titleSP.setText(shop.getTitle());
        holder.imgSP.setImageResource(shop.getImage());
        holder.tv_danhGia.setText(shop.getDanhGia());
    }

    @Override
    public int getItemCount() {
        if (mListShop != null){
            return mListShop.size();
        }
        return 0;
    }

    public class ShopHolder extends RecyclerView.ViewHolder{

        private TextView titleSP;
        private ImageView imgSP;
        private TextView tv_danhGia;
        public ShopHolder(@NonNull View itemView) {
            super(itemView);
            titleSP = itemView.findViewById(R.id.txt_titleSP);
            imgSP = itemView.findViewById(R.id.img_itemSP);
            tv_danhGia = itemView.findViewById(R.id.danhGia);

        }
    }
}

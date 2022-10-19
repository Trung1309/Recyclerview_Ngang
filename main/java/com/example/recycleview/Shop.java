package com.example.recycleview;

public class Shop {
    private int image;
    private String title;
    private String danhGia;

    public Shop(int image, String title,String danhGia) {
        this.image = image;
        this.title = title;
        this.danhGia = danhGia;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }
}

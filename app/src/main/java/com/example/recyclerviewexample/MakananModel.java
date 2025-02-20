package com.example.recyclerviewexample;

public class MakananModel {
    private String namaMakanan;
    private String hargaMakanan;

    public MakananModel(String namaMakanan, String hargaMakanan){
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }
}

package com.example.recyclerviewexample;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterListMakanan.OnItemClickListener{

    RecyclerView rvListMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rvListMakanan = (RecyclerView) findViewById(R.id.rvListMakanan);
        rvListMakanan.setLayoutManager(new LinearLayoutManager(this));
        // prepare data arraylist
        ArrayList<MakananModel> dataMakanan = new ArrayList<>();
        dataMakanan.add(new MakananModel("Soto Ayam", "Rp.10.000"));
        dataMakanan.add(new MakananModel("Bubur Ayam", "Rp.10.000"));
        dataMakanan.add(new MakananModel("Ayam Bakar", "Rp.10.000"));
        dataMakanan.add(new MakananModel("Sate Ayam", "Rp.10.000"));

        // call adapter class
        AdapterListMakanan adapterListMakanan = new AdapterListMakanan(dataMakanan, this);
        rvListMakanan.setAdapter(adapterListMakanan);

    }

    @Override
    public void onItemClick(MakananModel makananModel) {
        Toast.makeText(this, makananModel.getNamaMakanan(), Toast.LENGTH_SHORT).show();
    }
}
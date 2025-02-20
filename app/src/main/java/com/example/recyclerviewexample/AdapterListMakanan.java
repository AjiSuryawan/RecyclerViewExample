package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdapterListMakanan extends RecyclerView.Adapter<AdapterListMakanan.ListMakananViewHolder>{
    ArrayList<MakananModel> listMakananModel;
    // add lister object
    private final OnItemClickListener listener;

    // add interface
    public interface OnItemClickListener {
        void onItemClick(MakananModel makananModel);
    }

    // konstruktor add parameternya
    public AdapterListMakanan(ArrayList<MakananModel> listMakananModel , OnItemClickListener listener){
        this.listMakananModel = listMakananModel;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ListMakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ListMakananViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListMakananViewHolder holder, int position) {
        MakananModel makananModel = this.listMakananModel.get(position);
        // position 1 : bubur ayam
        holder.tvNamaMakanan.setText(makananModel.getNamaMakanan());
        holder.tvHargaMakanan.setText(makananModel.getHargaMakanan());
        // add action per item
        holder.itemView.setOnClickListener(v -> listener.onItemClick(makananModel));
    }

    @Override
    public int getItemCount() {
        return this.listMakananModel.size();
    }

    public static class ListMakananViewHolder extends RecyclerView.ViewHolder {

        TextView tvNamaMakanan;
        TextView tvHargaMakanan;

        public ListMakananViewHolder(View view) {
            super(view);
            tvNamaMakanan = (TextView) view.findViewById(R.id.tvNamaMakanan);
            tvHargaMakanan = (TextView) view.findViewById(R.id.tvHargaMakanan);

        }
    }

}
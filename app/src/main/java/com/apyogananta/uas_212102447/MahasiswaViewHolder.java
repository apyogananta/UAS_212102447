package com.apyogananta.uas_212102447;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaViewHolder extends RecyclerView.ViewHolder
{


    public TextView _jkTextView, _jpTextView, _namaTextView, _nimTextView, _noTextView;

    public MahasiswaViewHolder(@NonNull View itemView) {
        super(itemView);


        _jkTextView = itemView.findViewById(R.id.jkTextView);
        _jpTextView = itemView.findViewById(R.id.jpTextView);
        _noTextView = itemView.findViewById(R.id.noTextView);
        _namaTextView = itemView.findViewById(R.id.namaTextView);
        _nimTextView = itemView.findViewById(R.id.nimTextView);
    }
}
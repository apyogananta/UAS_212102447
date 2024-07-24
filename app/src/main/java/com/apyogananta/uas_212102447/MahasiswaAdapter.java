package com.apyogananta.uas_212102447;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaViewHolder>
{
    private List<MahasiswaModel> _mahasiswaModelList;

    public MahasiswaAdapter(List<MahasiswaModel> mahasiswaModelList)
    {
        this._mahasiswaModelList = mahasiswaModelList;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.list_mahasiswa, parent, false);
        return new MahasiswaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        int no = position + 1;

        MahasiswaModel mm = _mahasiswaModelList.get(position);


        holder._nimTextView.setText(mm.getNIM());
        holder._namaTextView.setText(mm.getNama());
        holder._jkTextView.setText(mm.getJenisKelamin());
    }

    @Override
    public int getItemCount() {
        int count = (_mahasiswaModelList !=null) ? _mahasiswaModelList.size() : 0;
        return count;
    }


}

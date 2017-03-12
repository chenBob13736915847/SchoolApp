package com.example.chen.schoolapp.curriculum;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chen.schoolapp.app.Myapplication;
import com.example.chen.schoolapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by chen on 2017/3/10.
 */

public class TdAdapter extends RecyclerView.Adapter<TdAdapter.ViewHolder> {


    private String[] data = {"Android","Java","Python"};

    private LayoutInflater mLayoutInflater;

    public TdAdapter(){

        mLayoutInflater = LayoutInflater.from(Myapplication.getContext());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mLayoutInflater.inflate(R.layout.item_tdtable,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.className.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.image_view)
        ImageView classImage;
        @Bind(R.id.text_view)
        TextView className;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}

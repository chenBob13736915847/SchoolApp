package com.example.chen.schoolapp.curriculum;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chen.schoolapp.R;

import butterknife.Bind;


/**
 * Created by chen on 2017/3/6.
 */

public class TodayCumFragment extends Fragment {

    @Bind(R.id.tdTableList)
    RecyclerView tdList;

    private TdAdapter tdAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        /**
         * 适配
         */
        View rootView = inflater.inflate(R.layout.fragment_tdtable,container,false);
        tdList = (RecyclerView) rootView.findViewById(R.id.tdTableList);
        tdAdapter = new TdAdapter();
        tdList.setAdapter(tdAdapter);
        tdList.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}

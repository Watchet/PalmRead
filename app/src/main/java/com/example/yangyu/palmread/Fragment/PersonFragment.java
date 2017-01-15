package com.example.yangyu.palmread.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yangyu.palmread.Base.BaseFragment;
import com.example.yangyu.palmread.R;

/**
 * Created by yangyu on 2017/1/9.
 */

public class PersonFragment extends BaseFragment {
    public static final String TAG =PersonFragment.class.getCanonicalName();
    private View mLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mLayout=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_person,container,false);
        return mLayout;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}
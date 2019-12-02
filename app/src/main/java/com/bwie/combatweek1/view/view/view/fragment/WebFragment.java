package com.bwie.combatweek1.view.view.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bwie.combatweek1.R;
import com.bwie.combatweek1.view.view.base.BaseFragment;
import com.bwie.combatweek1.view.view.view.activity.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class WebFragment extends BaseFragment {

    private Button button;

    @Override
    protected void initView(View inflate) {
        button = inflate.findViewById(R.id.bt);

    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_web;
    }

    @Override
    protected void initData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            MainActivity mainActivity=(MainActivity) getActivity();
            mainActivity.Data();
            }
        });
    }

}

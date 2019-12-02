package com.bwie.combatweek1.view.view.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwie.combatweek1.R;
import com.bwie.combatweek1.view.view.base.BaseFragment;
import com.bwie.combatweek1.view.view.utile.NetUtile;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment {

    private TextView textView;
    private ImageView imageView;

    @Override
    protected void initView(View inflate) {
        textView = inflate.findViewById(R.id.tv_one);
        imageView = inflate.findViewById(R.id.iv_one);
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initData() {
        if (NetUtile.getInstance().hasNet(getActivity())){
            textView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);

        }else {
            textView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
        }
    }

}

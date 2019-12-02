package com.bwie.combatweek1.view.view.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/*
 *@auther:王彦敏
 *@Date: 2019/12/2
 *@Time:14:05
 *@Description:
 * */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        initView();
        initData();

    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int layoutId();
}

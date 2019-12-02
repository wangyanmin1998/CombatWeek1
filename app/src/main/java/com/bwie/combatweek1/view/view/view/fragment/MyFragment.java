package com.bwie.combatweek1.view.view.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.bwie.combatweek1.R;
import com.bwie.combatweek1.view.view.base.BaseFragment;
import com.bwie.combatweek1.view.view.contract.IMyContract;
import com.bwie.combatweek1.view.view.model.EatBean;
import com.bwie.combatweek1.view.view.presenter.MyPresenter;
import com.bwie.combatweek1.view.view.view.adapter.MyAdapter;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment implements IMyContract.IView {

    private GridView gridView;

    @Override
    protected void initView(View inflate) {
        gridView = inflate.findViewById(R.id.gv);
    }

    @Override
    protected int layoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initData() {
        MyPresenter myPresenter = new MyPresenter();
        myPresenter.getData(this);

    }

    @Override
    public void onMySuccess(EatBean eatBean) {
        Toast.makeText(getActivity(), "成功"+eatBean.toString(), Toast.LENGTH_SHORT).show();
        List<EatBean.DataBean> data = eatBean.getData();
        gridView.setAdapter(new MyAdapter(data));
    }

    @Override
    public void onMyFailure(Throwable throwable) {
        Toast.makeText(getActivity(), "失败"+throwable.toString(), Toast.LENGTH_SHORT).show();
    }
}

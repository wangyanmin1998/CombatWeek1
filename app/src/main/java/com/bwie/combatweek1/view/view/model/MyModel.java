package com.bwie.combatweek1.view.view.model;

import com.bwie.combatweek1.view.view.contract.IMyContract;
import com.bwie.combatweek1.view.view.utile.NetUtile;
import com.google.gson.Gson;

/*
 *@auther:王彦敏
 *@Date: 2019/12/2
 *@Time:14:30
 *@Description:
 * */
public class MyModel {
    public void getMyData(final IMyContract.IModelCallBack iModelCallBack){
        NetUtile.getInstance().getData("http://blog.zhaoliang5156.cn/api/shop/shop1.json", new NetUtile.MyCallBack() {
            @Override
            public void onGetJson(String json) {
                Gson gson = new Gson();
                EatBean eatBean = gson.fromJson(json, EatBean.class);
                iModelCallBack.onMySuccess(eatBean);
            }

            @Override
            public void onError(Throwable throwable) {
                iModelCallBack.onMyFailure(throwable);
            }
        });

    }
}

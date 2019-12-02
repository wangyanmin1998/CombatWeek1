package com.bwie.combatweek1.view.view.presenter;

import com.bwie.combatweek1.view.view.contract.IMyContract;
import com.bwie.combatweek1.view.view.model.EatBean;
import com.bwie.combatweek1.view.view.model.MyModel;

/*
 *@auther:王彦敏
 *@Date: 2019/12/2
 *@Time:14:30
 *@Description:
 * */
public class MyPresenter {

    private MyModel myModel;

    public void getData(final IMyContract.IView iView){
        myModel = new MyModel();
        myModel.getMyData(new IMyContract.IModelCallBack() {
            @Override
            public void onMySuccess(EatBean eatBean) {
                iView.onMySuccess(eatBean);
            }

            @Override
            public void onMyFailure(Throwable throwable) {
                iView.onMyFailure(throwable);
            }
        });
    }
}

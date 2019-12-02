package com.bwie.combatweek1.view.view.contract;

import com.bwie.combatweek1.view.view.model.EatBean;

/*
 *@auther:王彦敏
 *@Date: 2019/12/2
 *@Time:14:30
 *@Description:
 * */
public interface IMyContract {
    interface IView{
        void  onMySuccess(EatBean eatBean);
        void  onMyFailure(Throwable throwable);
    }
    interface IModelCallBack{
        void  onMySuccess(EatBean eatBean);
        void  onMyFailure(Throwable throwable);
    }

}

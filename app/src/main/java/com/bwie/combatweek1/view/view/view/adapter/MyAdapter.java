package com.bwie.combatweek1.view.view.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwie.combatweek1.R;
import com.bwie.combatweek1.view.view.model.EatBean;
import com.bwie.combatweek1.view.view.utile.NetUtile;

import java.util.List;

/*
 *@auther:王彦敏
 *@Date: 2019/12/2
 *@Time:15:17
 *@Description:
 * */
public class MyAdapter extends BaseAdapter {
    List<EatBean.DataBean> list;
    public MyAdapter(List<EatBean.DataBean> list) {
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView=View.inflate(parent.getContext(), R.layout.item,null);
            holder=new ViewHolder();
            holder.tv_name=convertView.findViewById(R.id.tv_name);
            holder.iv_tu=convertView.findViewById(R.id.iv_tu);
            convertView.setTag(holder);

        }else {

            holder= (ViewHolder) convertView.getTag();
        }
        EatBean.DataBean dataBean = list.get(position);
        String goods_name = dataBean.getGoods_name();
        holder.tv_name.setText(goods_name);
        NetUtile.getInstance().getPhoto(dataBean.getGoods_thumb(),holder.iv_tu);

        return convertView;
    }

    private class ViewHolder{
        TextView tv_name;
        ImageView iv_tu;

    }
}

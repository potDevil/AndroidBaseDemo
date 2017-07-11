package com.example.fuzhihuangcom.androidbasedemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.fuzhihuangcom.androidbasedemo.presenter.JumpTermInterface;
import com.example.fuzhihuangcom.androidbasedemo.R;

import java.util.List;

/**
 * Created by fuzhihuang.com on 2017/4/18.
 */

public class ListViewAdapter<T> extends BaseAdapter {

    private Context mContext;
    private List<T> mList;
    JumpTermInterface mJumpTermInterface;

    public ListViewAdapter(Context context, List<T> list) {
        mContext = context;
        mList = list;
    }

    public void setJumpTermInterface(JumpTermInterface jumpTermInterface) {
        mJumpTermInterface = jumpTermInterface;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.adapter_list_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tv.setText(mList.get(position) + "");
        viewHolder.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    // 开启隐式意图
                    mJumpTermInterface.openImplicitIntent();
                } else if(position == 1) {
                    // 开启监听网络变化广播
                    mJumpTermInterface.openNetListening();
                } else if(position == 2) {
                    // 开启自定义广播发送
                    mJumpTermInterface.openCustomBroadcast();
                } else if(position == 3) {
                    // 开启服务
                    mJumpTermInterface.openService();
                }
            }
        });
        return convertView;
    }

    // view容器
    public class ViewHolder {
        TextView tv;

        public ViewHolder(View view) {
            tv = (TextView) view.findViewById(R.id.tv);
        }
    }
}

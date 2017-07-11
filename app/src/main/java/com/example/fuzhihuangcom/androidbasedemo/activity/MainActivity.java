package com.example.fuzhihuangcom.androidbasedemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.fuzhihuangcom.androidbasedemo.presenter.JumpTermInterface;
import com.example.fuzhihuangcom.androidbasedemo.adapter.ListViewAdapter;
import com.example.fuzhihuangcom.androidbasedemo.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JumpTermInterface {

    private ListView mLv;
    private ListViewAdapter mListViewAdapter;
    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLv = (ListView) this.findViewById(R.id.lv);

        mListViewAdapter = new ListViewAdapter(MainActivity.this, getList());
        mListViewAdapter.setJumpTermInterface(this);
        mLv.setAdapter(mListViewAdapter);
        //Button bt = (Button) this.findViewById(R.id.bt);
        //bt.setOnClickListener(this);
    }

    public List<String> getList() {

        mList.add("拨打电话");
        mList.add("网络广播监听");
        mList.add("自定义广播发送");
        mList.add("模拟开启服务");

        return mList;
    }

    // 开启隐式意图
    @Override
    public void openImplicitIntent() {
        Intent intent = new Intent("com.example.activitytest.ACTION_START");
        startActivity(intent);
    }

    // 开启监听网络变化广播
    @Override
    public void openNetListening() {
        Intent intent = new Intent(this, BroadcastActivity.class);
        startActivity(intent);
    }

    // 开启自定义广播发送
    @Override
    public void openCustomBroadcast() {
        Intent intent = new Intent(this, CustomActivity.class);
        startActivity(intent);
    }

    // 开启服务
    @Override
    public void openService() {
        Intent intent = new Intent(this, ServiceActivity.class);
        startActivity(intent);
    }

}

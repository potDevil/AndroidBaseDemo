package com.example.fuzhihuangcom.androidbasedemo.presenter;

/**
 * Created by fuzhihuang.com on 2017/4/18.
 * 界面跳转接口
 */

public interface JumpTermInterface {
    // 开启隐式意图
    void openImplicitIntent();
    // 开启监听网络变化广播
    void openNetListening();
    // 开启自定义广播发送
    void openCustomBroadcast();
    // 开启服务
    void openService();
}

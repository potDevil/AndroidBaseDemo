package com.example.fuzhihuangcom.androidbasedemo.broadCastRecevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by fuzhihuang.com on 2017/4/19.
 * 自定义广播接收者，然后再去清单文件注册intent-filter
 */

public class CustomBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "接收一条自定义广播", Toast.LENGTH_SHORT).show();
    }
}

package com.example.fuzhihuangcom.androidbasedemo.broadCastRecevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by fuzhihuang.com on 2017/4/18.
 * 动态注册网络状态改变的广播接收者
 */

public class NetworkChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // 系统服务类 专门管理网络连接
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isAvailable())
            Toast.makeText(context, "网络可用", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(context, "网络不可用", Toast.LENGTH_SHORT).show();
    }
}

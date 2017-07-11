package com.example.fuzhihuangcom.androidbasedemo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("MyService", "创建");
    }

    // 每次在服务启动的时候调用，如果我们希望服务一旦启动就去执行某个动作，那么就用这个方法
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("MyService" , "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("MyService" , "销毁");
    }
}

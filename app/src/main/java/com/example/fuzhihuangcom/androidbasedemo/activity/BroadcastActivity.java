package com.example.fuzhihuangcom.androidbasedemo.activity;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.fuzhihuangcom.androidbasedemo.R;
import com.example.fuzhihuangcom.androidbasedemo.broadCastRecevier.NetworkChangeReceiver;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by fuzhihuang.com on 2017/4/18.
 */

public class BroadcastActivity extends Activity {

    private IntentFilter mIntentFilter;
    NetworkChangeReceiver mNetworkChangeReceiver;
    private NetworkChangeReceiver mNetworkChangeReceiver1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
        mIntentFilter = new IntentFilter();
        mIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        mNetworkChangeReceiver = new NetworkChangeReceiver();
        registerReceiver(mNetworkChangeReceiver, mIntentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mNetworkChangeReceiver1);
    }

    /**
     * 水果名称注解
     * @author peida
     *
     */
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface FruitName {
        String value() default "";
    }

    class Apple {
        @FruitName("apple")
        private String appleName;
    }
}

package com.example.fuzhihuangcom.androidbasedemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.fuzhihuangcom.androidbasedemo.R;

/**
 * Created by fuzhihuang.com on 2017/4/19.
 * 自定义广播发送
 */

public class CustomActivity extends AppCompatActivity {

    private Button mBt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        mBt = (Button) findViewById(R.id.bt);

        mBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.pot.CUSTOM_BROADCAST");
                sendBroadcast(intent);
            }
        });
    }

}

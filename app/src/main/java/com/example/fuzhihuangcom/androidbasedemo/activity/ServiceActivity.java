package com.example.fuzhihuangcom.androidbasedemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.fuzhihuangcom.androidbasedemo.R;
import com.example.fuzhihuangcom.androidbasedemo.service.MyService;

/**
 * Created by fuzhihuang.com on 2017/4/19.
 */

public class ServiceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        Button bt1 = (Button) findViewById(R.id.start_service);
        Button bt2 = (Button) findViewById(R.id.stop_service);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(ServiceActivity.this, MyService.class);
                startService(startIntent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stopIntent = new Intent(ServiceActivity.this, MyService.class);
                stopService(stopIntent);
            }
        });
    }
}

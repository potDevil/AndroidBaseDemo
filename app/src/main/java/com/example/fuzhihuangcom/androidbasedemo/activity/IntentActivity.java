package com.example.fuzhihuangcom.androidbasedemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.fuzhihuangcom.androidbasedemo.R;

/**
 * Created by fuzhihuang.com on 2017/4/18.
 */

public class IntentActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        Button bt = (Button) this.findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // intent.setData(Uri.parse("http://www.baidu.com"));
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });
    }
}

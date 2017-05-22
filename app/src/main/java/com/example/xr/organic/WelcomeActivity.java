package com.example.xr.organic;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Xr on 5/22/2017.
 * 实现欢迎界面
 */

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.welcome_layout);

        ImageView welcomeImageView = (ImageView) findViewById(R.id.iv_welcome);
        //TODO: Change the image file of Welcome Activity in Glide.load()
        Glide.with(this).load(R.drawable.organic9).crossFade().centerCrop().into(welcomeImageView);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                WelcomeActivity.this.finish();
            }
        }, 1500);//载入延迟1500ms
    }
}

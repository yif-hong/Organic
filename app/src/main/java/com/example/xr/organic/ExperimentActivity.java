package com.example.xr.organic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import static com.bumptech.glide.Glide.with;

public class ExperimentActivity extends AppCompatActivity {
    public static final String EXPERIMENT_NAME = "experiment_name";

    public static final String EXPERIMENT_IMAGE_ID = "experiment_image_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);
        Intent intent = getIntent();
        String experimentName = intent.getStringExtra(EXPERIMENT_NAME);
        int experimentImageId = intent.getIntExtra(EXPERIMENT_IMAGE_ID, 0);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_experiment);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id
                .collapsing_toolbar);
        ImageView experimentImageView = (ImageView) findViewById(R.id.experiment_image_view);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbarLayout.setTitle(experimentName);
        with(this).load(experimentImageId).into(experimentImageView);

        //以下ImageView为实验内容图片，使用Glide加载jpg和gif

        ImageView iv_experiment_1_1 = (ImageView) findViewById(R.id.iv_experiment_1_1);
        Glide.with(this).load(R.drawable.iv_experiment_1_1).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_1);

        ImageView iv_experiment_1_2 = (ImageView) findViewById(R.id.iv_experiment_1_2);
        Glide.with(this).load(R.drawable.iv_experiment_1_2).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_2);

        ImageView iv_experiment_1_3 = (ImageView) findViewById(R.id.iv_experiment_1_3);
        Glide.with(this).load(R.drawable.iv_experiment_1_3).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_3);

        ImageView iv_experiment_1_4 = (ImageView) findViewById(R.id.iv_experiment_1_4);
        Glide.with(this).load(R.drawable.iv_experiment_1_4).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_4);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

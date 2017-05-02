package com.example.xr.organic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ExperimentActivity extends AppCompatActivity {
    public static final String EXPERIMENT_NAME = "experiment_name";

    public static final String EXPERIMENT_IMAGE_ID = "experiment_image_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);
        Intent intent = getIntent();
        String experimentName = intent.getStringExtra(EXPERIMENT_NAME);
        int experimentImageId = intent.getIntExtra(EXPERIMENT_IMAGE_ID,0);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_experiment);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        ImageView experimentImageView = (ImageView) findViewById(R.id.experiment_image_view);
        TextView experimentContentText = (TextView) findViewById(R.id.experiment_content_text);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbarLayout.setTitle(experimentName);
        Glide.with(this).load(experimentImageId).into(experimentImageView);
        String experimentContent = initsExperimentContent(experimentName);
        experimentContentText.setText(experimentContent);
    }

    private String initsExperimentContent(String experimentName){
        //初始化每个实验的内容，暂时未写!
        StringBuilder experimentContent = new StringBuilder();
        for (int i=0;i<1000;i++) {
            experimentContent.append(experimentName);
        }
        return experimentContent.toString();
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

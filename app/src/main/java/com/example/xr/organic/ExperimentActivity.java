package com.example.xr.organic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.xr.organic.fragment.ExperimentFragment1;

import static com.example.xr.organic.assist.ExperimentAssist.getExperiments;

public class ExperimentActivity extends AppCompatActivity {

    public static final String EXPERIMENT_NAME = "experiment_name";
    public static final String EXPERIMENT_IMAGE_ID = "experiment_image_id";
    private static final String TAG = "ExperimentActivity";
    private String experimentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);
        Intent intent = getIntent();
        experimentName = intent.getStringExtra(EXPERIMENT_NAME);
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
        Glide.with(this).load(experimentImageId).into(experimentImageView);
        loadFragment();
    }

    //载入fragment
    private void loadFragment() {
        Log.d(TAG, "loadFragment: 判断中");
        if (experimentName.equals(getExperiments(0).getName())) {
            replaceFragment(new ExperimentFragment1());
            Log.d(TAG, "loadFragment: 载入fragment1:" + getExperiments(0).getName());
        } else {
            Log.d(TAG, "loadFragment: 无对应fragment");
        }
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

    //交替载入fragment
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content_fragment_layout, fragment);
        transaction.commit();
    }
}

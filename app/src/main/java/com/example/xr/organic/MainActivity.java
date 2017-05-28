package com.example.xr.organic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.xr.organic.asset.Experiment;
import com.example.xr.organic.asset.ExperimentAsset;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final static int EXPERIMENTS_AMOUNT = 10;//总实验数量
    private List<Experiment> experimentList = new ArrayList<>();
    private ExperimentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        initsExperimentList();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new ExperimentAdapter(experimentList);
        recyclerView.setAdapter(adapter);
    }

    private void initsExperimentList() {
        experimentList.clear();
        for (int i = 0; i < EXPERIMENTS_AMOUNT; i++) {
            experimentList.add(ExperimentAsset.getExperiments(i));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.call_teacher:
                Intent intent = new Intent(Intent.ACTION_DIAL);
                //TODO: Change "10086" to teacher's telephone
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
                break;
        }
        return true;
    }
}

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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Experiment[] experiments = {
            new Experiment("熔点测定", R.drawable.organic1),
            new Experiment("蒸馏及沸点测定", R.drawable.organic2),
            new Experiment("乙酰苯胺的制备", R.drawable.organic3),
            new Experiment("乙酸正丁酯的制备", R.drawable.organic4),
            new Experiment("正溴丁烷的制备", R.drawable.organic5),
            new Experiment("正丁基苯基醚的制备", R.drawable.organic6),
            new Experiment("肉桂酸的制备", R.drawable.organic7),
            new Experiment("苯甲酸苯甲醇的制备", R.drawable.organic8),
            new Experiment("从茶叶中提取咖啡因", R.drawable.organic9),
            new Experiment("从菠菜中提取叶绿素", R.drawable.organic10)
    };
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
        for (int i = 0; i < experiments.length; i++) {
            experimentList.add(experiments[i]);
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
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
                break;
        }
        return true;
    }
}

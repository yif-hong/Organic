package com.example.xr.organic.assist;

import com.example.xr.organic.R;

/**
 * Created by Xr on 5/22/2017.
 */

public class ExperimentAssist {
    //返回主页面 实验项目，与Experiment Adapter相匹配
    public static Experiment getExperiments(int i) {
        Experiment[] experiments = {
                new Experiment("实验一：熔点测定", R.drawable.organic1),
                new Experiment("实验二：蒸馏及沸点测定", R.drawable.organic2),
                new Experiment("实验三：乙酰苯胺的制备", R.drawable.organic3),
                new Experiment("实验四：乙酸正丁酯的制备", R.drawable.organic4),
                new Experiment("实验五：正溴丁烷的制备", R.drawable.organic5),
                new Experiment("实验六：正丁基苯基醚的制备", R.drawable.organic6),
                new Experiment("实验七：肉桂酸的制备", R.drawable.organic7),
                new Experiment("实验八：苯甲酸苯甲醇的制备", R.drawable.organic8),
                new Experiment("实验九：从茶叶中提取咖啡因", R.drawable.organic9),
                new Experiment("实验十：从菠菜中提取叶绿素", R.drawable.organic10)
        };
        return experiments[i];
    }
}

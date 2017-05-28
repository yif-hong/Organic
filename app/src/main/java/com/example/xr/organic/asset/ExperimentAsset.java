package com.example.xr.organic.asset;

import android.util.Log;
import android.widget.Button;

import com.example.xr.organic.R;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;

/**
 * Created by Xr on 5/22/2017.
 */

public class ExperimentAsset {
    //返回主页面 实验项目，与Experiment Adapter相匹配
    public static Experiment getExperiments(int i) {
        Experiment[] experiments = {
                new Experiment("实验一：熔点测定", R.drawable.iv_experiment_1_11),
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

    //设置按钮显示答案answer
    public static void showAnswer(Button button, String answer) {
        button.setText(answer);
        button.setTextSize(20);
        Log.d(TAG, "showAnswer: done");
    }

    //还原按钮
    public static void returnButton(Button button) {
        button.setText("显示答案");
        button.setTextSize(20);
        Log.d(TAG, "returnButton: done");
    }
}

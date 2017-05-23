package com.example.xr.organic.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.xr.organic.R;

/**
 * Created by Xr on 5/23/2017.
 */

public class ExperimentFragment1 extends Fragment {

    private static final String TAG = "ExperimentFragment1";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.exp_frag_1, container, false);
        Log.d(TAG, "onCreateView: 载入fragment");


        ImageView iv_experiment_1_1 = (ImageView) view.findViewById(R.id.iv_experiment_1_1);
        Glide.with(this).load(R.drawable.iv_experiment_1_1).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_1);

        ImageView iv_experiment_1_2 = (ImageView) view.findViewById(R.id.iv_experiment_1_2);
        Glide.with(this).load(R.drawable.iv_experiment_1_2).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_2);

        ImageView iv_experiment_1_3 = (ImageView) view.findViewById(R.id.iv_experiment_1_3);
        Glide.with(this).load(R.drawable.iv_experiment_1_3).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_3);

        ImageView iv_experiment_1_4 = (ImageView) view.findViewById(R.id.iv_experiment_1_4);
        Glide.with(this).load(R.drawable.iv_experiment_1_4).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_4);


        return view;

    }

}

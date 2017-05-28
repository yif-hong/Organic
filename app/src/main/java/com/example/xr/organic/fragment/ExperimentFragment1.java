package com.example.xr.organic.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.xr.organic.R;

import static com.example.xr.organic.asset.ExperimentAsset.returnButton;
import static com.example.xr.organic.asset.ExperimentAsset.showAnswer;

/**
 * Created by Xr on 5/23/2017.
 */

public class ExperimentFragment1 extends Fragment {
    private static final String TAG = "ExperimentFragment1";
    private Button btnExp1;
    private boolean clickedDone;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.exp_frag_1, container, false);
        Log.d(TAG, "onCreateView: 载入fragment");

        btnExp1 = (Button) view.findViewById(R.id.btn_exp1_show_answer);
        returnButton(btnExp1);
        clickedDone = true;

        btnExp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickedDone) {
                    showAnswer(btnExp1, "1:A\n2:E、F；A、B、C");
                    clickedDone = false;
                } else {
                    returnButton(btnExp1);
                    clickedDone = true;
                }
                Log.d(TAG, "onClick: done");
            }
        });
        loadPictures(view);

        return view;

    }

    private void loadPictures(View view) {
        ImageView iv_experiment_1_1 = (ImageView) view.findViewById(R.id.iv_experiment_1_1);
        Glide.with(this).load(R.drawable.iv_experiment_1_1).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_1);

        ImageView iv_experiment_1_2 = (ImageView) view.findViewById(R.id.iv_experiment_1_2);
        Glide.with(this).load(R.drawable.iv_experiment_1_2).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_2);

        ImageView iv_experiment_1_3 = (ImageView) view.findViewById(R.id.iv_experiment_1_3);
        Glide.with(this).load(R.drawable.iv_experiment_1_3).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_3);

        ImageView iv_experiment_1_4 = (ImageView) view.findViewById(R.id.iv_experiment_1_4);
        Glide.with(this).load(R.drawable.iv_experiment_1_4).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_4);

        ImageView iv_experiment_1_5 = (ImageView) view.findViewById(R.id.iv_experiment_1_5);
        Glide.with(this).load(R.drawable.iv_experiment_1_5).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_5);

        ImageView iv_experiment_1_6 = (ImageView) view.findViewById(R.id.iv_experiment_1_6);
        Glide.with(this).load(R.drawable.iv_experiment_1_6).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_6);

        ImageView iv_experiment_1_7 = (ImageView) view.findViewById(R.id.iv_experiment_1_7);
        Glide.with(this).load(R.drawable.iv_experiment_1_7).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_7);

        ImageView iv_experiment_1_8 = (ImageView) view.findViewById(R.id.iv_experiment_1_8);
        Glide.with(this).load(R.drawable.iv_experiment_1_8).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_8);

        ImageView iv_experiment_1_9 = (ImageView) view.findViewById(R.id.iv_experiment_1_9);
        Glide.with(this).load(R.drawable.iv_experiment_1_9).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_9);

        ImageView iv_experiment_1_10 = (ImageView) view.findViewById(R.id.iv_experiment_1_10);
        Glide.with(this).load(R.drawable.iv_experiment_1_10).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_10);

        ImageView iv_experiment_1_11 = (ImageView) view.findViewById(R.id.iv_experiment_1_11);
        Glide.with(this).load(R.drawable.iv_experiment_1_11).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_11);

        ImageView iv_experiment_1_12 = (ImageView) view.findViewById(R.id.iv_experiment_1_12);
        Glide.with(this).load(R.drawable.iv_experiment_1_12).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_12);

        ImageView iv_experiment_1_13 = (ImageView) view.findViewById(R.id.iv_experiment_1_13);
        Glide.with(this).load(R.drawable.iv_experiment_1_13).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_13);

        ImageView iv_experiment_1_14 = (ImageView) view.findViewById(R.id.iv_experiment_1_14);
        Glide.with(this).load(R.drawable.iv_experiment_1_14).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_14);

        ImageView iv_experiment_1_15 = (ImageView) view.findViewById(R.id.iv_experiment_1_15);
        Glide.with(this).load(R.drawable.iv_experiment_1_15).placeholder(R.drawable.loading).crossFade().into(iv_experiment_1_15);
    }


}

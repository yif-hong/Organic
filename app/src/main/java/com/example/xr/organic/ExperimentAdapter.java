package com.example.xr.organic;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.xr.organic.asset.Experiment;

import java.util.List;

/**
 * Created by jk on 2017/5/2.
 */

public class ExperimentAdapter extends RecyclerView.Adapter<ExperimentAdapter.ViewHolder> {
    private Context mContext;
    private List<Experiment> mExperimentList;

    public ExperimentAdapter(List<Experiment> experimentList) {
        mExperimentList = experimentList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext == null) {
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.experiment_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=holder.getAdapterPosition();
                Experiment experiment = mExperimentList.get(position);
                Intent intent = new Intent(mContext, ExperimentActivity.class);
                intent.putExtra(ExperimentActivity.EXPERIMENT_NAME, experiment.getName());
                intent.putExtra(ExperimentActivity.EXPERIMENT_IMAGE_ID, experiment.getImageId());
                mContext.startActivity(intent);
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Experiment experiment = mExperimentList.get(position);
        holder.experimentName.setText(experiment.getName());
        Glide.with(mContext).load(experiment.getImageId()).into(holder.experimentImage);
    }

    @Override
    public int getItemCount() {
        return mExperimentList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView experimentImage;
        TextView experimentName;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            experimentImage = (ImageView) itemView.findViewById(R.id.experiment_image);
            experimentName = (TextView) itemView.findViewById(R.id.experiment_name);
        }
    }


}

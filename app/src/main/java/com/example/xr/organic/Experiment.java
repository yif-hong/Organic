package com.example.xr.organic;

/**
 * Created by jk on 2017/5/2.
 */

public class Experiment {
    private String name;
    private  int imageId;

    public Experiment(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}

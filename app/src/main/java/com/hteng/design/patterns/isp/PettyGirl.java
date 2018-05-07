package com.hteng.design.patterns.isp;

import android.util.Log;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {

    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        Log.d("JimmyZhang", name + "---脸蛋很漂亮");
    }

    @Override
    public void greatTemperament() {
        Log.d("JimmyZhang", name + "---气质非常好");
    }

    @Override
    public void niceFigure() {
        Log.d("JimmyZhang", name + "---身材非常棒");
    }
}

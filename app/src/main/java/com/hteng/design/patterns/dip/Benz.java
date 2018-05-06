package com.hteng.design.patterns.dip;

import android.util.Log;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

public class Benz implements ICar {

    @Override
    public void run() {
        Log.d("JimmyZhang", "奔驰汽车开始运行...");
    }
}

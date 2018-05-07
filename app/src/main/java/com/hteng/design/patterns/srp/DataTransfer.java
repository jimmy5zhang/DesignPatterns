package com.hteng.design.patterns.srp;

import android.util.Log;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class DataTransfer implements IDataTransfer {

    IConnectionManager cm;

    DataTransfer(IConnectionManager cm) {
        this.cm = cm;
    }

    @Override
    public void chat(Object o) {
        Log.d("JimmyZhang", "通话");
    }
}

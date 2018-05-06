package com.hteng.design.patterns.srp;

import android.util.Log;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

public class ConnectionManager implements IConnectionManager {

    @Override
    public void dial(String phoneNumber) {
        Log.d("JimmyZhang", "拨打电话");
    }

    @Override
    public void hangup() {
        Log.d("JimmyZhang", "挂断电话");
    }
}

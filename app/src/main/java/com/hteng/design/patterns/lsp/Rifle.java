package com.hteng.design.patterns.lsp;

import android.util.Log;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class Rifle extends AbstractGun {

    @Override
    void shoot() {
        Log.i("JimmyZhang", "步枪射击...");
    }
}

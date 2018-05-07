package com.hteng.design.patterns.lsp;

import android.util.Log;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class Handgun extends AbstractGun {

    @Override
    void shoot() {
        Log.i("JimmyZhang", "手枪射击...");
    }
}

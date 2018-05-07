package com.hteng.design.patterns.lsp;

import android.util.Log;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class ToyGun extends AbstractGun {

    @Override
    void shoot() {
        Log.i("JimmyZhang", "玩具枪射击...");
    }
}

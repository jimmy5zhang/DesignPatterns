package com.hteng.design.patterns.lsp;

import android.util.Log;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

public class MachineGun extends AbstractGun {

    @Override
    void shoot() {
        Log.i("JimmyZhang", "机枪扫射...");
    }
}

package com.hteng.design.patterns.lod;

import android.util.Log;

import java.util.List;

/**
 * Created by jimmyzhang on 2018/5/7.
 */

class GroupLeader {

    private List<Girl> listGirls;

    public GroupLeader(List<Girl> listGirls) {
        this.listGirls = listGirls;
    }

    public void countGirls() {
        Log.d("JimmyZhang", "女生的数量:" + listGirls.size());
    }
}

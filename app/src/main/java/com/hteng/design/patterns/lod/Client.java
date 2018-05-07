package com.hteng.design.patterns.lod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jimmyzhang on 2018/5/7.
 */

class Client {

    public static void main(String args) throws IOException {
        List<Girl> listGirls = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        Teacher teacher = new Teacher();
        GroupLeader groupLeader = new GroupLeader(listGirls);
        teacher.commond(groupLeader);
    }
}

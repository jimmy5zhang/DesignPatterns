package com.hteng.design.patterns.dip;

import java.io.IOException;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class Client {

    public static void main(String[] args) throws IOException {
        IDriver zhangsan = new Driver();
        ICar benz = new Benz();
        zhangsan.drive(benz);
    }
}

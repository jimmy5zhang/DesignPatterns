package com.hteng.design.patterns.srp;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

public interface IConnectionManager {

    void dial(String phoneNumber); // 拨打电话

    void hangup(); // 挂断电话
}

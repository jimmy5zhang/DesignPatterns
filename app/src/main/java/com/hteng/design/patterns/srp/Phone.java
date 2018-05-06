package com.hteng.design.patterns.srp;

import android.util.Log;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

public class Phone {

    DataTransfer dataTransfer;

    public void setDataTransfer(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
    }

    public void dial(String phoneNumber) {
        dataTransfer.cm.dial(phoneNumber);
    }

    public void hangup() {
        dataTransfer.cm.hangup();
    }

    public void chat(Object o) {
        dataTransfer.chat(o);
    }
}

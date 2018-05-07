package com.hteng.design.patterns.srp;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class Phone {

    DataTransfer dataTransfer;

    void setDataTransfer(DataTransfer dataTransfer) {
        this.dataTransfer = dataTransfer;
    }

    void dial(String phoneNumber) {
        dataTransfer.cm.dial(phoneNumber);
    }

    void hangup() {
        dataTransfer.cm.hangup();
    }

    void chat(Object o) {
        dataTransfer.chat(o);
    }
}

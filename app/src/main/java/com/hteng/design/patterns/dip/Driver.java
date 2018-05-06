package com.hteng.design.patterns.dip;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

public class Driver implements IDriver {

    @Override
    public void drive(ICar car) {
        car.run();
    }
}
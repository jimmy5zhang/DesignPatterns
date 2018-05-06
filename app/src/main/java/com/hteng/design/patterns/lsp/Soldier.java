package com.hteng.design.patterns.lsp;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

public class Soldier {

    AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        gun.shoot();
    }
}

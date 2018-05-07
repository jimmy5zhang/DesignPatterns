package com.hteng.design.patterns.lsp;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class Soldier {

    AbstractGun gun;

    void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    void killEnemy() {
        gun.shoot();
    }
}

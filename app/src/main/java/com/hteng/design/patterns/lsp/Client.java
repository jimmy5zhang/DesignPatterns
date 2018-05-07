package com.hteng.design.patterns.lsp;

import java.io.IOException;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class Client {

    public static void main(String[] args) throws IOException {
        Soldier soldier = new Soldier();
        AbstractGun gun = new MachineGun();
        soldier.setGun(gun);
        soldier.killEnemy();
    }
}

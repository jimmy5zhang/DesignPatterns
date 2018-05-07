package com.hteng.design.patterns.isp;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class Searcher extends AbstractSearcher {

    public PettyGirl pettyGirl;

    public Searcher(PettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    @Override
    void show() {
        pettyGirl.goodLooking();
        pettyGirl.niceFigure();
        pettyGirl.greatTemperament();
    }
}

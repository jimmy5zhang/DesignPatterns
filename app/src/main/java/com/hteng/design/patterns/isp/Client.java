package com.hteng.design.patterns.isp;

import java.io.IOException;

/**
 * Created by jimmyzhang on 2018/5/6.
 */

class Client {

    public static void main(String[] args) throws IOException {
        PettyGirl pettyGirl = new PettyGirl("景甜");
        AbstractSearcher searcher = new Searcher(pettyGirl);
        searcher.show();
    }
}

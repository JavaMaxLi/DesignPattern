package com.example.demo.design.easyFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 16:51
 */
public class EasyFactoryTest {
    public static void main(String[] args) {
        Car bc = CarFactory.getCar("bc");
        Car bm = CarFactory.getCar("bm");
        bc.run();
        bc.stop();
        bm.run();
        bm.stop();
    }
}

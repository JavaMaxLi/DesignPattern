package com.example.demo.design.easyFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 16:51
 */
public class CarFactory {
    public static Car getCar(String type) {
        Car car = null;
        if ("bc".equals(type)) {
            car = new BenC();
        } else if ("bm".equals(type)){
            car = new BaoM();
        }
        return car;
    }
}

package com.example.demo.design.easyFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 16:50
 */
public class BenC implements Car{
    @Override
    public void run() {
        System.out.println("奔驰车正在开。。。");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车停止了。。。");
    }
}

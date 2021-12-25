package com.example.demo.design.abstractFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 15:45
 */
public class XiaoMiPhone implements IPhoneProduct{
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("小米手机发短信");
    }
}

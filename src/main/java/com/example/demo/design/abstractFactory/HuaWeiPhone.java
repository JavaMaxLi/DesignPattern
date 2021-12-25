package com.example.demo.design.abstractFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 15:47
 */
public class HuaWeiPhone implements IPhoneProduct{
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("华为手机发短信");
    }
}

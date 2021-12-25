package com.example.demo.design.abstractFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 15:49
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        SuperFactory huawei = new HuaWeiFactory();
        IPhoneProduct hwPhone = huawei.phoneProduct();
        hwPhone.call();
        hwPhone.sendSms();
        IRouteProduct hwRoute = huawei.routeProduct();
        hwRoute.setting();
        hwRoute.openWiFi();
        System.out.println("=========================================");
        SuperFactory xiaomi = new HuaWeiFactory();
        IPhoneProduct xmphone = xiaomi.phoneProduct();
        xmphone.call();
        xmphone.sendSms();
        IRouteProduct xmroute = xiaomi.routeProduct();
        xmroute.setting();
        xmroute.openWiFi();
    }
}

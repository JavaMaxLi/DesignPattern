package com.example.demo.design.abstractFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 15:46
 */
public class XiaoMiRoute implements IRouteProduct {
    @Override
    public void openWiFi() {
        System.out.println("小米路由器打开WIFI");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置密码");
    }
}

package com.example.demo.design.abstractFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 15:48
 */
public class HuaWeiRoute implements IRouteProduct {
    @Override
    public void openWiFi() {
        System.out.println("华为路由器打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置密码");
    }
}

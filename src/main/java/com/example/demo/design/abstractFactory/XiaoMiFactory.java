package com.example.demo.design.abstractFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 15:44
 */
public class XiaoMiFactory implements SuperFactory{
    @Override
    public IPhoneProduct phoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouteProduct routeProduct() {
        return new XiaoMiRoute();
    }
}

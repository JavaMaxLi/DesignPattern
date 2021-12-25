package com.example.demo.design.abstractFactory;

/**
 * @author LiXiaoFeng
 * @date 2021年12月25日 15:42
 */
public interface SuperFactory {
    IPhoneProduct phoneProduct();

    IRouteProduct routeProduct();
}

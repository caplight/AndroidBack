package com.caplight.android.service;

import com.caplight.android.entity.Product;
import com.caplight.android.entity.Shopcart;

import java.util.List;

public interface ShopCartService {
    List<Shopcart> findUserCart(int userId);
    void updateShopCart(Shopcart shopcart);
    void deleteShopCart(Shopcart shopcart);
    void insertShopCart(Shopcart shopcart);
}

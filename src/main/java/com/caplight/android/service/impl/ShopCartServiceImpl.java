package com.caplight.android.service.impl;

import com.caplight.android.dao.ShopCartDao;
import com.caplight.android.entity.Product;
import com.caplight.android.entity.Shopcart;
import com.caplight.android.service.ShopCartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("shopCartService")
public class ShopCartServiceImpl implements ShopCartService {
    @Resource
    private ShopCartDao shopCartDao;

    @Override
    public List<Shopcart> findUserCart(int userId) {
        return shopCartDao.findUserCart(userId);
    }

    @Override
    public void deleteShopCart(Shopcart shopcart) {
        shopCartDao.deleteShopCart(shopcart);
    }

    @Override
    public void insertShopCart(Shopcart shopcart) {
        shopCartDao.insertShopCart(shopcart);
    }

    @Override
    public void updateShopCart(Shopcart shopcart) {
        shopCartDao.updateShopCart(shopcart);
    }
}

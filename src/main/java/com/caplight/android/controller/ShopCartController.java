package com.caplight.android.controller;

import com.caplight.android.entity.Product;
import com.caplight.android.entity.Shopcart;
import com.caplight.android.service.ShopCartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ShopCart)表控制层
 *
 * @author makejava
 * @since 2019-11-26 00:27:20
 */
@RestController
@RequestMapping("/shopCart")
public class ShopCartController {
    /**
     * 服务对象
     */
    @Resource
    private ShopCartService shopcartService;
    @RequestMapping("/findUserCart")
    public List<Shopcart> findUserCart(int id){
        return shopcartService.findUserCart(id);
    }
    @RequestMapping("/updateShopCart")
    public void updateShopCart(Shopcart shopcart){
        shopcartService.updateShopCart(shopcart);
    }
    @RequestMapping("/deleteShopCart")
    public void deleteShopCart(Shopcart shopcart){
        shopcartService.deleteShopCart(shopcart);
    }
    @RequestMapping("/insertShopCart")
    public void insertShopCart(Shopcart shopcart){
        shopcartService.deleteShopCart(shopcart);
    }
}

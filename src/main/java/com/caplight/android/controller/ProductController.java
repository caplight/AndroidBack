package com.caplight.android.controller;

import com.caplight.android.entity.Product;
import com.caplight.android.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

/**
 * (Product)表控制层
 *
 * @author makejava
 * @since 2019-11-20 10:39:11
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;

    @RequestMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }
}
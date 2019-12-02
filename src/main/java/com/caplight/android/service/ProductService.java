package com.caplight.android.service;

import com.caplight.android.entity.Product;

import java.util.List;

/**
 * (Product)表服务接口
 *
 * @author makejava
 * @since 2019-11-20 10:39:11
 */
public interface ProductService {
    List<Product> findAll();

}
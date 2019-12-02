package com.caplight.android.service.impl;

import com.caplight.android.dao.ProductDao;
import com.caplight.android.entity.Product;
import com.caplight.android.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Product)表服务实现类
 *
 * @author makejava
 * @since 2019-11-20 10:39:11
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;

    public  List<Product> findAll(){return productDao.findAll();}

}
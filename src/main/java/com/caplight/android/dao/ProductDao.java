package com.caplight.android.dao;

import com.caplight.android.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * (Product)表数据库访问层
 *
 * @author makejava
 * @since 2019-11-20 10:39:11
 */

@Mapper
public interface ProductDao {

    @Select("select * from product")
    List<Product> findAll();

}
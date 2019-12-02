package com.caplight.android.dao;

import com.caplight.android.entity.Shopcart;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShopCartDao {
    @Select("select * from shopCart where userId=#{arg0} ")
    List<Shopcart> findUserCart(int userId);
    @Update("update shopCart set proNum = ${pronum} WHERE userId = ${userid} and proId=${proid} ")
    void updateShopCart(Shopcart shopcart);
    @Delete("delete from shopCart where userId = ${userid} and proId=${proid}")
    void deleteShopCart(Shopcart shopcart);
    @Insert("insert into shopCart values(${proid},${proname},${proprice},${proimg},${userid},${pronum}")
    void insertShopCart(Shopcart shopcart);
}

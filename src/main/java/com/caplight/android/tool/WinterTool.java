package com.caplight.android.tool;


import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

public class WinterTool {
    public  WinterTool() {
    }
    public String getWinter(){

        String host = "http://freecityid.market.alicloudapi.com";
        String path = "/whapi/json/alicityweather/briefcondition";
        String method = "POST";
        String appcode = "07059f08d0544c4e9085446108c56aa7";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        //增城区
        bodys.put("cityId", "889");
        //bodys.put("token", "46e13b7aab9bb77ee3358c3b672a2ae4");
        String Result="";
        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            //System.out.println(response.toString());
            //获取response的body
            Result=EntityUtils.toString(response.getEntity());
            System.out.println(EntityUtils.toString(response.getEntity()));
            //JSONObject jsonObject= JSONObject.parseObject(EntityUtils.toString(response.getEntity()));
            //JSONArray jsonArray=jsonObject.getJSONArray("data");
            //System.out.println(jsonArray.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result;
    }


}

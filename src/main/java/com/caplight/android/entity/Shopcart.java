package com.caplight.android.entity;

import java.io.Serializable;

/**
 * (Shopcart)实体类
 *
 * @author makejava
 * @since 2019-11-26 01:44:09
 */
public class Shopcart implements Serializable {
    private static final long serialVersionUID = -45101979114246022L;

    private Integer proid;

    private String proname;

    private Integer proprice;

    private String proimg;

    private Integer userid;

    private Integer pronum;


    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public Integer getProprice() {
        return proprice;
    }

    public void setProprice(Integer proprice) {
        this.proprice = proprice;
    }

    public String getProimg() {
        return proimg;
    }

    public void setProimg(String proimg) {
        this.proimg = proimg;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPronum() {
        return pronum;
    }

    public void setPronum(Integer pronum) {
        this.pronum = pronum;
    }

}

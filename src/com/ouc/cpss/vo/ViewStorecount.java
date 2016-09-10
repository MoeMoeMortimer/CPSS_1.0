/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 库存查询的实体类
 * @author su
 */
public class ViewStorecount {
    Integer proid;
    String proname;
    String type;
    Integer nowcount;
    Integer safecount;
    BigDecimal sugpurchase;
    BigDecimal sugsell;
    Date lastpurdate;    //最近采购日期
    Date lastseldate;    //最近销售日期
    
    public ViewStorecount() {
	super();
    }

    public ViewStorecount(Integer proid, String proname, String type,Integer nowcount, Integer safecount,
	BigDecimal sugpurchase, Date lastpurdate, BigDecimal sugsell, Date lastseldate) {
	super();
	this.proid = proid;
	this.proname = proname;
        this.type = type;
	this.nowcount = nowcount;
	this.safecount = safecount;
	this.sugpurchase = sugpurchase;
	this.sugsell = sugsell;
	this.lastpurdate = lastpurdate;
	this.lastseldate = lastseldate;
    }

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
    
    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public Integer getNowcount() {
	return nowcount;
    }

    public void setNowcount(Integer nowcount) {
	this.nowcount = nowcount;
    }

    public Integer getSafecount() {
	return safecount;
    }

    public void setSafecount(Integer safecount) {
	this.safecount = safecount;
    }

    public BigDecimal getSugpurchase() {
	return sugpurchase;
    }

    public void setSugpurchase(BigDecimal sugpurchase) {
	this.sugpurchase = sugpurchase;
    }
    public BigDecimal getSugsell() {
        return sugsell;
    }

    public void setSugsell(BigDecimal sugsell) {
        this.sugsell = sugsell;
    }

    public Date getLastpurdate() {
	return lastpurdate;
    }

    public void setLastpurdate(Date lastpurdate) {
	this.lastpurdate = lastpurdate;
    }

    public Date getLastseldate() {
        return lastseldate;
    }

    public void setLastseldate(Date lastseldate) {
	this.lastseldate = lastseldate;
    }

		@Override
    public String toString() {
	return "ViewStorecount [proid=" + proid + ", proname=" + proname + ",type=" + type + ", nowcount=" + nowcount + ", safecount="
		+ safecount + ", sugpurchase=" + sugpurchase + ", sugsell=" + sugsell + ", lastpurdate="
		+ lastpurdate + ", lastseldate=" + lastseldate + "]";
	}
    
}

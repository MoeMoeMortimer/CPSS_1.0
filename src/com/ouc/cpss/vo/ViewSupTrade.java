/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.vo;

import java.math.BigDecimal;


/**
 * 供应商交易信息视图实体类
 * @author su
 */
public class ViewSupTrade {
    /**select supname,proname,
sum(purcount)as tatalcount,
sum(purcount*purprice) as purtotal 
from view_purchase 
where purdate between '2016-9-1' and '2016-9-9'
GROUP BY supname,proname;
* */
    
    private String supname;
    private String proname;
    private Integer totalcount;
    private BigDecimal purtotal;
    public ViewSupTrade( String supname, String proname, Integer totalcount, BigDecimal purtotal) {
        super();
	this.supname = supname;
	this.proname = proname;
	this.totalcount = totalcount;
	this.purtotal = purtotal;
}
    public ViewSupTrade() {
	super();
    }
    
    public String getSupname() {
	return supname;
    }
    public void setSupname(String supname) {
	this.supname = supname;
    }
    public String getProname() {
	return proname;
    }
    public void setProname(String proname) {
	this.proname = proname;
    }
    public Integer getTotalcount() {
	return totalcount;
    }
    public void setTotalcount(Integer totalcount) {
	this.totalcount = totalcount;
    }
    public BigDecimal getPurtotal() {
	return purtotal;
    }
    public void setPurtotal(BigDecimal purtotal) {
	this.purtotal = purtotal;
    }
    
	@Override
    public String toString() {
	return "ViewSupTrade [supname=" + supname + ", proname=" + proname + ", totalcount="
			+ totalcount + ", purtotal=" + purtotal + "]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.vo;

/**
 *
 * @author LIUYIYU
 */
import java.math.BigDecimal;
import java.sql.Date;

public class ViewPurReturn {
    //prtid, proname, type, supname, prtprice, prtcount, prtdate
	private Integer prtid;
	private String proname;
	private String type;
	private String supname;
	private BigDecimal prtprice;
	private Integer prtcount;
	private Date prtdate;
	public ViewPurReturn() {
		super();
	}
	public ViewPurReturn(Integer prtid, String proname, String type, String supname, BigDecimal prtprice,
			Integer prtcount, Date prtdate) {
		super();
		this.prtid = prtid;
		this.proname = proname;
		this.type = type;
		this.supname = supname;
		this.prtprice = prtprice;
		this.prtcount = prtcount;
		this.prtdate = prtdate;
	}
	public Integer getPrtid() {
		return prtid;
	}
	public void setPrtid(Integer prtid) {
		this.prtid = prtid;
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
	public String getSupname() {
		return supname;
	}
	public void setSupname(String supname) {
		this.supname = supname;
	}
	public BigDecimal getPrtprice() {
		return prtprice;
	}
	public void setPrtprice(BigDecimal prtprice) {
		this.prtprice = prtprice;
	}
	public Integer getPrtcount() {
		return prtcount;
	}
	public void setPrtcount(Integer prtcount) {
		this.prtcount = prtcount;
	}
	public Date getPrtdate() {
		return prtdate;
	}
	public void setPrtdate(Date prtdate) {
		this.prtdate = prtdate;
	}
	@Override
	public String toString() {
		return "ViewPurReturn [prtid=" + prtid + ", proname=" + proname + ", type=" + type + ", supname=" + supname
				+ ", prtprice=" + prtprice + ", prtcount=" + prtcount + ", prtdate=" + prtdate + "]";
	}

}

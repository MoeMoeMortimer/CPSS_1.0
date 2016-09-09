/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.po;

/**
 *
 * @author LIUYIYU
 */
import java.math.BigDecimal;
import java.sql.Date;

public class ViewSelReturn {
    //srtid, proname, type, cusname, srtprice, srtcount, srtdate
	private Integer srtid;
	private String proname;
	private String type;
	private String cusname;
	private BigDecimal srtprice;
	private Integer srtcount;
	private Date srtdate;
	public ViewSelReturn() {
		super();
	}
	public ViewSelReturn(Integer srtid, String proname, String type, String cusname, BigDecimal srtprice,
			Integer srtcount, Date srtdate) {
		super();
		this.srtid = srtid;
		this.proname = proname;
		this.type = type;
		this.cusname = cusname;
		this.srtprice = srtprice;
		this.srtcount = srtcount;
		this.srtdate = srtdate;
	}
	public Integer getSrtid() {
		return srtid;
	}
	public void setSrtid(Integer srtid) {
		this.srtid = srtid;
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
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public BigDecimal getSrtprice() {
		return srtprice;
	}
	public void setSrtprice(BigDecimal srtprice) {
		this.srtprice = srtprice;
	}
	public Integer getSrtcount() {
		return srtcount;
	}
	public void setSrtcount(Integer srtcount) {
		this.srtcount = srtcount;
	}
	public Date getSrtdate() {
		return srtdate;
	}
	public void setSrtdate(Date srtdate) {
		this.srtdate = srtdate;
	}
	@Override
	public String toString() {
		return "ViewSelReturn [srtid=" + srtid + ", proname=" + proname + ", type=" + type + ", cusname=" + cusname
				+ ", srtprice=" + srtprice + ", srtcount=" + srtcount + ", srtdate=" + srtdate + "]";
	}
}

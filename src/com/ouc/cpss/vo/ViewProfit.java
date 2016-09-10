/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.vo;

import java.math.BigDecimal;

/**
 *
 * @author su
 */
public class ViewProfit {
    private BigDecimal totalprofit;
	private Integer themonth;
	public ViewProfit() {
		super();
	}
	public ViewProfit(BigDecimal totalprofit, Integer themonth) {
		super();
		this.totalprofit = totalprofit;
		this.themonth = themonth;
	}
	public BigDecimal getTotalprofit() {
		return totalprofit;
	}
	public void setTotalprofit(BigDecimal totalprofit) {
		this.totalprofit = totalprofit;
	}
	public Integer getThemonth() {
		return themonth;
	}
	public void setThemonth(Integer themonth) {
		this.themonth = themonth;
	}
	@Override
	public String toString() {
		return "ViewProfit [totalprofit=" + totalprofit + ", themonth=" + themonth + "]";
	}
	
}

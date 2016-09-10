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

public class ViewPurchase {

    private int purid;
    private int proid;
    private String proname;
    private String type;
    private int nowcount;
    private int supid;
    private String supname;
    private int purcount;
    private BigDecimal purprice;
    private Date purdate;

    public ViewPurchase() {
        super();
    }

    public ViewPurchase(int purid, int proid, int supid, int nowcount, String proname, String type, String supname,
            int purcount, BigDecimal purprice, Date purdate) {
        super();
        this.purid = purid;
        this.proid = proid;
        this.supid = supid;
        this.nowcount = nowcount;
        this.proname = proname;
        this.type = type;
        this.supname = supname;
        this.purcount = purcount;
        this.purprice = purprice;
        this.purdate = purdate;
    }

    public int getPurid() {
        return purid;
    }

    public void setPurid(int purid) {
        this.purid = purid;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public int getSupid() {
        return supid;
    }

    public void setSupid(int supid) {
        this.supid = supid;
    }

    public int getNowcount() {
        return nowcount;
    }

    public void setNowcount(int nowcount) {
        this.nowcount = nowcount;
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

    public int getPurcount() {
        return purcount;
    }

    public void setPurcount(int purcount) {
        this.purcount = purcount;
    }

    public BigDecimal getPurprice() {
        return purprice;
    }

    public void setPurprice(BigDecimal purprice) {
        this.purprice = purprice;
    }

    public Date getPurdate() {
        return purdate;
    }

    public void setPurdate(Date purdate) {
        this.purdate = purdate;
    }

    @Override
    public String toString() {
        return "ViewPurchase [purid=" + purid + ", proid=" + proid + ", supid=" + supid + ", nowcount=" + nowcount
                + ", proname=" + proname + ", type=" + type + ", supname=" + supname + ", purcount=" + purcount
                + ", purprice=" + purprice + ", purdate=" + purdate + "]";
    }

}

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

public class ViewSell {
    private Integer selid;
    private String  proname;
    private String  type;
    private Integer selcount;
    private BigDecimal selprice;
    private String ename;
    private String cusname;
    private Date seldate;
    
    public ViewSell(){
        
    }

    public ViewSell(Integer selid, String proname, String type, Integer selcount, BigDecimal selprice, String ename, String cusname, Date seldate) {
        this.selid = selid;
        this.proname = proname;
        this.type = type;
        this.selcount = selcount;
        this.selprice = selprice;
        this.ename = ename;
        this.cusname = cusname;
        this.seldate = seldate;
    }

    public Integer getSelid() {
        return selid;
    }

    public String getProname() {
        return proname;
    }

    public String getType() {
        return type;
    }

    public Integer getSelcount() {
        return selcount;
    }

    public BigDecimal getSelprice() {
        return selprice;
    }

    public String getEname() {
        return ename;
    }

    public String getCusname() {
        return cusname;
    }

    public Date getSeldate() {
        return seldate;
    }

    public void setSelid(Integer selid) {
        this.selid = selid;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSelcount(Integer selcount) {
        this.selcount = selcount;
    }

    public void setSelprice(BigDecimal selprice) {
        this.selprice = selprice;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public void setSeldate(Date seldate) {
        this.seldate = seldate;
    }

    @Override
    public String toString() {
        return "ViewSell{" + "selid=" + selid + ", proname=" + proname + ", type=" + type + ", selcount=" + selcount + ", selprice=" + selprice + ", ename=" + ename + ", cusname=" + cusname + ", seldate=" + seldate + '}';
    }
    
    
    
}



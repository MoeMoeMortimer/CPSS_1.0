/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.po;

/**
 *
 * @author 晨晨
 */
public class Employee {
	private Integer empid;
	private String ename;
	private char esex;
	private Integer eage;
	private String etel;
	private String eaddr;
	private String position;	//老板、销售员、采购员
	private int choose;	//0对应老板，1对应销售员，2对应采购员
	public Employee() {
		super();
	}
	public Employee(Integer empid, String ename, char esex, Integer eage, String etel, String eaddr, String position,
			int choose) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esex = esex;
		this.eage = eage;
		this.etel = etel;
		this.eaddr = eaddr;
		this.position = position;
                this.choose = choose;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public char getEsex() {
		return esex;
	}
	public void setEsex(char esex) {
		this.esex = esex;
	}
	public Integer getEage() {
		return eage;
	}
	public void setEage(Integer eage) {
		this.eage = eage;
	}
	public String getEtel() {
		return etel;
	}
	public void setEtel(String etel) {
		this.etel = etel;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getChoose() {
		return choose;
	}
	public void setChoose(int choose) {
		this.choose = choose;
	}
        
	@Override
	public String toString() {
		return "员工编号：" + empid + ", 员工姓名：" + ename + ", 员工性别：" + esex 
				+ ", 员工年龄：" + eage + ", 员工电话：" + etel
				+ ", 员工住址：" + eaddr + ", 员工岗位：" + position ;
	}    
}

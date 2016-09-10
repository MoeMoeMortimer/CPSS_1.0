/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.EmployeeDao;
import com.ouc.cpss.vo.ViewEmp;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ViewEmpBizImpl implements ViewEmpBiz{
    EmployeeDao edao = new EmployeeDao();
    public List<ViewEmp> findByCondition(String start, String end, String conditions) {
        String sql = "select empid,ename,selid,proname,type,selcount,selprice,selcount*selprice as totalprice"
                + " from view_emp where seldate between ? and ? ";
	Object[] params = {start,end};
        if (conditions != null && conditions.length() > 0) {
            sql += " and concat(ename,proname,type) like '%" + conditions + "%'";
         }
        return edao.query(sql, ViewEmp.class,params);
        
    
    }
}

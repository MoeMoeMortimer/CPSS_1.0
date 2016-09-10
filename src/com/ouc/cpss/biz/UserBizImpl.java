/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.UserDao;
import com.ouc.cpss.po.User;
import java.util.List;

/**
 *
 * @author 晨晨
 */
public class UserBizImpl implements UserBiz {
        //引入Dao
	UserDao udao = new UserDao();
        //增加用户
	public boolean add(User u) {
		String sql = "insert into users values(?,?,?,?,?,?,?,?,?)";
		Object[] params = {null,u.getUsname(),u.getPswd(),u.getRealname(),u.getIdnumber(),u.getUstel(),
                        u.getUsemail(),u.getPosition(),1};
		return udao.update(sql, params);
	}
        
        //修改密码
	public boolean update(User u) {
		String sql = "update users set pswd=? where usname=?";
		Object[] params = {u.getPswd(),u.getUsname()};
		return udao.update(sql, params);
	}

        //查询用户名是否已存在
	public User findByUsname(String usname) {
		String sql = "select * from users where usname=?";
		Object[] params = {usname};
		return (User) udao.get(sql, User.class, params);
	}

    //登录
//    public User userlogin(String usname, String pswd) {
//        String sql = "select * from user where state =1 and usname = ? and pswd = ?";
//        Object[] params = {usname,pswd};
//        return (User) udao.get(sql, User.class, params);
//    }




    
    
}

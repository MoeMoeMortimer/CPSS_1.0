/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.dao.UserDao;
import com.ouc.cpss.po.User;

/**
 *
 * @author LIUYIYU
 */
public class UserBizImpl implements UserBiz{
    UserDao udao = new UserDao();
    @Override
    public User userLogin(String username, String password) {
        String sql = "select * from user where state = 1 and username = ? and password = ?";
        Object[] params = {username, password};
        return (User) udao.get(sql, User.class, params);
    }
    
}

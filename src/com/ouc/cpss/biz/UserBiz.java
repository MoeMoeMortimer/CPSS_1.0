/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.biz;

import com.ouc.cpss.po.User;

/**
 *
 * @author LIUYIYU
 */
public interface UserBiz {
    public User userLogin(String username, String password);
}

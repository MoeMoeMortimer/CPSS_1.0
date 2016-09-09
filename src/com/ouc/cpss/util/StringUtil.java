/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.util;

/**
 * 验证字符串的格式
 * @author ziyue
 */

public class StringUtil {
    // 1 非空验证
    public static boolean checkLength(String s){
        if(s.length() == 0){
            return false;
        }else{
            return true;
        }
    }
    
    // 2 数字验证
    public static boolean checkDigit(String s){
        String regex = "^[0-9]+$";
        if(s.matches(regex)){
            return true;
        }else{
            return false;
        }      
    }
    
    // 3 小数验证
    public static boolean checkDecimal(String s){
        String regex = "^([0-9]*.[0-9]+)|([0-9]+)$";
        if(s.matches(regex)){
            return true;
        }else{
            return false;
        }      
    }
    
}

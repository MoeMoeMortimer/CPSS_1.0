/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.util;

import com.ouc.cpss.vo.ViewEmp;
import com.ouc.cpss.vo.ViewSell;
import java.io.File;
import java.io.IOException;
import java.util.List;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.ScriptStyle;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Administrator
 */
public class ExportEmpProExcel {
    //打印商品销售信息
    public static void printSale(List<ViewEmp> list,File file){
          //1 ============设定表列名
            String empid = "销售员编号";
            String ename= "销售员姓名";
            String selid = "销售信息编号";
            String proname = "商品名称";
            String type = "商品类型";
            String selcount = "销售数量";
            String selprice = "销售单价";
            String totalprice = "销售总金额";
           try {
                //2==============创建excel文件并设置数据显示格式
                WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
                WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
                sheet1.setColumnView(0,15); //设置某一列的宽度
                sheet1.setRowView(0,500); //设置某一行的高度
                //设置第一行第二列的高度和宽度
                sheet1.setColumnView(1, 20);
                sheet1.setColumnView(2, 25);
                sheet1.setColumnView(3, 40);
                sheet1.setColumnView(4, 20);
                sheet1.setColumnView(5, 20);
                sheet1.setColumnView(6, 20);
                sheet1.setColumnView(7, 30);
                
                //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
                //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
                WritableFont font = new WritableFont(WritableFont.TIMES, 15, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.RED, ScriptStyle.NORMAL_SCRIPT); 
                WritableFont font1 = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
                
                WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中
                WritableCellFormat format1 = new WritableCellFormat(font1);
                
                format1.setAlignment(Alignment.CENTRE); //对齐方式的设定
                format.setAlignment(Alignment.CENTRE); //对齐方式的设定
              
              
               //3 ============设置第一行为列名,并添加列名
               //写入字符串，确定位置（列，行）、内容和格式
               //列，行，内容，格式
               Label labelEmpid= new Label(0, 0, empid, format); 
               Label labelEname = new Label(1, 0, ename, format);
               Label labelSelid = new Label(2, 0,selid, format);
               Label labelProname= new Label(3, 0, proname, format);
               Label labelType= new Label(4, 0, type, format); 
               Label labelSelcount = new Label(5, 0, selcount, format);
               Label labelSelprice = new Label(6, 0,selprice, format);
               Label labelTotalprice= new Label(7, 0, totalprice, format);
               //添加列名 才添加进去
              sheet1.addCell(labelEmpid); //sheet对象添加文本的数据类型为Label
              sheet1.addCell(labelEname);
              sheet1.addCell(labelSelid);
              sheet1.addCell(labelProname);
              sheet1.addCell(labelType);
              sheet1.addCell(labelSelcount);
              sheet1.addCell(labelSelprice);
              sheet1.addCell(labelTotalprice);
              
              //4 =====================取出List集合中的的内容，放到Excel中
               int row = list.size();//获取集合的长度作为表格的行数
               for (int i = 0; i < row; i++) {
                      //获取每一行数据，从第一行开始，第0行是标题
                      //列， 行， 内容 ，格式
                      Label empid1 = new Label(0, i+1, list.get(i).getEmpid().toString(), format1);
                      Label ename1 = new Label(1, i+1, list.get(i).getEname(), format1);
                      Label selid1 = new Label(2, i+1, list.get(i).getSelid().toString(), format1);
                      Label proname1 = new Label(3, i+1, list.get(i).getProname(), format1);
                      Label type1 = new Label(4, i+1, list.get(i).getType(), format1);
                      Label selcount1 = new Label(5, i+1, list.get(i).getSelcount().toString(), format1);
                      Label selprice1 = new Label(6, i+1, list.get(i).getSelprice().toString(), format1);
                      Label totalprice1 = new Label(7, i+1, list.get(i).getTotalprice().toString(), format1);
                      
                        //添加每一行内容
                       sheet1.addCell(empid1);
                       sheet1.addCell(ename1);
                       sheet1.addCell(selid1);
                       sheet1.addCell(proname1);
                       sheet1.addCell(type1);
                       sheet1.addCell(selcount1);
                       sheet1.addCell(selprice1);
                       sheet1.addCell(totalprice1);
               }
               
               //5 ===================保存数据，存盘
               book.write();//存盘
               book.close();
               
        }catch ( WriteException ex) {
          ex.printStackTrace();

        } catch (IOException ex) {
           ex.printStackTrace();
        }
    
    }
}

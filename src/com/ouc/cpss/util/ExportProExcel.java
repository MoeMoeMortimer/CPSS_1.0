/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.util;

import com.ouc.cpss.vo.ViewPro;
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
public class ExportProExcel {
    //打印商品销售信息
    public static void printSale(List<ViewPro> list,File file){
          //1 ============设定表列名
            String proid = "商品编号";
            String proname= "商品名称";
            String type = "商品型号";
            String totalpurcount = "采购总数量";
            String totalpurmoney = "采购总金额";
            String totalselcount = "销售总数量";
            String totalselmoney = "销售总金额";
            
           try {
                //2==============创建excel文件并设置数据显示格式
                WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
                WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
                sheet1.setColumnView(0,15); //设置某一列的宽度
                sheet1.setRowView(0,500); //设置某一行的高度
                //设置第一行第二列的高度和宽度
                sheet1.setColumnView(1, 40);
                sheet1.setColumnView(2, 25);
                sheet1.setColumnView(3, 20);
                sheet1.setColumnView(4, 20);
                sheet1.setColumnView(5, 20);
                sheet1.setColumnView(6, 20);
                
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
               Label labelProid= new Label(0, 0, proid, format); 
               Label labelProname = new Label(1, 0, proname, format);
               Label labelType = new Label(2, 0,type, format);
               Label labelTotalpurcount= new Label(3, 0, totalpurcount, format);
               Label labelTotalpurmoney= new Label(4, 0, totalpurmoney, format); 
               Label labelTotalselcount = new Label(5, 0, totalselcount, format);
               Label labelTotalselmoney = new Label(6, 0,totalselmoney, format);
               //添加列名 才添加进去
              sheet1.addCell(labelProid); //sheet对象添加文本的数据类型为Label
              sheet1.addCell(labelProname);
              sheet1.addCell(labelType);
              sheet1.addCell(labelTotalpurcount);
              sheet1.addCell(labelTotalpurmoney);
              sheet1.addCell(labelTotalselcount);
              sheet1.addCell(labelTotalselmoney);
              
              //4 =====================取出List集合中的的内容，放到Excel中
               int row = list.size();//获取集合的长度作为表格的行数
               for (int i = 0; i < row; i++) {
                      //获取每一行数据，从第一行开始，第0行是标题
                      //列， 行， 内容 ，格式
                      Label proid1 = new Label(0, i+1, list.get(i).getProid().toString(), format1);
                      Label proname1 = new Label(1, i+1, list.get(i).getProname(), format1);
                      Label type1 = new Label(2, i+1, list.get(i).getType(), format1);
                      Label totalpurcount1 = new Label(3, i+1, list.get(i).getTotalpurcount().toString(), format1);
                      Label totalpurmoney1 = new Label(4, i+1, list.get(i).getTotalpurmoney().toString(), format1);
                      Label totalselcount1 = new Label(5, i+1, list.get(i).getTotalselcount().toString(), format1);
                      Label totalselmoney1 = new Label(6, i+1, list.get(i).getTotalselmoney().toString(), format1);
                      
                        //添加每一行内容
                       sheet1.addCell(proid1);
                       sheet1.addCell(proname1);
                       sheet1.addCell(type1);
                       sheet1.addCell(totalpurcount1);
                       sheet1.addCell(totalpurmoney1);
                       sheet1.addCell(totalselcount1);
                       sheet1.addCell(totalselmoney1);
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

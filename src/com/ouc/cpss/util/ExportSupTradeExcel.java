/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.util;


import com.ouc.cpss.vo.ViewSupTrade;
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
 * 将指定的集合导入到指定的excel文件
 * @author yhy
 */
public class ExportSupTradeExcel {
    //打印商品销售信息
    public static void printSale(List<ViewSupTrade> psalelist,File file){
       //1 ============设定表列名
        String supname = "供应商名称";
        String proname = "商品名称";
        String totalcount = "交易数量";
        String purtotal = "交易金额";
            try {
                //2==============创建excel文件并设置数据显示格式
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            sheet1.setColumnView(0, 25); //设置某一列的宽度
            sheet1.setRowView(0, 400); //设置某一行的高度
            //设置第一行第二列的高度和宽度
            sheet1.setColumnView(1, 20);
            //sheet1.setRowView(1, 500);
            //设置第一行第三列的高度和宽度
            sheet1.setColumnView(2, 20);
            //sheet1.setRowView(2, 500);
            sheet1.setColumnView(3, 20);
      
            //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
           //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            
            
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
           
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            //3 ============设置第一行为列名,并添加列名
                    
            //写入字符串，确定位置（列，行）、内容和格式
            Label labelsupname = new Label(0, 0, supname, format);
            Label labelproname = new Label(1, 0,proname, format);
            Label labeltotalcount= new Label(2, 0, totalcount, format);
            Label labelpurtotal= new Label(3, 0, purtotal, format);

            //添加列名
         //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelsupname);
            sheet1.addCell(labelproname);
            sheet1.addCell(labeltotalcount);
            sheet1.addCell(labelpurtotal);
            //4 =====================取出List集合中的的内容，放到Excel中
            int row = psalelist.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                /**
                 * String supid = "供应商编号";
        String supname = "供应商名称";
        String proname = "商品名称";
        String purcount = "交易数量";
        String purtotal = "交易金额";
        String purdate = "交易日期";
                 */
        
                Label supname1 = new Label(0, i+1, psalelist.get(i).getSupname(), format1);
                Label proname1 = new Label(1, i+1, psalelist.get(i).getProname(), format1);
                Label purcount1 = new Label(2, i+1, psalelist.get(i).getTotalcount().toString(), format1);
                Label purtotal1 = new Label(3, i+1, psalelist.get(i).getPurtotal().toString(), format1);
         
                //添加每一行内容
                sheet1.addCell(supname1);
                sheet1.addCell(proname1);
                sheet1.addCell(purcount1);
                sheet1.addCell(purtotal1);
            }
            //5 ===================保存数据，存盘
            book.write();//存盘
            book.close();
        } catch (WriteException ex) {
          ex.printStackTrace();

        } catch (IOException ex) {
           ex.printStackTrace();
        }
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.util;
import com.ouc.cpss.vo.ViewStorecount;

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
public class ExportStorecountExcel {
    //打印商品库存信息
    public static void printSale(List<ViewStorecount> stclist,File file){
       //1 ============设定表列名
        String pname = "商品名称";
        String type = "商品型号";
        String nowcount = "当前库存";
        String safecount = "安全库存";
        String sugpurchase = "建议采购价";
        String lastpurdate = "最近采购日期";
        String sugsell = "建议销售价";
        String lastseldate = "最近销售日期";
            try {
                //2==============创建excel文件并设置数据显示格式
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            sheet1.setColumnView(0, 30); //设置某一列的宽度
            sheet1.setRowView(0, 400); //设置某一行的高度
            //设置第一行第二列的高度和宽度
            sheet1.setColumnView(1, 25);
            //sheet1.setRowView(1, 500);
            //设置第一行第三列的高度和宽度
            sheet1.setColumnView(2, 25);
            //sheet1.setRowView(2, 500);
            sheet1.setColumnView(3, 25);
            sheet1.setColumnView(4, 25);
            sheet1.setColumnView(5, 25);
            sheet1.setColumnView(6, 25);
            sheet1.setColumnView(7, 25);
            sheet1.setColumnView(8, 25);
            //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
           //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            
            
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
           
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            //3 ============设置第一行为列名,并添加列名
            
            Label labelPname= new Label(0, 0, pname, format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelType = new Label(1, 0, type, format);
            Label labelnowcount = new Label(2, 0,nowcount, format);
            Label labelsafecount= new Label(3, 0, safecount, format);
            Label labelsugpurchase= new Label(4, 0, sugpurchase, format);
            Label labellastpurdate= new Label(5, 0, lastpurdate, format);
            Label labelsugsell= new Label(6, 0, sugsell, format);
            Label labellastseldate= new Label(7, 0, lastseldate, format);
            //添加列名
            sheet1.addCell(labelPname); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelType);
            sheet1.addCell(labelnowcount);
            sheet1.addCell(labelsafecount);
            sheet1.addCell(labelsugpurchase);
            sheet1.addCell(labellastpurdate);
            sheet1.addCell(labelsugsell);
            sheet1.addCell(labellastseldate);
            //4 =====================取出List集合中的的内容，放到Excel中
            int row = stclist.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                //列 行  
                /**
                 * String pname = "商品名称";
        String type = "商品型号";
        String nowcount = "当前库存";
        String safecount = "安全库存";
        String sugpurchase = "建议采购价";
        String lastpurdate = "最近采购日期";
        String sugsell = "建议销售价";
        String lastseldate = "最近销售日期";
                 */
                Label pname1 = new Label(0, i+1, stclist.get(i).getProname(), format1);
                Label type1 = new Label(1, i+1, stclist.get(i).getType(), format1);
                Label nowcount1 = new Label(2, i+1, stclist.get(i).getNowcount().toString(), format1);
                Label safecount1 = new Label(3, i+1, stclist.get(i).getSafecount().toString(), format1);
                Label sugpurchase1 = new Label(4, i+1, stclist.get(i).getSugpurchase().toString(), format1);
                Label lastpurdate1 = new Label(5, i+1, stclist.get(i).getLastpurdate().toString(), format1);
                Label sugsell1 = new Label(6, i+1, stclist.get(i).getSugsell().toString(), format1);
                Label lastseldate1 = new Label(7, i+1, stclist.get(i).getLastseldate().toString(), format1);
                //添加每一行内容
                sheet1.addCell(pname1);
                sheet1.addCell(type1);
                sheet1.addCell(nowcount1);
                sheet1.addCell(safecount1);
                sheet1.addCell(sugpurchase1);
                sheet1.addCell(lastpurdate1);
                sheet1.addCell(sugsell1);
                sheet1.addCell(lastseldate1);
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

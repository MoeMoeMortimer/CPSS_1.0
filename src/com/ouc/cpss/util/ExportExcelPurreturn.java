/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.util;

import com.ouc.cpss.vo.ViewPurReturn;
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
 * @author LIUYIYU
 */
public class ExportExcelPurreturn {

    public static void printPurreturn(List<ViewPurReturn> prtlist, File file) {
        //1 ============设定表列名
        String prtid = "退货编号";
        String pname = "商品名称";
        String ptype = "商品型号";
        String supplier = "供应商";
        String prtprice = "退货单价";
        String prtcount = "退货数量";
        String prtdate = "退货日期";
        try {
            //2==============创建excel文件并设置数据显示格式
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            sheet1.setColumnView(0, 20); //设置某一列的宽度
            sheet1.setColumnView(1, 25);
            sheet1.setColumnView(2, 25);
            sheet1.setColumnView(3, 25);
            sheet1.setColumnView(4, 20);
            sheet1.setColumnView(5, 20);
            sheet1.setColumnView(6, 20);
            
             //   sheet1.setRowView(i, 500); //设置某一行的高度  
                        //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
            //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT);
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);

            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中
            WritableCellFormat format1 = new WritableCellFormat(font1);

            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定
            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            //3 ============设置第一行为列名,并添加列名
            Label labelPrtid = new Label(0, 0, prtid, format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelProname = new Label(1, 0, pname, format);
            Label labelPtype = new Label(2, 0, ptype, format);
            Label labelSupplier = new Label(3, 0, supplier, format);
            Label labelPrtprice = new Label(4, 0, prtprice, format);
            Label labelPrtcount = new Label(5, 0, prtcount, format);
            Label labelPrtdate = new Label(6, 0, prtdate, format);
            //添加列名
            sheet1.addCell(labelPrtid); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelProname);
            sheet1.addCell(labelPtype);
            sheet1.addCell(labelSupplier);
            sheet1.addCell(labelPrtprice);
            sheet1.addCell(labelPrtcount);
            sheet1.addCell(labelPrtdate);
            //4 =====================取出List集合中的的内容，放到Excel中
            int row = prtlist.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                Label rtid = new Label(0, i + 1,prtlist.get(i).getPrtid()+"", format1);
                Label name = new Label(1, i + 1, prtlist.get(i).getProname(), format1);
                Label type = new Label(2, i + 1, prtlist.get(i).getType(), format1);
                Label sup = new Label(3, i + 1, prtlist.get(i).getSupname(), format1);
                Label price = new Label(4, i + 1, prtlist.get(i).getPrtprice().toString(), format1);
                Label count = new Label(5, i + 1, prtlist.get(i).getPrtcount()+"", format1);
                Label date = new Label(6, i + 1, prtlist.get(i).getPrtdate().toString(), format1);
                     
                //添加每一行内容
                sheet1.addCell(rtid);
                sheet1.addCell(name);
                sheet1.addCell(type);
                sheet1.addCell(sup);
                sheet1.addCell(price);
                sheet1.addCell(count);
                sheet1.addCell(date);
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

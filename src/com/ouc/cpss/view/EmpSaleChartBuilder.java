/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.view;

import com.ouc.cpss.vo.ViewEmpsel;
import java.awt.Font;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author LIUYIYU
 */

@SuppressWarnings("serial")
public class EmpSaleChartBuilder extends JFrame{
    String title;
    static List<ViewEmpsel> list;//数据集合
    public EmpSaleChartBuilder(String title,List list) {
        super(title);
        this.title = title;
        this.list = list;
        //设置关闭方式为销毁当前窗体
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setContentPane(createPanel()); //将生成的图表面板设为内容面板
      
    }

    private static CategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
          for(ViewEmpsel ve : list){
              //图表数据，名称，横坐标
              dataset.addValue(ve.getTotalprice(), ve.getEname(),ve.getMon()+"月");
          }
        return dataset;
    }

    private static JFreeChart createJFreeChart(CategoryDataset dataset) {
        /**
         * 构建JFreeChart
         */
        //创建主题样式     
        StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
        //设置标题字体     
        standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
        //设置图例的字体    
        standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
        //设置轴向的字体     
        standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
        //应用主题样式   
        ChartFactory.setChartTheme(standardChartTheme);
        //生成柱状图
        JFreeChart jfreeChart = ChartFactory.createBarChart3D("员工销售统计",
                "", "销售总金额", dataset, PlotOrientation.VERTICAL, true, false,false);
        /**
         * 设置JFreeChart的属性
         */
        jfreeChart.setTitle(new TextTitle("员工销售统计", new Font("宋体", Font.BOLD
                + Font.ITALIC, 20)));
        CategoryPlot plot = (CategoryPlot) jfreeChart.getPlot();
        CategoryAxis categoryAxis = plot.getDomainAxis();
        categoryAxis.setLabelFont(new Font("仿宋", Font.ROMAN_BASELINE, 12));

        return jfreeChart;
    }

    public static JPanel createPanel() {
        // 生成JFreeChart对象(依据数据生成图表)
        JFreeChart chart = createJFreeChart(createDataSet());
        // 将JFreeChar对象转成JPanel
        return new ChartPanel(chart);
    }

    public static void main(String[] args) {
        
    }
    
}

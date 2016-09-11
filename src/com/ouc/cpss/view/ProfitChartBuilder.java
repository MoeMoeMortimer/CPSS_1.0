/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.view;

import com.ouc.cpss.vo.ViewProfit;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

/**
 * 每月利润生成图示实类
 * @author su
 */
public class ProfitChartBuilder extends JFrame {
    String title = null;
    static List<ViewProfit> list;//数据集合
    public ProfitChartBuilder(String title,List list) {
        super(title);
        this.title = title;
        ProfitChartBuilder.list = list;
        this.setContentPane(createPanel());
    }

    private static CategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int num = 0;
           for(int i=1;i<=12 && num<list.size();i++){
              //图表数据，名称，横坐标
              if(i != list.get(num).getThemonth()){
                  dataset.addValue(0, "利润", i+"月");
              }
              else{
                  dataset.addValue(list.get(num).getTotalprofit(), "利润", list.get(num).getThemonth()+"月");
                  num++;
                  if(num == list.size())
                      num-=1; 
              }
              
                  
          }
        return dataset;
    }

    public static JFreeChart createJFreeChart(CategoryDataset dataset){
	
	JFreeChart chart=ChartFactory.createLineChart("每月总利润折线图",
				"时间",
				"每月利润",
				dataset,
				PlotOrientation.VERTICAL,
				true,
				true,
				false);
	// 获取一个图例
	LegendTitle legendTitle = chart.getLegend(0);
	// 设置图例字体
	legendTitle.setItemFont(new Font("宋体", Font.BOLD, 18));
	CategoryPlot plot = (CategoryPlot) chart.getPlot();
	// 取得横轴
	org.jfree.chart.axis.CategoryAxis categoryAxis = plot.getDomainAxis();
        // 设置横轴的字体
	categoryAxis.setLabelFont(new Font("宋体", Font.BOLD, 18));

	// 设置分类标签字体
	categoryAxis.setTickLabelFont(new Font("宋体", Font.BOLD, 12));
	// 取得纵轴
	NumberAxis numberAxis = (NumberAxis) plot.getRangeAxis();
	// 设置纵轴的字体
	numberAxis.setLabelFont(new Font("宋体", Font.BOLD, 14));

	numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());//显示整数

	CategoryItemRenderer xylineandshaperenderer = plot.getRenderer();
	xylineandshaperenderer.setBaseItemLabelsVisible(true);
	xylineandshaperenderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(
							ItemLabelAnchor.OUTSIDE2, TextAnchor.BASELINE_RIGHT));
	xylineandshaperenderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        return chart;
    }

    public static JPanel createPanel() {
        JFreeChart chart = createJFreeChart(createDataSet());
        return new ChartPanel(chart);
    }
}

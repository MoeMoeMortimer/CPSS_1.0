/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.view;

import com.ouc.cpss.biz.SupTradeBiz;
import com.ouc.cpss.biz.SupTradeBizImpl;
import com.ouc.cpss.vo.ViewSupTrade;
import com.ouc.cpss.util.ExportSupTradeExcel;
import com.ouc.cpss.util.LocationUtil;
import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author su
 */
public class SupTradeFrame extends javax.swing.JInternalFrame {

    SupTradeBiz stbiz = new SupTradeBizImpl();
    static List<ViewSupTrade> list;

    /**
     * Creates new form SupTradeFrame
     */
    public SupTradeFrame() {
        initComponents();
        LocationUtil.setScreenCenter(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conPicPane1 = new com.ouc.cpss.view.ConPicPane();
        jLabel2 = new javax.swing.JLabel();
        cobType = new javax.swing.JComboBox();
        txtCondition = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupTrade = new javax.swing.JTable();
        btnExportExcel = new javax.swing.JButton();
        dateStart = new com.ouc.cpss.util.DateChooserJButton();
        dateEnd = new com.ouc.cpss.util.DateChooserJButton();
        jLabel3 = new javax.swing.JLabel();
        btnPie = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("供应商交易统计");
        setToolTipText("");

        conPicPane1.setPreferredSize(new java.awt.Dimension(793, 470));

        jLabel2.setText("条件");

        cobType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "供应商名称", "商品名称" }));

        btnSearch.setText("查询");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSupTrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "供应商名称", "商品名称", "交易数量", "交易金额"
            }
        ));
        jScrollPane1.setViewportView(tblSupTrade);

        btnExportExcel.setText("导出报表");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
            }
        });

        dateStart.setPreferredSize(new java.awt.Dimension(80, 22));

        dateEnd.setPreferredSize(new java.awt.Dimension(80, 22));

        jLabel3.setText("--");

        btnPie.setText("生成图表");
        btnPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conPicPane1Layout = new javax.swing.GroupLayout(conPicPane1);
        conPicPane1.setLayout(conPicPane1Layout);
        conPicPane1Layout.setHorizontalGroup(
            conPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conPicPane1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(conPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(conPicPane1Layout.createSequentialGroup()
                        .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cobType, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(conPicPane1Layout.createSequentialGroup()
                        .addComponent(btnExportExcel)
                        .addGap(18, 18, 18)
                        .addComponent(btnPie)))
                .addGap(30, 30, 30))
        );
        conPicPane1Layout.setVerticalGroup(
            conPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conPicPane1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(conPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cobType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(conPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPie)
                    .addComponent(btnExportExcel))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(conPicPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(conPicPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //查询按钮
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // 根据时间段或名称查询
        //按条件查询采购单
        //1获取条件
        String start = this.dateStart.getText();
        String end = this.dateEnd.getText();
        String conditions = this.txtCondition.getText().trim();
        //调用业务
        list = stbiz.findByCondition(start, end, conditions);
        //显示在表格中
        showOnTable(list);
    }//GEN-LAST:event_btnSearchActionPerformed

    //导出报表
    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        JFileChooser savefile = new JFileChooser();//文件选择对话框
        FileFilter filter = new FileNameExtensionFilter("Excel文件(*.xls)", "xls");
        savefile.addChoosableFileFilter(filter);//添加过滤器
        savefile.setFileFilter(filter);
        //打开文件选择对话框，showSaveDialog是保存，showOpenDialog是打开
        int flag = savefile.showSaveDialog(this);
        File file = null;
        //如果点击了保存按钮
        if (flag == JFileChooser.APPROVE_OPTION) {
            file = savefile.getSelectedFile();//所选择的文件名（手写或选择）
            //System.out.println("文件名：" + file.getAbsolutePath());
            String filename = file.getAbsolutePath();
            //截取文件扩展名（文件名长度后4位）
            String ftype = filename.substring(filename.length() - 4);
            if (!ftype.equals(".xls")) {
                //如果用户没有填写扩展名，自动添加扩展名.xls
                file = new File(filename + ".xls");
            }
            //集合获取数据，输出到文件：ExportExcel类的printSale方法
            ExportSupTradeExcel.printSale(list, file); //psalelist是要导出到excel的数据集合，来自有数据库查询
        }
    }//GEN-LAST:event_btnExportExcelActionPerformed

    private void btnPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPieActionPerformed
        String charttitle = "供应商交易统计";
        String start = this.dateStart.getText();
        String end = this.dateEnd.getText();
        String condition = this.txtCondition.getText().trim();
        list = stbiz.findByConditionForChart(start, end, condition);
        SupTradeChartBuilder chart = new SupTradeChartBuilder(charttitle, list);
        chart.pack();
        chart.setVisible(true);

    }//GEN-LAST:event_btnPieActionPerformed
    public void showOnTable(List<ViewSupTrade> list) {
        //将制定的list数据显示到表上
        //1.获取指定表格（tblProduct）模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblSupTrade.getModel();
        //2.清空表格信息
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示表格
        for (ViewSupTrade vstc : list) {
            Vector vt = new Vector();
            vt.add(vstc.getSupname());
            vt.add(vstc.getProname());
            vt.add(vstc.getTotalcount());
            vt.add(vstc.getPurtotal());
            dtm.addRow(vt);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JButton btnPie;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cobType;
    private com.ouc.cpss.view.ConPicPane conPicPane1;
    private com.ouc.cpss.util.DateChooserJButton dateEnd;
    private com.ouc.cpss.util.DateChooserJButton dateStart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSupTrade;
    private javax.swing.JTextField txtCondition;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.view;

import com.ouc.cpss.vo.ViewCusTrade;
import com.ouc.cpss.biz.CusTradeBiz;
import com.ouc.cpss.biz.CusTradeBizImpl;
import com.ouc.cpss.util.ExportCusTradeExcel;
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
public class CusTradeFrame extends javax.swing.JInternalFrame {
    CusTradeBiz ctbiz = new CusTradeBizImpl();
    static List<ViewCusTrade> list;
    /**
     * Creates new form CusTradeFrame
     */
    public CusTradeFrame() {
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
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCusTrade = new javax.swing.JTable();
        btnExportExel = new javax.swing.JButton();
        dateStart = new com.ouc.cpss.util.DateChooserJButton();
        dateEnd = new com.ouc.cpss.util.DateChooserJButton();
        txtCondition = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("买家交易记录");
        setPreferredSize(new java.awt.Dimension(809, 500));

        jLabel1.setText("--");

        btnSearch.setText("查询");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblCusTrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "买家编号", "买家姓名", "淘宝昵称", "购买金额"
            }
        ));
        jScrollPane1.setViewportView(tblCusTrade);

        btnExportExel.setText("导出报表");
        btnExportExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExelActionPerformed(evt);
            }
        });

        dateStart.setPreferredSize(new java.awt.Dimension(80, 22));

        dateEnd.setPreferredSize(new java.awt.Dimension(80, 22));
        dateEnd.setRequestFocusEnabled(false);
        dateEnd.setRolloverEnabled(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "买家姓名", "淘宝昵称" }));

        javax.swing.GroupLayout conPicPane1Layout = new javax.swing.GroupLayout(conPicPane1);
        conPicPane1.setLayout(conPicPane1Layout);
        conPicPane1Layout.setHorizontalGroup(
            conPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conPicPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(conPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExportExel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conPicPane1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(25, 25, 25))
        );
        conPicPane1Layout.setVerticalGroup(
            conPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conPicPane1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(conPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExportExel)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conPicPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conPicPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //查询按钮
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //根据时间段、买家姓名、淘宝昵称查询
        //1获取条件
        String start = this.dateStart.getText();
        String end = this.dateEnd.getText();
        String conditions = this.txtCondition.getText().trim();
        //调用业务
        list = ctbiz.findByCondition(start, end, conditions);
        //显示在表格中
        showOnTable(list);
    }//GEN-LAST:event_btnSearchActionPerformed

    //导出报表
    private void btnExportExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExelActionPerformed
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
        String filename = file.getAbsolutePath();
        //截取文件扩展名（文件名长度后4位）
        String ftype = filename.substring(filename.length()-4);
        if(!ftype.equals(".xls")){
            //如果用户没有填写扩展名，自动添加扩展名.xls
            file = new File(filename+".xls");
        }
        //集合获取数据，输出到文件：ExportExcel类的printSale方法
        ExportCusTradeExcel.printSale(list, file); //psalelist是要导出到excel的数据集合，来自有数据库查询
        }
    }//GEN-LAST:event_btnExportExelActionPerformed
    
    public void showOnTable(List<ViewCusTrade> list){
        //将制定的list数据显示到表上
        //1.获取指定表格（tblCusTrade）模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblCusTrade.getModel();
        //2.清空表格信息
        while(dtm.getRowCount() > 0){
            dtm.removeRow(0);
        }
        //3.显示表格
        for(ViewCusTrade vstc : list){
            Vector vt = new Vector();
            vt.add(vstc.getCusid());
            vt.add(vstc.getCusname());
            vt.add(vstc.getTbid());
            vt.add(vstc.getTotalmoney());
            dtm.addRow(vt);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportExel;
    private javax.swing.JButton btnSearch;
    private com.ouc.cpss.view.ConPicPane conPicPane1;
    private com.ouc.cpss.util.DateChooserJButton dateEnd;
    private com.ouc.cpss.util.DateChooserJButton dateStart;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCusTrade;
    private javax.swing.JTextField txtCondition;
    // End of variables declaration//GEN-END:variables
}

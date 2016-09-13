/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.view;

import com.ouc.cpss.biz.SupplierBiz;
import com.ouc.cpss.biz.SupplierBizImpl;
import com.ouc.cpss.po.Supplier;
import com.ouc.cpss.util.LocationUtil;
import com.ouc.cpss.util.StringUtil;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author su
 */
public class SupplierFrame extends javax.swing.JInternalFrame {

    //引入
    SupplierBiz supbiz = new SupplierBizImpl();

    /**
     * Creates new form SupplierFrame
     */
    public SupplierFrame() {
        initComponents();
        //初始化保存按钮
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
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

        basicPicPane1 = new com.ouc.cpss.view.BasicPicPane();
        txtConditions = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSupid = new javax.swing.JTextField();
        txtSupname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSuptel = new javax.swing.JTextField();
        txtSupaddr = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("供应商管理");

        basicPicPane1.setPreferredSize(new java.awt.Dimension(793, 470));

        btnSearch.setText("搜索");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "供应商编号", "供应商名称", "供应商电话", "供应商地址"
            }
        ));
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSupplier);
        if (tblSupplier.getColumnModel().getColumnCount() > 0) {
            tblSupplier.getColumnModel().getColumn(0).setResizable(false);
            tblSupplier.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("编号");

        jLabel2.setText("名称");

        txtSupid.setEditable(false);

        jLabel4.setText("电话");

        jLabel5.setText("地址");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupid, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuptel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSupname, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(txtSupaddr))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtSupid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSupname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtSuptel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSupaddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        btnClose.setText("退出");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnCancel.setText("取消");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setText("修改/保存");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("删除");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("新增");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnLoad.setText("载入");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("注意：红色字体处不可修改");

        javax.swing.GroupLayout basicPicPane1Layout = new javax.swing.GroupLayout(basicPicPane1);
        basicPicPane1.setLayout(basicPicPane1Layout);
        basicPicPane1Layout.setHorizontalGroup(
            basicPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicPicPane1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addGap(152, 152, 152)
                .addComponent(btnLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicPicPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(basicPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basicPicPane1Layout.createSequentialGroup()
                        .addComponent(txtConditions, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)))
                .addGap(30, 30, 30))
            .addGroup(basicPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basicPicPane1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        basicPicPane1Layout.setVerticalGroup(
            basicPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicPicPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basicPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtConditions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basicPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoad)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnClose)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25))
            .addGroup(basicPicPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basicPicPane1Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(210, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basicPicPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basicPicPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //查询按钮
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // 模糊查询
        String condition = this.txtConditions.getText().trim();
        List<Supplier> list = supbiz.findByCondition(condition);
        //显示list中的信息
        showOnTable(list);
    }//GEN-LAST:event_btnSearchActionPerformed

    //载入按钮
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        //查询数据库，将数据显示到表格上
        List<Supplier> list = supbiz.findAll();
        //显示list的信息
        showOnTable(list);
    }//GEN-LAST:event_btnLoadActionPerformed

    //新增按钮
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // 新增买家
        //获取买家信息
        String supname = this.txtSupname.getText().trim();
        String suptel = this.txtSuptel.getText().trim();    //联系电话
        String supaddr = this.txtSupaddr.getText().trim();
        //数据格式验证(StringUtil)
        //1验证非空
        if (StringUtil.checkLength(supname) == false) {
            JOptionPane.showMessageDialog(this, "姓名不能为空");
            return;
        }

        if (StringUtil.checkLength(suptel) == false) {
            JOptionPane.showMessageDialog(this, "联系电话不能为空");
            return;
        }

        if (StringUtil.checkLength(supaddr) == false) {
            JOptionPane.showMessageDialog(this, "送货地址不能为空");
            return;
        }

        //组合对象
        Supplier c = new Supplier(null, supname, suptel, supaddr);
        //调用业务类
        boolean result = supbiz.add(c);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "添加成功");
            List<Supplier> list = supbiz.findAll();
            //显示list的信息
            showOnTable(list);
        } else {
            JOptionPane.showMessageDialog(this, "添加失败");
        }
        //清孔面板信息
        clearInput();
    }//GEN-LAST:event_btnAddActionPerformed

    //删除按钮
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // 删除商品信息
        int answer = JOptionPane.showConfirmDialog(this, "你确定要删除吗？");
        if (answer == JOptionPane.YES_OPTION) {
            //获取proid
            int proid = Integer.parseInt(this.txtSupid.getText());
            boolean result = supbiz.delete(proid);
            if (result == true) {
                JOptionPane.showMessageDialog(this, "删除成功");
                List<Supplier> list = supbiz.findAll();
                //显示list中的信息
                showOnTable(list);
            } else {
                JOptionPane.showMessageDialog(this, "删除失败");

            }
            clearInput();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    //修改保存按钮
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // 修改供应商
        //获取供应商信息
        int supid = Integer.parseInt(this.txtSupid.getText().trim());
        String supname = this.txtSupname.getText().trim();
        String suptel = this.txtSuptel.getText().trim();    //联系电话
        String supaddr = this.txtSupaddr.getText().trim();
        //数据格式验证(StringUtil)
        //1验证非空
        if (StringUtil.checkLength(supname) == false) {
            JOptionPane.showMessageDialog(this, "姓名不能为空");
            return;
        }

        if (StringUtil.checkLength(suptel) == false) {
            JOptionPane.showMessageDialog(this, "联系电话不能为空");
            return;
        }

        if (StringUtil.checkLength(supaddr) == false) {
            JOptionPane.showMessageDialog(this, "送货地址不能为空");
            return;
        }

        //组合对象
        Supplier c = new Supplier(supid, supname, suptel, supaddr);
        //调用业务类
        boolean result = supbiz.update(c);
        if (result == true) {
            JOptionPane.showMessageDialog(this, "修改成功");
            List<Supplier> list = supbiz.findAll();
            //显示list的信息
            showOnTable(list);
        } else {
            JOptionPane.showMessageDialog(this, "修改失败");
        }
        //清孔面板信息
        clearInput();
    }//GEN-LAST:event_btnSaveActionPerformed

    //取消按钮
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // 界面恢复到最初状态
        clearInput();
        this.btnSave.setEnabled(false);
        this.btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    //退出按钮
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    //鼠标点击选中表的某一行
    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        // 鼠标选中某行，该行信息显示到输入面板
        int row = this.tblSupplier.getSelectedRow();//表示被选中的那一行
        //获取每一列的值
        this.txtSupid.setText(this.tblSupplier.getValueAt(row, 0) + "");
        this.txtSupname.setText(this.tblSupplier.getValueAt(row, 1) + "");
        this.txtSuptel.setText(this.tblSupplier.getValueAt(row, 2) + "");
        this.txtSupaddr.setText(this.tblSupplier.getValueAt(row, 3) + "");
        //保存  删除按钮可用
        this.btnSave.setEnabled(true);
        this.btnDelete.setEnabled(true);
    }//GEN-LAST:event_tblSupplierMouseClicked

    //将制定的list数据显示到表上
    public void showOnTable(List<Supplier> list) {
        //将制定的list数据显示到表上
        //1.获取指定表格（tblProduct）模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblSupplier.getModel();
        //2.清空表格信息
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3.显示表格
        for (Supplier s : list) {
            Vector vt = new Vector();
            vt.add(s.getSupid());
            vt.add(s.getSupname());
            vt.add(s.getSuptel());
            vt.add(s.getSupaddr());

            dtm.addRow(vt);
        }
    }

    //清空面板上的数据
    private void clearInput() {
        this.txtSupid.setText("");
        this.txtSupname.setText("");
        this.txtSuptel.setText("");
        this.txtSupaddr.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ouc.cpss.view.BasicPicPane basicPicPane1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtConditions;
    private javax.swing.JTextField txtSupaddr;
    private javax.swing.JTextField txtSupid;
    private javax.swing.JTextField txtSupname;
    private javax.swing.JTextField txtSuptel;
    // End of variables declaration//GEN-END:variables
}

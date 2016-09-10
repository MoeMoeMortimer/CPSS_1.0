/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.view;

import com.ouc.cpss.biz.EmployeeBiz;
import com.ouc.cpss.biz.EmployeeBizImpl;
import com.ouc.cpss.po.Employee;
import com.ouc.cpss.util.StringUtil;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author su
 */
public class EmployeeFrame extends javax.swing.JInternalFrame {

    EmployeeBiz empbiz = new EmployeeBizImpl();
    /**
     * Creates new form EmployeeFrame
     */
    public EmployeeFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtConditions = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmpid = new javax.swing.JTextField();
        txtEmpage = new javax.swing.JTextField();
        txtEmpname = new javax.swing.JTextField();
        txtEmptel = new javax.swing.JTextField();
        cobEmpsex = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtEmpaddr = new javax.swing.JTextField();
        cobJob = new javax.swing.JComboBox();
        btnClose = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("员工管理");

        btnSearch.setText("搜索");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "员工编号", "姓名", "性别", "年龄", "电话", "现住地址", "岗位"
            }
        ));
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("编号");

        jLabel2.setText("姓名");

        jLabel3.setText("性别");

        jLabel4.setText("年龄");

        jLabel5.setText("电话");

        jLabel6.setText("岗位");

        txtEmpid.setEditable(false);

        cobEmpsex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "男", "女" }));

        jLabel7.setText("现住地址");

        cobJob.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "销售员", "基本资料管理员", "总管理员" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(txtEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmpage, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmptel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpaddr)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cobEmpsex, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cobJob, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cobEmpsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtEmpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmptel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cobJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmpaddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
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

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("注意：红色字体处不可修改");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtConditions, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConditions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnCancel)
                    .addComponent(btnSave)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd)
                    .addComponent(btnLoad)
                    .addComponent(jLabel8))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //搜索按钮
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // 模糊查询
        String condition = this.txtConditions.getText().trim();
        List<Employee> list = empbiz.findByCondition(condition);
            //显示list中的信息
            showOnTable(list);
    }//GEN-LAST:event_btnSearchActionPerformed

    //载入按钮
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        //查询数据库，将数据显示到表格上
        List<Employee> list = empbiz.findAll();
        //显示list的信息
        showOnTable(list);
    }//GEN-LAST:event_btnLoadActionPerformed

    //新增按钮
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // 新增买家
        //获取买家信息
        String empname = this.txtEmpname.getText().trim();
        String empsex = (String)this.cobEmpsex.getSelectedItem();
        String age = this.txtEmpage.getText().trim();  
        String emptel = this.txtEmptel.getText().trim(); //联系电话
        String empjob = (String)this.cobJob.getSelectedItem();
        String empaddr= this.txtEmpaddr.getText().trim();
        //数据格式验证(StringUtil)
        //1验证非空
        if(StringUtil.checkLength(empname) == false){
            JOptionPane.showMessageDialog(this, "姓名不能为空");
            return;
        }
        if(StringUtil.checkLength(age) == false){
            JOptionPane.showMessageDialog(this, "年龄不能为空");
            return;
        }
        if(StringUtil.checkLength(emptel) == false){
            JOptionPane.showMessageDialog(this, "联系电话不能为空");
            return;
        }
        
        if(StringUtil.checkLength(empaddr) == false){
            JOptionPane.showMessageDialog(this, "现住地址不能为空");
            return;
        }
       if(StringUtil.checkDecimal(age) == false){
            JOptionPane.showMessageDialog(this, "年龄需为数字格式");
            return;
        }
        int empage = Integer.parseInt(age);
        //组合对象
        Employee e = new Employee(null,empname,empsex,empage,emptel,empaddr,empjob);
        //调用业务类
        boolean result = empbiz.add(e);
        if(result == true){
            JOptionPane.showMessageDialog(this, "添加成功");
             List<Employee> list = empbiz.findAll();
            //显示list的信息
            showOnTable(list);
        }
        else
            JOptionPane.showMessageDialog(this, "添加失败");
        //清孔面板信息
        clearInput();
    }//GEN-LAST:event_btnAddActionPerformed

    //鼠标点击选中表的某一行
    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
         // 鼠标选中某行，该行信息显示到输入面板
        int row = this.tblEmployee.getSelectedRow();//表示被选中的那一行
        //获取每一列的值
        this.txtEmpid.setText(this.tblEmployee.getValueAt(row, 0)+"");
        this.txtEmpname.setText(this.tblEmployee.getValueAt(row, 1)+"");
        this.cobEmpsex.setSelectedItem(this.tblEmployee.getValueAt(row, 2)+"");
        this.txtEmpage.setText(this.tblEmployee.getValueAt(row, 3)+"");
        this.txtEmptel.setText(this.tblEmployee.getValueAt(row, 4)+"");
        this.txtEmpaddr.setText(this.tblEmployee.getValueAt(row, 5)+"");
        this.cobJob.setSelectedItem(this.tblEmployee.getValueAt(row, 6)+"");
        
        //保存  删除按钮可用
        this.btnSave.setEnabled(true);
        this.btnDelete.setEnabled(true);
    }//GEN-LAST:event_tblEmployeeMouseClicked

     //修改/保存按钮
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // 修改员工信息
        //获取员工信息
        int empid = Integer.parseInt(this.txtEmpid.getText().trim());
       String empname = this.txtEmpname.getText().trim();
        String empsex = (String)this.cobEmpsex.getSelectedItem();
        String age = this.txtEmpage.getText().trim();  
        String emptel = this.txtEmptel.getText().trim(); //联系电话
        String empjob = (String)this.cobJob.getSelectedItem();
        String empaddr = this.txtEmpaddr.getText().trim();
        //数据格式验证(StringUtil)
        //1验证非空
        if(StringUtil.checkLength(empname) == false){
            JOptionPane.showMessageDialog(this, "姓名不能为空");
            return;
        }
        if(StringUtil.checkLength(age) == false){
            JOptionPane.showMessageDialog(this, "年龄不能为空");
            return;
        }
        if(StringUtil.checkLength(emptel) == false){
            JOptionPane.showMessageDialog(this, "联系电话不能为空");
            return;
        }
        
        if(StringUtil.checkLength(empaddr) == false){
            JOptionPane.showMessageDialog(this, "现住地址不能为空");
            return;
        }
       if(StringUtil.checkDecimal(age) == false){
            JOptionPane.showMessageDialog(this, "年龄需为数字格式");
            return;
        }
        int empage = Integer.parseInt(age);
        //组合对象
        Employee e = new Employee(empid,empname,empsex,empage,emptel,empaddr,empjob);
      
        //调用业务类
        boolean result = empbiz.update(e);
        if(result == true){
            JOptionPane.showMessageDialog(this, "修改成功");
             List<Employee> list = empbiz.findAll();
            //显示list的信息
            showOnTable(list);
        }
        else
            JOptionPane.showMessageDialog(this, "修改失败");
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

    //删除按钮
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // 删除商品信息
        int answer = JOptionPane.showConfirmDialog(this, "你确定要删除吗？");
        if(answer == JOptionPane.YES_OPTION){
            //获取proid
        int proid = Integer.parseInt(this.txtEmpid.getText());
        boolean result = empbiz.delete(proid);
        if(result == true){
            JOptionPane.showMessageDialog(this, "删除成功");
            List<Employee> list = empbiz.findAll();
            //显示list中的信息
            showOnTable(list);
        } else{
            JOptionPane.showMessageDialog(this, "删除失败");

        }
        clearInput();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    
    //将制定的list数据显示到表上
    public void showOnTable(List<Employee> list){
        //将制定的list数据显示到表上
        //1.获取指定表格（tblProduct）模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblEmployee.getModel();
        //2.清空表格信息
        while(dtm.getRowCount() > 0){
            dtm.removeRow(0);
        }
        //3.显示表格
        for(Employee e : list){
            Vector vt = new Vector();
            vt.add(e.getEmpid());
            vt.add(e.getEname());
            vt.add(e.getEsex());  
            vt.add(e.getEage());
            vt.add(e.getEtel()); 
            vt.add(e.getEaddr());
            vt.add(e.getPosition());
            dtm.addRow(vt);
        }
    }
    
    //清空面板上的数据
    private void clearInput() {
        this.txtEmpid.setText("");
        this.txtEmpname.setText("");
        this.txtEmptel.setText("");
        this.txtEmpage.setText(""); //邮编
        this.txtEmpaddr.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cobEmpsex;
    private javax.swing.JComboBox cobJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtConditions;
    private javax.swing.JTextField txtEmpaddr;
    private javax.swing.JTextField txtEmpage;
    private javax.swing.JTextField txtEmpid;
    private javax.swing.JTextField txtEmpname;
    private javax.swing.JTextField txtEmptel;
    // End of variables declaration//GEN-END:variables
}

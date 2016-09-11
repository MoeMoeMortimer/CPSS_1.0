/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.view;

import com.ouc.cpss.biz.UserBiz;
import com.ouc.cpss.biz.UserBizImpl;
import com.ouc.cpss.po.User;
import com.ouc.cpss.util.StringUtil;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author 晨晨
 */
public class RegisterFrame extends javax.swing.JFrame {

    //引入biz
    UserBiz ubiz = new UserBizImpl();

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comPosition = new javax.swing.JComboBox();
        txtPswd = new javax.swing.JPasswordField();
        txtPswd2 = new javax.swing.JPasswordField();
        txtUsname = new javax.swing.JTextField();
        txtRealName = new javax.swing.JTextField();
        txtIdNumber = new javax.swing.JTextField();
        txtUsTel = new javax.swing.JTextField();
        txtUsEmail = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtWeak = new javax.swing.JTextField();
        txtMid = new javax.swing.JTextField();
        txtStrong = new javax.swing.JTextField();
        hintLabel = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("用户注册");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("用户名：");

        jLabel2.setText("密码：");

        jLabel3.setText("确认密码：");

        jLabel4.setText("真实姓名：");

        jLabel5.setText("身份证号：");

        jLabel6.setText("联系电话：");

        jLabel7.setText("邮箱地址：");

        jLabel8.setText("身份：");

        comPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "总管理员", "基本资料管理员", "销售员" }));

        txtPswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPswdMouseClicked(evt);
            }
        });
        txtPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPswdActionPerformed(evt);
            }
        });

        txtPswd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPswd2MouseClicked(evt);
            }
        });

        btnRegister.setText("注册");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnCancel.setText("取消");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel10.setText("（密码由6-18位的数字或字母组成）");

        jLabel11.setText("（两次密码需一致）");

        jLabel9.setText("密码安全强度：");

        txtWeak.setBackground(new java.awt.Color(204, 204, 255));

        txtMid.setBackground(new java.awt.Color(204, 204, 255));

        txtStrong.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(comPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUsname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(hintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtPswd2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtUsEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                                .addComponent(txtUsTel, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtIdNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtRealName, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtPswd, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtWeak, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMid, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtStrong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(statusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 21, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnRegister)
                        .addGap(206, 206, 206)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtUsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtWeak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtMid, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtStrong, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPswd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRealName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        //注册用户    
        //1.获取用户信息
        String usname = this.txtUsname.getText().trim();
        // 提示用户名是否可用
        User newuser = ubiz.findByUsname(usname);
        char[] pswd1 = this.txtPswd.getPassword();
        String password1 = new String(pswd1);//将字符型数组转成字符串
        char[] pswd2 = this.txtPswd2.getPassword();
        String password2 = new String(pswd2);//将字符型数组转成字符串
        String realname = this.txtRealName.getText().trim();
        String idnumber = this.txtIdNumber.getText().trim();
        String ustel = this.txtUsTel.getText().trim();
        String usemail = this.txtUsEmail.getText().trim();
        String position = (String) this.comPosition.getSelectedItem();

        //数据格式验证(使用StringUtil)
        //1.验证非空
        if (StringUtil.checkLength(usname) == false) {
            JOptionPane.showMessageDialog(this, "用户名不能为空！");
            return;
        }
        if (StringUtil.checkLength(password1) == false) {
            JOptionPane.showMessageDialog(this, "密码不能为空！");
            return;
        }
        if (StringUtil.checkLength(realname) == false) {
            JOptionPane.showMessageDialog(this, "真实姓名不能为空！");
            return;
        }
        if (StringUtil.checkLength(idnumber) == false) {
            JOptionPane.showMessageDialog(this, "身份证号不能为空！");
            return;
        }
        //2.格式验证
        if (StringUtil.checkUsname(usname) == false) {
            JOptionPane.showMessageDialog(this, "用户名格式不正确！");
            return;
        }
        if (StringUtil.checkPassword(password1) == false) {
            JOptionPane.showMessageDialog(this, "密码格式不正确！");
            return;
        }
        if (!password1.equals(password2)) {
            JOptionPane.showMessageDialog(this, "两次密码不一致！");
            return;
        }
        if (StringUtil.checkRealname(realname) == false) {
            JOptionPane.showMessageDialog(this, "姓名格式不正确！");
            return;
        }
        if (StringUtil.checkUsid(idnumber) == false) {
            JOptionPane.showMessageDialog(this, "身份证号格式不正确！");
            return;
        }
        if (StringUtil.checkUstel(ustel) == false) {
            JOptionPane.showMessageDialog(this, "联系电话格式不正确！");
            return;
        }
        if (StringUtil.checkUsemail(usemail) == false) {
            JOptionPane.showMessageDialog(this, "邮箱格式不正确！");
            return;
        }
        //组合对象
        User u = new User(null, usname, password1, realname, idnumber, ustel, usemail, position);
        //调用业务类
        //验证用户名是否存在
        User newu = ubiz.findByUsname(usname);
        if (newu != null) {
            JOptionPane.showMessageDialog(this, "用户名已存在！");
            //清空面板信息
            clearInput();
            return;
        } else {
            boolean result = ubiz.add(u);
            if (result == true) {
                JOptionPane.showMessageDialog(this, "注册成功！");
                this.dispose(); //注册界面消失
            } else {
                JOptionPane.showMessageDialog(this, "注册失败！");
            }
            //清空面板信息
            clearInput();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // 取消/退出
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtPswdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPswdMouseClicked
        // 提示用户名是否可用
        String usname = this.txtUsname.getText().trim();
        User newuser = ubiz.findByUsname(usname);
        if (newuser != null) {
            this.hintLabel.setText("用户名已存在，换一个吧╮(╯▽╰)╭");
        } else if (usname.length() > 0) {
            this.hintLabel.setText("可用的用户名٩(๑´0`๑)۶");
        }
    }//GEN-LAST:event_txtPswdMouseClicked

    private void txtPswd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPswd2MouseClicked
        checkPwdStatus();
    }//GEN-LAST:event_txtPswd2MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // 提示用户名是否可用
        checkUsernameExist();
        // 测试密码强度
        checkPwdStatus();
        
    }//GEN-LAST:event_formMouseClicked

    private void txtPswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPswdActionPerformed
        // 提示用户名是否可用
        checkUsernameExist();
    }//GEN-LAST:event_txtPswdActionPerformed
    private void clearInput() {
        this.txtUsname.setText("");
        this.txtPswd.setText("");
        this.txtRealName.setText("");
        this.txtIdNumber.setText("");
        this.txtUsTel.setText("");
        this.txtUsEmail.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox comPosition;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JTextField txtIdNumber;
    private javax.swing.JTextField txtMid;
    private javax.swing.JPasswordField txtPswd;
    private javax.swing.JPasswordField txtPswd2;
    private javax.swing.JTextField txtRealName;
    private javax.swing.JTextField txtStrong;
    private javax.swing.JTextField txtUsEmail;
    private javax.swing.JTextField txtUsTel;
    private javax.swing.JTextField txtUsname;
    private javax.swing.JTextField txtWeak;
    // End of variables declaration//GEN-END:variables
    public void checkUsernameExist(){
        // 提示用户名是否可用
        String usname = this.txtUsname.getText().trim();
        User newuser = ubiz.findByUsname(usname);
        if (newuser != null) {
            this.hintLabel.setText("用户名已存在，换一个吧╮(╯▽╰)╭");
        } else if (usname.length() > 0) {
            this.hintLabel.setText("可用的用户名٩(๑´0`๑)۶");
        }
    }
    
    public void checkPwdStatus(){
        char[] pswd1 = this.txtPswd.getPassword();
        String password1 = new String(pswd1);//将字符型数组转成字符串
        if (password1.length() < 6) {

        } else if (password1.length() <= 10) {
            this.txtWeak.setBackground(Color.red);
            this.statusLbl.setText("低");
        } else if (password1.length() <= 14) {
            this.txtWeak.setBackground(Color.yellow);
            this.txtMid.setBackground(Color.yellow);
            this.statusLbl.setText("中");
        } else if (password1.length() <= 18) {
            this.txtWeak.setBackground(Color.green);
            this.txtMid.setBackground(Color.green);
            this.txtStrong.setBackground(Color.green);
            this.statusLbl.setText("高");
        }
    }

}

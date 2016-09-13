/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.cpss.util;

import com.ouc.cpss.po.Product;
import com.ouc.cpss.vo.ViewStorecount;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ColorTableRender {

    public static void setBackColor(JTable table) {
        System.out.println("设置颜色1---------------");
        try {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer() {
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    if (row % 2 == 0) {
                        setBackground(Color.white);
                    } else {
                        setBackground(Color.LIGHT_GRAY);
                    }
                    if (Integer.parseInt(table.getValueAt(row, 3).toString()) < Integer.parseInt(table.getValueAt(row, 4).toString())) {
                        setBackground(Color.red);
                    }
                    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                }
            };
            for (int i = 0; i < table.getColumnCount(); i++) {
                table.getColumn(table.getColumnName(i)).setCellRenderer(tcr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setBackColor(JTable table, JTable table2) {
        // System.out.println("设置颜色1---------------");
        try {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer() {
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    if (row % 2 == 0) {
                        setBackground(Color.white);
                    } else {
                        setBackground(Color.LIGHT_GRAY);
                    }
                    DefaultTableModel dtm = (DefaultTableModel) table2.getModel();
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        if (Integer.parseInt(table.getValueAt(row, 0).toString()) == (Integer.parseInt(table2.getValueAt(i, 0).toString()))) {
                            setBackground(Color.YELLOW);
                        }
                        System.out.println(i);
                    }
                    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                }
            };
            for (int i = 0; i < table.getColumnCount(); i++) {
                table.getColumn(table.getColumnName(i)).setCellRenderer(tcr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

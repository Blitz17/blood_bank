/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.blood_bank;

import java.sql.*;
import javax.swing.*;



/**
 *
 * @author User 01
 */
public class Recipient_Information extends javax.swing.JFrame {
    boolean nameo, cityo, bgo, amounto;
    int count = 5;
    /**
     * Creates new form Recipient_Information
     */
    public Recipient_Information() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        city_reciever = new javax.swing.JTextField();
        blood_grp_reciever = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name_reciever = new javax.swing.JTextField();
        amount_reciever = new javax.swing.JTextField();
        rb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(425, 325));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel2.setText("Recieve Blood");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 200, 60);

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel7.setText("Blood Type:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 160, 100, 20);

        jLabel8.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel8.setText("Amount:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 200, 70, 20);

        city_reciever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_recieverActionPerformed(evt);
            }
        });
        getContentPane().add(city_reciever);
        city_reciever.setBounds(40, 120, 64, 22);

        blood_grp_reciever.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AB+", "A+", "B+", "O+", "AB-", "A-", "B-", "O-" }));
        blood_grp_reciever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blood_grp_recieverActionPerformed(evt);
            }
        });
        getContentPane().add(blood_grp_reciever);
        blood_grp_reciever.setBounds(100, 160, 72, 22);

        jLabel10.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel10.setText("Name:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 80, 60, 20);

        jLabel11.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel11.setText("City:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 120, 60, 20);

        name_reciever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_recieverActionPerformed(evt);
            }
        });
        getContentPane().add(name_reciever);
        name_reciever.setBounds(60, 80, 64, 22);

        amount_reciever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_recieverActionPerformed(evt);
            }
        });
        getContentPane().add(amount_reciever);
        amount_reciever.setBounds(70, 200, 64, 22);

        rb.setText("Check>>");
        rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActionPerformed(evt);
            }
        });
        getContentPane().add(rb);
        rb.setBounds(160, 240, 77, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhanu\\OneDrive\\Desktop\\images_ccexpress.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-470, -90, 954, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blood_grp_recieverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blood_grp_recieverActionPerformed
        // TODO add your handling code here:
        bgo = true;
    }//GEN-LAST:event_blood_grp_recieverActionPerformed

    private void city_recieverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_recieverActionPerformed
        // TODO add your handling code here:
        cityo = true;
    }//GEN-LAST:event_city_recieverActionPerformed

    private void amount_recieverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount_recieverActionPerformed
        // TODO add your handling code here:
        amounto = true;
    }//GEN-LAST:event_amount_recieverActionPerformed

    private void name_recieverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_recieverActionPerformed
        // TODO add your handling code here:
        nameo = true;
    }//GEN-LAST:event_name_recieverActionPerformed

    private void rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActionPerformed
        // TODO add your handling code here:
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_management","root","Dhanush1Vedant0");
        
        PreparedStatement insert_stmt=con.prepareStatement("INSERT INTO Recipient values(?,?,?,?,?)");
        insert_stmt.setInt(1, count); // primary key - donorID
        insert_stmt.setString(2, name_reciever.getText().toLowerCase()); // var name of donor
        insert_stmt.setString(3, city_reciever.getText().toLowerCase()); // var city of the donor
        insert_stmt.setString(4, (String) blood_grp_reciever.getSelectedItem()); // var blood group of the donor
        insert_stmt.setInt(5, Integer.parseInt(amount_reciever.getText())); // var amount of blood
        int i= insert_stmt.executeUpdate();  
        System.out.println(i+" records inserted");
        String r_bg = (String)blood_grp_reciever.getSelectedItem();
        String r_city = city_reciever.getText().toLowerCase();
        int r_amount = Integer.parseInt(amount_reciever.getText());
        new Donor_Results(count, r_bg, r_city, r_amount).setVisible(true);
        count++;
        dispose();
        con.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_rbActionPerformed

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
            java.util.logging.Logger.getLogger(Recipient_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recipient_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recipient_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recipient_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recipient_Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount_reciever;
    private javax.swing.JComboBox<String> blood_grp_reciever;
    private javax.swing.JTextField city_reciever;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField name_reciever;
    private javax.swing.JButton rb;
    // End of variables declaration//GEN-END:variables
}

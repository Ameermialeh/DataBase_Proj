/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbgtcar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ameer
 */
public class ChangePass extends javax.swing.JFrame {

    /**
     * Creates new form DeleteProdS
     */
    public ChangePass() {
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

        jPanel1 = new javax.swing.JPanel();
        jLheader = new javax.swing.JLabel();
        jLheader1 = new javax.swing.JLabel();
        jTsearchbyname = new javax.swing.JTextField();
        jBsearchaddprod = new javax.swing.JButton();
        jLheader2 = new javax.swing.JLabel();
        jTsearchbyname1 = new javax.swing.JTextField();
        jLheader3 = new javax.swing.JLabel();
        jTsearchbyname2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(241, 223, 169));

        jLheader.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader.setText("Old Password");

        jLheader1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader1.setText("CHANGE PRODUCT");

        jTsearchbyname.setBackground(new java.awt.Color(45, 72, 77));
        jTsearchbyname.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jTsearchbyname.setForeground(new java.awt.Color(255, 255, 255));
        jTsearchbyname.setBorder(null);
        jTsearchbyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTsearchbynameActionPerformed(evt);
            }
        });

        jBsearchaddprod.setBackground(new java.awt.Color(241, 223, 169));
        jBsearchaddprod.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jBsearchaddprod.setForeground(new java.awt.Color(51, 51, 51));
        jBsearchaddprod.setText("Save");
        jBsearchaddprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBsearchaddprodMousePressed(evt);
            }
        });
        jBsearchaddprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsearchaddprodActionPerformed(evt);
            }
        });

        jLheader2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader2.setText("New Password");

        jTsearchbyname1.setBackground(new java.awt.Color(45, 72, 77));
        jTsearchbyname1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jTsearchbyname1.setForeground(new java.awt.Color(255, 255, 255));
        jTsearchbyname1.setBorder(null);
        jTsearchbyname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTsearchbyname1ActionPerformed(evt);
            }
        });

        jLheader3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader3.setText("User Name");

        jTsearchbyname2.setBackground(new java.awt.Color(45, 72, 77));
        jTsearchbyname2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jTsearchbyname2.setForeground(new java.awt.Color(255, 255, 255));
        jTsearchbyname2.setBorder(null);
        jTsearchbyname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTsearchbyname2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(241, 223, 169));
        jLabel1.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLheader2)
                    .addComponent(jLheader)
                    .addComponent(jLheader3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTsearchbyname1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTsearchbyname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTsearchbyname2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLheader1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jBsearchaddprod, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLheader1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLheader3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTsearchbyname2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLheader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTsearchbyname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTsearchbyname1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLheader2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBsearchaddprod)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTsearchbynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTsearchbynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTsearchbynameActionPerformed

    private void jBsearchaddprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsearchaddprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsearchaddprodActionPerformed

    private void jTsearchbyname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTsearchbyname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTsearchbyname1ActionPerformed

    private void jTsearchbyname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTsearchbyname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTsearchbyname2ActionPerformed

    private void jBsearchaddprodMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBsearchaddprodMousePressed
        // TODO add your handling code here:
          String url="jdbc:oracle:thin:@localhost:1521:xe";
          ResultSet rs = null;
          String str="",pass="";
          String newpass=jTsearchbyname1.getText();
          
            try {
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                Connection conn=DriverManager.getConnection(url, "c##ameer", "123456");
                if(!this.jTsearchbyname2.getText().isEmpty() && !jTsearchbyname1.getText().isEmpty() && !jTsearchbyname.getText().isEmpty()){
                    String strStmt="select * from admininfo where username='"+this.jTsearchbyname2.getText()+"'";
                    String strStmt3="UPDATE admininfo SET password= ? WHERE username= ?";
                    PreparedStatement pst3= conn.prepareStatement(strStmt3);
                    PreparedStatement pst= conn.prepareStatement(strStmt);

                    rs = pst.executeQuery();
                    if (rs.next()) {                    
                        str=rs.getString("username");
                        pass=rs.getString("password");
                    }

                    if(str.equals(jTsearchbyname2.getText()) && pass.equals(jTsearchbyname.getText()) ){

                        pst3.setString(1, newpass);
                        pst3.setString(2, str);
                        pst3.executeUpdate();
                        jLabel1.setText("The Password changed");
                    }
                    else{
                         jLabel1.setText("wrong Username or Password");
                    }
                }else{jLabel1.setText("Please enter the empty field");}
                conn.setAutoCommit(false);
                conn.commit();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DeleteProdA.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jBsearchaddprodMousePressed

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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsearchaddprod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLheader;
    private javax.swing.JLabel jLheader1;
    private javax.swing.JLabel jLheader2;
    private javax.swing.JLabel jLheader3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTsearchbyname;
    private javax.swing.JTextField jTsearchbyname1;
    private javax.swing.JTextField jTsearchbyname2;
    // End of variables declaration//GEN-END:variables
}

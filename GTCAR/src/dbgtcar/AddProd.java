/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dbgtcar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

/**
 *
 * @author ameer
 */
public class AddProd extends javax.swing.JFrame {

    /**
     * Creates new form AddProd
     */
    public AddProd() {
        initComponents();
        
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        ResultSet rs;
         LinkedList inls = new LinkedList<String>();
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn=DriverManager.getConnection(url, "c##ameer", "123456");  
            String strStmt="select CAR_TYPE from CAR";
            PreparedStatement pst= conn.prepareStatement(strStmt);
            rs = pst.executeQuery();

          
                
                while(rs.next()){
                    String ins =rs.getString(1);
                    if(!inls.contains(ins)){
                        jCcartype.addItem(ins);
                        inls.add(ins);
                    }
                }
            conn.close();
            jCcarname.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(AddProd.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLheader2 = new javax.swing.JLabel();
        jLheader3 = new javax.swing.JLabel();
        jLheader4 = new javax.swing.JLabel();
        jLheader5 = new javax.swing.JLabel();
        jTserid = new javax.swing.JTextField();
        jTprodn = new javax.swing.JTextField();
        jTQ = new javax.swing.JTextField();
        jBaddproducts = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLmasg = new javax.swing.JLabel();
        jLheader6 = new javax.swing.JLabel();
        jTpri = new javax.swing.JTextField();
        jLheader7 = new javax.swing.JLabel();
        jCcartype = new javax.swing.JComboBox<>();
        jCcarname = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(241, 223, 169));

        jLheader.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader.setText("ADD PRODUCT");

        jLheader1.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader1.setText("Serial ID :");

        jLheader2.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader2.setText("Product Name :");

        jLheader3.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader3.setText("Quantity :");

        jLheader4.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader4.setText("Date Of Purchase :");

        jLheader5.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader5.setText("Car Type :");

        jTserid.setBackground(new java.awt.Color(45, 72, 77));
        jTserid.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jTserid.setForeground(new java.awt.Color(255, 255, 255));
        jTserid.setBorder(null);
        jTserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTseridActionPerformed(evt);
            }
        });

        jTprodn.setBackground(new java.awt.Color(45, 72, 77));
        jTprodn.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jTprodn.setForeground(new java.awt.Color(255, 255, 255));
        jTprodn.setBorder(null);
        jTprodn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprodnActionPerformed(evt);
            }
        });

        jTQ.setBackground(new java.awt.Color(45, 72, 77));
        jTQ.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jTQ.setForeground(new java.awt.Color(255, 255, 255));
        jTQ.setText(" ");
        jTQ.setBorder(null);
        jTQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTQActionPerformed(evt);
            }
        });

        jBaddproducts.setBackground(new java.awt.Color(241, 223, 169));
        jBaddproducts.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jBaddproducts.setForeground(new java.awt.Color(51, 51, 51));
        jBaddproducts.setText("ADD");
        jBaddproducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddproductsActionPerformed(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(45, 72, 77));
        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        jLmasg.setBackground(new java.awt.Color(241, 223, 169));
        jLmasg.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLmasg.setForeground(new java.awt.Color(255, 0, 51));

        jLheader6.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader6.setText("Car Name :");

        jTpri.setBackground(new java.awt.Color(45, 72, 77));
        jTpri.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jTpri.setForeground(new java.awt.Color(255, 255, 255));
        jTpri.setBorder(null);
        jTpri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTpriActionPerformed(evt);
            }
        });

        jLheader7.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLheader7.setText("Price :");

        jCcartype.setEditable(true);
        jCcartype.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jCcartype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcartypeActionPerformed(evt);
            }
        });

        jCcarname.setEditable(true);
        jCcarname.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jCcarname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcarnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLheader))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLheader4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jLheader3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLheader5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLheader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLheader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLheader6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLheader7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTQ)
                            .addComponent(jTserid)
                            .addComponent(jTpri)
                            .addComponent(jTprodn)
                            .addComponent(jCcartype, 0, 188, Short.MAX_VALUE)
                            .addComponent(jCcarname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jBaddproducts, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLmasg, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLheader)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLheader1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTserid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTprodn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLheader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCcartype, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLheader5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLheader6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCcarname, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLheader3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLheader4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLheader7)
                    .addComponent(jTpri, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLmasg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBaddproducts)
                .addGap(31, 31, 31))
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

    private void jTseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTseridActionPerformed

    private void jTprodnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprodnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprodnActionPerformed

    private void jTQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTQActionPerformed

    private void jBaddproductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddproductsActionPerformed
        // TODO add your handling code here:
           ResultSet rs=null;
           int id=0;
           try {
            // TODO add your handling code here:
            String url="jdbc:oracle:thin:@localhost:1521:xe";
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn=DriverManager.getConnection(url, "c##ameer", "123456");   
                        String strStmt="insert into product (PROD_ID, PROD_NAME, QUANTITY,DATE_OF_PURCHASE,PRICE) values (?,?,?,to_date(?, 'dd-MM-yyyy'),?)";
                        String strStmt2="insert into prodcar (PROD_ID, CAR_ID) values (?,?)";
                        String strStmt3="select CAR_ID from car where car_type = ? and car_name = ?";
                        PreparedStatement pst= conn.prepareStatement(strStmt);
                        PreparedStatement pst2= conn.prepareStatement(strStmt2);
                        PreparedStatement pst3= conn.prepareStatement(strStmt3);
                        pst3.setString(1, jCcartype.getSelectedItem().toString());
                        pst3.setString(2, jCcarname.getSelectedItem().toString());
                        rs = pst3.executeQuery();
                          
                        if(jTserid.getText().trim().isEmpty() || jTprodn.getText().trim().isEmpty() || jTQ.getText().trim().isEmpty() || jTpri.getText().trim().isEmpty()||jDateChooser1.getDate()==null || jCcartype.getSelectedItem().toString().isEmpty() || jCcarname.getSelectedItem().toString().isEmpty() ){
                        jLmasg.setText("Please enter the empty field");
                        }
                        else{
                        pst.setInt(1, Integer.parseInt(jTserid.getText().trim()));
            
                        pst.setString(2, jTprodn.getText());
            
                        pst.setInt(3, Integer.parseInt(jTQ.getText().trim()));
            
                        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                        String date= sdf.format(jDateChooser1.getDate());
                        pst.setString(4, date);
            
                        pst.setInt(5,Integer.parseInt(jTpri.getText().trim()));
                       
                            if(rs.next()){
                                
                                     id=rs.getInt("car_id");
                               
                            }
                        pst2.setInt(1, Integer.parseInt(jTserid.getText().trim()));
                        pst2.setInt(2, id);
                       
                        pst.executeUpdate();
                        pst2.executeUpdate();
                        
                        jLmasg.setText("The Product is added");
                        }
                        conn.setAutoCommit(false);
                        conn.commit();
                        conn.close();
                        
                  
        } catch (SQLException ex) {
            Logger.getLogger(AdminInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBaddproductsActionPerformed

    private void jTpriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpriActionPerformed

    private void jCcartypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcartypeActionPerformed
        // TODO add your handling code here:
                 
        jCcarname.removeAllItems();
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        ResultSet rs = null;
       
            try {
                DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
                Connection conn=DriverManager.getConnection(url, "c##ameer", "123456");

                String strStmt="select * from CAR where CAR_TYPE='"+this.jCcartype.getSelectedItem().toString()+"'";
                PreparedStatement pst= conn.prepareStatement(strStmt);


                rs = pst.executeQuery();

                while (rs.next()) {          
                     jCcarname.addItem(rs.getString("car_name"));
                }
                jCcarname.setEnabled(true);
                conn.setAutoCommit(false);
                conn.commit();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DeleteProdA.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
    }//GEN-LAST:event_jCcartypeActionPerformed

    private void jCcarnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcarnameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCcarnameActionPerformed

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
            java.util.logging.Logger.getLogger(AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProd().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaddproducts;
    private javax.swing.JComboBox<String> jCcarname;
    private javax.swing.JComboBox<String> jCcartype;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLheader;
    private javax.swing.JLabel jLheader1;
    private javax.swing.JLabel jLheader2;
    private javax.swing.JLabel jLheader3;
    private javax.swing.JLabel jLheader4;
    private javax.swing.JLabel jLheader5;
    private javax.swing.JLabel jLheader6;
    private javax.swing.JLabel jLheader7;
    private javax.swing.JLabel jLmasg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTQ;
    private javax.swing.JTextField jTpri;
    private javax.swing.JTextField jTprodn;
    private javax.swing.JTextField jTserid;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.demo;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author HESHAN
 */
public class PlaceOrder extends javax.swing.JFrame {

    /**
     * Creates new form PlaceOrder
     */
    public PlaceOrder() {
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

        OrderId = new javax.swing.JLabel();
        Phonenumber = new javax.swing.JLabel();
        Phonenumbertxt = new javax.swing.JTextField();
        sizes = new javax.swing.JLabel();
        sizestxt = new javax.swing.JTextField();
        QTY = new javax.swing.JLabel();
        QTYtxt = new javax.swing.JTextField();
        Amount = new javax.swing.JLabel();
        Sizess = new javax.swing.JLabel();
        Place = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        aMOUNT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        OrderId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OrderId.setText("Order Id :");

        Phonenumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Phonenumber.setText("Customer ID :");

        Phonenumbertxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Phonenumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhonenumbertxtActionPerformed(evt);
            }
        });
        Phonenumbertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhonenumbertxtKeyPressed(evt);
            }
        });

        sizes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sizes.setText("T-shirt size :");

        sizestxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sizestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizestxtActionPerformed(evt);
            }
        });

        QTY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QTY.setText("QTY :");

        QTYtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QTYtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QTYtxtActionPerformed(evt);
            }
        });
        QTYtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QTYtxtKeyReleased(evt);
            }
        });

        Amount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Amount.setText("Amount :");

        Sizess.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sizess.setText("(XS/S/M/L/XL/XXL)");

        Place.setBackground(new java.awt.Color(0, 204, 204));
        Place.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Place.setForeground(new java.awt.Color(255, 255, 255));
        Place.setText("Place");
        Place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(255, 0, 51));
        Back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        aMOUNT.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                aMOUNTAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QTY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Phonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sizes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Phonenumbertxt)
                    .addComponent(sizestxt)
                    .addComponent(QTYtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aMOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Sizess)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Place)
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Phonenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sizes)
                        .addComponent(sizestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Sizess, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QTY)
                    .addComponent(QTYtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(Place)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        count++;
        String id = String.format("ORD#%05d", count);
        jLabel1.setText(id);
        Phonenumbertxt.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void PhonenumbertxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhonenumbertxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String phonenumber = Phonenumbertxt.getText();
            if (phonenumber.charAt(0) != '0' || phonenumber.length() != 10) {
                System.out.println("\t\tInvalid Phone number.. Try again \n");
                JOptionPane.showMessageDialog(this, "error", "error", JOptionPane.ERROR_MESSAGE);
                Phonenumbertxt.requestFocus();
            } else {
                sizestxt.requestFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_PhonenumbertxtKeyPressed

    private void PhonenumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhonenumbertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhonenumbertxtActionPerformed

    private void sizestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizestxtActionPerformed
        String sz = sizestxt.getText();
        if ("XS".equalsIgnoreCase(sz) || "S".equalsIgnoreCase(sz) || "M".equalsIgnoreCase(sz) || "L".equalsIgnoreCase(sz) || "XL".equalsIgnoreCase(sz) || "XXL".equalsIgnoreCase(sz)) {
            QTYtxt.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "error", "error", JOptionPane.ERROR_MESSAGE);
            sizestxt.requestFocus();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_sizestxtActionPerformed

    private void QTYtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QTYtxtActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_QTYtxtActionPerformed

    private void aMOUNTAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_aMOUNTAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_aMOUNTAncestorAdded

    private void QTYtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QTYtxtKeyReleased
    String QTY = QTYtxt.getText();
        String sz = sizestxt.getText();
        double amount = 0;
        if (QTY.matches("\\d+")) {
            
            int qty1 = Integer.parseInt(QTY);
            switch (sz) {
                case "XS":
                    amount = qty1 * 600;
                    break;
                case "S":
                    amount = qty1 * 800;
                    break;
                case "M":
                    amount = qty1 * 900;
                    break;
                case "L":
                    amount = qty1 * 1000;
                    break;
                case "XL":
                    amount = qty1 * 1100;
                    break;
                case "XXL":
                    amount = qty1 * 1200;
                    break;
            }
        }
        String Namount = Double.toString(amount);
        aMOUNT.setText(Namount);
// TODO add your handling code here:
    }//GEN-LAST:event_QTYtxtKeyReleased

    private void PlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceActionPerformed
        String id = jLabel1.getText();
        String phonenumber = Phonenumbertxt.getText();
        String sizes = sizestxt.getText();
        int qty = Integer.parseInt(QTYtxt.getText());
        double amount = Double.parseDouble(aMOUNT.getText());
        // TODO add your handling code here:
        
        Customer cs1 = new Customer(sizes, id, phonenumber, amount, qty, "Processing");
        JOptionPane.showMessageDialog(this,"Order Placed","Infromation",JOptionPane.INFORMATION_MESSAGE);
            sizestxt.requestFocus();

    }//GEN-LAST:event_PlaceActionPerformed

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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }
    public static int count = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JButton Back;
    private javax.swing.JLabel OrderId;
    private javax.swing.JLabel Phonenumber;
    private javax.swing.JTextField Phonenumbertxt;
    private javax.swing.JButton Place;
    private javax.swing.JLabel QTY;
    private javax.swing.JTextField QTYtxt;
    private javax.swing.JLabel Sizess;
    private javax.swing.JLabel aMOUNT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel sizes;
    private javax.swing.JTextField sizestxt;
    // End of variables declaration//GEN-END:variables
}

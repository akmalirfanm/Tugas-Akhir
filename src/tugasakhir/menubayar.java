/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 *
 * @author PREDATOR
 */
public class menubayar extends javax.swing.JFrame {

    /**
     * Creates new form menubayar
     */
    public menubayar() {
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
        resetbutton = new javax.swing.JButton();
        buybutton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amount2 = new javax.swing.JTextField();
        cbxdiamond = new javax.swing.JCheckBox();
        price2 = new javax.swing.JLabel();
        cbxexpcards = new javax.swing.JCheckBox();
        cbxbp = new javax.swing.JCheckBox();
        price3 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        amount3 = new javax.swing.JTextField();
        amount1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordertable = new javax.swing.JTable();
        additembutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalharga = new javax.swing.JTextField();
        bpcash = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setText("PAYMENT MENU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 60));

        resetbutton.setBackground(new java.awt.Color(51, 0, 153));
        resetbutton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        resetbutton.setForeground(new java.awt.Color(153, 204, 255));
        resetbutton.setText("RESET");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(resetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 140, 40));

        buybutton.setBackground(new java.awt.Color(51, 0, 153));
        buybutton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        buybutton.setForeground(new java.awt.Color(153, 204, 255));
        buybutton.setText("BUY");
        buybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buybuttonActionPerformed(evt);
            }
        });
        getContentPane().add(buybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 140, 40));

        logoutbutton.setBackground(new java.awt.Color(51, 0, 153));
        logoutbutton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        logoutbutton.setForeground(new java.awt.Color(153, 204, 255));
        logoutbutton.setText("LOG OUT");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 140, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRICE :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 100, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AMOUNT :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 100, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ITEM MENU :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

        amount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount2ActionPerformed(evt);
            }
        });
        getContentPane().add(amount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 70, 30));

        cbxdiamond.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        cbxdiamond.setForeground(new java.awt.Color(255, 255, 255));
        cbxdiamond.setText("Diamond");
        getContentPane().add(cbxdiamond, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 30));

        price2.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        price2.setForeground(new java.awt.Color(255, 255, 255));
        price2.setText("1000");
        getContentPane().add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, 20));

        cbxexpcards.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        cbxexpcards.setForeground(new java.awt.Color(255, 255, 255));
        cbxexpcards.setText("Exp Cards");
        getContentPane().add(cbxexpcards, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 30));

        cbxbp.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        cbxbp.setForeground(new java.awt.Color(255, 255, 255));
        cbxbp.setText("Battle Point");
        getContentPane().add(cbxbp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 30));

        price3.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        price3.setForeground(new java.awt.Color(255, 255, 255));
        price3.setText("200");
        getContentPane().add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 60, 20));

        price1.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        price1.setForeground(new java.awt.Color(255, 255, 255));
        price1.setText("100");
        getContentPane().add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 50, 30));

        amount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount3ActionPerformed(evt);
            }
        });
        getContentPane().add(amount3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 70, 30));
        getContentPane().add(amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 70, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("YOUR ORDER :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 30));

        ordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM MENU", "PRICE", "AMOUNT"
            }
        ));
        jScrollPane2.setViewportView(ordertable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 520, 140));

        additembutton.setBackground(new java.awt.Color(51, 0, 153));
        additembutton.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        additembutton.setForeground(new java.awt.Color(153, 204, 255));
        additembutton.setText("ADD ITEM");
        additembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additembuttonActionPerformed(evt);
            }
        });
        getContentPane().add(additembutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 140, 40));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL BAYAR :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CASH ANDA :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));
        getContentPane().add(totalharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 160, 30));
        getContentPane().add(bpcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 160, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\PREDATOR\\Downloads\\rsz_1sky.jpg")); // NOI18N
        jPanel1.add(jLabel8);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void total()
    {DefaultTableModel dataModel = (DefaultTableModel) ordertable.getModel();
            int jumlah = dataModel.getRowCount();
            double result = 0;
            
            for (int i = 0; i < jumlah; i++)
            {
                double dataPrice = Double.valueOf(dataModel.getValueAt(i,1).toString());
                double dataAmount = Double.valueOf(dataModel.getValueAt(i,2).toString());
                result += dataPrice * dataAmount;
            }
    totalharga.setText(Double.toString(result));
    }
    
    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
       DefaultTableModel mod = (DefaultTableModel) ordertable.getModel();
        for (int i = mod.getRowCount() - 1; i >= 0; i--)
        {
            mod = (DefaultTableModel) ordertable.getModel();
            mod.removeRow(i);
        }
        totalharga.setText("");
        bpcash.setText("");
        amount1.setText("");
        amount2.setText("");
        amount3.setText("");
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        Login loginmenu = new Login();
        loginmenu.setVisible(true);
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void buybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buybuttonActionPerformed
        double harga = Double.parseDouble(totalharga.getText());
        double uang = Double.parseDouble(bpcash.getText());
            if (uang >= harga)
            {
                JOptionPane.showMessageDialog (buybutton, "Pembayaran Berhasil, Terima Kasih!");
            }
            else
            {
                JOptionPane.showMessageDialog (buybutton, "Maaf, Saldo Anda tidak cukup");
            }
    }//GEN-LAST:event_buybuttonActionPerformed

    private void amount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount3ActionPerformed

    private void amount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount2ActionPerformed

    private void additembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additembuttonActionPerformed
        String battlepoint = "";
        String price = "";
        String amount = "";
        int bayar = 0;
        DefaultTableModel mod = (DefaultTableModel) ordertable.getModel();
       
        
        
        if (cbxbp.isSelected())
        {
            
            battlepoint  = cbxbp.getText();
            price        = price1.getText();
            amount       = amount1.getText();
            Object[] data = {battlepoint, price, amount};
            mod.addRow(data);
        }
        if (cbxdiamond.isSelected())
        {
            
            battlepoint    = cbxdiamond.getText();
            price          = price2.getText();
            amount         = amount2.getText();
            Object[] data = {battlepoint, price, amount};
            mod.addRow(data);
        }
        if (cbxexpcards.isSelected())
        {
            
            battlepoint   = cbxexpcards.getText();
            price         = price3.getText();
            amount        = amount3.getText();
            Object[] data = {battlepoint, price, amount};
            mod.addRow(data);
        }
        total();
    }//GEN-LAST:event_additembuttonActionPerformed

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
            java.util.logging.Logger.getLogger(menubayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menubayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menubayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menubayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menubayar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additembutton;
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amount2;
    private javax.swing.JTextField amount3;
    private javax.swing.JTextField bpcash;
    private javax.swing.JButton buybutton;
    private javax.swing.JCheckBox cbxbp;
    private javax.swing.JCheckBox cbxdiamond;
    private javax.swing.JCheckBox cbxexpcards;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JTable ordertable;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    private javax.swing.JButton resetbutton;
    private javax.swing.JTextField totalharga;
    // End of variables declaration//GEN-END:variables
}

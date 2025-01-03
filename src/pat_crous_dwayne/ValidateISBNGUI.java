/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pat_crous_dwayne;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dwayne
 */
public class ValidateISBNGUI extends javax.swing.JFrame {

    /**
     * Creates new form ValidateISBNGUI
     */
    public ValidateISBNGUI() {
        initComponents();
        setAppIcon();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txfISBNNumber = new javax.swing.JTextField();
        txfAnswer = new javax.swing.JTextField();
        btnBackToMainMenu = new javax.swing.JButton();
        btnValidate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System | Dwayne Crous");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Library Management System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Developed By Dwayne Crous");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(81, 113, 165));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 90));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Validate ISBN number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(81, 113, 165));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Dwayne Crous Development © 2024");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(351, 351, 351))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 950, -1));

        jPanel3.setBackground(new java.awt.Color(152, 185, 171));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Enter an ISBN number to check if it is valid");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        txfISBNNumber.setBackground(new java.awt.Color(176, 181, 179));
        txfISBNNumber.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txfISBNNumber.setForeground(new java.awt.Color(0, 0, 0));
        txfISBNNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txfISBNNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 370, 40));

        txfAnswer.setEditable(false);
        txfAnswer.setBackground(new java.awt.Color(176, 181, 179));
        txfAnswer.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txfAnswer.setForeground(new java.awt.Color(0, 0, 0));
        txfAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txfAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 370, 40));

        btnBackToMainMenu.setBackground(new java.awt.Color(176, 181, 179));
        btnBackToMainMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnBackToMainMenu.setText("Back");
        btnBackToMainMenu.setToolTipText("When clicked, it takes you back to the main menu.");
        btnBackToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMainMenuActionPerformed(evt);
            }
        });
        jPanel3.add(btnBackToMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, -1, 40));

        btnValidate.setBackground(new java.awt.Color(176, 181, 179));
        btnValidate.setForeground(new java.awt.Color(0, 0, 0));
        btnValidate.setText("Validate");
        btnValidate.setToolTipText("When clicked, this button will check if the number is valid.");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });
        jPanel3.add(btnValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 230, 40));

        btnClear.setBackground(new java.awt.Color(176, 181, 179));
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.setToolTipText("Clears the place where you enter your ISBN number if you want to check more than one.");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 230, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 950, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMainMenuActionPerformed
        // TODO add your handling code here:
        MainMenuGUI menuGUI = new MainMenuGUI();
        menuGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToMainMenuActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txfAnswer.setText("");
        txfISBNNumber.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        // TODO add your handling code here:
        MANAGER_CLASS mc = new MANAGER_CLASS();
        String isbnNum = txfISBNNumber.getText();
        
        if (mc.ValidateISBN(isbnNum) == true) 
        {
            txfAnswer.setText("The ISBN number is valid :)");
        } 
        else if (mc.ValidateISBN(isbnNum) == false)
        {
            txfAnswer.setText("The ISBN number is not valid :(");
        }
    }//GEN-LAST:event_btnValidateActionPerformed

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
            java.util.logging.Logger.getLogger(ValidateISBNGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidateISBNGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidateISBNGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidateISBNGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidateISBNGUI().setVisible(true);
            }
        });
    }
    
    private void setAppIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/Square71x71Logo.scale-100.png"));
        setIconImage(icon.getImage());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToMainMenu;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txfAnswer;
    private javax.swing.JTextField txfISBNNumber;
    // End of variables declaration//GEN-END:variables
}

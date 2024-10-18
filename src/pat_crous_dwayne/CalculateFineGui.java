/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pat_crous_dwayne;

import javax.swing.ImageIcon;

/**
 *
 * @author dwayne
 */
public class CalculateFineGui extends javax.swing.JFrame {

    /**
     * Creates new form CalculateFineGui
     */
    public CalculateFineGui() {
        initComponents();
        setAppIcon();
        MANAGER_CLASS mc = new MANAGER_CLASS();
        txtAmtDue.setText("R" + mc.Fine());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtAmtDue = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System | Dwayne Crous");
        setMinimumSize(new java.awt.Dimension(950, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Library Management System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Developed By Dwayne Crous");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dwayne Crous Development © 2024");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        jPanel1.setBackground(new java.awt.Color(81, 113, 165));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 950, -1));

        jPanel2.setBackground(new java.awt.Color(81, 113, 165));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        jPanel3.setBackground(new java.awt.Color(152, 185, 171));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(176, 181, 179));
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 100, 40));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Amount Due:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        txtAmtDue.setEditable(false);
        txtAmtDue.setBackground(new java.awt.Color(176, 181, 179));
        txtAmtDue.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtAmtDue.setForeground(new java.awt.Color(0, 0, 0));
        txtAmtDue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtAmtDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 300, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 950, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainMenuGUI menuGUI = new MainMenuGUI();
        menuGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateFineGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateFineGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateFineGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateFineGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateFineGui().setVisible(true);
            }
        });
    }
    
    private void setAppIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/Square71x71Logo.scale-100.png"));
        setIconImage(icon.getImage());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAmtDue;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projektjakubdrozdide16;

import java.util.Scanner;

/**
 *
 * @author jakub
 */
public class UvodniObrazovka extends javax.swing.JFrame {
    GUImanager gui = new GUImanager();
    
    /**
     * Creates new form UvodniObrazovka
     */
    public UvodniObrazovka() {
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
        StartTlacitko = new javax.swing.JButton();
        VyberSouboruText = new javax.swing.JTextField();
        VyberSouboruLabel = new javax.swing.JLabel();
        NacistSouborTlacitko = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Drozdova Úžasná Kvízová Aplikace");

        StartTlacitko.setText("Start");
        StartTlacitko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartTlacitkoActionPerformed(evt);
            }
        });

        VyberSouboruText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VyberSouboruTextActionPerformed(evt);
            }
        });

        VyberSouboruLabel.setText("Vyber si soubor:");

        NacistSouborTlacitko.setText("Načíst Soubor");
        NacistSouborTlacitko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NacistSouborTlacitkoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NacistSouborTlacitko)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StartTlacitko)
                                    .addComponent(VyberSouboruLabel))))
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(VyberSouboruText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(VyberSouboruLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VyberSouboruText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NacistSouborTlacitko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(StartTlacitko)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartTlacitkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartTlacitkoActionPerformed

    }//GEN-LAST:event_StartTlacitkoActionPerformed

    private void NacistSouborTlacitkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NacistSouborTlacitkoActionPerformed
        FileReader fr = new FileReader();
        String text = VyberSouboruText.getText();
        Scanner f = fr.NactiSoubor(text);
        VyberSouboruText.setText("");
        VyberSouboruLabel.setText("Soubor načten");
        var resetSkore = new Kviz(f);
        resetSkore.setSkore(0);
        gui.dalsiFrame(this, "Kviz");

    }//GEN-LAST:event_NacistSouborTlacitkoActionPerformed

    private void VyberSouboruTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VyberSouboruTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VyberSouboruTextActionPerformed

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
            java.util.logging.Logger.getLogger(UvodniObrazovka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UvodniObrazovka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UvodniObrazovka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UvodniObrazovka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UvodniObrazovka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NacistSouborTlacitko;
    private javax.swing.JButton StartTlacitko;
    private javax.swing.JLabel VyberSouboruLabel;
    private javax.swing.JTextField VyberSouboruText;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.iut;

/**
 *
 * @author roman
 */
public class VigenereGUI extends javax.swing.JFrame {

    /**
     * Creates new form VigenereGUI
     */
    public VigenereGUI() {
        initComponents();
    }

    String normalize(String str) {
        return str.replaceAll("\\s+", "").toLowerCase();
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
        cleVigenere = new javax.swing.JTextField();
        crypterVigenere = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texteCrypteVigenere = new javax.swing.JTextArea();
        decrypterVigenere = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        texteDecrypteVigenere = new javax.swing.JTextArea();
        texteACrypter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Cryptage de Vigenere");

        jLabel1.setText("Saisissez votre clé :");

        crypterVigenere.setText("Crypter");
        crypterVigenere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crypterVigenereActionPerformed(evt);
            }
        });

        jLabel7.setText("Message crypté");

        texteCrypteVigenere.setColumns(20);
        texteCrypteVigenere.setRows(5);
        jScrollPane2.setViewportView(texteCrypteVigenere);

        decrypterVigenere.setText("Décrypter");
        decrypterVigenere.setToolTipText("");
        decrypterVigenere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrypterVigenereActionPerformed(evt);
            }
        });

        jLabel8.setText("Message décrypté");

        texteDecrypteVigenere.setEditable(false);
        texteDecrypteVigenere.setColumns(20);
        texteDecrypteVigenere.setRows(5);
        jScrollPane4.setViewportView(texteDecrypteVigenere);

        texteACrypter.setAlignmentX(0.0F);
        texteACrypter.setName("texteACrypter"); // NOI18N
        texteACrypter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texteACrypterActionPerformed(evt);
            }
        });

        jLabel3.setText("Saisissez votre message :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(crypterVigenere))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(decrypterVigenere))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(cleVigenere)
                            .addComponent(texteACrypter, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texteACrypter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cleVigenere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(decrypterVigenere)
                    .addComponent(crypterVigenere))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crypterVigenereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crypterVigenereActionPerformed
        String message = normalize(texteACrypter.getText());
        String key = Vigenere.makeKey(normalize(cleVigenere.getText()), message.length());
        String encryptedText = Vigenere.vigenereEncrypt(message, key);
        texteCrypteVigenere.setText(encryptedText);
    }//GEN-LAST:event_crypterVigenereActionPerformed

    private void decrypterVigenereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrypterVigenereActionPerformed
        String message = normalize(texteCrypteVigenere.getText());
        String key = Vigenere.makeKey(normalize(cleVigenere.getText()), message.length());
        String decryptedText = Vigenere.vigenereDecrypt(message, key);
        texteDecrypteVigenere.setText(decryptedText);
    }//GEN-LAST:event_decrypterVigenereActionPerformed

    private void texteACrypterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texteACrypterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texteACrypterActionPerformed

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
            java.util.logging.Logger.getLogger(VigenereGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VigenereGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VigenereGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VigenereGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VigenereGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cleVigenere;
    private javax.swing.JButton crypterVigenere;
    private javax.swing.JButton decrypterVigenere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField texteACrypter;
    private javax.swing.JTextArea texteCrypteVigenere;
    private javax.swing.JTextArea texteDecrypteVigenere;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Geral
 */
public class Exemplo4 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo4
     */
    public Exemplo4() {
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

        jCkbIngles = new javax.swing.JCheckBox();
        jCkbInformatica = new javax.swing.JCheckBox();
        jBtnVerificar = new javax.swing.JButton();
        jBtnMarcar = new javax.swing.JButton();
        jBtnDesmarcar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jCkbIngles.setText("Inglês");
        jCkbIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCkbInglesActionPerformed(evt);
            }
        });

        jCkbInformatica.setText("Informática");
        jCkbInformatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCkbInformaticaActionPerformed(evt);
            }
        });

        jBtnVerificar.setText("Verificar");
        jBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarActionPerformed(evt);
            }
        });

        jBtnMarcar.setText("Marcar");
        jBtnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMarcarActionPerformed(evt);
            }
        });

        jBtnDesmarcar.setText("Desmarcar");
        jBtnDesmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDesmarcarActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCkbIngles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCkbInformatica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnMarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnDesmarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jCkbIngles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCkbInformatica)
                .addGap(18, 18, 18)
                .addComponent(jBtnVerificar)
                .addGap(18, 18, 18)
                .addComponent(jBtnMarcar)
                .addGap(18, 18, 18)
                .addComponent(jBtnDesmarcar)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarActionPerformed
        String selecao = "Selecionados: ";
        if(jCkbIngles.isSelected()){
            selecao+="\n"+jCkbIngles.getText();
        }
        if(jCkbInformatica.isSelected()){
           selecao+="\n"+jCkbInformatica.getText();
        }
        if((!jCkbIngles.isSelected())&&(!jCkbInformatica.isSelected())){
            JOptionPane.showMessageDialog(null, "Nenhum curso selecionado");
        } else {
            JOptionPane.showMessageDialog(null, selecao);
        }
    }//GEN-LAST:event_jBtnVerificarActionPerformed

    private void jBtnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMarcarActionPerformed
        jCkbInformatica.setSelected(true);
        jCkbIngles.setSelected(true);
    }//GEN-LAST:event_jBtnMarcarActionPerformed

    private void jBtnDesmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDesmarcarActionPerformed
        jCkbInformatica.setSelected(false);
        jCkbIngles.setSelected(false);
    }//GEN-LAST:event_jBtnDesmarcarActionPerformed

    private void jCkbInformaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCkbInformaticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCkbInformaticaActionPerformed

    private void jCkbInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCkbInglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCkbInglesActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDesmarcar;
    private javax.swing.JButton jBtnMarcar;
    private javax.swing.JButton jBtnVerificar;
    private javax.swing.JCheckBox jCkbInformatica;
    private javax.swing.JCheckBox jCkbIngles;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

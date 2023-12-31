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
public class Exemplo7 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo7
     */
    public Exemplo7() {
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

        jLabelValor = new javax.swing.JLabel();
        jTxtFieldValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDesconto = new javax.swing.JList<>();
        jTxtFieldResult = new javax.swing.JTextField();
        jBtnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelValor.setText("Valor");

        jTxtFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFieldValorActionPerformed(evt);
            }
        });

        jListDesconto.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "10%", "20%", "30%", "40%", "50%" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListDesconto);

        jTxtFieldResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFieldResultActionPerformed(evt);
            }
        });

        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFieldValor)
                    .addComponent(jTxtFieldResult)
                    .addComponent(jBtnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabelValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtFieldResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCalcular)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFieldValorActionPerformed

    private void jTxtFieldResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFieldResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFieldResultActionPerformed

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        if(jTxtFieldValor.getText().equals("")){
            jTxtFieldResult.requestFocus();
            return;
        }
         try {
            float valor = Float.parseFloat(jTxtFieldValor.getText());
            if(jListDesconto.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um item da lista!");
            }
            float pDesconto = 0.9f;
            if(jListDesconto.getSelectedIndex() == 1){
                pDesconto = 0.8f;
            }
            if(jListDesconto.getSelectedIndex() == 2) {
                pDesconto = 0.7f;
            }
            if(jListDesconto.getSelectedIndex() == 3) {
                pDesconto = 0.6f;
            }
            if(jListDesconto.getSelectedIndex() == 4) {
                pDesconto = 0.5f;
            }
            jTxtFieldResult.setText((""+valor*pDesconto));
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jBtnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JList<String> jListDesconto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtFieldResult;
    private javax.swing.JTextField jTxtFieldValor;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author valen
 */
public class Convertidor extends javax.swing.JFrame {

    /**
     * Creates new form Convertidor
     */
    public Convertidor() {
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
        jbConvertir = new javax.swing.JButton();
        jtTemp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("De Celcius a Fahrenheit");

        jbConvertir.setText("Convertir");
        jbConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConvertirActionPerformed(evt);
            }
        });

        jtTemp.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtTemp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtTemp.setText("Ingrese la temperatura en Celcius");
        jtTemp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtTempFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtTempFocusLost(evt);
            }
        });
        jtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTempActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jbConvertir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jbConvertir)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTempActionPerformed

    private void jbConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConvertirActionPerformed
        try{
            double temp=Double.parseDouble(jtTemp.getText());
            double rta=temp*1.8+32;
            String formatted = String.format("%.2f", rta);
             JOptionPane.showMessageDialog(this, formatted+" grados Farenheid");
                    
        }catch (NumberFormatException e){
             JOptionPane.showMessageDialog(this, "Datos ingresados Incorrectos");
             jtTemp.setText("Ingrese la temperatura en Celcius");
        }
    }//GEN-LAST:event_jbConvertirActionPerformed

    private void jtTempFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTempFocusGained
        if (jtTemp.getText().equals("Ingrese la temperatura en Celcius")) {
            jtTemp.setText("");
             jtTemp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtTempFocusGained

    private void jtTempFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTempFocusLost
        if (jtTemp.getText().equals("")) {
            jtTemp.setText("Ingrese la temperatura en Celcius");
            jtTemp.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jtTempFocusLost

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
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbConvertir;
    private javax.swing.JTextField jtTemp;
    // End of variables declaration//GEN-END:variables
}

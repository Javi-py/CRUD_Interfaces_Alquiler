/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.alquileres;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author javier
 */
public class ventanaInmuebles extends javax.swing.JFrame {

    String colorOscuro;
    public ventanaInmuebles() {
        initComponents();
        this.setMinimumSize(new Dimension(750,500));
        this.setLocationRelativeTo(null); // MÉTODO QUE COLOCA EN EL CENTRO LA VENTANA
        this.setTitle("INMUEBLES");
        this.dispose(); // MARCARLO EN PROPIEDADES DEL JFRAME
        colorOscuro = "40,40,40";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelArriba = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();
        imgLogo = new javax.swing.JLabel();
        imgLupa = new javax.swing.JLabel();
        barraLupa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVerinmuebles = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INMUEBLES");

        javax.swing.GroupLayout PanelArribaLayout = new javax.swing.GroupLayout(PanelArriba);
        PanelArriba.setLayout(PanelArribaLayout);
        PanelArribaLayout.setHorizontalGroup(
            PanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelArribaLayout.setVerticalGroup(
            PanelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        PanelIzq.setBackground(new java.awt.Color(40, 40, 40));

        jLabel2.setBackground(new java.awt.Color(50, 50, 50));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ID_INMUEBLE");

        jTextBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        imgLogo.setBackground(new java.awt.Color(40, 40, 40));
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        imgLogo.setOpaque(true);

        imgLupa.setBackground(new java.awt.Color(40, 40, 40));
        imgLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgLupa.png"))); // NOI18N
        imgLupa.setOpaque(true);
        imgLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLupaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgLupaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgLupaMouseExited(evt);
            }
        });

        barraLupa.setBackground(new java.awt.Color(40, 40, 40));
        barraLupa.setOpaque(true);

        javax.swing.GroupLayout PanelIzqLayout = new javax.swing.GroupLayout(PanelIzq);
        PanelIzq.setLayout(PanelIzqLayout);
        PanelIzqLayout.setHorizontalGroup(
            PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelIzqLayout.createSequentialGroup()
                        .addGroup(PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barraLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelIzqLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(imgLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelIzqLayout.setVerticalGroup(
            PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzqLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTableVerinmuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableVerinmuebles);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void imgLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLupaMouseClicked
        if (jTextBuscar.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "DEBE INTRODUCIR UN DATO CORRECTO", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            jTextBuscar.setText("");
        }else{
            int buscarId;
            CInmuebles inmueble = new CInmuebles();
            buscarId = Integer.parseInt(jTextBuscar.getText()); //HACER UN CASTING A INT
            inmueble.buscarInmueble(jTableVerinmuebles, buscarId);
        }
        
    }//GEN-LAST:event_imgLupaMouseClicked

    private void imgLupaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLupaMouseEntered
        barraLupa.setBackground(Color.orange); //marcar atributo opaco
    }//GEN-LAST:event_imgLupaMouseEntered

    private void imgLupaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLupaMouseExited
        barraLupa.setBackground(Color.getColor(colorOscuro)); //marcar atributo opaco
    }//GEN-LAST:event_imgLupaMouseExited

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
            java.util.logging.Logger.getLogger(ventanaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInmuebles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelArriba;
    private javax.swing.JPanel PanelIzq;
    private javax.swing.JLabel barraLupa;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgLupa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVerinmuebles;
    private javax.swing.JTextField jTextBuscar;
    // End of variables declaration//GEN-END:variables
}

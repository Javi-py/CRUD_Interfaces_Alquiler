
// VENTANA PRINCIPAL
package com.mycompany.alquileres;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author javier
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    
    
    String colorMarrón ="";
    String colorOscuro = "";
    public ventanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); // MÉTODO QUE COLOCA EN EL CENTRO LA VENTANA
        this.setTitle("PRINCIPAL");
        colorMarrón = "50,50,50";
        colorOscuro = "40,40,40";
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        btnClientes = new javax.swing.JLabel();
        btnAlquiler = new javax.swing.JLabel();
        btnInmuebles = new javax.swing.JLabel();
        btnInformes = new javax.swing.JLabel();
        barraClientes = new javax.swing.JLabel();
        barraAlquiler = new javax.swing.JLabel();
        barraInmuebles = new javax.swing.JLabel();
        barraInformes = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        FotoPerfil = new javax.swing.JLabel();
        PerfilNombre = new javax.swing.JLabel();
        PerfilCategoría = new javax.swing.JLabel();
        PonerNombre = new javax.swing.JLabel();
        PonerCategoría = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barraDocumentos = new javax.swing.JLabel();
        jPanelLogo = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRINCIPAL");
        setMinimumSize(new java.awt.Dimension(771, 500));

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));

        jPanelMenu.setBackground(new java.awt.Color(50, 50, 50));

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCliente.png"))); // NOI18N
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });

        btnAlquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAlquileres.png"))); // NOI18N
        btnAlquiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlquilerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlquilerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlquilerMouseExited(evt);
            }
        });

        btnInmuebles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnInmuebles.png"))); // NOI18N
        btnInmuebles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInmueblesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInmueblesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInmueblesMouseExited(evt);
            }
        });

        btnInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnInformes.png"))); // NOI18N
        btnInformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInformesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInformesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInformesMouseExited(evt);
            }
        });

        barraClientes.setBackground(new java.awt.Color(50, 50, 50));
        barraClientes.setOpaque(true);

        barraAlquiler.setBackground(new java.awt.Color(50, 50, 50));
        barraAlquiler.setOpaque(true);

        barraInmuebles.setBackground(new java.awt.Color(50, 50, 50));
        barraInmuebles.setOpaque(true);

        barraInformes.setBackground(new java.awt.Color(50, 50, 50));
        barraInformes.setOpaque(true);

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes)
                    .addComponent(barraClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlquiler)
                    .addComponent(barraAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInmuebles)
                    .addComponent(barraInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(barraInmuebles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barraClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)
                    .addComponent(barraAlquiler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barraInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));

        dashboard.setBackground(new java.awt.Color(40, 40, 40));

        FotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/foto_perfil.png"))); // NOI18N

        PerfilNombre.setBackground(new java.awt.Color(40, 40, 40));
        PerfilNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PerfilNombre.setForeground(new java.awt.Color(230, 230, 200));
        PerfilNombre.setText("NOMBRE");
        PerfilNombre.setOpaque(true);

        PerfilCategoría.setBackground(new java.awt.Color(40, 40, 40));
        PerfilCategoría.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PerfilCategoría.setForeground(new java.awt.Color(230, 230, 200));
        PerfilCategoría.setText("CATEGORÍA");
        PerfilCategoría.setOpaque(true);

        PonerNombre.setBackground(new java.awt.Color(40, 40, 40));
        PonerNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PonerNombre.setForeground(new java.awt.Color(230, 230, 200));
        PonerNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PonerNombre.setText("JAVIER");
        PonerNombre.setOpaque(true);

        PonerCategoría.setBackground(new java.awt.Color(40, 40, 40));
        PonerCategoría.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PonerCategoría.setForeground(new java.awt.Color(230, 230, 200));
        PonerCategoría.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PonerCategoría.setText("COMERCIAL");
        PonerCategoría.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DOCUMENTOS.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        barraDocumentos.setBackground(new java.awt.Color(40, 40, 40));
        barraDocumentos.setOpaque(true);

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PerfilCategoría, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PerfilNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PonerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(PonerCategoría, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(FotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerfilNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PonerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerfilCategoría, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PonerCategoría, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanelLogo.setBackground(new java.awt.Color(50, 50, 50));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogoLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        ventanaClientes clientes = new ventanaClientes();
        clientes.setVisible(true);
       
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        //Icon imagenOut = new ImageIcon(("Other Sources/src/main/resources/img/btnClienteAct.png"));
        //jLabel2.setIcon(imagenOut);
        
        barraClientes.setBackground(Color.orange); //marcar atributo opaco
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        barraClientes.setBackground(Color.getColor(colorMarrón));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnAlquilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlquilerMouseClicked
        ventanaAlquiler alquiler = new ventanaAlquiler();
        alquiler.setVisible(true);
        
    }//GEN-LAST:event_btnAlquilerMouseClicked

    private void btnAlquilerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlquilerMouseEntered
        barraAlquiler.setBackground(Color.orange); //marcar atributo opaco
    }//GEN-LAST:event_btnAlquilerMouseEntered

    private void btnAlquilerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlquilerMouseExited
        barraAlquiler.setBackground(Color.getColor(colorMarrón)); //marcar atributo opaco
    }//GEN-LAST:event_btnAlquilerMouseExited

    private void btnInmueblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInmueblesMouseClicked
        ventanaInmuebles inmuebles = new ventanaInmuebles();
        inmuebles.setVisible(true);
    }//GEN-LAST:event_btnInmueblesMouseClicked

    private void btnInmueblesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInmueblesMouseEntered
        barraInmuebles.setBackground(Color.orange);
    }//GEN-LAST:event_btnInmueblesMouseEntered

    private void btnInmueblesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInmueblesMouseExited
        barraInmuebles.setBackground(Color.getColor(colorMarrón)); //marcar atributo opaco
    }//GEN-LAST:event_btnInmueblesMouseExited

    private void btnInformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformesMouseClicked
        ventanaInformes informes = new ventanaInformes();
        informes.setVisible(true);
        
    }//GEN-LAST:event_btnInformesMouseClicked

    private void btnInformesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformesMouseEntered
        barraInformes.setBackground(Color.orange);
    }//GEN-LAST:event_btnInformesMouseEntered

    private void btnInformesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInformesMouseExited
        barraInformes.setBackground(Color.getColor(colorMarrón)); //marcar atributo opaco
    }//GEN-LAST:event_btnInformesMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        barraDocumentos.setBackground(Color.orange);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       barraDocumentos.setBackground(Color.getColor(colorOscuro)); //marcar atributo opaco
    }//GEN-LAST:event_jLabel2MouseExited

    
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FotoPerfil;
    private javax.swing.JLabel PerfilCategoría;
    private javax.swing.JLabel PerfilNombre;
    private javax.swing.JLabel PonerCategoría;
    private javax.swing.JLabel PonerNombre;
    private javax.swing.JLabel barraAlquiler;
    private javax.swing.JLabel barraClientes;
    private javax.swing.JLabel barraDocumentos;
    private javax.swing.JLabel barraInformes;
    private javax.swing.JLabel barraInmuebles;
    private javax.swing.JLabel btnAlquiler;
    private javax.swing.JLabel btnClientes;
    private javax.swing.JLabel btnInformes;
    private javax.swing.JLabel btnInmuebles;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables
}

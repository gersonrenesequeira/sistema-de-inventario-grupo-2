/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controlador;

import Vista.JInternalFrameCompras;
import Vista.JInternalFrameProducto;
import javax.swing.plaf.DesktopPaneUI;
import Vista.JInternalFrameProvedores;
import Vista.JIFVentas;
/**
 *
 * @author Usuario
 */
public class JFrameprincipal extends javax.swing.JFrame {
 private JInternalFrameProducto producto;//Objeto Formulario Autores
 private JInternalFrameCompras compras;
 private JInternalFrameProvedores provedores;
 private JIFVentas ventas;
    /**
     * Creates new form JFrameprincipal
     */
    public JFrameprincipal() {
        initComponents();
        setTitle("Frameprincipal");//Agrega titulo al MDI
        producto=new JInternalFrameProducto();
        
        //Agregar los JInternalFrame al desktopane del MDI
        jDesktopPanemenu.add(producto);
        
        
        provedores=new JInternalFrameProvedores();
        
        jDesktopPanemenu.add(provedores);
        
        
        ventas=new JIFVentas();
        
        jDesktopPanemenu.add(ventas);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonprovedores1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonagregarproductos = new javax.swing.JButton();
        jButtonagregarventas = new javax.swing.JButton();
        jButtonprovedores = new javax.swing.JButton();
        jButtonsalir = new javax.swing.JButton();
        jDesktopPanemenu = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jButtonCompras = new javax.swing.JButton();

        jButtonprovedores1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonprovedores1.setText("   Proveedores");
        jButtonprovedores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonprovedores1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButtonagregarproductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonagregarproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras (1).png"))); // NOI18N
        jButtonagregarproductos.setText("Productos");
        jButtonagregarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonagregarproductosActionPerformed(evt);
            }
        });

        jButtonagregarventas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonagregarventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dar-dinero (1).png"))); // NOI18N
        jButtonagregarventas.setText("Ventas");
        jButtonagregarventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonagregarventasActionPerformed(evt);
            }
        });

        jButtonprovedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonprovedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camion-de-reparto (1).png"))); // NOI18N
        jButtonprovedores.setText("   Proveedores");
        jButtonprovedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonprovedoresActionPerformed(evt);
            }
        });

        jButtonsalir.setBackground(new java.awt.Color(255, 102, 102));
        jButtonsalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion (1).png"))); // NOI18N
        jButtonsalir.setText("Salir");
        jButtonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirActionPerformed(evt);
            }
        });

        jDesktopPanemenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jDesktopPanemenuLayout = new javax.swing.GroupLayout(jDesktopPanemenu);
        jDesktopPanemenu.setLayout(jDesktopPanemenuLayout);
        jDesktopPanemenuLayout.setHorizontalGroup(
            jDesktopPanemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        jDesktopPanemenuLayout.setVerticalGroup(
            jDesktopPanemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SISTEMA DE INVENTARIO LA DENDICION");

        jButtonCompras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salario (1).png"))); // NOI18N
        jButtonCompras.setText("Compras");
        jButtonCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonagregarproductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonagregarventas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonprovedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButtonsalir)))
                .addGap(31, 31, 31)
                .addComponent(jDesktopPanemenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(324, 324, 324))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonagregarproductos)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonagregarventas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonprovedores)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCompras)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDesktopPanemenu))
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonagregarventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonagregarventasActionPerformed
        // TODO add your handling code here:
        ventas.ObtenerDatos();
        ventas.setVisible(true);
    }//GEN-LAST:event_jButtonagregarventasActionPerformed

    private void jButtonagregarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonagregarproductosActionPerformed
          //Llama al método obtenerDatos para mostrarlos en la tabla del formulario
        producto.obtenerDatos();
          producto.setVisible(true);//Muestra el formulario JInternalFrameAutores
    }//GEN-LAST:event_jButtonagregarproductosActionPerformed

    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
  System.exit(0);       
    }//GEN-LAST:event_jButtonsalirActionPerformed

    private void jButtonprovedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonprovedoresActionPerformed
  provedores.obtenerDatos();
  provedores.setVisible(true);
    }//GEN-LAST:event_jButtonprovedoresActionPerformed

    private void jButtonprovedores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonprovedores1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonprovedores1ActionPerformed

    private void jButtonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprasActionPerformed
     
        
    }//GEN-LAST:event_jButtonComprasActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCompras;
    private javax.swing.JButton jButtonagregarproductos;
    private javax.swing.JButton jButtonagregarventas;
    private javax.swing.JButton jButtonprovedores;
    private javax.swing.JButton jButtonprovedores1;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JDesktopPane jDesktopPanemenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

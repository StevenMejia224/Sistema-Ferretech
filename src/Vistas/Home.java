/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Cliente
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        //Inicion de posicion central
        this.setLocationRelativeTo(null);
        
        Date Sfecha = new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd-MMM-YYYY");
        fecha.setText(formato.format(Sfecha));
        
        Timer tiempo=new Timer(100, new Home.horas());
        tiempo.start();
    }
    
    class horas implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Date Shora=new Date();
            String pmAm="hh:mm:ss a";
            SimpleDateFormat format=new SimpleDateFormat(pmAm);
            Calendar hoy=Calendar.getInstance();
            Hora.setText(String.format(format.format(Shora),hoy));          
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDatos = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbOnline = new javax.swing.JLabel();
        lbNombre1 = new javax.swing.JLabel();
        lbUser2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCalendario = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        lbUsuarios = new javax.swing.JLabel();
        usuarios = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        lbInventario = new javax.swing.JLabel();
        inventario = new javax.swing.JLabel();
        lbCotizacion = new javax.swing.JLabel();
        catizaciones = new javax.swing.JLabel();
        lbVenta = new javax.swing.JLabel();
        venta = new javax.swing.JLabel();
        lbCompra = new javax.swing.JLabel();
        compra = new javax.swing.JLabel();
        lbDevolucion = new javax.swing.JLabel();
        devolucion = new javax.swing.JLabel();
        lbDevolucion1 = new javax.swing.JLabel();
        devolucion1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbClose = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDatos.setBackground(new java.awt.Color(33, 45, 62));
        jpDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbExit.setBackground(new java.awt.Color(2, 29, 62));
        lbExit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbExit.setForeground(new java.awt.Color(255, 0, 0));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_logout_rounded_left_25px.png"))); // NOI18N
        lbExit.setText("Cerrar Sesión");
        lbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        jpDatos.add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 140, 40));

        lbUser.setBackground(new java.awt.Color(255, 255, 255));
        lbUser.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("Tipo_usuario");
        jpDatos.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 90, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_user_125px.png"))); // NOI18N
        jpDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        lbOnline.setBackground(new java.awt.Color(2, 29, 62));
        lbOnline.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbOnline.setForeground(new java.awt.Color(0, 204, 51));
        lbOnline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOnline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_ok_25px_1.png"))); // NOI18N
        lbOnline.setText("ONLINE");
        jpDatos.add(lbOnline, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 90, 30));

        lbNombre1.setBackground(new java.awt.Color(255, 255, 255));
        lbNombre1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombre1.setText("Nombre_Usuario");
        lbNombre1.setToolTipText("");
        lbNombre1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpDatos.add(lbNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, 30));

        lbUser2.setBackground(new java.awt.Color(255, 255, 255));
        lbUser2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lbUser2.setForeground(new java.awt.Color(255, 255, 255));
        lbUser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser2.setText("USUARIO");
        jpDatos.add(lbUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 90, 20));

        getContentPane().add(jpDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 290, 540));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCalendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_calendar_96px_1.png"))); // NOI18N
        jPanel1.add(lblCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 110, 200));

        fecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(33, 45, 62));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Calendario");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        lbUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_user_96px_1.png"))); // NOI18N
        lbUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUsuariosMouseClicked(evt);
            }
        });
        jPanel1.add(lbUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 190));

        usuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usuarios.setForeground(new java.awt.Color(33, 45, 62));
        usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarios.setText("Usuarios");
        usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        Hora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Hora.setForeground(new java.awt.Color(33, 45, 62));
        Hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hora.setText("hh:mm:ss am");
        jPanel1.add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        lbInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_cardboard_box_96px_1.png"))); // NOI18N
        lbInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInventarioMouseClicked(evt);
            }
        });
        jPanel1.add(lbInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 90, 180));

        inventario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inventario.setForeground(new java.awt.Color(33, 45, 62));
        inventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventario.setText("Inventario");
        jPanel1.add(inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        lbCotizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_documents_96px_2.png"))); // NOI18N
        lbCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCotizacionMouseClicked(evt);
            }
        });
        lbCotizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbCotizacionKeyTyped(evt);
            }
        });
        jPanel1.add(lbCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 110, 170));

        catizaciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catizaciones.setForeground(new java.awt.Color(33, 45, 62));
        catizaciones.setText("Cotizaciones");
        jPanel1.add(catizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        lbVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_money_bag_96px_1.png"))); // NOI18N
        lbVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVentaMouseClicked(evt);
            }
        });
        jPanel1.add(lbVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, 160));

        venta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        venta.setForeground(new java.awt.Color(33, 45, 62));
        venta.setText("Venta");
        jPanel1.add(venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        lbCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_cash_in_hand_96px_2.png"))); // NOI18N
        lbCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCompraMouseClicked(evt);
            }
        });
        jPanel1.add(lbCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 110, 180));

        compra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        compra.setForeground(new java.awt.Color(33, 45, 62));
        compra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        compra.setText("Compra");
        jPanel1.add(compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        lbDevolucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/iconfinder_thefreeforty_shop_1243706.png"))); // NOI18N
        lbDevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbDevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDevolucionMouseClicked(evt);
            }
        });
        jPanel1.add(lbDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 130, 110));

        devolucion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        devolucion.setForeground(new java.awt.Color(33, 45, 62));
        devolucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devolucion.setText("Proveedor");
        jPanel1.add(devolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        lbDevolucion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDevolucion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_refresh_96px_4.png"))); // NOI18N
        lbDevolucion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbDevolucion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDevolucion1MouseClicked(evt);
            }
        });
        jPanel1.add(lbDevolucion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 100, 190));

        devolucion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        devolucion1.setForeground(new java.awt.Color(33, 45, 62));
        devolucion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devolucion1.setText("Devolución");
        jPanel1.add(devolucion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 760, 540));

        jPanel2.setBackground(new java.awt.Color(73, 181, 172));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_multiply_25px_1.png"))); // NOI18N
        lbClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCloseMouseClicked(evt);
            }
        });
        jPanel2.add(lbClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, -1, 40));

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_horizontal_line_25px_1.png"))); // NOI18N
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        jPanel2.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, 40));

        lblMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_compress_25px_1.png"))); // NOI18N
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, 40));

        lblMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagees/icons8_maximize_button_25px.png"))); // NOI18N
        lblMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, -1, 40));

        lbNombre.setBackground(new java.awt.Color(255, 255, 255));
        lbNombre.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombre.setText("FERRETECH System");
        lbNombre.setToolTipText("");
        lbNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null,"¿Desea cerrar sesión?","Cerrar Sesión",dialog);
        
        if(resultado == 0)
        {
            dispose();
            IniciarSesion abrir = new IniciarSesion();
            abrir.setVisible(true);
        }
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCloseMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null,"¿Desea cerrar el Programa?","Cerrar Programa",dialog);
        
        if(resultado == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_lbCloseMouseClicked

    int xx,xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
       xx= evt.getX();
       xy=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void lbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUsuariosMouseClicked
        GUsuarios abrir = new GUsuarios();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbUsuariosMouseClicked

    private void lbInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInventarioMouseClicked
        GInventario abrir = new GInventario();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbInventarioMouseClicked

    private void lbVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVentaMouseClicked
        GVentas abrir = new GVentas();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbVentaMouseClicked

    private void lbCotizacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbCotizacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbCotizacionKeyTyped

    private void lbCotizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCotizacionMouseClicked
        GCotizacion abrir = new GCotizacion();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbCotizacionMouseClicked

    private void lbCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCompraMouseClicked
        GCompra1 abrir = new GCompra1();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbCompraMouseClicked

    private void lbDevolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDevolucionMouseClicked
        GProveedor abrir = new GProveedor();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbDevolucionMouseClicked

    private void lbDevolucion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDevolucion1MouseClicked
        // TODO add your handling code here:
        GDevolucion abrir = new GDevolucion();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbDevolucion1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel catizaciones;
    private javax.swing.JLabel compra;
    private javax.swing.JLabel devolucion;
    private javax.swing.JLabel devolucion1;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel inventario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JLabel lbClose;
    private javax.swing.JLabel lbCompra;
    private javax.swing.JLabel lbCotizacion;
    private javax.swing.JLabel lbDevolucion;
    private javax.swing.JLabel lbDevolucion1;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbInventario;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbOnline;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbUser2;
    private javax.swing.JLabel lbUsuarios;
    private javax.swing.JLabel lbVenta;
    private javax.swing.JLabel lblCalendario;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel usuarios;
    private javax.swing.JLabel venta;
    // End of variables declaration//GEN-END:variables
}

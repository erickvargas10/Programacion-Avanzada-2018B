/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN-MINEDUC
 */
public class Interfaz extends javax.swing.JFrame {
    
  
    
    public Interfaz() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/1.jpg")).getImage());
       
        this.setTitle("PROYECTO FINAL BDD-ALGORITMOS");
          ImageIcon image4= new ImageIcon(getClass().getResource("/imagenes/4.jpg"));
        Icon fondo4 = new ImageIcon(image4.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(fondo4);
        
         ImageIcon image1 = new ImageIcon(getClass().getResource("/imagenes/1.jpg"));
        Icon fondo1 = new ImageIcon(image1.getImage().getScaledInstance(lblFondo1.getWidth(), lblFondo1.getHeight(), Image.SCALE_DEFAULT));
        lblFondo1.setIcon(fondo1);
        
        ImageIcon image2 = new ImageIcon(getClass().getResource("/imagenes/2.jpg"));
        Icon fondo2 = new ImageIcon(image2.getImage().getScaledInstance(lblFondo2.getWidth(), lblFondo2.getHeight(), Image.SCALE_DEFAULT));
        lblFondo2.setIcon(fondo2);
        
          ImageIcon image3 = new ImageIcon(getClass().getResource("/imagenes/3.jpg"));
        Icon fondo3 = new ImageIcon(image3.getImage().getScaledInstance(lblFondo3.getWidth(), lblFondo3.getHeight(), Image.SCALE_DEFAULT));
        lblFondo3.setIcon(fondo3);
        this.repaint();
         btnAdministrador.setEnabled(false);
         btnUsuario.setEnabled(false);
         txtcedula.setEnabled(false);
         txtPass.setEnabled(false);
        
     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmb1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFondo1 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        lblFondo3 = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        btnAdministrador = new javax.swing.JButton();
        lblacceso = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lblcedula = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "USUARIO" }));
        getContentPane().add(cmb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 236, 35));

        jButton1.setText("SELECCIONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 116, 35));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMAS DE FACTURACION \"FOODTRUCKS\"");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 440, 51));
        getContentPane().add(lblFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, 94, 85));
        getContentPane().add(lblFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 59, 34));
        getContentPane().add(lblFondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 59, 32));

        btnUsuario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnUsuario.setText("USUARIO");
        btnUsuario.setPreferredSize(new java.awt.Dimension(120, 30));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 344, 128, -1));

        btnAdministrador.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnAdministrador.setText("ADMINISTRADOR");
        btnAdministrador.setPreferredSize(new java.awt.Dimension(120, 30));
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 344, 143, -1));

        lblacceso.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblacceso.setForeground(new java.awt.Color(255, 255, 255));
        lblacceso.setText("Iniciar Sesión");
        getContentPane().add(lblacceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, 22));

        txtcedula.setPreferredSize(new java.awt.Dimension(130, 30));
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, 30));

        lblcedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblcedula.setForeground(new java.awt.Color(255, 255, 255));
        lblcedula.setText("Cédula:");
        getContentPane().add(lblcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        lblpass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 255, 255));
        lblpass.setText("Contraseña:");
        getContentPane().add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
   
        Conexiones.Conexion.setcuenta(txtcedula.getText(), txtPass.getText());
        Conexiones.Conexion.getConexion();
        if(Conexiones.Conexion.getstatus()){
            System.out.println("CONEXION ESTABLECIDA");
            this.setVisible(false);
            MenuAdministrador obj = new MenuAdministrador();
            obj.setVisible(true);
          
           
        } else {
            JOptionPane.showMessageDialog(null, "USUARIO Y PASSWORD INCORRECTOS","Error De Conexion",JOptionPane.ERROR_MESSAGE);
            txtcedula.setText("");
            txtPass.setText("");
            
    }    
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
       Conexiones.Conexion.setcuenta(txtcedula.getText(), txtPass.getText());
        Conexiones.Conexion.getConexion();
        if(Conexiones.Conexion.getstatus()){
            System.out.println("CONEXION ESTABLECIDA");
             this.setVisible(false);
            Menu obj = new Menu();
            obj.setVisible(true);
          
           
        } else {
            JOptionPane.showMessageDialog(null, "USUARIO Y PASSWORD INCORRECTOS","Error De Conexion",JOptionPane.ERROR_MESSAGE);
            txtcedula.setText("");
            txtPass.setText("");
            
    }    
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
   
    }//GEN-LAST:event_txtPassKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String tipo="";
        tipo=cmb1.getSelectedItem().toString();
        if(null != tipo)switch (tipo) {
            case "ADMINISTRADOR":{
                  btnAdministrador.setEnabled(true);
                  txtcedula.setEnabled(true);
                  txtPass.setEnabled(true);
        ;
                break;
                }
            case "USUARIO":{
                  btnUsuario.setEnabled(true);
                  txtcedula.setEnabled(true);
                  txtPass.setEnabled(true);
                break;
                }
               default:
                break;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblFondo3;
    private javax.swing.JLabel lblacceso;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblpass;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtcedula;
    // End of variables declaration//GEN-END:variables
}

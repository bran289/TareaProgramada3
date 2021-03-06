/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaPresentacion;

import DataBase.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import DataBase.ValidacionUsuario;

/**
 *
 * @author Rolo
 */
public class Principal extends javax.swing.JFrame {
    
    /** Creates new form Principal */
    public Principal() {
        this.rootPane.getContentPane().setBackground(Color.getHSBColor(122, 110, 238));
        initComponents();
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        contraseñaUsuario = new javax.swing.JTextField();
        nombreUsuario = new javax.swing.JTextField();
        IniciarSesionBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vistaRdBtn = new javax.swing.JRadioButton();
        AdminRdBtn = new javax.swing.JRadioButton();
        OrgRdBtn = new javax.swing.JRadioButton();
        IniciarSesionBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hackathon CR");
        setBackground(new java.awt.Color(122, 110, 238));
        setForeground(new java.awt.Color(122, 110, 238));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        contraseñaUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        contraseñaUsuario.setForeground(new java.awt.Color(153, 153, 153));
        contraseñaUsuario.setText("Password");
        contraseñaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaUsuarioMouseClicked(evt);
            }
        });
        contraseñaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaUsuarioActionPerformed(evt);
            }
        });

        nombreUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(153, 153, 153));
        nombreUsuario.setText("Username");
        nombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreUsuarioMouseClicked(evt);
            }
        });

        IniciarSesionBtn.setBackground(new java.awt.Color(102, 0, 0));
        IniciarSesionBtn.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesionBtn.setText("Log in");
        IniciarSesionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log in");

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HACKATHON CR");

        btngroup.add(vistaRdBtn);
        vistaRdBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vistaRdBtn.setForeground(new java.awt.Color(255, 255, 255));
        vistaRdBtn.setText("View");

        btngroup.add(AdminRdBtn);
        AdminRdBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AdminRdBtn.setForeground(new java.awt.Color(255, 255, 255));
        AdminRdBtn.setText("Manager");

        btngroup.add(OrgRdBtn);
        OrgRdBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        OrgRdBtn.setForeground(new java.awt.Color(255, 255, 255));
        OrgRdBtn.setText("Organizer");

        IniciarSesionBtn1.setBackground(new java.awt.Color(102, 0, 0));
        IniciarSesionBtn1.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesionBtn1.setText("Sign in");
        IniciarSesionBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrgRdBtn)
                            .addComponent(AdminRdBtn)
                            .addComponent(vistaRdBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nombreUsuario)
                                .addComponent(contraseñaUsuario)
                                .addComponent(IniciarSesionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IniciarSesionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vistaRdBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminRdBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrgRdBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IniciarSesionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IniciarSesionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreUsuarioMouseClicked
        nombreUsuario.setText("");
        nombreUsuario.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioMouseClicked

    private void contraseñaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaUsuarioActionPerformed

    private void contraseñaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaUsuarioMouseClicked
        this.contraseñaUsuario.setText("");
        contraseñaUsuario.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaUsuarioMouseClicked

    private void IniciarSesionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionBtnActionPerformed
            if(this.vistaRdBtn.isSelected()){           
                new Vista().setVisible(true);
            }
            else if(this.AdminRdBtn.isSelected()){
                try{
                   ValidacionUsuario validar = new ValidacionUsuario();
                   String comp=validar.validarAdmin(nombreUsuario.getText(),contraseñaUsuario.getText());
                   if(comp.equals(nombreUsuario.getText())){
                       new Administrador().setVisible(true);
                   }else{
                       JOptionPane.showMessageDialog(null, "Contraseña y/o usuario incorrectos");
                   }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else if(this.OrgRdBtn.isSelected()){
                try{
                   ValidacionUsuario validar = new ValidacionUsuario();
                   String comp=validar.validarOrgan(nombreUsuario.getText(),contraseñaUsuario.getText());
                   if(comp.equals(nombreUsuario.getText())){
                       new Organizador().setVisible(true);
                   }else{
                       JOptionPane.showMessageDialog(null, "Contraseña y/o usuario incorrectos");
                   }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_IniciarSesionBtnActionPerformed

    private void IniciarSesionBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionBtn1ActionPerformed
        new Registro().setVisible(true);
    }//GEN-LAST:event_IniciarSesionBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal principal = new Principal();
                principal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRdBtn;
    private javax.swing.JButton IniciarSesionBtn;
    private javax.swing.JButton IniciarSesionBtn1;
    private javax.swing.JRadioButton OrgRdBtn;
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.JTextField contraseñaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JRadioButton vistaRdBtn;
    // End of variables declaration//GEN-END:variables

}

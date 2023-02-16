/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.vista.agenda;

import com.patron.contexto.Backup;
import com.patron.contexto.Conexion;
import com.patron.estrategia.EstrategiaMySQL;
import com.patron.estrategia.EstrategiaPostgres;
import com.patron.plantilla.Copiar;
import com.patron.plantilla.Restaurar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jorhak
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    Conexion con;
    Backup backup;

    public Agenda() {
        initComponents();
        con = new Conexion();
        backup = new Backup();
        Bloquear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContacto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textID = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnObtener = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelHost = new javax.swing.JLabel();
        labelDatabase = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelPort = new javax.swing.JLabel();
        textHost = new javax.swing.JTextField();
        textDatabase = new javax.swing.JTextField();
        textUser = new javax.swing.JTextField();
        textPassword = new javax.swing.JTextField();
        textPort = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        radioMySQL = new javax.swing.JRadioButton();
        radioPostgres = new javax.swing.JRadioButton();
        btnCopiar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Formulario Contacto"));

        tablaContacto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaContacto);

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("TELEFONO:");

        jLabel3.setText("DIRECCION:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnObtener.setText("Obtener");
        btnObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevo)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(textNombre)
                            .addComponent(textDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrar)
                            .addComponent(btnObtener))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addComponent(btnEliminar))
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObtener)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Conexion a DB"));

        labelHost.setText("HOST:");

        labelDatabase.setText("DATABASE:");

        labelUser.setText("USER:");

        labelPassword.setText("PASSWORD:");

        labelPort.setText("PORT:");

        btnConectar.setText("Conectar");

        radioMySQL.setText("MySQL");
        radioMySQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMySQLActionPerformed(evt);
            }
        });

        radioPostgres.setText("Postgres");
        radioPostgres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPostgresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelUser)
                        .addGap(62, 62, 62)
                        .addComponent(textUser))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelDatabase)
                        .addGap(26, 26, 26)
                        .addComponent(textDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelHost)
                        .addGap(62, 62, 62)
                        .addComponent(textHost, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPassword)
                            .addComponent(labelPort))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(textPort))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(radioMySQL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioPostgres)
                .addGap(59, 59, 59))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btnConectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHost)
                            .addComponent(textHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDatabase)
                            .addComponent(textDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelUser)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPassword)
                            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPort))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMySQL)
                    .addComponent(radioPostgres))
                .addGap(18, 18, 18)
                .addComponent(btnConectar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnCopiar.setText("Copiar");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCopiar)
                        .addGap(36, 36, 36)
                        .addComponent(btnRestaurar)
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRestaurar)
                            .addComponent(btnCopiar))
                        .addGap(59, 59, 59))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioMySQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMySQLActionPerformed
        if (radioMySQL.isSelected()) {

            con.setEstrategia(EstrategiaMySQL.getInstance());

            Map<String, String> conexion = new HashMap<>();
            conexion.put("host", textHost.getText());
            conexion.put("database", textDatabase.getText());
            conexion.put("user", textUser.getText());
            conexion.put("password", textPassword.getText());
            conexion.put("port", textPort.getText());

            con.procesar(conexion);
            Actualizar(Listar());
        }
    }//GEN-LAST:event_radioMySQLActionPerformed

    private void radioPostgresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPostgresActionPerformed
        if (radioPostgres.isSelected()) {

            con.setEstrategia(EstrategiaPostgres.getInstance());

            Map<String, String> conexion = new HashMap<>();
            conexion.put("host", textHost.getText());
            conexion.put("database", textDatabase.getText());
            conexion.put("user", textUser.getText());
            conexion.put("password", textPassword.getText());
            conexion.put("port", textPort.getText());

            con.procesar(conexion);
            Actualizar(Listar());
        }
    }//GEN-LAST:event_radioPostgresActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        textNombre.setEnabled(true);
        textTelefono.setEnabled(true);
        textDireccion.setEnabled(true);
        btnRegistrar.setEnabled(true);
        textNombre.requestFocusInWindow();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (Registrar()) {
            Actualizar(Listar());
            JOptionPane.showMessageDialog(null, "Se registro correctamente el contacto");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el contacto>>>>");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (Modificar()) {
            Actualizar(Listar());
            JOptionPane.showMessageDialog(null, "Se modifico correctamente el contacto");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el contacto>>>>");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        textID.setText("");
        textNombre.setText("");
        textTelefono.setText("");
        textDireccion.setText("");
        textNombre.setEnabled(false);
        textTelefono.setEnabled(false);
        textDireccion.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnModificar.setEnabled(false);
        textNombre.requestFocusInWindow();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerActionPerformed
        textNombre.setEnabled(true);
        textTelefono.setEnabled(true);
        textDireccion.setEnabled(true);
        btnRegistrar.setEnabled(true);
        textNombre.requestFocusInWindow();

        btnRegistrar.setEnabled(false);
        btnModificar.setEnabled(true);
        int fila = tablaContacto.getSelectedRow();
        if (fila >= 0) {
            textID.setText(tablaContacto.getValueAt(fila, 0).toString());
            textNombre.setText(tablaContacto.getValueAt(fila, 1).toString());
            textTelefono.setText(tablaContacto.getValueAt(fila, 2).toString());
            textDireccion.setText(tablaContacto.getValueAt(fila, 3).toString());

        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado la fila para obtener el contacto.");
        }
    }//GEN-LAST:event_btnObtenerActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaContacto.getSelectedRow();
        if (fila >= 0) {
            textID.setText(tablaContacto.getValueAt(fila, 0).toString());

            Eliminar();
            Actualizar(Listar());
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado la fila y no se ha eliminado la categoria.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        backup.setRespaldar(new Copiar());
        backup.ejecutar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        backup.setRespaldar(new Restaurar());
        backup.ejecutar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnObtener;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDatabase;
    private javax.swing.JLabel labelHost;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPort;
    private javax.swing.JLabel labelUser;
    private javax.swing.JRadioButton radioMySQL;
    private javax.swing.JRadioButton radioPostgres;
    private javax.swing.JTable tablaContacto;
    private javax.swing.JTextField textDatabase;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textHost;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPassword;
    private javax.swing.JTextField textPort;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables

//    public void CambiarEstrategia(boolean estrategia) {
//        con.setEstrategia(estrategia ? EstrategiaMySQL.getInstance() : EstrategiaPostgres.getInstance());
//        con.procesar();
//    }
    public boolean Registrar() {
        boolean proccessed = false;
        String sql = "insert into contacto (nombre, telefono, direccion) "
                + "values (?,?,?);";

        try {
            PreparedStatement statement = con.getConexion().prepareStatement(sql);
            statement.setString(1, textNombre.getText());
            statement.setString(2, textTelefono.getText());
            statement.setString(3, textDireccion.getText());

            proccessed = con.executeSQL(statement);
        } catch (SQLException e) {
        }

        return proccessed;
    }

    public boolean Modificar() {
        boolean proccessed = false;
        String sql = "update contacto "
                + "set nombre=?, telefono=?, direccion=? "
                + "where id=?;";

        try {
            PreparedStatement statement = con.getConexion().prepareStatement(sql);
            statement.setString(1, textNombre.getText());
            statement.setString(2, textTelefono.getText());
            statement.setString(3, textDireccion.getText());
            statement.setInt(4, Integer.parseInt(textID.getText()));

            proccessed = con.executeSQL(statement);
        } catch (SQLException e) {
        }

        return proccessed;
    }

    public boolean Eliminar() {
        String sql = "delete from contacto where id=?;";
        return con.delete(sql, textID.getText());
    }

    public Map<String, String> BuscarID() {
        return BuscarColumnaValor("id", textID.getText());
    }

    public Map<String, String> BuscarColumnaValor(String columnName, Object columnValue) {
        String sql = "select * from contacto where %s='%s' limit 1;";
        sql = String.format(sql, columnName, columnValue);

        List<Map<String, String>> resultado = con.executeSQLResultList(sql);
        return !resultado.isEmpty() ? resultado.get(0) : null;
    }

    public List<Map<String, String>> Listar() {
        String sql = "select * from contacto order by 1;";
        return con.executeSQLResultList(sql);
    }

    public void Actualizar(List<Map<String, String>> datos) {
        DefaultTableModel mode = new DefaultTableModel();
        mode.addColumn("ID");
        mode.addColumn("Nombre");
        mode.addColumn("Telefono");
        mode.addColumn("Direccion");
        tablaContacto.setModel(mode);

        String dato[] = new String[4];

        for (int i = 0; i < datos.size(); i++) {
            Map<String, String> row = datos.get(i);

            dato[0] = row.getOrDefault("id", "0");
            dato[1] = row.getOrDefault("nombre", "");
            dato[2] = row.getOrDefault("telefono", "");
            dato[3] = row.getOrDefault("direccion", "");
            mode.addRow(dato);

        }
    }

    public void Bloquear() {
        textID.setEnabled(false);
        textNombre.setEnabled(false);
        textTelefono.setEnabled(false);
        textDireccion.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnModificar.setEnabled(false);
    }
}

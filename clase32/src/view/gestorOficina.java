/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import dao.oficinaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.oficina;

/**
 *
 * @author belca
 */
public class gestorOficina extends javax.swing.JInternalFrame {

  static oficinaDao dao = new oficinaDao();
 DefaultTableModel model;

  public gestorOficina() {
    initComponents();
    try {
      llenarTabla();
    } catch (SQLException ex) {
      Logger
        .getLogger(gestorOficina.class.getName())
        .log(Level.SEVERE, null, ex);
    }
  }

  public void llenarTabla() throws SQLException {
    model = (DefaultTableModel) ofi_tabla.getModel();
    model.getDataVector().clear();

    ArrayList<oficina> oficinas = new ArrayList<>();
    oficinas = (ArrayList<oficina>) dao.getOficinas();

    for (oficina ofi : oficinas) {
      Object[] row = { ofi.getId(), ofi.getDireccion() };
      model.addRow(row);
    }
    ofi_tabla.setModel(model);
    ofi_tabla.updateUI();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ofi_tabla = new javax.swing.JTable();
        ofi_lbl_registar = new javax.swing.JLabel();
        ofi_registrar_direccion = new javax.swing.JTextField();
        ofi_actualizar_direccion = new javax.swing.JTextField();
        ofi_btn_actualizar = new javax.swing.JButton();
        ofi_btn_eliminar = new javax.swing.JButton();
        ofi_btn_registrar = new javax.swing.JButton();
        ofi_lbl_actualizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        ofi_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ofi_tabla.setName("ofi_tabla"); // NOI18N
        jScrollPane1.setViewportView(ofi_tabla);

        ofi_lbl_registar.setText("REGISTRAR OFICINA");
        ofi_lbl_registar.setName("ofi_lbl_registar"); // NOI18N

        ofi_registrar_direccion.setName("ofi_registrar_direccion"); // NOI18N

        ofi_actualizar_direccion.setName("ofi_actualizar_direccion"); // NOI18N

        ofi_btn_actualizar.setText("Actualizar");
        ofi_btn_actualizar.setName("ofi_btn_actualizar"); // NOI18N
        ofi_btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofi_btn_actualizarActionPerformed(evt);
            }
        });

        ofi_btn_eliminar.setText("Eliminar");
        ofi_btn_eliminar.setName("ofi_btn_eliminar"); // NOI18N
        ofi_btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofi_btn_eliminarActionPerformed(evt);
            }
        });

        ofi_btn_registrar.setText("jButton1");
        ofi_btn_registrar.setName("ofi_btn_registrar"); // NOI18N
        ofi_btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofi_btn_registrarActionPerformed(evt);
            }
        });

        ofi_lbl_actualizar.setText("ACTUALIZAR OFICINA");
        ofi_lbl_actualizar.setName("ofi_lbl_actualizar"); // NOI18N

        jLabel1.setText("Direccion");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Direccion");
        jLabel2.setName("jLabel2"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(120, 120, 120)
                        .add(ofi_btn_registrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(250, 250, 250)
                        .add(ofi_btn_actualizar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(ofi_btn_eliminar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 841, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(70, 70, 70)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(ofi_registrar_direccion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 270, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1))
                        .add(180, 180, 180)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(ofi_actualizar_direccion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 270, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(130, 130, 130)
                .add(ofi_lbl_registar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(ofi_lbl_actualizar)
                .add(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(ofi_lbl_registar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ofi_lbl_actualizar))
                .add(76, 76, 76)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel2))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ofi_registrar_direccion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ofi_actualizar_direccion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(80, 80, 80)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ofi_btn_registrar)
                    .add(ofi_btn_actualizar)
                    .add(ofi_btn_eliminar))
                .add(62, 62, 62)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 138, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void ofi_btn_registrarActionPerformed(
    java.awt.event.ActionEvent evt
  ) {//GEN-FIRST:event_ofi_btn_registrarActionPerformed
    String direccion = ofi_registrar_direccion.getText();
    try {
      dao.crearOficina(direccion);
      llenarTabla();
    } catch (SQLException ex) {
      Logger
        .getLogger(gestorOficina.class.getName())
        .log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_ofi_btn_registrarActionPerformed

  private void ofi_btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ofi_btn_eliminarActionPerformed
    DefaultTableModel model = (DefaultTableModel) ofi_tabla.getModel();
    int row = ofi_tabla.getSelectedRow();
    int id = (int) model.getValueAt(row, 0);

    int confirmacion = JOptionPane.showConfirmDialog(
      null,
      "Seguro que deseas eliminar"
    );

    if (confirmacion == 0) {
      confirmacion =
        JOptionPane.showConfirmDialog(null, "realmente estas seguro?");
      if (confirmacion == 0) {
        try {
          dao.eliminarOficina(id);
          llenarTabla();
        } catch (SQLException ex) {
          Logger
            .getLogger(gestorOficina.class.getName())
            .log(Level.SEVERE, null, ex);
        }
      } else {}
    }
  }//GEN-LAST:event_ofi_btn_eliminarActionPerformed

  private void ofi_btn_actualizarActionPerformed(
    java.awt.event.ActionEvent evt
  ) {//GEN-FIRST:event_ofi_btn_actualizarActionPerformed
    DefaultTableModel model = (DefaultTableModel) ofi_tabla.getModel();
    int row = ofi_tabla.getSelectedRow();
    int id = (int) model.getValueAt(row, 0);
    String direccion = ofi_actualizar_direccion.getText();

    try {
      int confirmacion = JOptionPane.showConfirmDialog(
        null,
        "Seguro que actualizar dato \n" +
        id +
        " " +
        dao.getOficina(id).getDireccion()
      );

      if (confirmacion == 0) {
        try {
          dao.actualizarOficina(id, direccion);
          llenarTabla();
        } catch (SQLException ex) {
          Logger
            .getLogger(gestorOficina.class.getName())
            .log(Level.SEVERE, null, ex);
        }
      } else {}
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }//GEN-LAST:event_ofi_btn_actualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ofi_actualizar_direccion;
    private javax.swing.JButton ofi_btn_actualizar;
    private javax.swing.JButton ofi_btn_eliminar;
    private javax.swing.JButton ofi_btn_registrar;
    private javax.swing.JLabel ofi_lbl_actualizar;
    private javax.swing.JLabel ofi_lbl_registar;
    private javax.swing.JTextField ofi_registrar_direccion;
    private javax.swing.JTable ofi_tabla;
    // End of variables declaration//GEN-END:variables
}

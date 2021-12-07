/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import dao.alquilerDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.alquiler;

public class gestorAlquiler extends javax.swing.JInternalFrame {

  static alquilerDao dao = new alquilerDao();
  static DefaultTableModel model;

  public gestorAlquiler() {
    initComponents();
    try {
      llenarTabla();
    } catch (SQLException ex) {
      Logger
        .getLogger(gestorAlquiler.class.getName())
        .log(Level.SEVERE, null, ex);
    }
  }

  public void llenarTabla() throws SQLException {
    model = (DefaultTableModel) alq_tabla.getModel();
    model.getDataVector().clear();
    ArrayList<alquiler> alquileres = (ArrayList<alquiler>) dao.getAlquileres();

    for (alquiler alq : alquileres) {
      Object[] row = { alq.getId(), alq.getMonto(), alq.getOcupado() };
      model.addRow(row);
    }
    alq_tabla.setModel(model);
    alq_tabla.updateUI();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        alq_tabla = new javax.swing.JTable();
        alq_registar_btn = new javax.swing.JButton();
        alq_actualizar_btn = new javax.swing.JButton();
        alq_eliminar_btn = new javax.swing.JButton();
        alq_chk_ocupado_reg = new javax.swing.JCheckBox();
        alq_chk_ocupado_upt = new javax.swing.JCheckBox();
        alq_ipt_monto_upt = new javax.swing.JTextField();
        alq_ipt_monto_reg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(859, 538));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        alq_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Monto", "Ocupado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        alq_tabla.setName("alq_tabla"); // NOI18N
        jScrollPane1.setViewportView(alq_tabla);

        alq_registar_btn.setText("Registar");
        alq_registar_btn.setName("alq_registar_btn"); // NOI18N
        alq_registar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alq_registar_btnActionPerformed(evt);
            }
        });

        alq_actualizar_btn.setText("Actualizar");
        alq_actualizar_btn.setName("alq_actualizar_btn"); // NOI18N
        alq_actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alq_actualizar_btnActionPerformed(evt);
            }
        });

        alq_eliminar_btn.setText("Eliminar");
        alq_eliminar_btn.setName("alq_eliminar_btn"); // NOI18N
        alq_eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alq_eliminar_btnActionPerformed(evt);
            }
        });

        alq_chk_ocupado_reg.setText("Ocupado");
        alq_chk_ocupado_reg.setName("alq_chk_ocupado_reg"); // NOI18N

        alq_chk_ocupado_upt.setText("Ocupado");
        alq_chk_ocupado_upt.setName("alq_chk_ocupado_upt"); // NOI18N

        alq_ipt_monto_upt.setName("alq_ipt_monto_upt"); // NOI18N
        alq_ipt_monto_upt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alq_ipt_monto_uptKeyTyped(evt);
            }
        });

        alq_ipt_monto_reg.setName("alq_ipt_monto_reg"); // NOI18N
        alq_ipt_monto_reg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alq_ipt_monto_regKeyTyped(evt);
            }
        });

        jLabel1.setText("Monto");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Monto");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("REGISTRAR");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("ACTUALIZAR");
        jLabel4.setName("jLabel4"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(107, 107, 107)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(alq_chk_ocupado_reg)
                    .add(alq_registar_btn))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(alq_chk_ocupado_upt)
                .add(127, 127, 127))
            .add(layout.createSequentialGroup()
                .add(69, 69, 69)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(alq_ipt_monto_reg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(alq_actualizar_btn)
                        .add(71, 71, 71)
                        .add(alq_eliminar_btn))
                    .add(alq_ipt_monto_upt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 234, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(49, 49, 49))
            .add(layout.createSequentialGroup()
                .add(130, 130, 130)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel4)
                .add(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel4))
                .add(37, 37, 37)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(alq_ipt_monto_upt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .add(alq_ipt_monto_reg))
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(alq_chk_ocupado_reg)
                    .add(alq_chk_ocupado_upt))
                .add(46, 46, 46)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(alq_registar_btn)
                    .add(alq_actualizar_btn)
                    .add(alq_eliminar_btn))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 129, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void alq_registar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alq_registar_btnActionPerformed
    try {
      // TODO add your handling code here:
      if (!alq_ipt_monto_reg.getText().equals("")) {
        int monto = Integer.parseInt(alq_ipt_monto_reg.getText());
        boolean ocupado = alq_chk_ocupado_reg.isSelected();
        dao.crearAlquiler(monto, ocupado);
      } else {
        JOptionPane.showMessageDialog(null, "Monto no puede ser nulo");
      }
      llenarTabla();
    } catch (SQLException ex) {
      Logger
        .getLogger(gestorAlquiler.class.getName())
        .log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_alq_registar_btnActionPerformed

  private void alq_actualizar_btnActionPerformed(
    java.awt.event.ActionEvent evt
  ) {//GEN-FIRST:event_alq_actualizar_btnActionPerformed
    DefaultTableModel model = (DefaultTableModel) alq_tabla.getModel();
    int row = alq_tabla.getSelectedRow();
    int id = (int) model.getValueAt(row, 0);
    int monto = 0;
    if (!alq_ipt_monto_upt.getText().equals("")) {
      monto = Integer.parseInt(alq_ipt_monto_upt.getText());
    }
    if (alq_ipt_monto_upt.getText().equals("")) {
      monto = (int) model.getValueAt(row, 1);
    }

    boolean ocupado = alq_chk_ocupado_upt.isSelected();
    try {
      int confirmacion = JOptionPane.showConfirmDialog(
        null,
        "Seguro que desea actualizar datp \n" +
        id +
        " " +
        dao.getAlquiler(id).getMonto()
      );
      if (confirmacion == 0) {
        dao.actualizarAlquiler(id, monto, ocupado);
        llenarTabla();
      }
    } catch (SQLException ex) {
      Logger
        .getLogger(gestorAlquiler.class.getName())
        .log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_alq_actualizar_btnActionPerformed

  private void alq_eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alq_eliminar_btnActionPerformed
    DefaultTableModel model = (DefaultTableModel) alq_tabla.getModel();
    int row = alq_tabla.getSelectedRow();
    int id = (int) model.getValueAt(row, 0);

    int confirmacion = JOptionPane.showConfirmDialog(
      null,
      "Esta seguro que desea eliminar?"
    );
    if (confirmacion == 0) {
      confirmacion =
        JOptionPane.showConfirmDialog(null, "realmente quiere eliminar?");
      if (confirmacion == 0) {
        try {
          dao.eliminarAlquiler(id);
          llenarTabla();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }//GEN-LAST:event_alq_eliminar_btnActionPerformed

  private void alq_ipt_monto_uptKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alq_ipt_monto_uptKeyTyped
    char x = evt.getKeyChar();
    if (!Character.isDigit(x)) {
      evt.consume();
      java.awt.Toolkit.getDefaultToolkit().beep();
    }
  }//GEN-LAST:event_alq_ipt_monto_uptKeyTyped

  private void alq_ipt_monto_regKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alq_ipt_monto_regKeyTyped
    char x = evt.getKeyChar();
    if (!Character.isDigit(x)) {
      evt.consume();
      java.awt.Toolkit.getDefaultToolkit().beep();
    }
  }//GEN-LAST:event_alq_ipt_monto_regKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alq_actualizar_btn;
    private javax.swing.JCheckBox alq_chk_ocupado_reg;
    private javax.swing.JCheckBox alq_chk_ocupado_upt;
    private javax.swing.JButton alq_eliminar_btn;
    private javax.swing.JTextField alq_ipt_monto_reg;
    private javax.swing.JTextField alq_ipt_monto_upt;
    private javax.swing.JButton alq_registar_btn;
    private javax.swing.JTable alq_tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

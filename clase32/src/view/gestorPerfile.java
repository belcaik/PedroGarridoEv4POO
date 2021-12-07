/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import dao.perfileDao;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import pojo.perfile;

public class gestorPerfile extends javax.swing.JInternalFrame {

		perfileDao dao = new perfileDao();
		DefaultTableModel model;
		
		
		public gestorPerfile() {
				initComponents();
				try {
						llenarTabla();
				} catch (SQLException ex) {
						Logger.getLogger(gestorPerfile.class.getName()).log(Level.SEVERE, null, ex);
				}
		}

		public void llenarTabla() throws SQLException{
				model=(DefaultTableModel) per_tabla.getModel();
				model.getDataVector().clear();
				ArrayList<perfile> perfiles = (ArrayList<perfile>) dao.getPerfiles();
				
				for(perfile per : perfiles){
						Object[] row = {per.getId(), per.getNombre()};
						model.addRow(row);
				}
				per_tabla.setModel(model);
				per_tabla.updateUI();
		}
		
		
		@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        per_scrollpane = new javax.swing.JScrollPane();
        per_tabla = new javax.swing.JTable();
        per_nombre_reg = new javax.swing.JTextField();
        per_nombre_upt = new javax.swing.JTextField();
        per_registrar_btn = new javax.swing.JButton();
        per_actualizar_btn = new javax.swing.JButton();
        per_eliminar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        per_scrollpane.setName("per_scrollpane"); // NOI18N

        per_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        per_tabla.setName("per_tabla"); // NOI18N
        per_tabla.getTableHeader().setReorderingAllowed(false);
        per_scrollpane.setViewportView(per_tabla);

        per_nombre_reg.setName("per_nombre_reg"); // NOI18N

        per_nombre_upt.setName("per_nombre_upt"); // NOI18N

        per_registrar_btn.setText("Registrar");
        per_registrar_btn.setName("per_registrar_btn"); // NOI18N
        per_registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per_registrar_btnActionPerformed(evt);
            }
        });

        per_actualizar_btn.setText("Actualizar");
        per_actualizar_btn.setName("per_actualizar_btn"); // NOI18N
        per_actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per_actualizar_btnActionPerformed(evt);
            }
        });

        per_eliminar_btn.setText("Eliminar");
        per_eliminar_btn.setName("per_eliminar_btn"); // NOI18N
        per_eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                per_eliminar_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Perfil");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Nombre Perfil");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("REGISTRAR");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("ACTUALIZAR");
        jLabel4.setName("jLabel4"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(per_scrollpane)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(137, 137, 137)
                        .add(per_registrar_btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(63, 63, 63)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(per_nombre_reg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 269, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 56, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(0, 13, Short.MAX_VALUE)
                        .add(per_actualizar_btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(49, 49, 49)
                        .add(per_eliminar_btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(56, 56, 56))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(per_nombre_upt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 269, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .add(layout.createSequentialGroup()
                .add(141, 141, 141)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel4)
                .add(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel4))
                .add(43, 43, 43)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(per_nombre_reg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(per_nombre_upt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(per_actualizar_btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(per_eliminar_btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(per_registrar_btn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 52, Short.MAX_VALUE)
                .add(per_scrollpane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void per_registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per_registrar_btnActionPerformed
        try {
						if(!per_nombre_reg.getText().equals("")){
								String nombre = per_nombre_reg.getText();
								dao.crearPerfile(nombre);
								llenarTabla();
						}else{
								JOptionPane.showMessageDialog(null, "Nombre no puede ser nulo");
						}
				} catch (Exception e) {
				}
    }//GEN-LAST:event_per_registrar_btnActionPerformed

    private void per_actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per_actualizar_btnActionPerformed
        model = (DefaultTableModel) per_tabla.getModel();
				int row = per_tabla.getSelectedRow();
				int id = (int) model.getValueAt(row, 0);
				String nombre = "";
				if(!per_nombre_upt.getText().equals("")){
						nombre = per_nombre_upt.getText();
				}if(per_nombre_upt.getText().equals("")){
						nombre = (String) model.getValueAt(row, 1);
				}
				
				try {
						int confirmacion = JOptionPane.showConfirmDialog(null, "Seguro que deseas actualizar?");
						if(confirmacion==0){
								dao.actualizarPerfile(id, nombre);
								llenarTabla();
						}else{}	
				} catch (SQLException e) {
						e.printStackTrace();
				}
				
				
				
				
    }//GEN-LAST:event_per_actualizar_btnActionPerformed

    private void per_eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_per_eliminar_btnActionPerformed
        model = (DefaultTableModel) per_tabla.getModel();
				int row = per_tabla.getSelectedRow();
				int id = (int) model.getValueAt(row, 0);
				
				int confirmacion = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas eliminar?");
				if(confirmacion==0){
						confirmacion=JOptionPane.showConfirmDialog(null, "realmente estas seguro?");
						if(confirmacion==0){
								try {
										dao.eliminarPerfile(id);
										llenarTabla();
								} catch (SQLException ex) {
										Logger.getLogger(gestorPerfile.class.getName()).log(Level.SEVERE, null, ex);
								}
						}
				}
				
				
    }//GEN-LAST:event_per_eliminar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton per_actualizar_btn;
    private javax.swing.JButton per_eliminar_btn;
    private javax.swing.JTextField per_nombre_reg;
    private javax.swing.JTextField per_nombre_upt;
    private javax.swing.JButton per_registrar_btn;
    private javax.swing.JScrollPane per_scrollpane;
    private javax.swing.JTable per_tabla;
    // End of variables declaration//GEN-END:variables
}

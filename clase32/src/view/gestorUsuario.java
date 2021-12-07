
package view;

import dao.usuarioDao;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import pojo.usuario;

public class gestorUsuario extends javax.swing.JInternalFrame {
		
		usuarioDao dao = new usuarioDao();
		DefaultTableModel model;
		
		public gestorUsuario() throws SQLException {
				initComponents();
				llenarTabla();
		}

		public void llenarTabla() throws SQLException{
				model=(DefaultTableModel) usu_tabla.getModel();
				model.getDataVector().clear();
				ArrayList<usuario> usuarios = (ArrayList<usuario>) dao.getUsuarios();
				
				for(usuario usu : usuarios){
						Object[] row={usu.getId(), usu.getUsername(), usu.getPassword()};
						model.addRow(row);
				}
		usu_tabla.setModel(model);
		usu_tabla.updateUI();
		
		}
		
		@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        usu_tabla = new javax.swing.JTable();
        usu_nombre_reg = new javax.swing.JTextField();
        usu_password_reg = new javax.swing.JTextField();
        usu_nombre_upt = new javax.swing.JTextField();
        usu_password_upt = new javax.swing.JTextField();
        usu_registrar_btn = new javax.swing.JButton();
        usu_actualizar_btn = new javax.swing.JButton();
        usu_eliminar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        usu_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        usu_tabla.setName("usu_tabla"); // NOI18N
        usu_tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(usu_tabla);

        usu_nombre_reg.setName("usu_nombre_reg"); // NOI18N

        usu_password_reg.setName("usu_password_reg"); // NOI18N

        usu_nombre_upt.setName("usu_nombre_upt"); // NOI18N

        usu_password_upt.setName("usu_password_upt"); // NOI18N

        usu_registrar_btn.setText("Registrar");
        usu_registrar_btn.setName("usu_registrar_btn"); // NOI18N
        usu_registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usu_registrar_btnActionPerformed(evt);
            }
        });

        usu_actualizar_btn.setText("Actualizar");
        usu_actualizar_btn.setName("usu_actualizar_btn"); // NOI18N
        usu_actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usu_actualizar_btnActionPerformed(evt);
            }
        });

        usu_eliminar_btn.setText("Eliminar");
        usu_eliminar_btn.setName("usu_eliminar_btn"); // NOI18N
        usu_eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usu_eliminar_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Usuario");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Password");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("Password");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("Nombre Usuario");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("REGISTRAR");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText("ACTUALIZAR");
        jLabel6.setName("jLabel6"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
            .add(layout.createSequentialGroup()
                .add(85, 85, 85)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel2)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(usu_nombre_reg)
                            .add(usu_password_reg, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(139, 139, 139)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(usu_registrar_btn)
                                .add(195, 195, 195)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(usu_password_upt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 224, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(usu_actualizar_btn)
                                        .add(31, 31, 31)
                                        .add(usu_eliminar_btn))
                                    .add(jLabel3)))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel4)
                                .add(usu_nombre_upt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 224, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(167, 167, 167)
                        .add(jLabel5)
                        .add(271, 271, 271)
                        .add(jLabel6)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jLabel6))
                .add(25, 25, 25)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(usu_nombre_reg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(usu_nombre_upt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(usu_password_reg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(usu_password_upt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(usu_registrar_btn)
                    .add(usu_actualizar_btn)
                    .add(usu_eliminar_btn))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 30, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 177, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

		
    private void usu_registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usu_registrar_btnActionPerformed
       try {
						if(!usu_nombre_reg.equals("")&&!usu_password_reg.equals("")){
								String nombre = usu_nombre_reg.getText();
								String password = usu_password_reg.getText();
								dao.crearUsuario(nombre, password);
						}else{
								JOptionPane.showMessageDialog(null, "no pueden haber campos vacios");
						}
						llenarTabla();
				} catch (SQLException e) {
						e.printStackTrace();
				}
    }//GEN-LAST:event_usu_registrar_btnActionPerformed

    private void usu_actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usu_actualizar_btnActionPerformed
        model=(DefaultTableModel) usu_tabla.getModel();
				int row = usu_tabla.getSelectedRow();
				int id = (int) model.getValueAt(row, 0);
				String nombre = "";
				String password = "";
				if (!usu_nombre_upt.getText().equals("")) {
						nombre = usu_nombre_upt.getText();
				}
				if(usu_nombre_upt.getText().equals("")) {
						nombre = (String) model.getValueAt(row, 1);
				}
				if(!usu_password_upt.equals("")){
						password = usu_password_upt.getText();
				}if(usu_password_upt.getText().equals("")){
						password = (String) model.getValueAt(row, 2);
				}

    
				try {
				int confirmacion = JOptionPane.showConfirmDialog(
        null,
        "Seguro que desea actualizar dato?");
      if (confirmacion == 0) {
        dao.actualizarUsuario(id, nombre, password);
        llenarTabla();
      }
    } catch (SQLException ex) {
				ex.printStackTrace();
    }
    }//GEN-LAST:event_usu_actualizar_btnActionPerformed

    private void usu_eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usu_eliminar_btnActionPerformed
        
				
				model=(DefaultTableModel) usu_tabla.getModel();
				int row = usu_tabla.getSelectedRow();
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
          dao.eliminarUsuario(id);
          llenarTabla();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    }//GEN-LAST:event_usu_eliminar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton usu_actualizar_btn;
    private javax.swing.JButton usu_eliminar_btn;
    private javax.swing.JTextField usu_nombre_reg;
    private javax.swing.JTextField usu_nombre_upt;
    private javax.swing.JTextField usu_password_reg;
    private javax.swing.JTextField usu_password_upt;
    private javax.swing.JButton usu_registrar_btn;
    private javax.swing.JTable usu_tabla;
    // End of variables declaration//GEN-END:variables
}


package view;

import dao.productoDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import pojo.producto;
import javax.swing.JOptionPane;

public class gestorProducto extends javax.swing.JInternalFrame {
		DefaultTableModel model;
		productoDao dao = new productoDao();
		public gestorProducto() {
				initComponents();
				try {
						llenarTabla();
				} catch (SQLException ex) {
						Logger.getLogger(gestorProducto.class.getName()).log(Level.SEVERE, null, ex);
				}
		}
		
		public void llenarTabla() throws SQLException{
				model=(DefaultTableModel) prod_tabla.getModel();
				model.getDataVector().clear();
				ArrayList<producto> productos = (ArrayList<producto>) dao.getProductos();
				
				for(producto prod : productos){
						Object[] row={prod.getId(), prod.getDescripcion(), prod.getPrecio()};
						model.addRow(row);
				}
		prod_tabla.setModel(model);
		prod_tabla.updateUI();
		
		}
		
		
	
		@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        prod_tabla = new javax.swing.JTable();
        prod_descripcion_reg = new javax.swing.JTextField();
        prod_precio_reg = new javax.swing.JTextField();
        prod_descripcion_upt = new javax.swing.JTextField();
        prod_precio_upt = new javax.swing.JTextField();
        prod_registar_btn = new javax.swing.JButton();
        prod_actualizar_btn = new javax.swing.JButton();
        prod_eliminar_btn = new javax.swing.JButton();
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

        prod_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Descripcion", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        prod_tabla.setName("prod_tabla"); // NOI18N
        prod_tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(prod_tabla);

        prod_descripcion_reg.setName("prod_descripcion_reg"); // NOI18N

        prod_precio_reg.setName("prod_precio_reg"); // NOI18N
        prod_precio_reg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prod_precio_regKeyTyped(evt);
            }
        });

        prod_descripcion_upt.setName("prod_descripcion_upt"); // NOI18N

        prod_precio_upt.setName("prod_precio_upt"); // NOI18N
        prod_precio_upt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prod_precio_uptKeyTyped(evt);
            }
        });

        prod_registar_btn.setText("Registrar");
        prod_registar_btn.setName("prod_registar_btn"); // NOI18N
        prod_registar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_registar_btnActionPerformed(evt);
            }
        });

        prod_actualizar_btn.setText("Actualizar");
        prod_actualizar_btn.setName("prod_actualizar_btn"); // NOI18N
        prod_actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_actualizar_btnActionPerformed(evt);
            }
        });

        prod_eliminar_btn.setText("Eliminar");
        prod_eliminar_btn.setName("prod_eliminar_btn"); // NOI18N
        prod_eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_eliminar_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Descripcion");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Precio");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("Descripcion");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText("Precio");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("REGISTRAR");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText("ACTUALIZAR");
        jLabel6.setName("jLabel6"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1)
            .add(layout.createSequentialGroup()
                .add(138, 138, 138)
                .add(prod_registar_btn)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 165, Short.MAX_VALUE)
                .add(prod_actualizar_btn)
                .add(36, 36, 36)
                .add(prod_eliminar_btn)
                .add(84, 84, 84))
            .add(layout.createSequentialGroup()
                .add(72, 72, 72)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(prod_precio_reg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 228, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prod_descripcion_reg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 228, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(prod_descripcion_upt)
                            .add(prod_precio_upt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .add(55, 55, 55))
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel3)
                        .add(221, 221, 221))
                    .add(layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel4)
                        .add(246, 246, 246))))
            .add(layout.createSequentialGroup()
                .add(157, 157, 157)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel6)
                .add(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jLabel6))
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(prod_descripcion_reg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prod_descripcion_upt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(1, 1, 1)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jLabel4))
                .add(1, 1, 1)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(prod_precio_reg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prod_precio_upt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(34, 34, 34)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(prod_registar_btn)
                    .add(prod_actualizar_btn)
                    .add(prod_eliminar_btn))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 54, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prod_registar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_registar_btnActionPerformed
        try {
						if(!prod_descripcion_reg.equals("")&&!prod_precio_reg.equals("")){
								int precio = Integer.parseInt(prod_precio_reg.getText());
								String descripcion = prod_descripcion_reg.getText();
								dao.crearProducto(descripcion, precio);
						}else{
								JOptionPane.showMessageDialog(null, "no pueden haber campos vacios");
						}
						llenarTabla();
				} catch (SQLException e) {
						e.printStackTrace();
				}
    }//GEN-LAST:event_prod_registar_btnActionPerformed

    private void prod_actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_actualizar_btnActionPerformed
        model=(DefaultTableModel) prod_tabla.getModel();
				int row = prod_tabla.getSelectedRow();
				int id = (int) model.getValueAt(row, 0);
				int precio = 0;
				String descripcion = "";
				if (!prod_descripcion_upt.getText().equals("")) {
						descripcion = prod_descripcion_upt.getText();
				}
				if (prod_descripcion_upt.getText().equals("")) {
						descripcion = (String) model.getValueAt(row, 1);
				}
				if(!prod_precio_upt.equals("")){
						precio = Integer.parseInt(prod_precio_upt.getText());
				}
				if(prod_precio_upt.equals("")){
						precio = (int) model.getValueAt(row, 2);
				}

    
				try {
				int confirmacion = JOptionPane.showConfirmDialog(
        null,
        "Seguro que desea actualizar dato?");
      if (confirmacion == 0) {
        dao.actualizarProducto(id, descripcion, precio);
        llenarTabla();
      }
    } catch (SQLException ex) {
      Logger
        .getLogger(gestorAlquiler.class.getName())
        .log(Level.SEVERE, null, ex);
    }
				
    }//GEN-LAST:event_prod_actualizar_btnActionPerformed

    private void prod_eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_eliminar_btnActionPerformed
        model = (DefaultTableModel) prod_tabla.getModel();
				 int row = prod_tabla.getSelectedRow();
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
          dao.eliminarProducto(id);
          llenarTabla();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
    }//GEN-LAST:event_prod_eliminar_btnActionPerformed

    private void prod_precio_regKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prod_precio_regKeyTyped
        char x = evt.getKeyChar();
    if (!Character.isDigit(x)) {
      evt.consume();
      java.awt.Toolkit.getDefaultToolkit().beep();
    }
    }//GEN-LAST:event_prod_precio_regKeyTyped

    private void prod_precio_uptKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prod_precio_uptKeyTyped
        char x = evt.getKeyChar();
    if (!Character.isDigit(x)) {
      evt.consume();
      java.awt.Toolkit.getDefaultToolkit().beep();
    }
    }//GEN-LAST:event_prod_precio_uptKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prod_actualizar_btn;
    private javax.swing.JTextField prod_descripcion_reg;
    private javax.swing.JTextField prod_descripcion_upt;
    private javax.swing.JButton prod_eliminar_btn;
    private javax.swing.JTextField prod_precio_reg;
    private javax.swing.JTextField prod_precio_upt;
    private javax.swing.JButton prod_registar_btn;
    private javax.swing.JTable prod_tabla;
    // End of variables declaration//GEN-END:variables
}

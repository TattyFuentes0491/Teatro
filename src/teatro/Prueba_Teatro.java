/*
8.  Un teatro se caracteriza por su nombre y su dirección y en él se realizan 4 funciones al día.
Cada función tiene un nombre y un precio. Realice el diseño de clases definiendo los métodos  y atributos  
que tendría cada clase, teniendo en cuenta que se pueda cambiar los valores de los atributos del teatro y de la función.  
Implemente dichas clases, y defina un método adicional que permita mostrar por pantalla toda la información del teatro. 
Diseñe una clase donde se pruebe las funcionalidades descritas.
 */
package teatro;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Prueba_Teatro extends javax.swing.JFrame {
    
    //instanciamos la clase
    Teatro tea = new Teatro();

    public Prueba_Teatro() {
        initComponents();
        jBtnActualizar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuTeatro = new javax.swing.JPopupMenu();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtFldNombreTeatro = new javax.swing.JTextField();
        jTxtFldDireccion = new javax.swing.JTextField();
        jTxtFldNombreFuncion = new javax.swing.JTextField();
        jTxtFldPrecio = new javax.swing.JTextField();
        jBtnAnadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTeatro = new javax.swing.JTable();
        jBtnExportar = new javax.swing.JButton();
        jBtnActualizar = new javax.swing.JButton();

        jMenuItemModificar.setText("Modificar");
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jPopupMenuTeatro.add(jMenuItemModificar);

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenuTeatro.add(jMenuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Información Teatro");

        jLabel2.setText("Nombre del Teatro");

        jLabel3.setText("Dirección");

        jLabel4.setText("Nombre de la Función");

        jLabel5.setText("Precio de la Función");

        jTxtFldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFldPrecioActionPerformed(evt);
            }
        });

        jBtnAnadir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnAnadir.setText("Añadir");
        jBtnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnadirActionPerformed(evt);
            }
        });

        jTableTeatro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Teatro", "Dirección", "Nombre Funcion", "Precio"
            }
        ));
        jTableTeatro.setComponentPopupMenu(jPopupMenuTeatro);
        jScrollPane1.setViewportView(jTableTeatro);
        if (jTableTeatro.getColumnModel().getColumnCount() > 0) {
            jTableTeatro.getColumnModel().getColumn(0).setMaxWidth(130);
            jTableTeatro.getColumnModel().getColumn(1).setMaxWidth(80);
            jTableTeatro.getColumnModel().getColumn(2).setMaxWidth(130);
            jTableTeatro.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        jBtnExportar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnExportar.setText("Exportar");
        jBtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExportarActionPerformed(evt);
            }
        });

        jBtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnActualizar.setText("Actualizar");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTxtFldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jBtnActualizar)
                                .addGap(167, 167, 167)
                                .addComponent(jBtnExportar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtFldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtFldNombreTeatro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtFldNombreFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtFldNombreTeatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtFldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxtFldNombreFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnActualizar)
                    .addComponent(jBtnExportar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtFldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jBtnAnadir)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFldPrecioActionPerformed

    private void jBtnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnadirActionPerformed
        // añadimos registro a la tabla  
        String nomT,direc,nomF;
        double precio;
        nomT=jTxtFldNombreTeatro.getText();
        direc=jTxtFldDireccion.getText();
        nomF=jTxtFldNombreFuncion.getText();
        precio=Double.parseDouble(jTxtFldPrecio.getText());
        //llenamos la tabla con la información
        tea.llenarTabla(nomT,direc,nomF,precio,jTableTeatro);
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnAnadirActionPerformed

    private void jBtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExportarActionPerformed
        //exportar datos a un archivo de texto
        tea.crearArchivo(jTableTeatro);
    }//GEN-LAST:event_jBtnExportarActionPerformed

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
         //instanciamos la tabla
        DefaultTableModel tb = (DefaultTableModel) jTableTeatro.getModel();
        if (jTableTeatro.getSelectedRow()>=0){ // nos paramos ne la fila seleccionada
            //reasignamos en las cajas de texto los valores de la tabla
            jTxtFldNombreTeatro.setText(jTableTeatro.getValueAt(jTableTeatro.getSelectedRow(), 0).toString());
            jTxtFldDireccion.setText(jTableTeatro.getValueAt(jTableTeatro.getSelectedRow(), 1).toString());
            jTxtFldNombreFuncion.setText(jTableTeatro.getValueAt(jTableTeatro.getSelectedRow(), 2).toString());
            jTxtFldPrecio.setText(jTableTeatro.getValueAt(jTableTeatro.getSelectedRow(), 3).toString());
        } 
        jBtnActualizar.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarActionPerformed

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarActionPerformed
        //creamos atributos
        String nomT,direc,nomF;
        double precio;
        nomT=jTxtFldNombreTeatro.getText();
        direc=jTxtFldDireccion.getText();
        nomF=jTxtFldNombreFuncion.getText();
        precio=Double.parseDouble(jTxtFldPrecio.getText());
        //guaradr datos modificados
        int filaSelec=0;
        filaSelec= jTableTeatro.getSelectedRow();
        tea.guardarDatosModificados(jTableTeatro,filaSelec,nomT,direc,nomF,precio);
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnActualizarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        // eliminar un registro
        tea.eliminaRegistro(jTableTeatro);
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

     private void limpiarCajaTexto(){
        //limpiamos las cajas de texto
        jTxtFldNombreTeatro.setText(null);
        jTxtFldDireccion.setText(null);
        jTxtFldNombreFuncion.setText(null);
        jTxtFldPrecio.setText(null);
    }
     
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
            java.util.logging.Logger.getLogger(Prueba_Teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba_Teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba_Teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba_Teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba_Teatro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnAnadir;
    private javax.swing.JButton jBtnExportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenuTeatro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTeatro;
    private javax.swing.JTextField jTxtFldDireccion;
    private javax.swing.JTextField jTxtFldNombreFuncion;
    private javax.swing.JTextField jTxtFldNombreTeatro;
    private javax.swing.JTextField jTxtFldPrecio;
    // End of variables declaration//GEN-END:variables
}

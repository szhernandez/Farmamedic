/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.logcliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZAIR
 */
public class dialogpvtipodoc extends java.awt.Dialog {

    /**
     * Creates new form frmpvcliente
     */
    public dialogpvtipodoc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        titulostabla();
    }
    //daclarando variable publica
    public static String accion="";
    
    DefaultTableModel modelo= new DefaultTableModel(){
     public boolean isCellEditable(int row, int column) {return false;}};
    void titulostabla(){
    modelo.addColumn("Documento");
    modelo.addColumn("Descripcion");
    tabladocs.setModel(modelo);
    String []datos = new String[4];
    datos[0]="Ticket";
    datos[1]="Esto Genera un ticket de venta";
    modelo.addRow(datos);
    datos[0]="Nota";
    datos[1]="Esto Genera una nota de venta tamaño carta";
    modelo.addRow(datos);
   /* modelo.setValueAt("Ticket", 0, 0);
    modelo.setValueAt("Esto Genera un ticket de venta", 0, 1);
    modelo.setValueAt("Nota", 1, 0);
    modelo.setValueAt("Esto Genera una nota de venta tamaño carta", 1, 1);
    */
    formatodetabla();
    }
    
    void formatodetabla(){
    //idclient
    tabladocs.getColumnModel().getColumn(0).setPreferredWidth(200);
     //Columna nombre
    tabladocs.getColumnModel().getColumn(1).setPreferredWidth(300);
    
     
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladocs = new javax.swing.JTable();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        tabladocs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabladocs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladocsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabladocs);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void tabladocsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladocsMouseClicked
              if (evt.getClickCount()==2 ) {
                  try {
                      if (accion.equals("Venta")) {
                          int fila= tabladocs.rowAtPoint(evt.getPoint());
                      frmpuntoventa.txttipodocumento.setText(tabladocs.getValueAt(fila, 0).toString());
                      }
                      if (accion.equals("Venta2")) {
                          int fila= tabladocs.rowAtPoint(evt.getPoint());
                      frmpuntoventa2.txttipodocumento.setText(tabladocs.getValueAt(fila, 0).toString());
                      }
                      if (accion.equals("Preventa")) {
                          int fila= tabladocs.rowAtPoint(evt.getPoint());
                      frmpuntoventa_preventa.txttipodocumento.setText(tabladocs.getValueAt(fila, 0).toString());
                      }
                      if (accion.equals("Modificar")) {
                       int fila= tabladocs.rowAtPoint(evt.getPoint());
                      frmpuntoconsultaventa.txttipodocumento.setText(tabladocs.getValueAt(fila, 0).toString());
                      }
                     
                      this.dispose();
                  } catch (Exception e) {
                  }
              }
    }//GEN-LAST:event_tabladocsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogpvtipodoc dialog = new dialogpvtipodoc(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladocs;
    // End of variables declaration//GEN-END:variables
}
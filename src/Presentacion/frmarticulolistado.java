/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;



import Logica.logarticulo;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZAIR
 */
public class frmarticulolistado extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmlistadoclientes
     */
    public frmarticulolistado() {
        initComponents();
        //Iniciando el metodo mostrar el cual llena la tabla de clientes
        mostrar("");
         Color myColor = new Color(255,255,255);
         tablaproducto.setBackground(myColor);
         jScrollPane1.getViewport().setBackground(myColor);
          ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);//Con esto quito el title
        
        
    }
    void formatodetabla(){
    //Columnaid
    txtbuscar.requestFocus();
    tablaproducto.getColumnModel().getColumn(0).setPreferredWidth(300);
    //Columna descripcion
    tablaproducto.getColumnModel().getColumn(1).setPreferredWidth(500);
    //colunma marca
    tablaproducto.getColumnModel().getColumn(2).setPreferredWidth(200);
    //Columna tipo
    tablaproducto.getColumnModel().getColumn(3).setMaxWidth(0);
    tablaproducto.getColumnModel().getColumn(3).setMinWidth(0);
    tablaproducto.getColumnModel().getColumn(3).setPreferredWidth(0);
    //Columna impuesto
    tablaproducto.getColumnModel().getColumn(4).setMaxWidth(0);
    tablaproducto.getColumnModel().getColumn(4).setMinWidth(0);
    tablaproducto.getColumnModel().getColumn(4).setPreferredWidth(0);
    //Columna precio compra
    tablaproducto.getColumnModel().getColumn(5).setMaxWidth(0);
    tablaproducto.getColumnModel().getColumn(5).setMinWidth(0);
    tablaproducto.getColumnModel().getColumn(5).setPreferredWidth(0);
    //Columna precio venta1
    tablaproducto.getColumnModel().getColumn(6).setPreferredWidth(100);
     //Columna precio venta2
    tablaproducto.getColumnModel().getColumn(7).setPreferredWidth(100);
     //Columna precio venta3
    tablaproducto.getColumnModel().getColumn(8).setPreferredWidth(100);
     //Columna precio venta4
    tablaproducto.getColumnModel().getColumn(9).setPreferredWidth(100);
     //Columna precio venta5
    tablaproducto.getColumnModel().getColumn(10).setPreferredWidth(100);
     //Columna  imagen
    tablaproducto.getColumnModel().getColumn(11).setMaxWidth(0);
    tablaproducto.getColumnModel().getColumn(11).setMinWidth(0);
    tablaproducto.getColumnModel().getColumn(11).setPreferredWidth(0);
    //Columna  existencia
    tablaproducto.getColumnModel().getColumn(12).setPreferredWidth(100);
     //Columna  minimo
    tablaproducto.getColumnModel().getColumn(13).setMaxWidth(0);
    tablaproducto.getColumnModel().getColumn(13).setMinWidth(0);
    tablaproducto.getColumnModel().getColumn(13).setPreferredWidth(0);
     //Columna  maximo
    tablaproducto.getColumnModel().getColumn(14).setMaxWidth(0);
    tablaproducto.getColumnModel().getColumn(14).setMinWidth(0);
    tablaproducto.getColumnModel().getColumn(14).setPreferredWidth(0);
     //Columna  observaciones
    tablaproducto.getColumnModel().getColumn(15).setPreferredWidth(300);
     //Columna  fecha
    tablaproducto.getColumnModel().getColumn(16).setMaxWidth(0);
    tablaproducto.getColumnModel().getColumn(16).setMinWidth(0);
    tablaproducto.getColumnModel().getColumn(16).setPreferredWidth(0);
     //Columna  Hora
    tablaproducto.getColumnModel().getColumn(17).setMaxWidth(0);
    tablaproducto.getColumnModel().getColumn(17).setMinWidth(0);
    tablaproducto.getColumnModel().getColumn(17).setPreferredWidth(0);
     //Columna  Peso
    tablaproducto.getColumnModel().getColumn(18).setMaxWidth(0);
    tablaproducto.getColumnModel().getColumn(18).setMinWidth(0);
    tablaproducto.getColumnModel().getColumn(18).setPreferredWidth(0);
    }
    
     void mostrar(String buscar){
        try {
            DefaultTableModel modelo;
            logarticulo func = new logarticulo();
            modelo=func.mostrar(buscar);
            tablaproducto.setModel(modelo);
            formatodetabla();
           lbltotal.setText("Total de articulos: "+ Integer.toString(func.totalregistros));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproducto = new javax.swing.JTable();
        lbltotal = new javax.swing.JLabel();
        jPanelencabezado = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnnuevo1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de Articulos");

        tablaproducto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tablaproducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaproducto.setToolTipText("Doble clic para editar");
        tablaproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaproducto);

        lbltotal.setText("Total");

        jPanelencabezado.setBackground(new java.awt.Color(242, 124, 13));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32x32/icons8_Close_Window_32px_1.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(242, 124, 13));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de articulos");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanelencabezadoLayout = new javax.swing.GroupLayout(jPanelencabezado);
        jPanelencabezado.setLayout(jPanelencabezadoLayout);
        jPanelencabezadoLayout.setHorizontalGroup(
            jPanelencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelencabezadoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanelencabezadoLayout.setVerticalGroup(
            jPanelencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelencabezadoLayout.createSequentialGroup()
                .addGroup(jPanelencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/64x64/buscarproducto.png"))); // NOI18N

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setToolTipText("Buscar cliente ");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnnuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/32x32/add.png"))); // NOI18N
        btnnuevo1.setToolTipText("Agregar trabajador");
        btnnuevo1.setBorderPainted(false);
        btnnuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevo1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnnuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnuevo1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelencabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelencabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        
        mostrar(txtbuscar.getText());
        txtbuscar.selectAll();
        
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnnuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevo1ActionPerformed
        try {
            //Abriendo ventana trabajador

            frmarticulo producto = new frmarticulo();
            frminicio.escritorio.add(producto);
            producto.toFront();
            Dimension desktopSize = frminicio.escritorio.getSize();
            Dimension FrameSize = producto.getSize();
            producto.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
            producto.toFront();
            producto.setVisible(true);

            //Enviando la accion que se requerira segun la funcion
            frmarticulo.lblaccion.setText("guardar");
            frmarticulo.btnaccion.setText("Guardar");
           
            
            frmarticulo.btneliminar.setVisible(false);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"Error: " + e.toString());
        }
    }//GEN-LAST:event_btnnuevo1ActionPerformed

    private void tablaproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductoMouseClicked
       //REFRESCANDO LA PAGINA CON UN CLIC EN TABLA
        if (evt.getClickCount()==1 ) {
            try {
                 mostrar(txtbuscar.getText());
            } catch (Exception e) {
            }
        }
        
        if (evt.getClickCount()==2 ) {
            try {
        //Abriendo ventana proveedores
        int fila= tablaproducto.rowAtPoint(evt.getPoint());
        frmarticulo ventana = new frmarticulo();
        frminicio.escritorio.add(ventana);
        ventana.toFront();
        Dimension desktopSize = frminicio.escritorio.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ventana.toFront();
       
        ventana.setVisible(true);  
       
       //Enviando la accion que se requerira segun la funcion
       frmarticulo.lblaccion.setText("editar");
       frmarticulo.btnaccion.setText("Editar");
       frmarticulo.txtcodigo.setEnabled(false);
       frmarticulo.lblid.setEnabled(false);
       frmarticulo.txtpreciocompra.setEditable(false);
       frmarticulo.txtexistencia.setEditable(false);
       
       //Asignando datos a elementos ventana trabajador
       frmarticulo.txtcodigo.setText(tablaproducto.getValueAt(fila, 0).toString());
       frmarticulo.txtdescripcion.setText(tablaproducto.getValueAt(fila, 1).toString());
       frmarticulo.txtmarca.setText(tablaproducto.getValueAt(fila, 2).toString());
        frmarticulo.txttipo.setText(tablaproducto.getValueAt(fila, 3).toString());
       frmarticulo.cboimpuesto.setSelectedItem(tablaproducto.getValueAt(fila, 4).toString());
       frmarticulo.txtpreciocompra.setText(tablaproducto.getValueAt(fila, 5).toString());
       frmarticulo.txtpv1.setText(tablaproducto.getValueAt(fila, 6).toString());
       frmarticulo.txtpv2.setText(tablaproducto.getValueAt(fila, 7).toString());
       frmarticulo.txtpv3.setText(tablaproducto.getValueAt(fila, 8).toString());
       frmarticulo.txtpv4.setText(tablaproducto.getValueAt(fila, 9).toString());
       frmarticulo.txtpv5.setText(tablaproducto.getValueAt(fila, 10).toString());
       //EL 11 corresponde a la imagen
       frmarticulo.txtexistencia.setText(tablaproducto.getValueAt(fila, 12).toString());
       frmarticulo.txtstockmin.setText(tablaproducto.getValueAt(fila, 13).toString());
       frmarticulo.txtstockmax.setText(tablaproducto.getValueAt(fila, 14).toString());
       frmarticulo.txtobservaciones.setText(tablaproducto.getValueAt(fila, 15).toString());
       
       
      
       //Cerrando la ventana      
       //this.dispose();
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.toString());
        }
      }
    }//GEN-LAST:event_tablaproductoMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(frmarticulolistado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmarticulolistado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmarticulolistado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmarticulolistado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmarticulolistado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnnuevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelencabezado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tablaproducto;
    public static javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}

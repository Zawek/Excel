/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtlCliente;
import Controlador.CtlProducto;
import Controlador.CtlProveedor;
import java.io.File;
import java.io.IOException;
import static java.lang.System.out;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author HP
 */
public class JfrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JfrmPrincipal
     */
    private JFileChooser FileChooser = new JFileChooser();
    private Vector columna = new Vector();
    private Vector filas = new Vector();
    
    CtlProveedor ctProveedor;
    CtlCliente ctCliente;
    CtlProducto ctProducto;
    
    File fileRuta;
    
    public JfrmPrincipal() {
        initComponents();
        ctCliente = new CtlCliente();
        ctProducto = new CtlProducto();
        ctProveedor = new CtlProveedor();
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
        tblTablas = new javax.swing.JTable();
        btnImportar = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tblTablas);

        btnImportar.setText("Importar");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnImportar)
                        .addGap(29, 29, 29)
                        .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImportar)
                    .addComponent(btnValidar))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        // TODO add your handling code here:

        FileChooser.showDialog(null, "Importar Hoja ");
        fileRuta = FileChooser.getSelectedFile();
        
        if (!fileRuta.getName().endsWith("xls")) {
            
            JOptionPane.showMessageDialog(null, "Seleccione un archivo excel...", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (fileRuta.getName().equals("Clientes.xls")) {
                try {
                    tblTablas.setModel(ctCliente.SolicitudListarCliente(fileRuta, columna, filas));
                    
                } catch (IOException ex) {
                    Logger.getLogger(JfrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else if (fileRuta.getName().equals("Proveedores.xls")) {
                try {
                    tblTablas.setModel(ctProveedor.SolicitudListarProveedor(fileRuta, columna, filas));
                    
                } catch (IOException ex) {
                    Logger.getLogger(JfrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (fileRuta.getName().equals("Productos.xls")) {
                try {
                    tblTablas.setModel(ctProducto.SolicitudListarProductos(fileRuta, columna, filas));
                    
                } catch (IOException ex) {
                    Logger.getLogger(JfrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            {
                
            }
            
        }
        

    }//GEN-LAST:event_btnImportarActionPerformed
    

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        
        File file = fileRuta;
        
        if (file.getName().equals("Clientes.xls")) {
            ctCliente.SolicitudRegistrarConsulta();
            
        } else if (file.getName().equals("Proveedores.xls")) {
            ctProveedor.SolicitudRegistrarConsulta();
        } else if (file.getName().equals("Productos.xlsx")) {
            ctProducto.SolicitudRegistrarConsulta();
        }


    }//GEN-LAST:event_btnValidarActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablas;
    // End of variables declaration//GEN-END:variables

//     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ProductoDAO;
import Modelo.ClsConexion;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CtlProducto {
    ClsConexion conexion = new ClsConexion();
    
     public DefaultTableModel SolicitudListarProductos(File file,Vector a,Vector b) throws IOException {
         ProductoDAO clienDAO = new ProductoDAO();
        return clienDAO.listarProductos(file,a,b);
    }
     
     public boolean SolicitudRegistrarConsulta(){
         ProductoDAO clienDAO = new ProductoDAO();
      return  clienDAO.registrarConsulta();
     }
}

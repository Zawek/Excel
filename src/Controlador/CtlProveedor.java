/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ProveedorDAO;
import Modelo.ClsConexion;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CtlProveedor {
    ClsConexion conexion = new ClsConexion();
    
     public DefaultTableModel SolicitudListarProveedor(File file,Vector a,Vector b) throws IOException {
         ProveedorDAO proveDAO = new ProveedorDAO();
        return proveDAO.listarProveedor(file,a,b);
    }
     
     public boolean SolicitudRegistrarConsulta(){
         ProveedorDAO proveDAO = new ProveedorDAO();
      return  proveDAO.registrarConsulta();
     }
}

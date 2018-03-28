/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ClienteDAO;
import Modelo.ClsConexion;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CtlCliente {
    ClsConexion conexion = new ClsConexion();
    
     public DefaultTableModel SolicitudListarCliente(File file,Vector a,Vector b) throws IOException {
        ClienteDAO clienDAO = new ClienteDAO();
        return clienDAO.listarClientes(file,a,b);
    }
     
     public boolean SolicitudRegistrarConsulta(){
         ClienteDAO clienDAO = new ClienteDAO();
      return  clienDAO.registrarConsulta();
     }

   
    
}

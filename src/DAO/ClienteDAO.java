/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ClsConexion;
import java.io.File;
import java.io.IOException;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author HP
 */
public class ClienteDAO extends ClsConexion {


    public DefaultTableModel listarClientes(File file, Vector columna, Vector filas) throws IOException {

        Workbook workbook = null;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Alias");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Poblacion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Movil");
        modelo.addColumn("Email");
        modelo.addColumn("Observacion");
        modelo.addColumn("Sexo");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Estado Civil");
        modelo.addColumn("Desempleado");
        modelo.addColumn("Profesion");
        modelo.addColumn("Nivel Academico");
        modelo.addColumn("Peso Kg");
        modelo.addColumn("Altura");
        modelo.addColumn("Cabello");
        modelo.addColumn("Ojos");
        modelo.addColumn("Fumador");
        modelo.addColumn("Salud");
        try {
            workbook = Workbook.getWorkbook(file);

            Sheet sheet = workbook.getSheet(0);
            columna.clear();

            for (int i = 0; i < sheet.getColumns(); i++) {
                Cell cell1 = sheet.getCell(i, 0);
                columna.add(cell1.getContents());
            }
            filas.clear();

            for (int j = 1; j < sheet.getRows(); j++) {

                Vector d = new Vector();

                for (int i = 0; i < sheet.getColumns(); i++) {

                    Cell cell = sheet.getCell(i, j);
                    d.add(cell.getContents());
                }
                d.add("\n");
                filas.add(d);

                modelo.addRow(d);

            }

        } catch (BiffException e) {
            e.printStackTrace();
        }

        return modelo;
    }

    public boolean registrarConsulta() {
        String consulta = "LOAD DATA LOCAL INFILE 'C:\\\\Users\\\\Cristian\\\\Documents\\\\NetBeansProjects\\\\Excel\\\\src\\\\Recursos\\\\Clientes.csv' INTO TABLE clientes FIELDS TERMINATED BY ';' IGNORE 1 LINES";       
        return super.ejecutar(consulta);
    }

}

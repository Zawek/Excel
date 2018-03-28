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
public class ProductoDAO  extends ClsConexion{

    public DefaultTableModel listarProductos(File file, Vector columna, Vector filas) throws IOException {
         Workbook workbook = null;
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Categoria");
        modelo.addColumn("CantidadPorUnidad");
        modelo.addColumn("PrecioUnidad");
        modelo.addColumn("Unidades En Existencia");
        modelo.addColumn("Unidades En Pedido");       
        modelo.addColumn("Nivel Nuevo Pedido");
        modelo.addColumn("Suspendido");
        
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

        return modelo; }

    public boolean registrarConsulta() {
       String consulta = "LOAD DATA LOCAL INFILE 'C:\\\\Users\\\\Cristian\\\\Documents\\\\NetBeansProjects\\\\Excel\\\\src\\\\Recursos\\\\Productos.csv' INTO TABLE productos FIELDS TERMINATED BY ';' IGNORE 1 LINES";       
        return super.ejecutar(consulta);
    }
    
}

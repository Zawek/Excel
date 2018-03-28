/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author HP
 */
public class ClsProducto {
    int idProducto,unidadesEnEistencia,unidadesEnPedido,nuvelNuevoPedido;
    double precioUnidad;
    String nombreProducto,proveedor,categoria, cantidadPorUniddad, suspendido;

    public ClsProducto(int idProducto, int unidadesEnEistencia, int unidadesEnPedido, int nuvelNuevoPedido, double precioUnidad, String nombreProducto, String proveedor, String categoria, String cantidadPorUniddad, String suspendido) {
        this.idProducto = idProducto;
        this.unidadesEnEistencia = unidadesEnEistencia;
        this.unidadesEnPedido = unidadesEnPedido;
        this.nuvelNuevoPedido = nuvelNuevoPedido;
        this.precioUnidad = precioUnidad;
        this.nombreProducto = nombreProducto;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.cantidadPorUniddad = cantidadPorUniddad;
        this.suspendido = suspendido;
    }

    public ClsProducto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getUnidadesEnEistencia() {
        return unidadesEnEistencia;
    }

    public void setUnidadesEnEistencia(int unidadesEnEistencia) {
        this.unidadesEnEistencia = unidadesEnEistencia;
    }

    public int getUnidadesEnPedido() {
        return unidadesEnPedido;
    }

    public void setUnidadesEnPedido(int unidadesEnPedido) {
        this.unidadesEnPedido = unidadesEnPedido;
    }

    public int getNuvelNuevoPedido() {
        return nuvelNuevoPedido;
    }

    public void setNuvelNuevoPedido(int nuvelNuevoPedido) {
        this.nuvelNuevoPedido = nuvelNuevoPedido;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCantidadPorUniddad() {
        return cantidadPorUniddad;
    }

    public void setCantidadPorUniddad(String cantidadPorUniddad) {
        this.cantidadPorUniddad = cantidadPorUniddad;
    }

    public String getSuspendido() {
        return suspendido;
    }

    public void setSuspendido(String suspendido) {
        this.suspendido = suspendido;
    }
    
    
}

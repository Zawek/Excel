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
public class ClsProveedor {
    int idProveedor, cantidadCompradas;
    double cantidadEnPesos;
    String nombre,direccion,teledono,fax,rfc,correo,web,contacto,puestoContacto,correoContacto,telefonoAlterno,telefonoAlterno2;

    public ClsProveedor(int idProveedor, int cantidadCompradas, double cantidadEnPesos, String nombre, String direccion, String teledono, String fax, String rfc, String correo, String web, String contacto, String puestoContacto, String correoContacto, String telefonoAlterno, String telefonoAlterno2) {
        this.idProveedor = idProveedor;
        this.cantidadCompradas = cantidadCompradas;
        this.cantidadEnPesos = cantidadEnPesos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.teledono = teledono;
        this.fax = fax;
        this.rfc = rfc;
        this.correo = correo;
        this.web = web;
        this.contacto = contacto;
        this.puestoContacto = puestoContacto;
        this.correoContacto = correoContacto;
        this.telefonoAlterno = telefonoAlterno;
        this.telefonoAlterno2 = telefonoAlterno2;
    }

    public ClsProveedor() {
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCantidadCompradas() {
        return cantidadCompradas;
    }

    public void setCantidadCompradas(int cantidadCompradas) {
        this.cantidadCompradas = cantidadCompradas;
    }

    public double getCantidadEnPesos() {
        return cantidadEnPesos;
    }

    public void setCantidadEnPesos(double cantidadEnPesos) {
        this.cantidadEnPesos = cantidadEnPesos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTeledono() {
        return teledono;
    }

    public void setTeledono(String teledono) {
        this.teledono = teledono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPuestoContacto() {
        return puestoContacto;
    }

    public void setPuestoContacto(String puestoContacto) {
        this.puestoContacto = puestoContacto;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public String getTelefonoAlterno() {
        return telefonoAlterno;
    }

    public void setTelefonoAlterno(String telefonoAlterno) {
        this.telefonoAlterno = telefonoAlterno;
    }

    public String getTelefonoAlterno2() {
        return telefonoAlterno2;
    }

    public void setTelefonoAlterno2(String telefonoAlterno2) {
        this.telefonoAlterno2 = telefonoAlterno2;
    }
    
    
    
}

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
public class ClsCliente {
    
    int iDcliente,hijos,peso;
    double altura;
    String alias,apellido,nombre,direccion,poblacion,telefono,movil,email,observacion,sexo,fechaNacimiento,estadoCivil,desepleado,profesion,nivelAcademico,cabello,ojos,fumador,salud;

    public ClsCliente(int iDcliente, int hijos, int peso, double altura, String alias, String apellido, String nombre, String direccion, String poblacion, String telefono, String movil, String email, String observacion, String sexo, String fechaNacimiento, String estadoCivil, String desepleado, String profesion, String nivelAcademico, String cabello, String ojos, String fumador, String salud) {
        this.iDcliente = iDcliente;
        this.hijos = hijos;
        this.peso = peso;
        this.altura = altura;
        this.alias = alias;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.telefono = telefono;
        this.movil = movil;
        this.email = email;
        this.observacion = observacion;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.desepleado = desepleado;
        this.profesion = profesion;
        this.nivelAcademico = nivelAcademico;
        this.cabello = cabello;
        this.ojos = ojos;
        this.fumador = fumador;
        this.salud = salud;
    }

    public ClsCliente() {
    }

    public int getiDcliente() {
        return iDcliente;
    }

    public void setiDcliente(int iDcliente) {
        this.iDcliente = iDcliente;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDesepleado() {
        return desepleado;
    }

    public void setDesepleado(String desepleado) {
        this.desepleado = desepleado;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getCabello() {
        return cabello;
    }

    public void setCabello(String cabello) {
        this.cabello = cabello;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getFumador() {
        return fumador;
    }

    public void setFumador(String fumador) {
        this.fumador = fumador;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }
    
    
}

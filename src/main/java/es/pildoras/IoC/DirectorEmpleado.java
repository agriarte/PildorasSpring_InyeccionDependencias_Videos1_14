/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.IoC;

/**
 *
 * @author Pedro
 */
public class DirectorEmpleado implements Empleados {

    // inyeccion del bean, email y nombreEmpresa están en XML
    private String email;
    private String nombreEmpresa;
    // atributos que estan en archivo datosEmpresa.propiedades
    private String telefono,ciudad;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
// Creación de campo tipo la interfaz CreacionInformes
    private CreacionInformes nuevoInforme;

    // creación del constructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

    @Override
    public String getTareas() {
        return "Gestionar toda la plantilla de empleados";
    }

    @Override
    public String getInformes() {
        return "Informe creado por el Director: " + nuevoInforme.getInforme();
    }

}

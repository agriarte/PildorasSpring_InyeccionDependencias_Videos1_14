/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.IoC;

/**
 *
 * @author Pedro
 */
public class SecretarioEmpleado implements Empleados {
    
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

   // Creacion de dependencias mediante setter
   private CreacionInformes nuevoInforme;

    public void setNuevoInforme(CreacionInformes nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

   

    @Override
    public String getTareas() {
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInformes() {
       return "Informe del secretario: " + nuevoInforme.getInforme();
    }
    
}

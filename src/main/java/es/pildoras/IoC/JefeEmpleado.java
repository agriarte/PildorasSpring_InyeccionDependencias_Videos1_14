/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.IoC;

/**
 *
 * @author Pedro
 */
public class JefeEmpleado implements Empleados{
    
    // Creación de campo tipo la interfaz CreacionInformes
    private CreacionInformes nuevoInforme;

    public JefeEmpleado(CreacionInformes nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }
    
    
    @Override
    public String getTareas(){
        return "Soy un jefe que gestiono las cuestiones relativas a mis empleados";
    }

    @Override
    public String getInformes() {
        return null;
    }
    
    // Creación de método Init. Realiza tareas antes de que el bean esté disponible.
    // Ejemplos: conexion bbdd, abrir socket,...
    public void metodoInicial(){
        System.out.println("metodoInicial(). Aquí van las tareas antes de que el bean esté listo"); 
    }
    
    // Método Destroy. Ejecutar tareas después de que el bean se haya utilizado
    public void metodoDestroy(){
        System.out.println("metodoDestroy(). Aquí las tareas a ejecutar cuando muere el bean");
    }
}

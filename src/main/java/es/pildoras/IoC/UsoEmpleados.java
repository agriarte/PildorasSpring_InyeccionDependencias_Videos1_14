/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Pedro
 */
public class UsoEmpleados {

    public static void main(String[] args) {
        /*  FORMA DE PROGRAMAR SIN SPRING
        // Creacion de objetos tipo empleado
        Empleados empleado1 = new DirectorEmpleado();
        // Uso de objetos tipo empleado
        System.out.println(empleado1.getTareas());
         */

        //AQUI EMPIEZA SPRING
        // 1-  cargar archivo XML de Spring
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2- solicitar Bean, es decir pedirle al contexto el objeto. Requiere dos argumentos:
        //  -"miEmpleado es el nombre de Bean en XML. Sería como un motor o generador de beans.
        //  -Empleados es la interfaz
        //Empleados juan=contexto.getBean("miEmpleado", Empleados.class);

        //ATENCION: ahora se crea objeto a partir de la clase, no de la interfaz porque no reconocería métodos getters/setters
        DirectorEmpleado juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
        // 3- Usar el objeto de dependencia mediante constructor
        System.out.println("Hola Spring***");
        System.out.println(juan.getTareas());
        System.out.println(juan.getInformes());
        System.out.println(juan.getEmail());
        System.out.println(juan.getNombreEmpresa());
        System.out.println(juan.getTelefono());
        System.out.println(juan.getCiudad());
        
        
        System.out.println("\n ***separador*** \n");
        
        // usar otro objeto de dependencia mediante setter
        SecretarioEmpleado pedro = contexto.getBean("miSecretario", SecretarioEmpleado.class);
        System.out.println(pedro.getTareas());
        System.out.println(pedro.getInformes());
        System.out.println(pedro.getEmail());
        System.out.println(pedro.getNombreEmpresa());
        // 4- Cerrar contexto
        contexto.close();

    }
}

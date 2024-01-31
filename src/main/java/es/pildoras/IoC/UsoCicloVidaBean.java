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
public class UsoCicloVidaBean {
    public static void main(String[] args) {
         // 1-  cargar archivo XML de Spring
         // en el archivo XML se declaran los métodos de init y destroy del bean
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext_3.xml");
        
        // bean de tipo JefeEmpleado según el XML. Aquí se crea a partir de la interfaz
        Empleados juan=contexto.getBean("miEmpleado", Empleados.class);
        
        juan.getInformes();
        //cerrar el contexto
        contexto.close();
    }
    
}

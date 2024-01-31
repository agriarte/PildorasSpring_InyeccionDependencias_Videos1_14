/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * probando singleton y prototype. Repaso de inyección datos desde archivo y desde property del bean
 * 
 */
public class usoDemoSingletonPrototype {

    public static void main(String[] args) {
        // 1-  cargar archivo XML de Spring
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext_2.xml");
        // Petición de Beans al contenedor Spring
        SecretarioEmpleado maria = contexto.getBean("miSecretario", SecretarioEmpleado.class);
        SecretarioEmpleado pedro = contexto.getBean("miSecretario", SecretarioEmpleado.class);

        // Por defecto se usa patrón singleton. Todos los beans apuntan al mismo objeto (misma direccioón de memoria
        // Para cambiarlo, añadir modificador scope="prototype" en la definición de bean en el XML
        // Por defecto scope="sigleton" aunque no se especifique
        System.out.println("xxxxxx SEPARADOR xxxxx");

        System.out.println("Dirección memoria maria: " + maria);
        System.out.println("Dirección memoria pedro: " + pedro);
        
        // email es un dato contenido en el bean del XML
        System.out.println(pedro.getEmail());
        // ciudad está en archivo datosEmpresa.propiedades
         System.out.println(pedro.getCiudad());
    }

}

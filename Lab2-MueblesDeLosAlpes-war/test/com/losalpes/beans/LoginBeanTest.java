/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ LoginBeanTest.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * Autor: Juan Sebastián Urrego
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.beans;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase que realiza pruebas unitarias sobre el Managed bean LoginBean
 * @author Juan Sebastián Urrego
 */
public class LoginBeanTest
{

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase
     */
    public LoginBeanTest()
    {
        
    }

    //-----------------------------------------------------------
    // Métodos de inicialización y terminación
    //-----------------------------------------------------------

    /**
     * Método que se ejecuta antes de comenzar la prueba unitaria
     * Se encarga de inicializar todo lo necesario para la prueba
     */
    @Before
    public void setUp()
    {

    }

    /**
     * Método que se ejecuta después de haber ejecutado la prueba
     */
    @After
    public void tearDown()
    {
        
    }

    /**
     * Realiza una prueba para verificar la correcta autenticación de un usuario de tipo Administrador
     */
    @Test
    public void testLoginAdmin()
    {
        LoginBean instance = new LoginBean();
        instance.setUsuario("admin");
        instance.setContraseña("adminadmin");
        String expResult = "administrador";
        String result = instance.login();
        assertEquals(expResult, result);
    }
    
    //-----------------------------------------------------------
    // Métodos de prueba
    //-----------------------------------------------------------

    /**
     * Realiza una prueba para verificar la correcta autenticación de un usuario de tipo Cliente
     */
    @Test
    public void testLoginClient()
    {
        LoginBean instance = new LoginBean();
        instance.setUsuario("client");
        instance.setContraseña("clientclient");
        String expResult = "cliente";
        String result = instance.login();
        assertEquals(expResult, result);
    }

}
/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ TestSessionBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * Autor: Juan Sebastián Urrego
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.test;

import javax.ejb.Local;

/**
 * Interface de la clase de prueba [No hay que modificar]
 * @author Juan Sebastián Urrego
 */
@Local
public interface TestSessionLocal
{

    /**
     * Método de prueba [No se implementa]
     * @param parameter Primer parametro
     * @param parameter1 Segundo parámetro
     */
    void testMethod(String parameter, String parameter1);
    
}

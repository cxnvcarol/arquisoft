/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioSeguridad.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * Autor: Juan Sebastián Urrego
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.bos.Usuario;
import com.losalpes.excepciones.AutenticacionException;

/**
 * Contrato funcional de los servicios que se le prestan al catalogo
 * @author Juan Sebastián Urrego
 */
public interface IServicioSeguridad
{

    /**
     * Registra el ingreso de un usuario al sistema.
     * @param nombre Login del usuario que quiere ingresar al sistema.
     * @param contraseña Contraseña del usuario que quiere ingresar al sistema.
     * @return usuario Retorna el objeto que contiene la información del usuario que ingreso al sistema.
     */
    public Usuario login(String nombre, String contraseña)throws AutenticacionException;

}

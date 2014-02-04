/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioSeguridad.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * Autor: Juan Sebastián Urrego
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.bos.TipoUsuario;
import com.losalpes.bos.Usuario;
import com.losalpes.excepciones.AutenticacionException;
import java.util.ArrayList;

/**
 * Clase que se encarga de la autenticación de un usuario en el sistema
 * @author Juan Sebastián Urrego
 */
public class ServicioSeguridadMock implements IServicioSeguridad
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los usuarios del sistema
     */
    private ArrayList<Usuario> usuarios;

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     *
     */
    public ServicioSeguridadMock()
    {
        //Inicializa el arreglo que contiene los usuarios
        usuarios=new ArrayList<Usuario>();

        //Agrega usuarios al sistema
        usuarios.add(new Usuario("admin","adminadmin",TipoUsuario.ADMINISTRADOR));
        usuarios.add(new Usuario("client","clientclient",TipoUsuario.CLIENTE));

    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Registra el ingreso de un usuario al sistema.
     * @param nombre Login del usuario que quiere ingresar al sistema.
     * @param contraseña Contraseña del usuario que quiere ingresar al sistema.
     * @return usuario Retorna el objeto que contiene la información del usuario que ingreso al sistema.
     */
    @Override
    public Usuario login(String nombre, String contraseña) throws AutenticacionException
    {
        Usuario u=null;

        boolean termino=false;

        for (int i = 0; i < usuarios.size() && !termino; i++)
        {
            u=usuarios.get(i);

            if(u.getNombre().equals(nombre)&& u.getContraseña().equals(contraseña))
            {
               termino=true;
            }
            else if(i==usuarios.size()-1)
            {
                throw new AutenticacionException("Usuario Inválido");
            }
        }

        return u;
    }

}

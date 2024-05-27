/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author msi
 */
public class AdministrarLogin {
        
    public boolean validarInicioSesion(Cliente cliente, String correo, String contraseña){
        if(cliente.getCorreo().equals(correo) && cliente.getContraseña().equals(contraseña)){
            
            return true;
        }
        return false;
    }
}

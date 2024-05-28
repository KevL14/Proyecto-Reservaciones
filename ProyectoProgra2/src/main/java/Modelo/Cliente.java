/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Rubén Delgado C
 */
public class Cliente {
    private String correo;
    private String nombre;
    private String apellido;
    private String contraseña;
    private String reservaciones;
    private String admin;

    public Cliente() {
        this.correo = "";
        this.nombre = "";
        this.apellido = "";
        this.contraseña = "";
        this.reservaciones = "";
        this.admin = "";
    }
    
    public Cliente(String correo, String nombre, String apellido, String contraseña, String reservaciones, String admin) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.reservaciones = reservaciones;
        this.admin = admin;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(String reservaciones) {
        this.reservaciones = reservaciones;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Cliente{" + "correo=" + correo + ", nombre=" + nombre + ", apellido=" + apellido + ", Contraseña=" + contraseña + ", reservaciones=" + reservaciones + ", admin=" + admin + '}';
    }


    
}//Fin Class

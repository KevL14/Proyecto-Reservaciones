/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Rubén Delgado C
 */
public class Hotel {
    private String Id;
    private String nombre;
    private String ubicacion;
    
    //Constructores: Con Parámetros y Vacio
    public Hotel(String Id, String nombre, String ubicacion) {
        this.Id = Id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    public Hotel( ) {
        this.Id = "";
        this.nombre = "";
        this.ubicacion = "";
    }
    
    //Metodos Setter y Getter
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Hotel{" + "Id=" + Id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + '}';
    }
    
}//Fin Class

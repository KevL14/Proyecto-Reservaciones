/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Rubén Delgado C
 */
public class Reservaciones {
    private String Id;
    private String nombre;
    private String tipo;
    private String provincia;
    private String ubicacion;
    private String reservado = "123_12(10)-24_14(10)-24{snnxsn} / 234_16(10)-24_20(10)-24";
//    servicios fijos
    private String baños;
    private String habitaciones;
    
//    servios incluibles 
    private String transporte;
    private String desayuno;
    
    
    //Constructores: Con Parámetros y Vacio
    public Reservaciones(String Id, String nombre, String ubicacion) {
        this.Id = Id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    public Reservaciones( ) {
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Reservaciones{" + "Id=" + Id + ", nombre=" + nombre + ", tipo=" + tipo + ", provincia=" + provincia + ", ubicacion=" + ubicacion + ", reservado=" + reservado + ", ba\u00f1os=" + baños + ", habitaciones=" + habitaciones + ", transporte=" + transporte + ", desayuno=" + desayuno + '}';
    }
    
}//Fin Class

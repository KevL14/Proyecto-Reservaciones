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
   
    
    public Reservaciones( String Id, String nombre, String tipo, String provincia, String ubicacion, String baños, String habitaciones, String transporte, String desayuno) {
        this.Id = Id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.provincia = provincia;
        this.ubicacion = ubicacion;
        this.baños = baños;
        this.habitaciones = habitaciones;
        this.transporte = transporte;
        this.desayuno = desayuno;
    }

    public Reservaciones() {
        this.Id = "";
        this.nombre = "";
        this.tipo = "";
        this.provincia = "";
        this.ubicacion = "";
        this.baños = "";
        this.habitaciones = "";
        this.transporte = "";
        this.desayuno = "";
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getReservado() {
        return reservado;
    }

    public void setReservado(String reservado) {
        this.reservado = reservado;
    }

    public String getBaños() {
        return baños;
    }

    public void setBaños(String baños) {
        this.baños = baños;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }
    

    @Override
    public String toString() {
        return "Reservaciones{" + "Id=" + Id + ", nombre=" + nombre + ", tipo=" + tipo + ", provincia=" + provincia + ", ubicacion=" + ubicacion + ", reservado=" + reservado + ", baños=" + baños + ", habitaciones=" + habitaciones + ", transporte=" + transporte + ", desayuno=" + desayuno + '}';
    }
    
}//Fin Class

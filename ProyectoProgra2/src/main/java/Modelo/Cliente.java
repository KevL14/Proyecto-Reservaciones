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
    private String Id;
    private String nombre;
    private String apellido;
    private String destino;
    private int cantidadDias;
    private int totalPersonas;
    private double totalPagar;
    
    //Constructores: Con Parámetros y Vacio
    public Cliente(String Id, String nombre, String apellido, String destino, int cantidadDias, int totalPersonas, double totalPagar) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.destino = destino;
        this.cantidadDias = cantidadDias;
        this.totalPersonas = totalPersonas;
        this.totalPagar = totalPagar;
    }
    
     public Cliente( ) {
        this.Id = "";
        this.nombre = "";
        this.apellido = "";
        this.destino = "";
        this.cantidadDias = 0;
        this.totalPersonas = 0;
        this.totalPagar = 0;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDías) {
        this.cantidadDias = cantidadDías;
    }

    public int getTotalPersonas() {
        return totalPersonas;
    }

    public void setTotalPersonas(int totalPersonas) {
        this.totalPersonas = totalPersonas;
    }
    
    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + ", destino=" + destino + ", cantidadDías=" + cantidadDias + ", totalPagar=" + totalPagar + '}';
    } 
    
}//Fin Class

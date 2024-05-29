/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Rubén Delgado C
 * Fijos:

Piscina
Parqueo
Seguridad
Vista a la playa

Elegibles
Transporte
Desayuno
Servicio a la habitacion
 */
public class Reservaciones {
    private String Id;
    private String nombre;
    private String tipo;
    private String provincia;
    private String ubicacion;
    private String reservado = "123_12(10)-24_14(10)-24{snnxsn} / 234_16(10)-24_20(10)-24";
//    servicios fijos
    private String baños, habitaciones, camas, cocinaEquipada, zonaRecreativas, piscina, parqueo, seguridad;
    
    
//    servios incluibles 
    private String transporte,desayuno, servicioALaHabitacion;
    
    
    //Constructores: Con Parámetros y Vacio

    public Reservaciones(String Id, String nombre, String tipo, String provincia, String ubicacion, String reservado, String baños, String habitaciones, String camas, String cocinaEquipada, String zonaRecreativas, String piscina, String parqueo, String seguridad, String transporte, String desayuno, String servicioALaHabitacion) {
        this.Id = Id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.provincia = provincia;
        this.ubicacion = ubicacion;
        this.reservado = reservado;
        this.baños = baños;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.cocinaEquipada = cocinaEquipada;
        this.zonaRecreativas = zonaRecreativas;
        this.piscina = piscina;
        this.parqueo = parqueo;
        this.seguridad = seguridad;
        this.transporte = transporte;
        this.desayuno = desayuno;
        this.servicioALaHabitacion = servicioALaHabitacion;
    }
   
    


    public Reservaciones() {
        this.Id = "";
        this.nombre = "";
        this.tipo = "";
        this.provincia = "";
        this.ubicacion = "";
        this.reservado = "";
        this.baños = "";
        this.habitaciones = "";
        this.transporte = "";
        this.desayuno = "";
        this.camas=""; 
        this.cocinaEquipada=""; 
        this.zonaRecreativas=""; 
        this.piscina=""; 
        this.parqueo=""; 
        this.seguridad="";
    }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public String getCamas() {
        return camas;
    }

    public void setCamas(String camas) {
        this.camas = camas;
    }

    public String getCocinaEquipada() {
        return cocinaEquipada;
    }

    public void setCocinaEquipada(String cocinaEquipada) {
        this.cocinaEquipada = cocinaEquipada;
    }

    public String getZonaRecreativas() {
        return zonaRecreativas;
    }

    public void setZonaRecreativas(String zonaRecreativas) {
        this.zonaRecreativas = zonaRecreativas;
    }

    public String getPiscina() {
        return piscina;
    }

    public void setPiscina(String piscina) {
        this.piscina = piscina;
    }

    public String getParqueo() {
        return parqueo;
    }

    public void setParqueo(String parqueo) {
        this.parqueo = parqueo;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
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

    public String getServicioALaHabitacion() {
        return servicioALaHabitacion;
    }

    public void setServicioALaHabitacion(String servicioALaHabitacion) {
        this.servicioALaHabitacion = servicioALaHabitacion;
    }
    
    
   
}//Fin Class

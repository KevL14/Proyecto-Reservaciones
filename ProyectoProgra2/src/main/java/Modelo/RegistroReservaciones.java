/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author msi
 */
public class RegistroReservaciones {
    private ArrayList<Reservaciones> listaReservaciones;
    private String mensaje;
    private String filePath = "reservaciones.json";

    public RegistroReservaciones() {
        this.listaReservaciones = readJSON();
    }
    
    public int buscarReservacion(String correo){
        for (int i = 0; i < listaReservaciones.size(); i++) {
            if(listaReservaciones.get(i).getNombre().equals(correo)){
                return i;
            }
        }
        return -1;
    }
    
    public String agregarReservacion(Reservaciones reservacion){
        if(reservacion != null){
            if(buscarReservacion(reservacion.getNombre()) == -1){
                listaReservaciones.add(reservacion);
                
                writeJSON();
                mensaje = "La Reserva fue agregado exitosamente";
            }else{
                mensaje = "Ya existe una Reserva con este nombre";
            }
        }
        return mensaje;
    }
    
    public String eliminarReservacion(Reservaciones reservacion){
        if(buscarReservacion(reservacion.getNombre()) != -1){
            listaReservaciones.remove(buscarReservacion(reservacion.getNombre()));
            
            writeJSON();
            mensaje = "La Reserva fue eliminado exitosamente";
        }else{
            mensaje = "No existe una Reserva con este nombre";
        }
    return mensaje;
    }
    
    public String modificarReservacion(Reservaciones reservacion){
            if(buscarReservacion(reservacion.getNombre()) != -1){
                eliminarReservacion(reservacion);
                agregarReservacion(reservacion);
                
                writeJSON();
                mensaje = "La Reserva fue modificado exitosamente";
            }else{
                mensaje = "No existe no Existe una reserva con este nombre";
            }
        return mensaje;
    }
    
    public String[][] llenarMatrizTabla(){
        String [][] matrizTabla = new String[this.listaReservaciones.size()][4];
        
        for (int i = 0; i < listaReservaciones.size(); i++) {
            matrizTabla[i][0] = this.listaReservaciones.get(i).getNombre();
            matrizTabla[i][1] = this.listaReservaciones.get(i).getTipo();
            matrizTabla[i][3] = this.listaReservaciones.get(i).getProvincia();
            matrizTabla[i][2] = this.listaReservaciones.get(i).getPrecioNoche();

        }
        
        return matrizTabla;
    }
    
    public void writeJSON(){
         JSONArray jsonArray = new JSONArray();
        
        for (int i = 0; i < listaReservaciones.size(); i++) {

            JSONObject newObject = new JSONObject();
            newObject.put("Nombre", listaReservaciones.get(i).getNombre());
            newObject.put("Tipo", listaReservaciones.get(i).getTipo());
            newObject.put("Provincia", listaReservaciones.get(i).getProvincia());
            newObject.put("Ubicacion", listaReservaciones.get(i).getUbicacion());
            newObject.put("PrecioNoche", listaReservaciones.get(i).getPrecioNoche());
            
            newObject.put("Reservado", listaReservaciones.get(i).getReservado());
            //Servicios fijos
            newObject.put("Baños", listaReservaciones.get(i).getBaños());
            newObject.put("Habitaciones", listaReservaciones.get(i).getHabitaciones());
            newObject.put("Camas", listaReservaciones.get(i).getCamas());
            newObject.put("CocinaEquipada", listaReservaciones.get(i).getCocinaEquipada());
            newObject.put("ZonaRecreativa", listaReservaciones.get(i).getZonaRecreativas());
            newObject.put("Piscina", listaReservaciones.get(i).getPiscina());
            newObject.put("Parqueo", listaReservaciones.get(i).getParqueo());
            newObject.put("Seguridad", listaReservaciones.get(i).getSeguridad());
            //Servicios incluibles
            newObject.put("Transporte", listaReservaciones.get(i).getTransporte());
            newObject.put("Desayuno", listaReservaciones.get(i).getDesayuno());
            newObject.put("ServicioHabitacion", listaReservaciones.get(i).getServicioALaHabitacion());

            jsonArray.add(newObject);

            try (FileWriter file = new FileWriter(filePath)) {
                file.write(jsonArray.toJSONString());
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //public ArrayList<Reservaciones> getListaReservaciones() {
    //    readJSON();
    //    return listaReservaciones;
    //}
    
    public Reservaciones getReservaciones(String id){
        int indiceReservacion = buscarReservacion(id);
        if(indiceReservacion!=-1){
            System.out.println(listaReservaciones.get(indiceReservacion).toString());
            return listaReservaciones.get(indiceReservacion);  
        }
        
        return null;
    }
    

    
    
    public ArrayList<Reservaciones> readJSON() {
        ArrayList<Reservaciones> listaClien = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;

            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                
                String nombre = (String) jsonObject.get("Nombre");
                String tipo = (String) jsonObject.get("Tipo");
                String provincia = (String) jsonObject.get("Provincia");
                String ubicacion = (String) jsonObject.get("Ubicacion");
                String precioNoche = (String) jsonObject.get("PrecioNoche");
                String reservado = (String) jsonObject.get("Reservado");
                String baños = (String) jsonObject.get("Baños");
                String habitaciones = (String) jsonObject.get("Habitaciones");
                String camas = (String) jsonObject.get("Camas");
                String cocinaEquipada = (String) jsonObject.get("CocinaEquipada");
                String zonaRecreativas = (String) jsonObject.get("ZonaRecreativa");
                String piscina = (String) jsonObject.get("Piscina");
                String parqueo = (String) jsonObject.get("Parqueo");
                String seguridad = (String) jsonObject.get("Seguridad");
                String transporte = (String) jsonObject.get("Transporte");
                String desayuno = (String) jsonObject.get("Desayuno");
                String servicioALaHabitacion = (String) jsonObject.get("ServicionHabitacion");


                Reservaciones reservacion = new Reservaciones(nombre, tipo, provincia, ubicacion,precioNoche,reservado, baños, habitaciones, camas, cocinaEquipada, zonaRecreativas, piscina, parqueo, seguridad, transporte, desayuno,servicioALaHabitacion);
                listaClien.add(reservacion);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return listaClien;
    }
}

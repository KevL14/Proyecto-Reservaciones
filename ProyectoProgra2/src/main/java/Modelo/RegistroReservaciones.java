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
    
    public int buscarCliente(String correo){
        for (int i = 0; i < listaReservaciones.size(); i++) {
            if(listaReservaciones.get(i).getId().equals(correo)){
                return i;
            }
        }
        return -1;
    }
    
    public String agregarCliente(Reservaciones reservacion){
        if(reservacion != null){
            if(buscarCliente(reservacion.getId()) == -1){
                listaReservaciones.add(reservacion);
                
                writeJSON();
                mensaje = "El cliente fue agregado exitosamente";
            }else{
                mensaje = "Ya existe un cliente con este correo";
            }
        }
        return mensaje;
    }
    
    public String eliminarCliente(Reservaciones reservacion){
        if(buscarCliente(reservacion.getId()) != -1){
            listaReservaciones.remove(buscarCliente(reservacion.getId()));
            
            writeJSON();
            mensaje = "El cliente fue eliminado exitosamente";
        }else{
            mensaje = "No existe un cliente con este correo";
        }
    return mensaje;
    }
    
    public String modificarCliente(Reservaciones reservacion){
            if(buscarCliente(reservacion.getId()) != -1){
                eliminarCliente(reservacion);
                agregarCliente(reservacion);
                
                writeJSON();
                mensaje = "El cliente fue modificado exitosamente";
            }else{
                mensaje = "No existe un cliente con este Correo";
            }
        return mensaje;
    }
    
    public String[][] llenarMatrizTabla(){
        String [][] matriz = new String[this.listaReservaciones.size()][4];
        
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = this.listaReservaciones.get(i).getId();
            matriz[i][1] = this.listaReservaciones.get(i).getNombre();
            matriz[i][2] = this.listaReservaciones.get(i).getProvincia();
            matriz[i][3] = this.listaReservaciones.get(i).getUbicacion();
        }
        
        return matriz;
    }
    
    public void writeJSON(){
         JSONArray jsonArray = new JSONArray();
        
        for (int i = 0; i < listaReservaciones.size(); i++) {

            JSONObject newObject = new JSONObject();

            newObject.put("Correo", listaReservaciones.get(i).getId());
            newObject.put("Nombre", listaReservaciones.get(i).getNombre());
            newObject.put("Tipo", listaReservaciones.get(i).getTipo());
            newObject.put("Provincia", listaReservaciones.get(i).getProvincia());
            newObject.put("Ubicacion", listaReservaciones.get(i).getUbicacion());
            newObject.put("Reservado", listaReservaciones.get(i).getReservado());
            //Servicios fijos
            newObject.put("Baños", listaReservaciones.get(i).getBaños());
            newObject.put("Habitaciones", listaReservaciones.get(i).getHabitaciones());
            //Servicios incluibles
            newObject.put("Transporte", listaReservaciones.get(i).getTransporte());
            newObject.put("Desayuno", listaReservaciones.get(i).getDesayuno());

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
        int indiceReservacion = buscarCliente(id);
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
                String correo = (String) jsonObject.get("Correo");
                String nombre = (String) jsonObject.get("Nombre");
                String tipo = (String) jsonObject.get("Tipo");
                String provincia = (String) jsonObject.get("Provincia");
                String ubicacion = (String) jsonObject.get("Ubicacion");
                String reservado = (String) jsonObject.get("Reservado");
                String baños = (String) jsonObject.get("Baños");
                String habitaciones = (String) jsonObject.get("Habitaciones");
                String transporte = (String) jsonObject.get("Transporte");
                String desayuno = (String) jsonObject.get("Desayuno");


                Reservaciones reservacion = new Reservaciones(correo,nombre,tipo,provincia,ubicacion,baños,habitaciones,transporte,desayuno);
                listaClien.add(reservacion);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return listaClien;
    }
}

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
    
    public int buscarClientes(String correo){
        for (int i = 0; i < listaReservaciones.size(); i++) {
            if(listaReservaciones.get(i).getId().equals(correo)){
                return i;
            }
        }
        return -1;
    }
    
    public String agregarClientes(Reservaciones reservacion){
        if(reservacion != null){
            if(buscarClientes(reservacion.getId()) == -1){
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
        if(buscarClientes(reservacion.getId()) != -1){
            listaReservaciones.remove(buscarClientes(reservacion.getId()));
            
            writeJSON();
            mensaje = "El cliente fue eliminado exitosamente";
        }else{
            mensaje = "No existe un cliente con este correo";
        }
    return mensaje;
    }
    
    public String modificarCliente(Reservaciones reservacion){
            if(buscarClientes(reservacion.getId()) != -1){
                eliminarCliente(reservacion);
                agregarClientes(reservacion);
                
                writeJSON();
                mensaje = "El cliente fue modificado exitosamente";
            }else{
                mensaje = "No existe un cliente con este Correo";
            }
        return mensaje;
    }
    
    public void writeJSON(){
         JSONArray jsonArray = new JSONArray();
        
        for (int i = 0; i < listaReservaciones.size(); i++) {

            JSONObject newObject = new JSONObject();

            newObject.put("Correo", listaReservaciones.get(i).getId());
            newObject.put("Nombre", listaReservaciones.get(i).getNombre());
//            newObject.put("Apellido", listaReservaciones.get(i).getApellido());
//            newObject.put("Contraseña", listaReservaciones.get(i).getContraseña());
//            newObject.put("Reservaciones", listaReservaciones.get(i).getReservaciones());
//            newObject.put("Admin", listaReservaciones.get(i).getReservaciones());
            
            


            jsonArray.add(newObject);

            try (FileWriter file = new FileWriter(filePath)) {
                file.write(jsonArray.toJSONString());
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    public ArrayList<Cliente> getListaClientes() {
//        readJSON();
//        return listaClientes;
//    }
    public Reservaciones getCliente(String id){
        int indiceReservacion = buscarClientes(id);
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
                String apellido = (String) jsonObject.get("Apellido");
                String contraseña = (String) jsonObject.get("Contraseña");
                String reservaciones = (String) jsonObject.get("Reservaciones");
                String admin = (String) jsonObject.get("Admin");
                


                Reservaciones reservacion = new Reservaciones(/*atributos*/);
                listaClien.add(reservacion);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return listaClien;
    }
}

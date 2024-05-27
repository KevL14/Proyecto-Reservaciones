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
 * @author Aguss
 */
public class RegistroClientes {
    private ArrayList<Cliente> listaClientes;
    private String mensaje;
    private String filePath = "clientes.json";

    public RegistroClientes() {
        this.listaClientes = readJSON();
    }
    
    public int buscarClientes(String correo){
        for (int i = 0; i < listaClientes.size(); i++) {
            if(listaClientes.get(i).getCorreo().equals(correo)){
                return i;
            }
        }
        return -1;
    }
    
    public String agregarClientes(Cliente cliente){
        if(cliente != null){
            if(buscarClientes(cliente.getCorreo()) == -1){
                listaClientes.add(cliente);
                
                writeJSON();
                mensaje = "El cliente fue agregado exitosamente";
            }else{
                mensaje = "Ya existe un cliente con este correo";
            }
        }
        return mensaje;
    }
    
    public String eliminarCliente(Cliente cliente){
        if(buscarClientes(cliente.getCorreo()) != -1){
            listaClientes.remove(buscarClientes(cliente.getCorreo()));
            
            writeJSON();
            mensaje = "El cliente fue eliminado exitosamente";
        }else{
            mensaje = "No existe un cliente con este correo";
        }
    return mensaje;
    }
    
    public String modificarCliente(Cliente cliente){
            if(buscarClientes(cliente.getCorreo()) != -1){
                eliminarCliente(cliente);
                agregarClientes(cliente);
                
                writeJSON();
                mensaje = "El cliente fue modificado exitosamente";
            }else{
                mensaje = "No existe un cliente con este Correo";
            }
        return mensaje;
    }
    
    public void writeJSON(){
         JSONArray jsonArray = new JSONArray();
        
        for (int i = 0; i < listaClientes.size(); i++) {

            JSONObject newObject = new JSONObject();

            newObject.put("Correo", listaClientes.get(i).getCorreo());
            newObject.put("Nombre", listaClientes.get(i).getNombre());
            newObject.put("Apellido", listaClientes.get(i).getApellido());
            newObject.put("Contraseña", listaClientes.get(i).getContraseña());
            newObject.put("Reservaciones", listaClientes.get(i).getReservaciones());
            newObject.put("Admin", listaClientes.get(i).getReservaciones());
            
            


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
    public Cliente getCliente(String correo){
        int indiceCliente = buscarClientes(correo);
        if(indiceCliente!=-1){
            System.out.println(listaClientes.get(indiceCliente).toString());
            return listaClientes.get(indiceCliente);
            
        }
        
        return null;
    }
    

    
    
    public ArrayList<Cliente> readJSON() {
        ArrayList<Cliente> listaClien = new ArrayList<>();
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
                


                Cliente cliente = new Cliente(correo, nombre, apellido, contraseña, reservaciones,admin);
                listaClien.add(cliente);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return listaClien;
    }
}

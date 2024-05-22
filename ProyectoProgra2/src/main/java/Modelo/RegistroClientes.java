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
    
    public int buscarClientes(String id){
        for (int i = 0; i < listaClientes.size(); i++) {
            if(listaClientes.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    
    public String agregarClientes(Cliente cliente){
        if(cliente != null){
            if(buscarClientes(cliente.getId()) == -1){
                listaClientes.add(cliente);
                
                writeJSON();
                mensaje = "El cliente fue agregado exitosamente";
            }else{
                mensaje = "Ya existe un cliente con ese ID";
            }
        }
        return mensaje;
    }
    
    public String eliminarCliente(Cliente cliente){
        if(buscarClientes(cliente.getId()) != -1){
            listaClientes.remove(buscarClientes(cliente.getId()));
            
            writeJSON();
            mensaje = "El cliente fue eliminado exitosamente";
        }else{
            mensaje = "No existe un cliente con ese ID";
        }
    return mensaje;
    }
    
    public String modificarCliente(Cliente cliente){
            if(buscarClientes(cliente.getId()) != -1){
                eliminarCliente(cliente);
                agregarClientes(cliente);
                
                writeJSON();
                mensaje = "El cliente fue modificado exitosamente";
            }else{
                mensaje = "No existe un cliente con ese ID";
            }
        return mensaje;
    }
    
    public void writeJSON(){
         JSONArray jsonArray = new JSONArray();
        
        for (int i = 0; i < listaClientes.size(); i++) {

            JSONObject newObject = new JSONObject();

            newObject.put("ID", listaClientes.get(i).getId());
            newObject.put("Nombre", listaClientes.get(i).getNombre());
            newObject.put("Apellido", listaClientes.get(i).getApellido());
            newObject.put("Destino", listaClientes.get(i).getDestino());
            newObject.put("Cantidad de dias", listaClientes.get(i).getCantidadDias());
            newObject.put("Total de personas", listaClientes.get(i).getTotalPersonas());
            newObject.put("Total a pagar", listaClientes.get(i).getTotalPagar());

            jsonArray.add(newObject);

            try (FileWriter file = new FileWriter(filePath)) {
                file.write(jsonArray.toJSONString());
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public ArrayList<Cliente> readJSON() {
        ArrayList<Cliente> listaClien = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;

            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                String id = (String) jsonObject.get("ID");
                String nombre = (String) jsonObject.get("Nombre");
                String apellido = (String) jsonObject.get("Apellido");
                String destino = (String) jsonObject.get("Destino");
                int cantidadDias = ((Long) jsonObject.get("Cantidad de dias")).intValue();
                int totalPersonas = ((Long) jsonObject.get("Total de personas")).intValue();
                double totalPagar = ((Double) jsonObject.get("Total de personas")).doubleValue();

                Cliente cliente = new Cliente(id, nombre, apellido, destino, cantidadDias, totalPersonas, totalPagar);
                listaClien.add(cliente);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return listaClien;
    }
}

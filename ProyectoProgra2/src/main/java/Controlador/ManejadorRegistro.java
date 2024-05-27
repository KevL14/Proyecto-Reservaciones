/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.RegistroClientes;
import Vista.FRM_Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author msi
 */
public class ManejadorRegistro implements ActionListener{
    private FRM_Registro frmRegistro;
    private RegistroClientes registroClientes;
    
    public ManejadorRegistro(){
        this.registroClientes = new RegistroClientes();
        this.frmRegistro = new FRM_Registro();
        frmRegistro.accionarBotones(this);
    }
    
    public void visualizarVentana(){
        frmRegistro.setVisible(true);
    }

    public Cliente getClienteBuscado(String correo) {
        return registroClientes.getCliente(correo);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Registrarse":
                frmRegistro.mostrarMensaje(registroClientes.agregarClientes(frmRegistro.getCliente()));
                frmRegistro.limpiar();
                break;
            case "Limpiar":
                frmRegistro.limpiar();
                break;
            case "Salir":
                frmRegistro.limpiar();
                frmRegistro.dispose();
                
                break;
        }
    }
    
}

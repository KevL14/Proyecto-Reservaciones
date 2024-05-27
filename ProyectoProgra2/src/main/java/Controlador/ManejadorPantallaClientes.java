/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FRM_PantallaPrincipalClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author msi
 */
public class ManejadorPantallaClientes implements ActionListener {

    private FRM_PantallaPrincipalClientes frmPantallaPrincipalClientes;
    private Manejador_FRMLogin manejadorLogin;

    public ManejadorPantallaClientes(Manejador_FRMLogin manejadorLogin) {
        this.frmPantallaPrincipalClientes = new FRM_PantallaPrincipalClientes();
        this.frmPantallaPrincipalClientes.escucharBotones(this);
        this.manejadorLogin = manejadorLogin;
    }
    
    public void visibilidadVentana(){
        frmPantallaPrincipalClientes.setVisible(true);
    }
        

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            
            
            
            case "Salir":
                frmPantallaPrincipalClientes.dispose();
                manejadorLogin.visualizarVentana();
                break;
        }
    }

}
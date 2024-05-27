/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FRM_PantallaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author msi
 */
public class ManejadorPantallaAdministradores implements ActionListener{
    private FRM_PantallaPrincipal frmPantallaPrincipalAdmiistradores;
    private Manejador_FRMLogin manejadorLogin;

    public ManejadorPantallaAdministradores(Manejador_FRMLogin manejadorfrmLogin) {
        this.frmPantallaPrincipalAdmiistradores = new FRM_PantallaPrincipal();
        this.frmPantallaPrincipalAdmiistradores.escucharBotones(this);
        this.manejadorLogin = manejadorfrmLogin;
    }
    
    public void visibilidadVentana(){
        frmPantallaPrincipalAdmiistradores.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            
            
            
            case "Salir":
                System.out.println("entra");
                                manejadorLogin.visualizarVentana();
                frmPantallaPrincipalAdmiistradores.dispose();

                break;
        }
        
    }
}

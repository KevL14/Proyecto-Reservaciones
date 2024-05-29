/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.RegistroReservaciones;
import Vista.FRM_PantallaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author msi
 */
public class ManejadorPantallaAdministradores implements ActionListener{
    private FRM_PantallaPrincipal frmPantallaPrincipalAdmiistradores;
    private ManejadorListaReservaciones manejadorListaReservaciones;
    private Manejador_FRMLogin manejadorLogin;

    public ManejadorPantallaAdministradores(Manejador_FRMLogin manejadorfrmLogin) {
        this.frmPantallaPrincipalAdmiistradores = new FRM_PantallaPrincipal();
        this.manejadorListaReservaciones = new ManejadorListaReservaciones();
        this.frmPantallaPrincipalAdmiistradores.escucharBotones(this);
        this.manejadorLogin = manejadorfrmLogin;
    }
    public RegistroReservaciones getRegistroReservas(){
        return manejadorListaReservaciones.getRegistroReservas();
    }
    public void visibilidadVentana(){
        frmPantallaPrincipalAdmiistradores.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Registrar Reservacion":
                    manejadorListaReservaciones.visualizarVentana();
                break;
            
            
            case "Salir":
                System.out.println("entra");
                                manejadorLogin.visualizarVentana();
                frmPantallaPrincipalAdmiistradores.dispose();

                break;
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Vista.FRM_ListaReservaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author msi
 */
public class ManejadorListaReservaciones implements ActionListener{
     private FRM_ListaReservaciones frmListaReservaciones;
     private ManejadorRegistroReservaciones manejadorResgistroReservaciones;

    public ManejadorListaReservaciones() {
        this.frmListaReservaciones = new FRM_ListaReservaciones();
        this.manejadorResgistroReservaciones = new ManejadorRegistroReservaciones();
        
        this.frmListaReservaciones.escucharBotones(this);
    }
    
    public void visualizarVentana(){
        frmListaReservaciones.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()){
           case "Registrar Nueva Reservacion":
               manejadorResgistroReservaciones.visualizarVentana();
               break;

           case "Salir":
               frmListaReservaciones.dispose();
               break;
       }
    }
}

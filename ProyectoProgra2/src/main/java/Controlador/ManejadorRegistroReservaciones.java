/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.RegistroReservaciones;
import Vista.FRM_RegistroReservaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author msi
 */
public class ManejadorRegistroReservaciones implements ActionListener{
    private RegistroReservaciones registroReservaciones;
    private FRM_RegistroReservaciones frmRegistroReservaciones;

    public ManejadorRegistroReservaciones() {
        this.frmRegistroReservaciones = new FRM_RegistroReservaciones();
        this.registroReservaciones = new RegistroReservaciones();
        this.frmRegistroReservaciones.escucharBotones(this);
    }
    
    public void visualizarVentana(){
        frmRegistroReservaciones.setVisible(true);
    }
    
    public RegistroReservaciones getRegistroReservas(){
        return registroReservaciones;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()){
           case "Agregar":
               frmRegistroReservaciones.mensaje(registroReservaciones.agregarReservacion(frmRegistroReservaciones.getReservacion()));
               

               break;
           case "Modificar":
               frmRegistroReservaciones.mensaje(registroReservaciones.modificarReservacion(frmRegistroReservaciones.getReservacion()));
               break;
           case "Eliminar":
               frmRegistroReservaciones.mensaje(registroReservaciones.eliminarReservacion(frmRegistroReservaciones.getReservacion()));
               frmRegistroReservaciones.limpiar();
               break;
               
           case "Limpiar":
                frmRegistroReservaciones.limpiar();
               break;
           case "Salir":
                frmRegistroReservaciones.limpiar();
               frmRegistroReservaciones.dispose();
               break;
       }
    }
}

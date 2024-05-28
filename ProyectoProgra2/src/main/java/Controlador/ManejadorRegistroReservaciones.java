/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Vista.FRM_RegistroReservaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author msi
 */
public class ManejadorRegistroReservaciones implements ActionListener{
    
    private FRM_RegistroReservaciones frmRegistroReservaciones;

    public ManejadorRegistroReservaciones() {
        this.frmRegistroReservaciones = new FRM_RegistroReservaciones();
        this.frmRegistroReservaciones.escucharBotones(this);
    }
    
    public void visualizarVentana(){
        frmRegistroReservaciones.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()){
           case "Agregar":

               break;
           case "Modificar":

               break;
           case "Eliminar":

               break;
           case "Salir":
               frmRegistroReservaciones.dispose();
               break;
       }
    }
}

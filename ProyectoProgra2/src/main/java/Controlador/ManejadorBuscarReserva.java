/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FRM_BuscarReserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author msi
 */
public class ManejadorBuscarReserva implements ActionListener{
    private FRM_BuscarReserva frmBuscarReserva;

    public ManejadorBuscarReserva() {
        this.frmBuscarReserva = new FRM_BuscarReserva();
        this.frmBuscarReserva.escucharBotones(this);
    }
    
    public void visualizarVentana(){
        frmBuscarReserva.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()){
           case "Salir":
               frmBuscarReserva.dispose();
               break;
       }
    }
    
}

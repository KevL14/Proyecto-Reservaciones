/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.RegistroReservaciones;
import Vista.FRM_BuscarReserva;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author msi
 */
public class ManejadorBuscarReserva implements ActionListener{
    private FRM_BuscarReserva frmBuscarReserva;
    private RegistroReservaciones registroReservaciones;
    private String[] TITULO_TABLA;
    public ManejadorBuscarReserva(RegistroReservaciones registroReservaciones) {
        this.frmBuscarReserva = new FRM_BuscarReserva();
        this.registroReservaciones = registroReservaciones;
        this.TITULO_TABLA = new String[]{"Nombres","Tipo","Precio Por Noche","Provincia"};
        this.frmBuscarReserva.escucharBotones(this);
    }
    
    public void visualizarVentana(){
        frmBuscarReserva.setVisible(true);
        frmBuscarReserva.setDataTable(registroReservaciones.llenarMatrizTabla(),TITULO_TABLA);
        
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.RegistroReservaciones;
import Vista.FRM_ListaReservaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

/**
 *
 * @author msi
 */
public class ManejadorListaReservaciones implements ActionListener{
     private FRM_ListaReservaciones frmListaReservaciones;
     private ManejadorRegistroReservaciones manejadorResgistroReservaciones;
     private RegistroReservaciones registroReservas;
     private String[] TITULO_TABLA;
    public ManejadorListaReservaciones() {
        this.frmListaReservaciones = new FRM_ListaReservaciones();
        this.manejadorResgistroReservaciones = new ManejadorRegistroReservaciones();
        this.TITULO_TABLA = new String[]{"Nombres","Tipo","Precio Por Noche","Provincia"};
        this.registroReservas = getRegistroReservas();
        this.frmListaReservaciones.escucharBotones(this);
    }
    
    public void visualizarVentana(){
        frmListaReservaciones.setDataTable(registroReservas.llenarMatrizTabla(), TITULO_TABLA);
        frmListaReservaciones.setVisible(true);
    }
    
    public RegistroReservaciones getRegistroReservas(){
        return manejadorResgistroReservaciones.getRegistroReservas();
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

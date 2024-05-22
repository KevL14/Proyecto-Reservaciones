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
 * @author Aguss
 */
public class ManejadorPrincipalClientes implements ActionListener {
    
    FRM_PantallaPrincipalClientes frmPrincipalClientes;
    
    public ManejadorPrincipalClientes() {
        this.frmPrincipalClientes = new FRM_PantallaPrincipalClientes();
        this.frmPrincipalClientes.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        switch(e.getActionCommand()){
            
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AdministrarLogin;
import Modelo.Cliente;
import Vista.FRM_Login;
import Vista.FRM_PantallaPrincipal;
import Vista.FRM_PantallaPrincipalClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author msi
 */
public class Manejador_FRMLogin implements ActionListener{
    private FRM_Login frmLogin;
    private AdministrarLogin administrarLogin;
    private ManejadorPantallaAdministradores  manejadorPantallaAdministradores;
    private ManejadorPantallaClientes manejadorPantallaClientes;
    private ManejadorRegistro manejadorRegistro;
    
    public Manejador_FRMLogin() {
        this.manejadorPantallaAdministradores = new ManejadorPantallaAdministradores(this);
        this.manejadorPantallaClientes = new ManejadorPantallaClientes(this);
        this.manejadorRegistro = new ManejadorRegistro();
        this.administrarLogin = new AdministrarLogin();
        this.frmLogin = new FRM_Login();
        
        frmLogin.escuchador(this);
        frmLogin.setVisible(true);
    }

    public void visualizarVentana(){
        frmLogin.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Iniciar Sesion":
               Cliente clienteLogin = manejadorRegistro.getClienteBuscado(frmLogin.getjTFCorreo());
               boolean validacionDatos = administrarLogin.validarInicioSesion(clienteLogin, frmLogin.getjTFCorreo(),frmLogin.getjTFContraseña());
                System.out.println(frmLogin.getjTFCorreo() +" = "+ clienteLogin.getCorreo()+"\n "+frmLogin.getjTFContraseña()+" = "+clienteLogin.getContraseña());
                System.out.println("Validacion de datos = "+ validacionDatos);
               
               if(validacionDatos){
                   String admin = clienteLogin.getAdmin();
                   if(admin.equalsIgnoreCase("yes")){
                       manejadorPantallaAdministradores.visibilidadVentana();
                       
                   }else{
                       manejadorPantallaClientes.visibilidadVentana();
                   }
                   frmLogin.limpiar();
                   frmLogin.dispose();
               }else{
                  frmLogin.mostrarMensaje("Correo o Coontraseña no validos");
               }
                break;
                
            case "Registrarme":
                manejadorRegistro.visualizarVentana();
                break;
            
        }
    }
    
    

}

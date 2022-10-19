/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import conexion.conexion;
import controlador.controladorCategoria;
import controlador.controladorFactura;
import controlador.controladorLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ModeloUsuario;
import modelo.modeloCategoria;
import modelo.modeloFacturacion;

/**
 *
 * @author Linda
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // conectamos a la base de datos:
         conexion con = new conexion();
        try {
            con.conectar();
            modeloCategoria modacat = new modeloCategoria();
        //controladorCategoria cc = new controladorCategoria(modacat);
            ModeloUsuario modusuario = new ModeloUsuario();
        //controladorLogin clogin = new controladorLogin(modusuario);
         modeloFacturacion modfac = new modeloFacturacion();
    controladorFactura cf = new controladorFactura(modfac);
        
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

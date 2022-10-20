/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ModeloProducto;
import modelo.modeloCliente;

/**
 *
 * @author Linda
 */
public class daoCliente extends conexion {
    //Variables necesarias
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    
    //declaracion de modelos:
    modeloCliente modc = new modeloCliente();
    
    
    //linda: buscar cliente para registrarlo en la venta:
   public boolean consultarcliente(Object obj) {
        modc =(modeloCliente) obj;
         String sql = "SELECT * FROM cliente WHERE dpi_cliente=?";
        try {
            con = conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, modc.getDpi_cliente());
            rs = ps.executeQuery();
            
            if(rs.next()) {
               
               modc.setId_cliente(rs.getInt("id_cliente"));
           
               return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(daoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}

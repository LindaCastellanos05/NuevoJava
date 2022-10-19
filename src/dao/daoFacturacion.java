/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.conexion;
import controlador.crudInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.modeloFacturacion;

/**
 *
 * @author Linda
 */
public class daoFacturacion extends conexion implements crudInterface{
  //definicion de variables que usaremes para conectar a la base de datos
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    
    //declaracion de los querys que usaremos para acceder a la base de datos:
    //--------------------------------querys--------------------------------------------------------
    String sqlselectall ="select * from facturacion";
    //----------------------------------------------------------------------------------------------
    //declaracion modelos
    modeloFacturacion modfactura = new modeloFacturacion();
    
    @Override
    public boolean agregar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List mostrartodo(Object obj) {
        //establezco mi objeto
        modfactura = (modeloFacturacion) obj;
        
        //conecto a la base de datos para recuperar los datos
        try {
            con = conectar();
            ps = con.prepareStatement(sqlselectall);
            rs=ps.executeQuery();
            
            //Creo mi lista
            List<modeloFacturacion>todasventas = new ArrayList<>();
            
            //lleno la lista con los datos que obtengo en la base de datos
            while(rs.next()){
                
                modfactura.setCantidad_facturacion(rs.getInt("cantidad_facturacion"));
                modfactura.setFecha_facturacion(rs.getString("fecha_facturacion"));
                modfactura.setId_facturacion(rs.getInt("id_facturacion"));
                modfactura.setIdcajero_facturacion(rs.getInt("idcajero_facturacion"));
                modfactura.setIdcliente_facturacion(rs.getInt("idcliente_facturacion"));
                modfactura.setIdpuntos_facturacion(rs.getInt("idpuntos_facturacion"));
                modfactura.setLatitud_facturacion(rs.getString("latitud_facturaciom"));
                modfactura.setLongitud_facturacion(rs.getString("longitud_facturacion"));
                modfactura.setMonto_facturacion(rs.getDouble("monto_facturacion"));
                modfactura.setNit_facturacion(rs.getString("nit_facturacion"));
                
                todasventas.add(modfactura);
            }
             
             return todasventas;
             
        } catch (SQLException ex) {
            Logger.getLogger(daoFacturacion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{
            closeConection();
        }
           }

    @Override
    public List buscar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
